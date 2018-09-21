/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.6
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

/**
 * StorageAccountSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-21T12:54:18.961+08:00")
public class StorageAccountSettings {
  @JsonProperty("anonymous")
  private Boolean anonymous = null;

  @JsonProperty("credential")
  private String credential = null;

  @JsonProperty("identity")
  private String identity = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("useSsl")
  private Boolean useSsl = null;

  public StorageAccountSettings anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * True for public account
   * @return anonymous
  **/
  @ApiModelProperty(example = "false", value = "True for public account")
  public Boolean isAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public StorageAccountSettings credential(String credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Credential (such as Secret Key) of the cloud account
   * @return credential
  **/
  @ApiModelProperty(value = "Credential (such as Secret Key) of the cloud account")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }

  public StorageAccountSettings identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Identity (such as Key ID) of the cloud account
   * @return identity
  **/
  @ApiModelProperty(value = "Identity (such as Key ID) of the cloud account")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public StorageAccountSettings name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-defined storage account name
   * @return name
  **/
  @ApiModelProperty(value = "User-defined storage account name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StorageAccountSettings useSsl(Boolean useSsl) {
    this.useSsl = useSsl;
    return this;
  }

   /**
   * Encrypt transfer with SSL
   * @return useSsl
  **/
  @ApiModelProperty(example = "true", value = "Encrypt transfer with SSL")
  public Boolean isUseSsl() {
    return useSsl;
  }

  public void setUseSsl(Boolean useSsl) {
    this.useSsl = useSsl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccountSettings storageAccountSettings = (StorageAccountSettings) o;
    return Objects.equals(this.anonymous, storageAccountSettings.anonymous) &&
        Objects.equals(this.credential, storageAccountSettings.credential) &&
        Objects.equals(this.identity, storageAccountSettings.identity) &&
        Objects.equals(this.name, storageAccountSettings.name) &&
        Objects.equals(this.useSsl, storageAccountSettings.useSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymous, credential, identity, name, useSsl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountSettings {\n");
    
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    useSsl: ").append(toIndentedString(useSsl)).append("\n");
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
