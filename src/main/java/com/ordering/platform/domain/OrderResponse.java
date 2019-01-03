package com.ordering.platform.domain;

public class OrderResponse {
	private Order order;
	private Boolean response;

	public OrderResponse(Order order, Boolean response) {
		this.order = order;
		this.response = response;

	}

	public Order get() {
		return (Order) order.clone();
	}

	public boolean response() {
		return response;
	}
}
