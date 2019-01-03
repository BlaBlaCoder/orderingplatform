package com.ordering.platform.processor.orderstate;

import com.ordering.platform.domain.Order;
import com.ordering.platform.domain.OrderResponse;
import com.ordering.platform.processor.context.ContextWrapper;
import com.ordering.platform.processor.context.ContextWrapperImpl;

public class BiilingEntry extends AbstractStateManagement<Order ,OrderResponse> {

	ContextWrapper contextWrapper = new ContextWrapperImpl();
	@Override
	public OrderResponse process(Order v) {
		return makeEntryInBilling(v);
	}

	private OrderResponse makeEntryInBilling(Order v) {
		System.out.println("Billing Entry Made");
		OrderResponse orderResponse = new OrderResponse(v,true);
		contextWrapper.getContext();
		return orderResponse;
	}

}
