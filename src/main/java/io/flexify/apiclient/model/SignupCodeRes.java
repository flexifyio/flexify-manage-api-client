/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.5-SNAPSHOT
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
import io.flexify.apiclient.model.SignupCodeStat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SignupCodeRes
 */




public class SignupCodeRes {
  @JsonProperty("code")
  private String code = null;

  /**
   * Gets or Sets roles
   */
  public enum RolesEnum {
    ACTUATOR("ROLE_ACTUATOR"),
    
    ADMIN("ROLE_ADMIN"),
    
    BILLING("ROLE_BILLING"),
    
    DISTRIBUTOR("ROLE_DISTRIBUTOR"),
    
    IMPERSONATOR("ROLE_IMPERSONATOR"),
    
    PARTNER_ADMIN("ROLE_PARTNER_ADMIN"),
    
    USER("ROLE_USER");

    private String value;

    RolesEnum(String value) {
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
    public static RolesEnum fromValue(String text) {
      for (RolesEnum b : RolesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roles")
  private List<RolesEnum> roles = null;

  @JsonProperty("singleUse")
  private Boolean singleUse = null;

  @JsonProperty("stat")
  private SignupCodeStat stat = null;

  public SignupCodeRes code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SignupCodeRes roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public SignupCodeRes addRolesItem(RolesEnum rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RolesEnum>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  public SignupCodeRes singleUse(Boolean singleUse) {
    this.singleUse = singleUse;
    return this;
  }

   /**
   * Get singleUse
   * @return singleUse
  **/
  @ApiModelProperty(value = "")
  public Boolean isSingleUse() {
    return singleUse;
  }

  public void setSingleUse(Boolean singleUse) {
    this.singleUse = singleUse;
  }

  public SignupCodeRes stat(SignupCodeStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @ApiModelProperty(value = "")
  public SignupCodeStat getStat() {
    return stat;
  }

  public void setStat(SignupCodeStat stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupCodeRes signupCodeRes = (SignupCodeRes) o;
    return Objects.equals(this.code, signupCodeRes.code) &&
        Objects.equals(this.roles, signupCodeRes.roles) &&
        Objects.equals(this.singleUse, signupCodeRes.singleUse) &&
        Objects.equals(this.stat, signupCodeRes.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, roles, singleUse, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupCodeRes {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    singleUse: ").append(toIndentedString(singleUse)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

