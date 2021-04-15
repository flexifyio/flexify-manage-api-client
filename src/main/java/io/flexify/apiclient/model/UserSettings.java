/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.3
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
 * User&#39;s settings
 */
@ApiModel(description = "User's settings")




public class UserSettings {
  @JsonProperty("allowPartnerManage")
  private Boolean allowPartnerManage = null;

  @JsonProperty("sendNews")
  private Boolean sendNews = null;

  @JsonProperty("sendNotifications")
  private Boolean sendNotifications = null;

  public UserSettings allowPartnerManage(Boolean allowPartnerManage) {
    this.allowPartnerManage = allowPartnerManage;
    return this;
  }

   /**
   * Indicates that the user allowed his or her partner to impersonate and manage user&#39;s account
   * @return allowPartnerManage
  **/
  @ApiModelProperty(value = "Indicates that the user allowed his or her partner to impersonate and manage user's account")
  public Boolean isAllowPartnerManage() {
    return allowPartnerManage;
  }

  public void setAllowPartnerManage(Boolean allowPartnerManage) {
    this.allowPartnerManage = allowPartnerManage;
  }

  public UserSettings sendNews(Boolean sendNews) {
    this.sendNews = sendNews;
    return this;
  }

   /**
   * Indicates tha the user agreed to receive news and updates
   * @return sendNews
  **/
  @ApiModelProperty(value = "Indicates tha the user agreed to receive news and updates")
  public Boolean isSendNews() {
    return sendNews;
  }

  public void setSendNews(Boolean sendNews) {
    this.sendNews = sendNews;
  }

  public UserSettings sendNotifications(Boolean sendNotifications) {
    this.sendNotifications = sendNotifications;
    return this;
  }

   /**
   * Indicates that we should send system notifications to the user
   * @return sendNotifications
  **/
  @ApiModelProperty(value = "Indicates that we should send system notifications to the user")
  public Boolean isSendNotifications() {
    return sendNotifications;
  }

  public void setSendNotifications(Boolean sendNotifications) {
    this.sendNotifications = sendNotifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettings userSettings = (UserSettings) o;
    return Objects.equals(this.allowPartnerManage, userSettings.allowPartnerManage) &&
        Objects.equals(this.sendNews, userSettings.sendNews) &&
        Objects.equals(this.sendNotifications, userSettings.sendNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPartnerManage, sendNews, sendNotifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettings {\n");
    
    sb.append("    allowPartnerManage: ").append(toIndentedString(allowPartnerManage)).append("\n");
    sb.append("    sendNews: ").append(toIndentedString(sendNews)).append("\n");
    sb.append("    sendNotifications: ").append(toIndentedString(sendNotifications)).append("\n");
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

