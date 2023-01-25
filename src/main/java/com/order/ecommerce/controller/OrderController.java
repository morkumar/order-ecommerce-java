package com.order.ecommerce.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.ecommerce.dto.OrderDto;
import com.order.ecommerce.dto.OrderResponseDto;
import com.order.ecommerce.service.IOrderService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final IOrderService orderService;

    /**
     * Creates order
     * @param orderDto
     * @return
     */
    @PostMapping
    @Operation(summary = "Create an order", description = "Create an order")
    public OrderResponseDto createOrder(@Valid @RequestBody OrderDto orderDto) {
       
    	log.info("initiated the process on creating the order");
        return orderService.createOrder(orderDto);
    }

    /**
     * Finds Order by Id
     * @param orderId
     * @return
     */
    @GetMapping("/{orderId}")
    @Operation(summary = "Find order", description = "Find order by id")
    public OrderDto findOrderBy(@PathVariable(name = "orderId") @NotEmpty(message="order id cannot be null or empty") String orderId) {
 
    	log.info("initiated the process on fetching the order by id");
    	return orderService.findOrderById(orderId);
    }

    /**
     * Updates order status
     * @param orderId
     * @param orderStatus
     */
    @PatchMapping("/{orderId}")
    @Operation(summary = "Update order status", description = "Update order status")
    public void updateOrderStatus(@PathVariable("orderId") @NotEmpty(message="order id cannot be null or empty") String orderId,
                                  @RequestParam(name = "orderStatus") @NotEmpty(message="order status cannot be null or empty") String orderStatus) {
    	log.info("initiated the process on updating the order status");
        orderService.updateOrderStatus(orderId, orderStatus);
    }

}
