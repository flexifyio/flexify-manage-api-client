/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.4
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentOptions
 */




public class PaymentOptions {
  @JsonProperty("amountString")
  private String amountString = null;

  @JsonProperty("authToken")
  private String authToken = null;

  @JsonProperty("productId")
  private Long productId = null;

  public PaymentOptions amountString(String amountString) {
    this.amountString = amountString;
    return this;
  }

   /**
   * Get amountString
   * @return amountString
  **/
  @ApiModelProperty(value = "")
  public String getAmountString() {
    return amountString;
  }

  public void setAmountString(String amountString) {
    this.amountString = amountString;
  }

  public PaymentOptions authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Get authToken
   * @return authToken
  **/
  @ApiModelProperty(value = "")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public PaymentOptions productId(Long productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOptions paymentOptions = (PaymentOptions) o;
    return Objects.equals(this.amountString, paymentOptions.amountString) &&
        Objects.equals(this.authToken, paymentOptions.authToken) &&
        Objects.equals(this.productId, paymentOptions.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountString, authToken, productId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOptions {\n");
    
    sb.append("    amountString: ").append(toIndentedString(amountString)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

