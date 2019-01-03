package com.ordering.platform.processor;

import java.util.Arrays;
import java.util.List;

import com.ordering.platform.domain.Order;
import com.ordering.platform.domain.OrderResponse;
import com.ordering.platform.processor.orderstate.AbstractStateManagement;
import com.ordering.platform.processor.orderstate.BiilingEntry;
import com.ordering.platform.processor.orderstate.MakePayment;
import com.ordering.platform.processor.orderstate.TempOrderCreation;

public class OrderProcessorImpl implements OrderProcessor<Order> {

	List<AbstractStateManagement<Order, OrderResponse>> processList = Arrays.asList(new TempOrderCreation(), new MakePayment(),
			new BiilingEntry());

	@Override
	public Order processOrder() {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setIsO2PostPaid(true);
		order.setOrderId(1L);
		order.setServiceType(200L);
		for (AbstractStateManagement<Order, OrderResponse> process : processList) {
			process.process(order);
		}
		return order;
	}

	public static void main(String... s) {
		new OrderProcessorImpl().processOrder();
	}
}
