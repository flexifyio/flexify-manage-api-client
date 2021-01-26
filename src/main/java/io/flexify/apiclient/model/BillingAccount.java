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
import io.flexify.apiclient.model.Distributor;
import io.flexify.apiclient.model.Money;
import io.flexify.apiclient.model.PriceList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Billing Account Information
 */
@ApiModel(description = "Billing Account Information")




public class BillingAccount {
  /**
   * System Account state (Updated by Administrator)
   */
  public enum AdminStateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    AdminStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AdminStateEnum fromValue(String text) {
      for (AdminStateEnum b : AdminStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("adminState")
  private AdminStateEnum adminState = null;

  /**
   * Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE)
   */
  public enum AggregateStateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    AggregateStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AggregateStateEnum fromValue(String text) {
      for (AggregateStateEnum b : AggregateStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("aggregateState")
  private AggregateStateEnum aggregateState = null;

  /**
   * Billing Account state (Depend on balance and max credit)
   */
  public enum BillingStateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    BillingStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BillingStateEnum fromValue(String text) {
      for (BillingStateEnum b : BillingStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("billingState")
  private BillingStateEnum billingState = null;

  @JsonProperty("createdDate")
  private DateTime createdDate = null;

  @JsonProperty("distributor")
  private Distributor distributor = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("maxCredit")
  private Money maxCredit = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priceList")
  private PriceList priceList = null;

  public BillingAccount adminState(AdminStateEnum adminState) {
    this.adminState = adminState;
    return this;
  }

   /**
   * System Account state (Updated by Administrator)
   * @return adminState
  **/
  @ApiModelProperty(example = "ACTIVE", value = "System Account state (Updated by Administrator)")
  public AdminStateEnum getAdminState() {
    return adminState;
  }

  public void setAdminState(AdminStateEnum adminState) {
    this.adminState = adminState;
  }

  public BillingAccount aggregateState(AggregateStateEnum aggregateState) {
    this.aggregateState = aggregateState;
    return this;
  }

   /**
   * Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE)
   * @return aggregateState
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Aggregated Account state (ACTIVE only if admin state and billing state are ACTIVE)")
  public AggregateStateEnum getAggregateState() {
    return aggregateState;
  }

  public void setAggregateState(AggregateStateEnum aggregateState) {
    this.aggregateState = aggregateState;
  }

  public BillingAccount billingState(BillingStateEnum billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * Billing Account state (Depend on balance and max credit)
   * @return billingState
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Billing Account state (Depend on balance and max credit)")
  public BillingStateEnum getBillingState() {
    return billingState;
  }

  public void setBillingState(BillingStateEnum billingState) {
    this.billingState = billingState;
  }

  public BillingAccount createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Created Timestamp
   * @return createdDate
  **/
  @ApiModelProperty(value = "Created Timestamp")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public BillingAccount distributor(Distributor distributor) {
    this.distributor = distributor;
    return this;
  }

   /**
   * Distributor that manages this account
   * @return distributor
  **/
  @ApiModelProperty(value = "Distributor that manages this account")
  public Distributor getDistributor() {
    return distributor;
  }

  public void setDistributor(Distributor distributor) {
    this.distributor = distributor;
  }

  public BillingAccount id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Account Id
   * @return id
  **/
  @ApiModelProperty(value = "Account Id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BillingAccount maxCredit(Money maxCredit) {
    this.maxCredit = maxCredit;
    return this;
  }

   /**
   * Account Maximum Credit
   * @return maxCredit
  **/
  @ApiModelProperty(value = "Account Maximum Credit")
  public Money getMaxCredit() {
    return maxCredit;
  }

  public void setMaxCredit(Money maxCredit) {
    this.maxCredit = maxCredit;
  }

  public BillingAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Account Name
   * @return name
  **/
  @ApiModelProperty(example = "Personal Account", value = "Account Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillingAccount priceList(PriceList priceList) {
    this.priceList = priceList;
    return this;
  }

   /**
   * Price list (without prices)
   * @return priceList
  **/
  @ApiModelProperty(value = "Price list (without prices)")
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAccount billingAccount = (BillingAccount) o;
    return Objects.equals(this.adminState, billingAccount.adminState) &&
        Objects.equals(this.aggregateState, billingAccount.aggregateState) &&
        Objects.equals(this.billingState, billingAccount.billingState) &&
        Objects.equals(this.createdDate, billingAccount.createdDate) &&
        Objects.equals(this.distributor, billingAccount.distributor) &&
        Objects.equals(this.id, billingAccount.id) &&
        Objects.equals(this.maxCredit, billingAccount.maxCredit) &&
        Objects.equals(this.name, billingAccount.name) &&
        Objects.equals(this.priceList, billingAccount.priceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminState, aggregateState, billingState, createdDate, distributor, id, maxCredit, name, priceList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAccount {\n");
    
    sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
    sb.append("    aggregateState: ").append(toIndentedString(aggregateState)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxCredit: ").append(toIndentedString(maxCredit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
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

