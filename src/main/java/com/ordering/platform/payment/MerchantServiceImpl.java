package com.ordering.platform.payment;

import com.ordering.platform.domain.Order;
import com.ordering.platform.domain.OrderResponse;

public class MerchantServiceImpl implements MerchantService<Order, OrderResponse> {

	@Override
	public OrderResponse blockCreditRequest(Order object) {
		// TODO Auto-generated method stub
		System.out.println("blocking CR");
		OrderResponse orderResponse  = new OrderResponse(object,true);
		return orderResponse;
	}

	@Override
	public OrderResponse releaseCreditRequest(Order object) {
		System.out.println("releasing CR");
		return null;
	}



}
