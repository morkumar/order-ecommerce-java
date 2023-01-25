package com.order.ecommerce.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderDto {

	@NotBlank(message = "customer id cannot be null or empty")
    private  String customerId;

    private  double subTotal;

    private  double totalAmt;

    private  double tax;

    private  double shippingCharges;

    @NotBlank(message = "title cannot cannot be null or empty")
    private  String title;

    private  String shippingMode;

    private  double amount;

    @NotBlank(message = "payment mode cannot be null or empty")
    private  String paymentMode;

    @NotNull(message = "billing address cannot be null")
    private  AddressDto billingAddress;

    private  AddressDto shippingAddress;

    @NotBlank(message = "order items cannot be null or empty")
    private  List<OrderItemDto> orderItems;

    @NotBlank(message = "order status cannot be null or empty")
    private  String orderStatus;
}
