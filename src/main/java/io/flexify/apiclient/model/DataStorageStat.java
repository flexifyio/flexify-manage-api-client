/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.4.0
 * Contact: info@flexify.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.flexify.apiclient.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * DataStorageStat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-07T17:03:52.903+03:00")
public class DataStorageStat {
  @JsonProperty("bytes")
  private Long bytes = null;

  @JsonProperty("lastRefreshed")
  private DateTime lastRefreshed = null;

  @JsonProperty("objects")
  private Long objects = null;

  /**
   * State of the storage
   */
  public enum StatStateEnum {
    NONE("NONE"),
    
    CALCULATING("CALCULATING"),
    
    REFRESHING("REFRESHING"),
    
    FAILED("FAILED"),
    
    CANCELED("CANCELED"),
    
    UPDATED("UPDATED");

    private String value;

    StatStateEnum(String value) {
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
    public static StatStateEnum fromValue(String text) {
      for (StatStateEnum b : StatStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("statState")
  private StatStateEnum statState = null;

  public DataStorageStat bytes(Long bytes) {
    this.bytes = bytes;
    return this;
  }

   /**
   * Bytes in this storage
   * @return bytes
  **/
  @ApiModelProperty(value = "Bytes in this storage")
  public Long getBytes() {
    return bytes;
  }

  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }

  public DataStorageStat lastRefreshed(DateTime lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
    return this;
  }

   /**
   * Last success refresh operation complete timestamp
   * @return lastRefreshed
  **/
  @ApiModelProperty(value = "Last success refresh operation complete timestamp")
  public DateTime getLastRefreshed() {
    return lastRefreshed;
  }

  public void setLastRefreshed(DateTime lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }

  public DataStorageStat objects(Long objects) {
    this.objects = objects;
    return this;
  }

   /**
   * Objects in this storage
   * @return objects
  **/
  @ApiModelProperty(value = "Objects in this storage")
  public Long getObjects() {
    return objects;
  }

  public void setObjects(Long objects) {
    this.objects = objects;
  }

  public DataStorageStat statState(StatStateEnum statState) {
    this.statState = statState;
    return this;
  }

   /**
   * State of the storage
   * @return statState
  **/
  @ApiModelProperty(value = "State of the storage")
  public StatStateEnum getStatState() {
    return statState;
  }

  public void setStatState(StatStateEnum statState) {
    this.statState = statState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataStorageStat dataStorageStat = (DataStorageStat) o;
    return Objects.equals(this.bytes, dataStorageStat.bytes) &&
        Objects.equals(this.lastRefreshed, dataStorageStat.lastRefreshed) &&
        Objects.equals(this.objects, dataStorageStat.objects) &&
        Objects.equals(this.statState, dataStorageStat.statState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, lastRefreshed, objects, statState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataStorageStat {\n");
    
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    statState: ").append(toIndentedString(statState)).append("\n");
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

