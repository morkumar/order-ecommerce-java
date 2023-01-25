package com.order.ecommerce.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderItemDto {

    @NotBlank(message = "productId cannot be null or empty")
    private final String productId;
    @NotBlank(message = "quantity cannot be null or empty")
    private final String quantity;
	
  
}
