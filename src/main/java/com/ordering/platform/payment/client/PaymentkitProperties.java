package com.ordering.platform.payment.client;
//package com.ordering.payment;
//
//import javax.validation.constraints.NotNull;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.annotation.Validated;
//
//@Component
//@Validated
//@ConfigurationProperties(
// prefix = "zservice.payment.kit"
//)
//public class PaymentKitProperties {
// @NotNull
// private String host;
// @NotNull
// private Integer port;
// @NotNull
// private Boolean enabled;
// @NotNull
// private String serviceType;
// @NotNull
// private String widgetType;
// private String secret;
//
// public String getServiceUrl() {
//     return String.format("https://%s?service_type=%s&widget_type=%s", this.host, this.serviceType, this.widgetType);
// }
//
// public String getSecret() {
//     return this.secret;
// }
//
// public PaymentKitProperties() {
// }
//
// public String getHost() {
//     return this.host;
// }
//
// public Integer getPort() {
//     return this.port;
// }
//
// public Boolean getEnabled() {
//     return this.enabled;
// }
//
// public String getServiceType() {
//     return this.serviceType;
// }
//
// public String getWidgetType() {
//     return this.widgetType;
// }
//
// public void setHost(String host) {
//     this.host = host;
// }
//
// public void setPort(Integer port) {
//     this.port = port;
// }
//
// public void setEnabled(Boolean enabled) {
//     this.enabled = enabled;
// }
//
// public void setServiceType(String serviceType) {
//     this.serviceType = serviceType;
// }
//
// public void setWidgetType(String widgetType) {
//     this.widgetType = widgetType;
// }
//
// public void setSecret(String secret) {
//     this.secret = secret;
// }
//
// public boolean equals(Object o) {
//     if (o == this) {
//         return true;
//     } else if (!(o instanceof PaymentKitProperties)) {
//         return false;
//     } else {
//         PaymentKitProperties other = (PaymentKitProperties)o;
//         if (!other.canEqual(this)) {
//             return false;
//         } else {
//             Object this$host = this.getHost();
//             Object other$host = other.getHost();
//             if (this$host == null) {
//                 if (other$host != null) {
//                     return false;
//                 }
//             } else if (!this$host.equals(other$host)) {
//                 return false;
//             }
//
//             Object this$port = this.getPort();
//             Object other$port = other.getPort();
//             if (this$port == null) {
//                 if (other$port != null) {
//                     return false;
//                 }
//             } else if (!this$port.equals(other$port)) {
//                 return false;
//             }
//
//             Object this$enabled = this.getEnabled();
//             Object other$enabled = other.getEnabled();
//             if (this$enabled == null) {
//                 if (other$enabled != null) {
//                     return false;
//                 }
//             } else if (!this$enabled.equals(other$enabled)) {
//                 return false;
//             }
//
//             label62: {
//                 Object this$serviceType = this.getServiceType();
//                 Object other$serviceType = other.getServiceType();
//                 if (this$serviceType == null) {
//                     if (other$serviceType == null) {
//                         break label62;
//                     }
//                 } else if (this$serviceType.equals(other$serviceType)) {
//                     break label62;
//                 }
//
//                 return false;
//             }
//
//             label55: {
//                 Object this$widgetType = this.getWidgetType();
//                 Object other$widgetType = other.getWidgetType();
//                 if (this$widgetType == null) {
//                     if (other$widgetType == null) {
//                         break label55;
//                     }
//                 } else if (this$widgetType.equals(other$widgetType)) {
//                     break label55;
//                 }
//
//                 return false;
//             }
//
//             Object this$secret = this.getSecret();
//             Object other$secret = other.getSecret();
//             if (this$secret == null) {
//                 if (other$secret != null) {
//                     return false;
//                 }
//             } else if (!this$secret.equals(other$secret)) {
//                 return false;
//             }
//
//             return true;
//         }
//     }
// }
//
// protected boolean canEqual(Object other) {
//     return other instanceof PaymentKitProperties;
// }
//
// public int hashCode() {
//     int PRIME = true;
//     int result = 1;
//     Object $host = this.getHost();
//     int result = result * 59 + ($host == null ? 0 : $host.hashCode());
//     Object $port = this.getPort();
//     result = result * 59 + ($port == null ? 0 : $port.hashCode());
//     Object $enabled = this.getEnabled();
//     result = result * 59 + ($enabled == null ? 0 : $enabled.hashCode());
//     Object $serviceType = this.getServiceType();
//     result = result * 59 + ($serviceType == null ? 0 : $serviceType.hashCode());
//     Object $widgetType = this.getWidgetType();
//     result = result * 59 + ($widgetType == null ? 0 : $widgetType.hashCode());
//     Object $secret = this.getSecret();
//     result = result * 59 + ($secret == null ? 0 : $secret.hashCode());
//     return result;
// }
//
// public String toString() {
//     return "PaymentKitProperties(host=" + this.getHost() + ", port=" + this.getPort() + ", enabled=" + this.getEnabled() + ", serviceType=" + this.getServiceType() + ", widgetType=" + this.getWidgetType() + ", secret=" + this.getSecret() + ")";
// }
//}
