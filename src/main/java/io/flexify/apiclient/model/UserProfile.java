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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User&#39;s profile
 */
@ApiModel(description = "User's profile")




public class UserProfile {
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("streetFirstLine")
  private String streetFirstLine = null;

  @JsonProperty("streetSecondLine")
  private String streetSecondLine = null;

  @JsonProperty("zip")
  private String zip = null;

  public UserProfile city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "Munchkin Village", value = "City")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserProfile company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company
   * @return company
  **/
  @ApiModelProperty(example = "Wiz", value = "Company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UserProfile country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @ApiModelProperty(example = "Munchkin Country", value = "Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public UserProfile displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name (usually first and last name)
   * @return displayName
  **/
  @ApiModelProperty(example = "Scarecrow The Wiz", value = "Display name (usually first and last name)")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserProfile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address, always matches the username
   * @return email
  **/
  @ApiModelProperty(example = "scarecrow@wiz.oz", value = "Email address, always matches the username")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserProfile phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone number
   * @return phone
  **/
  @ApiModelProperty(example = "+78887775533", value = "Phone number")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserProfile streetFirstLine(String streetFirstLine) {
    this.streetFirstLine = streetFirstLine;
    return this;
  }

   /**
   * Street address - first line
   * @return streetFirstLine
  **/
  @ApiModelProperty(example = "Deadly Poppy Field", value = "Street address - first line")
  public String getStreetFirstLine() {
    return streetFirstLine;
  }

  public void setStreetFirstLine(String streetFirstLine) {
    this.streetFirstLine = streetFirstLine;
  }

  public UserProfile streetSecondLine(String streetSecondLine) {
    this.streetSecondLine = streetSecondLine;
    return this;
  }

   /**
   * Street address - second line
   * @return streetSecondLine
  **/
  @ApiModelProperty(value = "Street address - second line")
  public String getStreetSecondLine() {
    return streetSecondLine;
  }

  public void setStreetSecondLine(String streetSecondLine) {
    this.streetSecondLine = streetSecondLine;
  }

  public UserProfile zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Zip code
   * @return zip
  **/
  @ApiModelProperty(example = "17564", value = "Zip code")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.city, userProfile.city) &&
        Objects.equals(this.company, userProfile.company) &&
        Objects.equals(this.country, userProfile.country) &&
        Objects.equals(this.displayName, userProfile.displayName) &&
        Objects.equals(this.email, userProfile.email) &&
        Objects.equals(this.phone, userProfile.phone) &&
        Objects.equals(this.streetFirstLine, userProfile.streetFirstLine) &&
        Objects.equals(this.streetSecondLine, userProfile.streetSecondLine) &&
        Objects.equals(this.zip, userProfile.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, company, country, displayName, email, phone, streetFirstLine, streetSecondLine, zip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    streetFirstLine: ").append(toIndentedString(streetFirstLine)).append("\n");
    sb.append("    streetSecondLine: ").append(toIndentedString(streetSecondLine)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

