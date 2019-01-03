package com.ordering.platform.payment.client;


import java.math.BigDecimal;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
//lonecodie
//W3lcome@1821389
public class PaymentClient {
	private String serviceUrl;
    private RestTemplate restTemplate;
    private String secretKeyHeader;
    private String secretKey;

    public PaymentClient(String serviceUrl, RestTemplate restTemplate, String secretKeyHeader, String secretKey) {
        this.serviceUrl = serviceUrl;
        this.restTemplate = restTemplate;
        this.secretKeyHeader = secretKeyHeader;
        this.secretKey = secretKey;
    }

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED);
        headers.set(this.secretKeyHeader, this.secretKey);
        return headers;
    }

    public PaymentResponse getPaymentDetails(Long orderId, String serviceType) {
        HttpHeaders headers = this.getHeaders();
        MultiValueMap<String, String> requestData = TransformationUtils.transformPaymentRequest(orderId, serviceType);
        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity(requestData, headers);
        String url = String.format("%s/v1/get_payment_status", this.serviceUrl);

        try {
            ResponseEntity<PaymentResponse> response = this.restTemplate.exchange(url, HttpMethod.POST, httpEntity, PaymentResponse.class, new Object[0]);
            PaymentResponse obtainedResponse = (PaymentResponse)response.getBody();
            obtainedResponse.setStatusCode(response.getStatusCodeValue());
            return obtainedResponse;
        } catch (HttpStatusCodeException var9) {
            return TransformationUtils.transformPaymentResponse(var9);
        }
    }

    public PaymentMethodDetailsResponse getPaymentMethodDetails(String serviceType, Long paymentMethodId, String paymentMethodType) {
        HttpHeaders headers = this.getHeaders();
        MultiValueMap<String, String> requestData = TransformationUtils.transformPaymentRequest(serviceType, paymentMethodId, paymentMethodType);
        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity(requestData, headers);
        String url = String.format("%s/v1/get_payment_method_detail", this.serviceUrl);

        PaymentMethodDetailsResponse obtainedResponse;
        try {
            ResponseEntity<PaymentMethodDetailsResponse> response = this.restTemplate.exchange(url, HttpMethod.POST, httpEntity, PaymentMethodDetailsResponse.class, new Object[0]);
            obtainedResponse = (PaymentMethodDetailsResponse)response.getBody();
            obtainedResponse.setStatusCode(response.getStatusCodeValue());
        } catch (HttpStatusCodeException var10) {
            obtainedResponse = new PaymentMethodDetailsResponse();
            obtainedResponse.setStatusCode(var10.getRawStatusCode());
            obtainedResponse.setStatus("FAILURE");
        }

        return obtainedResponse;
    }

    public PaymentRefundResponse generateRefund(String serviceType, Long orderId, BigDecimal amount, PaymentClient.RefundSource source) {
        HttpHeaders headers = this.getHeaders();
        MultiValueMap<String, String> requestData = TransformationUtils.transformRefundRequest(serviceType, orderId, amount, source.source);
        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity(requestData, headers);
        String url = String.format("%s/v1/refund_order", this.serviceUrl);

        PaymentRefundResponse paymentRefundResponse;
        try {
            ResponseEntity<PaymentRefundResponse> response = this.restTemplate.exchange(url, HttpMethod.POST, httpEntity, PaymentRefundResponse.class, new Object[0]);
            paymentRefundResponse = (PaymentRefundResponse)response.getBody();
            paymentRefundResponse.setStatusCode(response.getStatusCodeValue());
        } catch (HttpStatusCodeException var11) {
            paymentRefundResponse = new PaymentRefundResponse();
            paymentRefundResponse.setStatusCode(var11.getRawStatusCode());
            paymentRefundResponse.setStatus("FAILURE");
        }

        return paymentRefundResponse;
    }

    public MakePaymentResponse makePayment(MakePaymentRequest makePaymentRequest) {
        HttpHeaders headers = this.getHeaders();
        MultiValueMap<String, String> requestData = TransformationUtils.tranformMakePaymentRequest(makePaymentRequest);
        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity(requestData, headers);
        String url = String.format("%s/v1/make_payment", this.serviceUrl);

        MakePaymentResponse makePaymentResponse;
        try {
            ResponseEntity<MakePaymentResponse> response = this.restTemplate.exchange(url, HttpMethod.POST, httpEntity, MakePaymentResponse.class, new Object[0]);
            makePaymentResponse = (MakePaymentResponse)response.getBody();
            makePaymentResponse.setStatusCode(response.getStatusCodeValue());
        } catch (HttpStatusCodeException var8) {
            makePaymentResponse = MakePaymentResponse.builder().statusCode(var8.getRawStatusCode()).status("FAILURE").build();
        }

        return makePaymentResponse;
    }
    public static enum RefundSource {
        ORIGINAL("original"),
        ZCREDITS("credits");

        public String source;

        private RefundSource(String source) {
            this.source = source;
        }
    }

}
