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
 * Distributor or reseller partner
 */
@ApiModel(description = "Distributor or reseller partner")




public class Distributor {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("payUrl")
  private String payUrl = null;

  public Distributor id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Distributor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the distributor
   * @return name
  **/
  @ApiModelProperty(example = "Logosoft, Turkey", value = "Name of the distributor")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Distributor payUrl(String payUrl) {
    this.payUrl = payUrl;
    return this;
  }

   /**
   * URL where user should be redirected for payment
   * @return payUrl
  **/
  @ApiModelProperty(example = "https://example.com/pay", value = "URL where user should be redirected for payment")
  public String getPayUrl() {
    return payUrl;
  }

  public void setPayUrl(String payUrl) {
    this.payUrl = payUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distributor distributor = (Distributor) o;
    return Objects.equals(this.id, distributor.id) &&
        Objects.equals(this.name, distributor.name) &&
        Objects.equals(this.payUrl, distributor.payUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, payUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distributor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payUrl: ").append(toIndentedString(payUrl)).append("\n");
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

