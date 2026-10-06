package com.dhruv.FoodApp.payment.repository;

import com.dhruv.FoodApp.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {



}
