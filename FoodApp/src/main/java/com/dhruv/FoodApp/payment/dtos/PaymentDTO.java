package com.dhruv.FoodApp.payment.dtos;

import com.dhruv.FoodApp.auth_users.dtos.UserDTO;
import com.dhruv.FoodApp.enums.PaymentGateway;
import com.dhruv.FoodApp.enums.PaymentStatus;
import com.dhruv.FoodApp.order.dtos.OrderDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    private Long id;

    private Long orderId;

    private BigDecimal amount;

    private PaymentStatus paymentStatus;

    private String transactionId;

    private PaymentGateway paymentGateway;

    private String failureReason;

    private boolean success;

    private LocalDateTime paymentDate;

    private OrderDTO orderDTO;

    private UserDTO userDTO;
}
