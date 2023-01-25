package com.order.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemPk implements Serializable {

	private static final long serialVersionUID = 2218936744700948184L;

	@Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

}
