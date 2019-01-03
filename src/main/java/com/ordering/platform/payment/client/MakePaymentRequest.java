package com.ordering.platform.payment.client;

import java.math.BigDecimal;

public class MakePaymentRequest {
    private String orderType;
    private Long orderId;
    private Long paymentMethodId;
    private String paymentMethodType;
    private BigDecimal amount;
    private Long userId;
    private Long countryId;
    private String hostRedirectUrl;
    private String serviceType;
    private String phone;
    private String email;
    private String cardVault;

    MakePaymentRequest(String orderType, Long orderId, Long paymentMethodId, String paymentMethodType, BigDecimal amount, Long userId, Long countryId, String hostRedirectUrl, String serviceType, String phone, String email, String cardVault) {
        this.orderType = orderType;
        this.orderId = orderId;
        this.paymentMethodId = paymentMethodId;
        this.paymentMethodType = paymentMethodType;
        this.amount = amount;
        this.userId = userId;
        this.countryId = countryId;
        this.hostRedirectUrl = hostRedirectUrl;
        this.serviceType = serviceType;
        this.phone = phone;
        this.email = email;
        this.cardVault = cardVault;
    }

    public static MakePaymentRequest.MakePaymentRequestBuilder builder() {
        return new MakePaymentRequest.MakePaymentRequestBuilder();
    }

