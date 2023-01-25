package com.order.ecommerce.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AddressDto {

    @NotBlank(message = "address1 cannot be null or empty")
    private final String address1;
    @NotBlank(message = "address2 cannot be null or empty")
    private final String address2;
    @NotBlank(message = "city cannot be null or empty")
    private final String city;
    @NotBlank(message = "state cannot be null or empty")
    private final String state;
    @NotBlank(message = "zip cannot be null or empty")
    private final String zip;
    @NotBlank(message = "email cannot be null or empty")
    private final String email;
    @NotBlank(message = "phone cannot be null or empty")
    private final String phone;
    
}
