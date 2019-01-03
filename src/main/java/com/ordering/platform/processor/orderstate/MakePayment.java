package com.ordering.platform.processor.orderstate;

import org.springframework.beans.factory.annotation.Autowired;

import com.ordering.platform.domain.Order;
import com.ordering.platform.domain.OrderResponse;
import com.ordering.platform.payment.MerchantService;
import com.ordering.platform.payment.MerchantServiceImpl;
import com.ordering.platform.payment.Payment;
import com.ordering.platform.payment.PaymentImpl;
import com.ordering.platform.processor.context.Context;
import com.ordering.platform.processor.context.ContextImpl;
import com.ordering.platform.wallet.service.WalletService;


public class MakePayment extends AbstractStateManagement<Order, OrderResponse>{

	Context iContext = new ContextImpl();
	Payment<Order,OrderResponse> payment = new PaymentImpl();
	MerchantService<Order,OrderResponse> merchantService = new MerchantServiceImpl();
	@Autowired
	WalletService walletService;
	@Override
	public OrderResponse process(Order order) {
		
		if (!order.getIsO2PostPaid()) {
			System.out.println("Wallet deduction flow");
			OrderResponse response = payment.pay(order);
			if(response.response()) {
				System.out.println("Amount Deducted");
			}else {
				System.out.println("Amount is less add more");
			}
			return response;
		} else {
			System.out.println("this is an o2 postpaid campaign");

			OrderResponse blockCreditRequest = merchantService.blockCreditRequest(order);
			if (blockCreditRequest.response())
				System.out.println("Limit Blocked");
			else {
				System.out.println("Limit Blocked");
			}
			return blockCreditRequest;

		}
		
	}

}
