package dev.moretty.MagicFridgeAI.repository;

import dev.moretty.MagicFridgeAI.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

}
