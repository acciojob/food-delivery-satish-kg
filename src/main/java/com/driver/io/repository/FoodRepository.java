package com.driver.io.repository;

import com.driver.model.entity.FoodEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<FoodEntity, Long> {
    FoodEntity findByFoodId(String foodId);
}
