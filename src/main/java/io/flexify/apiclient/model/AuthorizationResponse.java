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
import io.flexify.apiclient.model.GrantedAuthority;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Authorization response
 */
@ApiModel(description = "Authorization response")




public class AuthorizationResponse {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("accountNonExpired")
  private Boolean accountNonExpired = null;

  @JsonProperty("accountNonLocked")
  private Boolean accountNonLocked = null;

  @JsonProperty("authorities")
  private List<GrantedAuthority> authorities = null;

  @JsonProperty("credentialsNonExpired")
  private Boolean credentialsNonExpired = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("username")
  private String username = null;

  public AuthorizationResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AuthorizationResponse accountNonExpired(Boolean accountNonExpired) {
    this.accountNonExpired = accountNonExpired;
    return this;
  }

   /**
   * Get accountNonExpired
   * @return accountNonExpired
  **/
  @ApiModelProperty(value = "")
  public Boolean isAccountNonExpired() {
    return accountNonExpired;
  }

  public void setAccountNonExpired(Boolean accountNonExpired) {
    this.accountNonExpired = accountNonExpired;
  }

  public AuthorizationResponse accountNonLocked(Boolean accountNonLocked) {
    this.accountNonLocked = accountNonLocked;
    return this;
  }

   /**
   * Get accountNonLocked
   * @return accountNonLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isAccountNonLocked() {
    return accountNonLocked;
  }

  public void setAccountNonLocked(Boolean accountNonLocked) {
    this.accountNonLocked = accountNonLocked;
  }

  public AuthorizationResponse authorities(List<GrantedAuthority> authorities) {
    this.authorities = authorities;
    return this;
  }

  public AuthorizationResponse addAuthoritiesItem(GrantedAuthority authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new ArrayList<GrantedAuthority>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @ApiModelProperty(value = "")
  public List<GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(List<GrantedAuthority> authorities) {
    this.authorities = authorities;
  }

  public AuthorizationResponse credentialsNonExpired(Boolean credentialsNonExpired) {
    this.credentialsNonExpired = credentialsNonExpired;
    return this;
  }

   /**
   * Get credentialsNonExpired
   * @return credentialsNonExpired
  **/
  @ApiModelProperty(value = "")
  public Boolean isCredentialsNonExpired() {
    return credentialsNonExpired;
  }

  public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
    this.credentialsNonExpired = credentialsNonExpired;
  }

  public AuthorizationResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AuthorizationResponse userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public AuthorizationResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationResponse authorizationResponse = (AuthorizationResponse) o;
    return Objects.equals(this.accountId, authorizationResponse.accountId) &&
        Objects.equals(this.accountNonExpired, authorizationResponse.accountNonExpired) &&
        Objects.equals(this.accountNonLocked, authorizationResponse.accountNonLocked) &&
        Objects.equals(this.authorities, authorizationResponse.authorities) &&
        Objects.equals(this.credentialsNonExpired, authorizationResponse.credentialsNonExpired) &&
        Objects.equals(this.enabled, authorizationResponse.enabled) &&
        Objects.equals(this.userId, authorizationResponse.userId) &&
        Objects.equals(this.username, authorizationResponse.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountNonExpired, accountNonLocked, authorities, credentialsNonExpired, enabled, userId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNonExpired: ").append(toIndentedString(accountNonExpired)).append("\n");
    sb.append("    accountNonLocked: ").append(toIndentedString(accountNonLocked)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    credentialsNonExpired: ").append(toIndentedString(credentialsNonExpired)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

