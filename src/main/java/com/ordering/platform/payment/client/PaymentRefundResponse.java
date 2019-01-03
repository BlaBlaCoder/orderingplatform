package com.ordering.platform.payment.client;

import java.util.List;
import java.util.Map;

public class PaymentRefundResponse {
    private int statusCode;
    private String status;
    private PaymentRefundResponse.ZPaymentsResponse zpayments_response;

    public boolean isSuccess() {
        return this.statusCode == 200 && this.status.equals("success") && this.zpayments_response != null && this.zpayments_response.getStatus().equals("success");
    }

    public PaymentRefundResponse() {
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatus() {
        return this.status;
    }

    public PaymentRefundResponse.ZPaymentsResponse getZpayments_response() {
        return this.zpayments_response;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setZpayments_response(PaymentRefundResponse.ZPaymentsResponse zpayments_response) {
        this.zpayments_response = zpayments_response;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PaymentRefundResponse)) {
            return false;
        } else {
            PaymentRefundResponse other = (PaymentRefundResponse)o;
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
        return other instanceof PaymentRefundResponse;
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
        return "PaymentRefundResponse(statusCode=" + this.getStatusCode() + ", status=" + this.getStatus() + ", zpayments_response=" + this.getZpayments_response() + ")";
    }

    public class ZPaymentsResponse {
        private String status;
        private List<Map<String, String>> data;

        public ZPaymentsResponse() {
        }

        public String getStatus() {
            return this.status;
        }

        public List<Map<String, String>> getData() {
            return this.data;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setData(List<Map<String, String>> data) {
            this.data = data;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof PaymentRefundResponse.ZPaymentsResponse)) {
                return false;
            } else {
                PaymentRefundResponse.ZPaymentsResponse other = (PaymentRefundResponse.ZPaymentsResponse)o;
                if (!other.canEqual(this)) {
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

                    Object this$data = this.getData();
                    Object other$data = other.getData();
                    if (this$data == null) {
                        if (other$data != null) {
                            return false;
                        }
                    } else if (!this$data.equals(other$data)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(Object other) {
            return other instanceof PaymentRefundResponse.ZPaymentsResponse;
        }

        public int hashCode() {
            boolean PRIME = true;
            int result = 1;
            Object $status = this.getStatus();
            int resultx = result * 59 + ($status == null ? 0 : $status.hashCode());
            Object $data = this.getData();
            resultx = resultx * 59 + ($data == null ? 0 : $data.hashCode());
            return resultx;
        }

        public String toString() {
            return "PaymentRefundResponse.ZPaymentsResponse(status=" + this.getStatus() + ", data=" + this.getData() + ")";
        }
    }
}