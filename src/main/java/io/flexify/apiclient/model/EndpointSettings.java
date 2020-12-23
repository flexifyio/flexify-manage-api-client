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
 * Flexify.IO Virtual Endpoint
 */
@ApiModel(description = "Flexify.IO Virtual Endpoint")




public class EndpointSettings {
  @JsonProperty("credential")
  private String credential = null;

  @JsonProperty("identity")
  private String identity = null;

  /**
   * Storage Protocol
   */
  public enum ProtocolEnum {
    AZURE("AZURE"),
    
    B2("B2"),
    
    DROPBOX("DROPBOX"),
    
    DROPBOX_TEAM("DROPBOX_TEAM"),
    
    S3("S3");

    private String value;

    ProtocolEnum(String value) {
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
    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("protocol")
  private ProtocolEnum protocol = null;

  @JsonProperty("publicAccessReadAllBlobs")
  private Boolean publicAccessReadAllBlobs = null;

  @JsonProperty("selectionBreakTimeout")
  private Long selectionBreakTimeout = null;

  /**
   * Storage selection policy for GET/HEAD object requests
   */
  public enum SelectionPolicyEnum {
    FASTEST("FASTEST"),
    
    NEWEST("NEWEST");

    private String value;

    SelectionPolicyEnum(String value) {
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
    public static SelectionPolicyEnum fromValue(String text) {
      for (SelectionPolicyEnum b : SelectionPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("selectionPolicy")
  private SelectionPolicyEnum selectionPolicy = null;

  public EndpointSettings credential(String credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Storage Credential (Secret Key)
   * @return credential
  **/
  @ApiModelProperty(example = "xRFZjLNGnRv8Y3hIWW5yX2WKKjzwZZaJBo3TvlF9", value = "Storage Credential (Secret Key)")
  public String getCredential() {
    return credential;
  }

  public void setCredential(String credential) {
    this.credential = credential;
  }

  public EndpointSettings identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Storage Identity (Access Key)
   * @return identity
  **/
  @ApiModelProperty(example = "P16UNOh1ELAXQXFWLhok", value = "Storage Identity (Access Key)")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public EndpointSettings protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Storage Protocol
   * @return protocol
  **/
  @ApiModelProperty(example = "S3", value = "Storage Protocol")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public EndpointSettings publicAccessReadAllBlobs(Boolean publicAccessReadAllBlobs) {
    this.publicAccessReadAllBlobs = publicAccessReadAllBlobs;
    return this;
  }

   /**
   * Public read access for all objects in virtual buckets
   * @return publicAccessReadAllBlobs
  **/
  @ApiModelProperty(example = "false", value = "Public read access for all objects in virtual buckets")
  public Boolean isPublicAccessReadAllBlobs() {
    return publicAccessReadAllBlobs;
  }

  public void setPublicAccessReadAllBlobs(Boolean publicAccessReadAllBlobs) {
    this.publicAccessReadAllBlobs = publicAccessReadAllBlobs;
  }

  public EndpointSettings selectionBreakTimeout(Long selectionBreakTimeout) {
    this.selectionBreakTimeout = selectionBreakTimeout;
    return this;
  }

   /**
   * Timeout before canceling rqeusts to non-responing clouds in FASTEST selection policy
   * @return selectionBreakTimeout
  **/
  @ApiModelProperty(example = "300", value = "Timeout before canceling rqeusts to non-responing clouds in FASTEST selection policy")
  public Long getSelectionBreakTimeout() {
    return selectionBreakTimeout;
  }

  public void setSelectionBreakTimeout(Long selectionBreakTimeout) {
    this.selectionBreakTimeout = selectionBreakTimeout;
  }

  public EndpointSettings selectionPolicy(SelectionPolicyEnum selectionPolicy) {
    this.selectionPolicy = selectionPolicy;
    return this;
  }

   /**
   * Storage selection policy for GET/HEAD object requests
   * @return selectionPolicy
  **/
  @ApiModelProperty(example = "NEWEST", value = "Storage selection policy for GET/HEAD object requests")
  public SelectionPolicyEnum getSelectionPolicy() {
    return selectionPolicy;
  }

  public void setSelectionPolicy(SelectionPolicyEnum selectionPolicy) {
    this.selectionPolicy = selectionPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointSettings endpointSettings = (EndpointSettings) o;
    return Objects.equals(this.credential, endpointSettings.credential) &&
        Objects.equals(this.identity, endpointSettings.identity) &&
        Objects.equals(this.protocol, endpointSettings.protocol) &&
        Objects.equals(this.publicAccessReadAllBlobs, endpointSettings.publicAccessReadAllBlobs) &&
        Objects.equals(this.selectionBreakTimeout, endpointSettings.selectionBreakTimeout) &&
        Objects.equals(this.selectionPolicy, endpointSettings.selectionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, identity, protocol, publicAccessReadAllBlobs, selectionBreakTimeout, selectionPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointSettings {\n");
    
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    publicAccessReadAllBlobs: ").append(toIndentedString(publicAccessReadAllBlobs)).append("\n");
    sb.append("    selectionBreakTimeout: ").append(toIndentedString(selectionBreakTimeout)).append("\n");
    sb.append("    selectionPolicy: ").append(toIndentedString(selectionPolicy)).append("\n");
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

