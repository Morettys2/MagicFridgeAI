package dev.moretty.MagicFridgeAI.controller;

import dev.moretty.MagicFridgeAI.model.FoodItem;
import dev.moretty.MagicFridgeAI.service.ChatGptService;
import dev.moretty.MagicFridgeAI.service.FoodItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class RecipeController {

    private final FoodItemService foodItemService;
    private final ChatGptService chatGptService;

    public RecipeController(FoodItemService foodItemService, ChatGptService chatGptService) {
        this.foodItemService = foodItemService;
        this.chatGptService = chatGptService;
    }

    /**
     * Rota para gerar receita baseada nos alimentos cadastrados.
     */
    @GetMapping("/generate")
    public Mono<ResponseEntity<String>> generateRecipe() {
        List<FoodItem> foodItems = foodItemService.listarTodos();
        return chatGptService.generateRecipe(foodItems)
                .map(recipe -> ResponseEntity.ok(recipe))
                .defaultIfEmpty(ResponseEntity.noContent().build());
    }
}