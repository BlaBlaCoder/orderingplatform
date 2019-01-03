package com.ordering.platform.payment.client;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by Fernflower decompiler)
//

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpStatusCodeException;

public class TransformationUtils {
 public TransformationUtils() {
 }

 public static MultiValueMap<String, String> transformPaymentRequest(Long orderId, String serviceType) {
     MultiValueMap<String, String> request = new LinkedMultiValueMap();
     request.add("order_id", orderId.toString());
     request.add("service_type", serviceType);
     return request;
 }

 public static MultiValueMap<String, String> transformPaymentRequest(String serviceType, Long paymentMethodId, String paymentMethodType) {
     MultiValueMap<String, String> request = new LinkedMultiValueMap();
     request.add("payment_method_id", paymentMethodId.toString());
     request.add("payment_method_type", paymentMethodType);
     request.add("service_type", serviceType);
     return request;
 }

 public static MultiValueMap<String, String> transformRefundRequest(String serviceType, Long orderId, BigDecimal amount, String source) {
     MultiValueMap<String, String> request = new LinkedMultiValueMap();
     request.add("service_type", serviceType);
     request.add("order_id", orderId.toString());
     request.add("amount", amount.setScale(2, RoundingMode.DOWN).toString());
     request.add("source", source);
     return request;
 }

 public static PaymentResponse transformPaymentResponse(HttpStatusCodeException response) {
     PaymentResponse transformedResponse = new PaymentResponse();
     transformedResponse.setStatusCode(response.getRawStatusCode());
     transformedResponse.setStatus("FAILURE");
     return transformedResponse;
 }

 public static MultiValueMap<String, String> tranformMakePaymentRequest(MakePaymentRequest makePaymentRequest) {
     MultiValueMap<String, String> request = new LinkedMultiValueMap();
     request.add("order_type", makePaymentRequest.getOrderType());
     request.add("order_id", makePaymentRequest.getOrderId().toString());
     request.add("payment_method_id", makePaymentRequest.getPaymentMethodId().toString());
     request.add("payment_method_type", makePaymentRequest.getPaymentMethodType());
     request.add("amount", makePaymentRequest.getAmount().toString());
     request.add("user_id", makePaymentRequest.getUserId().toString());
     request.add("country_id", makePaymentRequest.getCountryId().toString());
     request.add("host_redirect_url", makePaymentRequest.getHostRedirectUrl());
     request.add("service_type", makePaymentRequest.getServiceType());
     request.add("phone", makePaymentRequest.getPhone());
     request.add("email", makePaymentRequest.getEmail());
     request.add("card_vault", makePaymentRequest.getCardVault());
     return request;
 }
}
