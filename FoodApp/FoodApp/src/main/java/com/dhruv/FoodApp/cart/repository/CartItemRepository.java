package com.dhruv.FoodApp.cart.repository;

import com.dhruv.FoodApp.cart.dtos.CartItemDTO;
import com.dhruv.FoodApp.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


}
