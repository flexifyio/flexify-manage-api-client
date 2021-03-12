/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.2
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
import io.flexify.apiclient.model.VirtualBucketSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request to create new virtual bucket
 */
@ApiModel(description = "Request to create new virtual bucket")




public class CreateVirtualBucketRequest {
  @JsonProperty("settings")
  private VirtualBucketSettings settings = null;

  public CreateVirtualBucketRequest settings(VirtualBucketSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Settings of the newly created virtual bucket
   * @return settings
  **/
  @ApiModelProperty(value = "Settings of the newly created virtual bucket")
  public VirtualBucketSettings getSettings() {
    return settings;
  }

  public void setSettings(VirtualBucketSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVirtualBucketRequest createVirtualBucketRequest = (CreateVirtualBucketRequest) o;
    return Objects.equals(this.settings, createVirtualBucketRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVirtualBucketRequest {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

