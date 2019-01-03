package com.ordering.platform.payment.client;

import java.util.Map;

public class PaymentMethodDetailsResponse {
    private int statusCode;
    private String status;
    private Map<String, Object> zpayments_response;

    public PaymentMethodDetailsResponse() {
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatus() {
        return this.status;
    }

    public Map<String, Object> getZpayments_response() {
        return this.zpayments_response;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setZpayments_response(Map<String, Object> zpayments_response) {
        this.zpayments_response = zpayments_response;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PaymentMethodDetailsResponse)) {
            return false;
        } else {
            PaymentMethodDetailsResponse other = (PaymentMethodDetailsResponse)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getStatusCode() != other.getStatusCode()) {
                return false;
            } else {
                Object this$status = this.getStatus();
                Object other$status = other.getStatus();
                if (this$status == null) {
                    if (other$status != null) {
                        return false;
                    }
                } else if (!this$status.equals(other$status)) {
                    return false;
                }

                Object this$zpayments_response = this.getZpayments_response();
                Object other$zpayments_response = other.getZpayments_response();
                if (this$zpayments_response == null) {
                    if (other$zpayments_response != null) {
                        return false;
                    }
                } else if (!this$zpayments_response.equals(other$zpayments_response)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PaymentMethodDetailsResponse;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + this.getStatusCode();
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 0 : $status.hashCode());
        Object $zpayments_response = this.getZpayments_response();
        result = result * 59 + ($zpayments_response == null ? 0 : $zpayments_response.hashCode());
        return result;
    }

    public String toString() {
        return "PaymentMethodDetailsResponse(statusCode=" + this.getStatusCode() + ", status=" + this.getStatus() + ", zpayments_response=" + this.getZpayments_response() + ")";
    }
}
