package com.ordering.platform.payment;

import java.math.BigDecimal;
import java.util.Map;

import com.ordering.platform.domain.Order;
import com.ordering.platform.domain.OrderResponse;
import com.ordering.platform.payment.client.MakePaymentRequest;
import com.ordering.platform.payment.client.MakePaymentResponse;

public class PaymentImpl implements Payment<Order, OrderResponse> {

	

	@Override
	public OrderResponse pay(Order order) {
		System.out.println("payment has been made");
		
		if (isAutoPayAllowed(order.getProductId(), zomatoBillingCountryId)) {
            // Call payment client to make actual payment
            MakePaymentRequest makePaymentRequest = MakePaymentRequest.builder()
                    .orderId(order.getOrderId())
                    .orderType(paymentKitProperties.getServiceType())
                    .paymentMethodId(paymentMethodId)
                    .paymentMethodType(paymentMethodType)
                    .amount(txnAmount)
                    .userId(user.getUserId())
                    .countryId((long)zomatoBillingCountryId)
                    .hostRedirectUrl("https://www.zomato.com")
                    .serviceType(paymentKitProperties.getServiceType())
                    .phone(user.getPhone())
                    .email(user.getEmail())
                    .cardVault(vault)
                    .build();
            MakePaymentResponse makePaymentResponse = paymentClient.makePayment(makePaymentRequest);

            if (makePaymentResponse.getStatusCode() == 200 && makePaymentResponse.getStatus().equals("success")) {
                Map<String, Object> zPaymentsResponse = makePaymentResponse.getZpayments_response();
                if (zPaymentsResponse.getOrDefault("status", "failed").equals("success")) {
                    InsertCampaignSale insertCampaignSale = new InsertCampaignSale();
                    insertCampaignSale.setCampaignId(order.getCampaignId());
                    insertCampaignSale.setOrderId(order.getOrderId());
                    insertCampaignSale.setNetAmount(netAmount.floatValue());
                    insertCampaignSale.setWalletAmountUsed(BigDecimal.ZERO);
                    insertCampaignSale.setZoneOffset(zoneOffset);
                    insertCampaignSale.setTxnAmount(txnAmount.floatValue());
                    insertCampaignSale.setUserId(user.getUserId());

                    // Pass order and payment entry as well because they won't be present in DB due to @Transactional's atomicity
                    campaignService.insertCampaignSale(insertCampaignSale, order, paymentEntry);
                    return true;
                }
            }
        }
        return false;
		//type of order
		return new OrderResponse(v,true);
	}

	
}
