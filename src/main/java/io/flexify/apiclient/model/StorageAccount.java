/*
 * Flexify.IO User REST API
 * + Generate access token via `/rest/auth` + Authorize in Swagger UI using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.7.0
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
import io.flexify.apiclient.model.StorageAccountSettings;
import io.flexify.apiclient.model.StorageProvider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * StorageAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-19T15:19:29.561+08:00")
public class StorageAccount {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("provider")
  private StorageProvider provider = null;

  @JsonProperty("settings")
  private StorageAccountSettings settings = null;

  @JsonProperty("url")
  private String url = null;

   /**
   * Id of the storage account
   * @return id
  **/
  @ApiModelProperty(value = "Id of the storage account")
  public Long getId() {
    return id;
  }

  public StorageAccount provider(StorageProvider provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Link to the storage provider (Amazon, Azure, etc)
   * @return provider
  **/
  @ApiModelProperty(value = "Link to the storage provider (Amazon, Azure, etc)")
  public StorageProvider getProvider() {
    return provider;
  }

  public void setProvider(StorageProvider provider) {
    this.provider = provider;
  }

  public StorageAccount settings(StorageAccountSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Configuration of this storage account
   * @return settings
  **/
  @ApiModelProperty(value = "Configuration of this storage account")
  public StorageAccountSettings getSettings() {
    return settings;
  }

  public void setSettings(StorageAccountSettings settings) {
    this.settings = settings;
  }

  public StorageAccount url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to the cloud
   * @return url
  **/
  @ApiModelProperty(example = "https://s3.amazonaws.com", value = "URL to the cloud")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccount storageAccount = (StorageAccount) o;
    return Objects.equals(this.id, storageAccount.id) &&
        Objects.equals(this.provider, storageAccount.provider) &&
        Objects.equals(this.settings, storageAccount.settings) &&
        Objects.equals(this.url, storageAccount.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, provider, settings, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

