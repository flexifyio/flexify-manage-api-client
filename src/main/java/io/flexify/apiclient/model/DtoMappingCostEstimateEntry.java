/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.1-SNAPSHOT
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
import io.flexify.apiclient.model.CloudLocationRes;
import io.flexify.apiclient.model.Money;
import io.flexify.apiclient.model.Price;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DtoMappingCostEstimateEntry
 */




public class DtoMappingCostEstimateEntry {
  @JsonProperty("cost")
  private Money cost = null;

  @JsonProperty("destRegion")
  private String destRegion = null;

  @JsonProperty("engineLocation")
  private CloudLocationRes engineLocation = null;

  @JsonProperty("enginesCount")
  private Integer enginesCount = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("sourceRegion")
  private String sourceRegion = null;

  @JsonProperty("usage")
  private Long usage = null;

  public DtoMappingCostEstimateEntry cost(Money cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public Money getCost() {
    return cost;
  }

  public void setCost(Money cost) {
    this.cost = cost;
  }

  public DtoMappingCostEstimateEntry destRegion(String destRegion) {
    this.destRegion = destRegion;
    return this;
  }

   /**
   * Get destRegion
   * @return destRegion
  **/
  @ApiModelProperty(value = "")
  public String getDestRegion() {
    return destRegion;
  }

  public void setDestRegion(String destRegion) {
    this.destRegion = destRegion;
  }

  public DtoMappingCostEstimateEntry engineLocation(CloudLocationRes engineLocation) {
    this.engineLocation = engineLocation;
    return this;
  }

   /**
   * Get engineLocation
   * @return engineLocation
  **/
  @ApiModelProperty(value = "")
  public CloudLocationRes getEngineLocation() {
    return engineLocation;
  }

  public void setEngineLocation(CloudLocationRes engineLocation) {
    this.engineLocation = engineLocation;
  }

  public DtoMappingCostEstimateEntry enginesCount(Integer enginesCount) {
    this.enginesCount = enginesCount;
    return this;
  }

   /**
   * Get enginesCount
   * @return enginesCount
  **/
  @ApiModelProperty(value = "")
  public Integer getEnginesCount() {
    return enginesCount;
  }

  public void setEnginesCount(Integer enginesCount) {
    this.enginesCount = enginesCount;
  }

  public DtoMappingCostEstimateEntry price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public DtoMappingCostEstimateEntry sourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
    return this;
  }

   /**
   * Get sourceRegion
   * @return sourceRegion
  **/
  @ApiModelProperty(value = "")
  public String getSourceRegion() {
    return sourceRegion;
  }

  public void setSourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
  }

  public DtoMappingCostEstimateEntry usage(Long usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public Long getUsage() {
    return usage;
  }

  public void setUsage(Long usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DtoMappingCostEstimateEntry dtoMappingCostEstimateEntry = (DtoMappingCostEstimateEntry) o;
    return Objects.equals(this.cost, dtoMappingCostEstimateEntry.cost) &&
        Objects.equals(this.destRegion, dtoMappingCostEstimateEntry.destRegion) &&
        Objects.equals(this.engineLocation, dtoMappingCostEstimateEntry.engineLocation) &&
        Objects.equals(this.enginesCount, dtoMappingCostEstimateEntry.enginesCount) &&
        Objects.equals(this.price, dtoMappingCostEstimateEntry.price) &&
        Objects.equals(this.sourceRegion, dtoMappingCostEstimateEntry.sourceRegion) &&
        Objects.equals(this.usage, dtoMappingCostEstimateEntry.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, destRegion, engineLocation, enginesCount, price, sourceRegion, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DtoMappingCostEstimateEntry {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    destRegion: ").append(toIndentedString(destRegion)).append("\n");
    sb.append("    engineLocation: ").append(toIndentedString(engineLocation)).append("\n");
    sb.append("    enginesCount: ").append(toIndentedString(enginesCount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