    public String getOrderType() {
        return this.orderType;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public Long getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getCountryId() {
        return this.countryId;
    }

    public String getHostRedirectUrl() {
        return this.hostRedirectUrl;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCardVault() {
        return this.cardVault;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setPaymentMethodId(Long paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public void setHostRedirectUrl(String hostRedirectUrl) {
        this.hostRedirectUrl = hostRedirectUrl;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCardVault(String cardVault) {
        this.cardVault = cardVault;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof MakePaymentRequest)) {
            return false;
        } else {
            MakePaymentRequest other = (MakePaymentRequest)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label155: {
                    Object this$orderType = this.getOrderType();
                    Object other$orderType = other.getOrderType();
                    if (this$orderType == null) {
                        if (other$orderType == null) {
                            break label155;
                        }
                    } else if (this$orderType.equals(other$orderType)) {
                        break label155;
                    }

                    return false;
                }

                Object this$orderId = this.getOrderId();
                Object other$orderId = other.getOrderId();
                if (this$orderId == null) {
                    if (other$orderId != null) {
                        return false;
                    }
                } else if (!this$orderId.equals(other$orderId)) {
                    return false;
                }

                Object this$paymentMethodId = this.getPaymentMethodId();
                Object other$paymentMethodId = other.getPaymentMethodId();
                if (this$paymentMethodId == null) {
                    if (other$paymentMethodId != null) {
                        return false;
                    }
                } else if (!this$paymentMethodId.equals(other$paymentMethodId)) {
                    return false;
                }

                label134: {
                    Object this$paymentMethodType = this.getPaymentMethodType();
                    Object other$paymentMethodType = other.getPaymentMethodType();
                    if (this$paymentMethodType == null) {
                        if (other$paymentMethodType == null) {
                            break label134;
                        }
                    } else if (this$paymentMethodType.equals(other$paymentMethodType)) {
                        break label134;
                    }

                    return false;
                }

                label127: {
                    Object this$amount = this.getAmount();
                    Object other$amount = other.getAmount();
                    if (this$amount == null) {
                        if (other$amount == null) {
                            break label127;
                        }
                    } else if (this$amount.equals(other$amount)) {
                        break label127;
                    }

                    return false;
                }

                label120: {
                    Object this$userId = this.getUserId();
                    Object other$userId = other.getUserId();
                    if (this$userId == null) {
                        if (other$userId == null) {
                            break label120;
                        }
                    } else if (this$userId.equals(other$userId)) {
                        break label120;
                    }

                    return false;
                }

                Object this$countryId = this.getCountryId();
                Object other$countryId = other.getCountryId();
                if (this$countryId == null) {
                    if (other$countryId != null) {
                        return false;
                    }
                } else if (!this$countryId.equals(other$countryId)) {
                    return false;
                }

                label106: {
                    Object this$hostRedirectUrl = this.getHostRedirectUrl();
                    Object other$hostRedirectUrl = other.getHostRedirectUrl();
                    if (this$hostRedirectUrl == null) {
                        if (other$hostRedirectUrl == null) {
                            break label106;
                        }
                    } else if (this$hostRedirectUrl.equals(other$hostRedirectUrl)) {
                        break label106;
                    }

                    return false;
                }

                Object this$serviceType = this.getServiceType();
                Object other$serviceType = other.getServiceType();
                if (this$serviceType == null) {
                    if (other$serviceType != null) {
                        return false;
                    }
                } else if (!this$serviceType.equals(other$serviceType)) {
                    return false;
                }

                label92: {
                    Object this$phone = this.getPhone();
                    Object other$phone = other.getPhone();
                    if (this$phone == null) {
                        if (other$phone == null) {
                            break label92;
                        }
                    } else if (this$phone.equals(other$phone)) {
                        break label92;
                    }

                    return false;
                }

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email != null) {
                        return false;
                    }
                } else if (!this$email.equals(other$email)) {
                    return false;
                }

                Object this$cardVault = this.getCardVault();
                Object other$cardVault = other.getCardVault();
                if (this$cardVault == null) {
                    if (other$cardVault != null) {
                        return false;
                    }
                } else if (!this$cardVault.equals(other$cardVault)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof MakePaymentRequest;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $orderType = this.getOrderType();
        result = result * 59 + ($orderType == null ? 0 : $orderType.hashCode());
        Object $orderId = this.getOrderId();
        result = result * 59 + ($orderId == null ? 0 : $orderId.hashCode());
        Object $paymentMethodId = this.getPaymentMethodId();
        result = result * 59 + ($paymentMethodId == null ? 0 : $paymentMethodId.hashCode());
        Object $paymentMethodType = this.getPaymentMethodType();
        result = result * 59 + ($paymentMethodType == null ? 0 : $paymentMethodType.hashCode());
        Object $amount = this.getAmount();
        result = result * 59 + ($amount == null ? 0 : $amount.hashCode());
        Object $userId = this.getUserId();
        result = result * 59 + ($userId == null ? 0 : $userId.hashCode());
        Object $countryId = this.getCountryId();
        result = result * 59 + ($countryId == null ? 0 : $countryId.hashCode());
        Object $hostRedirectUrl = this.getHostRedirectUrl();
        result = result * 59 + ($hostRedirectUrl == null ? 0 : $hostRedirectUrl.hashCode());
        Object $serviceType = this.getServiceType();
        result = result * 59 + ($serviceType == null ? 0 : $serviceType.hashCode());
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 0 : $phone.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 0 : $email.hashCode());
        Object $cardVault = this.getCardVault();
        result = result * 59 + ($cardVault == null ? 0 : $cardVault.hashCode());
        return result;
    }

    public String toString() {
        return "MakePaymentRequest(orderType=" + this.getOrderType() + ", orderId=" + this.getOrderId() + ", paymentMethodId=" + this.getPaymentMethodId() + ", paymentMethodType=" + this.getPaymentMethodType() + ", amount=" + this.getAmount() + ", userId=" + this.getUserId() + ", countryId=" + this.getCountryId() + ", hostRedirectUrl=" + this.getHostRedirectUrl() + ", serviceType=" + this.getServiceType() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", cardVault=" + this.getCardVault() + ")";
    }

    public static class MakePaymentRequestBuilder {
        private String orderType;
        private Long orderId;
        private Long paymentMethodId;
        private String paymentMethodType;
        private BigDecimal amount;
        private Long userId;
        private Long countryId;
        private String hostRedirectUrl;
        private String serviceType;
        private String phone;
        private String email;
        private String cardVault;

        MakePaymentRequestBuilder() {
        }

        public MakePaymentRequest.MakePaymentRequestBuilder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder paymentMethodId(Long paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder paymentMethodType(String paymentMethodType) {
            this.paymentMethodType = paymentMethodType;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder countryId(Long countryId) {
            this.countryId = countryId;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder hostRedirectUrl(String hostRedirectUrl) {
            this.hostRedirectUrl = hostRedirectUrl;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public MakePaymentRequest.MakePaymentRequestBuilder cardVault(String cardVault) {
            this.cardVault = cardVault;
            return this;
        }

        public MakePaymentRequest build() {
            return new MakePaymentRequest(this.orderType, this.orderId, this.paymentMethodId, this.paymentMethodType, this.amount, this.userId, this.countryId, this.hostRedirectUrl, this.serviceType, this.phone, this.email, this.cardVault);
        }

        public String toString() {
            return "MakePaymentRequest.MakePaymentRequestBuilder(orderType=" + this.orderType + ", orderId=" + this.orderId + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethodType=" + this.paymentMethodType + ", amount=" + this.amount + ", userId=" + this.userId + ", countryId=" + this.countryId + ", hostRedirectUrl=" + this.hostRedirectUrl + ", serviceType=" + this.serviceType + ", phone=" + this.phone + ", email=" + this.email + ", cardVault=" + this.cardVault + ")";
        }
    }
}