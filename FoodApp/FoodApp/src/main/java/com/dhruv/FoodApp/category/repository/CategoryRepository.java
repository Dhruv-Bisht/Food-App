package com.dhruv.FoodApp.category.repository;

import com.dhruv.FoodApp.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {



}
