/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.1-dev
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
import io.flexify.apiclient.model.AddMigrationRequestMapping;
import io.flexify.apiclient.model.DtoMappingCostEstimateEntry;
import io.flexify.apiclient.model.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Estimate cost of migration mapping
 */
@ApiModel(description = "Estimate cost of migration mapping")




public class DtoMappingCostEstimate {
  @JsonProperty("costs")
  private List<DtoMappingCostEstimateEntry> costs = null;

  @JsonProperty("mapping")
  private AddMigrationRequestMapping mapping = null;

  @JsonProperty("totalCost")
  private Money totalCost = null;

  @JsonProperty("totalUsage")
  private Long totalUsage = null;

  public DtoMappingCostEstimate costs(List<DtoMappingCostEstimateEntry> costs) {
    this.costs = costs;
    return this;
  }

  public DtoMappingCostEstimate addCostsItem(DtoMappingCostEstimateEntry costsItem) {
    if (this.costs == null) {
      this.costs = new ArrayList<DtoMappingCostEstimateEntry>();
    }
    this.costs.add(costsItem);
    return this;
  }

   /**
   * Get costs
   * @return costs
  **/
  @ApiModelProperty(value = "")
  public List<DtoMappingCostEstimateEntry> getCosts() {
    return costs;
  }

  public void setCosts(List<DtoMappingCostEstimateEntry> costs) {
    this.costs = costs;
  }

  public DtoMappingCostEstimate mapping(AddMigrationRequestMapping mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  @ApiModelProperty(value = "")
  public AddMigrationRequestMapping getMapping() {
    return mapping;
  }

  public void setMapping(AddMigrationRequestMapping mapping) {
    this.mapping = mapping;
  }

  public DtoMappingCostEstimate totalCost(Money totalCost) {
    this.totalCost = totalCost;
    return this;
  }

   /**
   * Get totalCost
   * @return totalCost
  **/
  @ApiModelProperty(value = "")
  public Money getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Money totalCost) {
    this.totalCost = totalCost;
  }

  public DtoMappingCostEstimate totalUsage(Long totalUsage) {
    this.totalUsage = totalUsage;
    return this;
  }

   /**
   * Get totalUsage
   * @return totalUsage
  **/
  @ApiModelProperty(value = "")
  public Long getTotalUsage() {
    return totalUsage;
  }

  public void setTotalUsage(Long totalUsage) {
    this.totalUsage = totalUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DtoMappingCostEstimate dtoMappingCostEstimate = (DtoMappingCostEstimate) o;
    return Objects.equals(this.costs, dtoMappingCostEstimate.costs) &&
        Objects.equals(this.mapping, dtoMappingCostEstimate.mapping) &&
        Objects.equals(this.totalCost, dtoMappingCostEstimate.totalCost) &&
        Objects.equals(this.totalUsage, dtoMappingCostEstimate.totalUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs, mapping, totalCost, totalUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DtoMappingCostEstimate {\n");
    
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    totalUsage: ").append(toIndentedString(totalUsage)).append("\n");
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

