package com.order.ecommerce.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductDto {

    @NotBlank(message = "Product Id cannot be null or empty")
    private final String productId;

    @NotBlank(message = "Product sku cannot be null or empty")
    private final String sku;

    @NotBlank(message = "Product title cannot be null")
    private final String title;

    @NotBlank(message = "Product description cannot be null or empty")
    private final String description;

    private final double price;

}
