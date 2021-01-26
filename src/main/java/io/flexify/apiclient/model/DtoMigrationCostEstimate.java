/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.1
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
import io.flexify.apiclient.model.DtoMappingCostEstimate;
import io.flexify.apiclient.model.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Estimate cost of migration
 */
@ApiModel(description = "Estimate cost of migration")




public class DtoMigrationCostEstimate {
  @JsonProperty("mappings")
  private List<DtoMappingCostEstimate> mappings = null;

  @JsonProperty("totalCost")
  private Money totalCost = null;

  @JsonProperty("totalUsage")
  private Long totalUsage = null;

  public DtoMigrationCostEstimate mappings(List<DtoMappingCostEstimate> mappings) {
    this.mappings = mappings;
    return this;
  }

  public DtoMigrationCostEstimate addMappingsItem(DtoMappingCostEstimate mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<DtoMappingCostEstimate>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Get mappings
   * @return mappings
  **/
  @ApiModelProperty(value = "")
  public List<DtoMappingCostEstimate> getMappings() {
    return mappings;
  }

  public void setMappings(List<DtoMappingCostEstimate> mappings) {
    this.mappings = mappings;
  }

  public DtoMigrationCostEstimate totalCost(Money totalCost) {
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

  public DtoMigrationCostEstimate totalUsage(Long totalUsage) {
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
    DtoMigrationCostEstimate dtoMigrationCostEstimate = (DtoMigrationCostEstimate) o;
    return Objects.equals(this.mappings, dtoMigrationCostEstimate.mappings) &&
        Objects.equals(this.totalCost, dtoMigrationCostEstimate.totalCost) &&
        Objects.equals(this.totalUsage, dtoMigrationCostEstimate.totalUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings, totalCost, totalUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DtoMigrationCostEstimate {\n");
    
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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

