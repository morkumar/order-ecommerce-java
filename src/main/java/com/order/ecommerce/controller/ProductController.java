package com.order.ecommerce.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.ecommerce.dto.ProductDto;
import com.order.ecommerce.service.IProductService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    private final IProductService productService;

    /**
     * Creates a product
     * @param productDto
     * @return
     */
    @PostMapping
    @Operation(summary = "Create a product", description = "Create a product")
	public ProductDto createProduct(
			@Valid @RequestBody @NotNull(message = "Product cannot be null") final ProductDto productDto) {
    	log.info("initiated the process on creating the product");
        return productService.createProduct(productDto);
    }

    /**
     * Finds product by id
     * @param productId
     * @return
     */
    @GetMapping("/{productId}")
    @Operation(summary = "Find a product", description = "Find a product by id")
    public ProductDto findProductById(@PathVariable(name = "productId") @NotBlank(message = "Product Id cannot be null or empty") String productId) {
    	log.info("initiated the process on fetching the product by id");
        return productService.findProductById(productId);
    }

}