package dev.moretty.MagicFridgeAI.service;
import dev.moretty.MagicFridgeAI.model.FoodItem;
import dev.moretty.MagicFridgeAI.repository.FoodItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {

    private final FoodItemRepository repository;

    public FoodItemService(FoodItemRepository repository) {
        this.repository = repository;
    }

    public FoodItem salvar(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    public List<FoodItem> listarTodos() {
        return repository.findAll();
    }

    public Optional<FoodItem> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public FoodItem atualizar(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}