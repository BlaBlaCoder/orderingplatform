package com.ordering.platform.payment.client;

import java.util.List;
import java.util.Map;

public class PaymentResponse {
    private int statusCode;
    private String status;
    private PaymentResponse.TransactionLegs zpayments_response;

    public boolean isSuccess() {
        return this.status.equals("success");
    }

    public PaymentResponse() {
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatus() {
        return this.status;
    }

    public PaymentResponse.TransactionLegs getZpayments_response() {
        return this.zpayments_response;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setZpayments_response(PaymentResponse.TransactionLegs zpayments_response) {
        this.zpayments_response = zpayments_response;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PaymentResponse)) {
            return false;
        } else {
            PaymentResponse other = (PaymentResponse)o;
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
        return other instanceof PaymentResponse;
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
        return "PaymentResponse(statusCode=" + this.getStatusCode() + ", status=" + this.getStatus() + ", zpayments_response=" + this.getZpayments_response() + ")";
    }

    public class TransactionLegs {
        private String status;
        private List<Map<String, String>> txns;
        private String message;

        public TransactionLegs() {
        }

        public String getStatus() {
            return this.status;
        }

        public List<Map<String, String>> getTxns() {
            return this.txns;
        }

        public String getMessage() {
            return this.message;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setTxns(List<Map<String, String>> txns) {
            this.txns = txns;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof PaymentResponse.TransactionLegs)) {
                return false;
            } else {
                PaymentResponse.TransactionLegs other = (PaymentResponse.TransactionLegs)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    label47: {
                        Object this$status = this.getStatus();
                        Object other$status = other.getStatus();
                        if (this$status == null) {
                            if (other$status == null) {
                                break label47;
                            }
                        } else if (this$status.equals(other$status)) {
                            break label47;
                        }

                        return false;
                    }

                    Object this$txns = this.getTxns();
                    Object other$txns = other.getTxns();
                    if (this$txns == null) {
                        if (other$txns != null) {
                            return false;
                        }
                    } else if (!this$txns.equals(other$txns)) {
                        return false;
                    }

                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if (this$message == null) {
                        if (other$message != null) {
                            return false;
                        }
                    } else if (!this$message.equals(other$message)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(Object other) {
            return other instanceof PaymentResponse.TransactionLegs;
        }

        public int hashCode() {
            boolean PRIME = true;
            int resultx = 1;
            Object $status = this.getStatus();
            int result = resultx * 59 + ($status == null ? 0 : $status.hashCode());
            Object $txns = this.getTxns();
            result = result * 59 + ($txns == null ? 0 : $txns.hashCode());
            Object $message = this.getMessage();
            result = result * 59 + ($message == null ? 0 : $message.hashCode());
            return result;
        }

        public String toString() {
            return "PaymentResponse.TransactionLegs(status=" + this.getStatus() + ", txns=" + this.getTxns() + ", message=" + this.getMessage() + ")";
        }
    }
}