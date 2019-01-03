package com.ordering.platform.processor.orderstate;

import com.ordering.platform.domain.Order;
import com.ordering.platform.domain.OrderResponse;

public class TempOrderCreation extends AbstractStateManagement<Order,OrderResponse> {
	
	@Override
	public OrderResponse process(Order v) {
		// TODO Auto-generated method stub
		return tempOrderCreation(v);
	}

	private OrderResponse tempOrderCreation(Order v) {
		OrderResponse orderResponse = new OrderResponse(v,true);
		System.out.println("Creating temp order");
		return orderResponse;
		
	}

}
