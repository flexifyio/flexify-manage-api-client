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
import io.flexify.apiclient.model.EndpointStat;
import io.flexify.apiclient.model.EndpointStorage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Endpoint
 */
@ApiModel(description = "Data Endpoint")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-07T17:03:52.903+03:00")
public class EndpointDetails {
  @JsonProperty("bucket")
  private String bucket = null;

  @JsonProperty("credential")
  private String credential = null;

  @JsonProperty("endpointStorages")
  private List<EndpointStorage> endpointStorages = null;

  @JsonProperty("hostnames")
  private List<String> hostnames = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("identity")
  private String identity = null;

  /**
   * Storage Protocol
   */
  public enum ProtocolEnum {
    S3("S3"),
    
    AZURE("AZURE"),
    
    GOOGLE("GOOGLE"),
    
    OPENSTACK("OPENSTACK"),
    
    RACKSPACE("RACKSPACE");

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

  @JsonProperty("stat")
  private EndpointStat stat = null;

  public EndpointDetails bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Backet name
   * @return bucket
  **/
  @ApiModelProperty(example = "flexifyio", value = "Backet name")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public EndpointDetails credential(String credential) {
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

  public EndpointDetails endpointStorages(List<EndpointStorage> endpointStorages) {
    this.endpointStorages = endpointStorages;
    return this;
  }

  public EndpointDetails addEndpointStoragesItem(EndpointStorage endpointStoragesItem) {
    if (this.endpointStorages == null) {
      this.endpointStorages = new ArrayList<EndpointStorage>();
    }
    this.endpointStorages.add(endpointStoragesItem);
    return this;
  }

   /**
   * Get endpointStorages
   * @return endpointStorages
  **/
  @ApiModelProperty(value = "")
  public List<EndpointStorage> getEndpointStorages() {
    return endpointStorages;
  }

  public void setEndpointStorages(List<EndpointStorage> endpointStorages) {
    this.endpointStorages = endpointStorages;
  }

  public EndpointDetails hostnames(List<String> hostnames) {
    this.hostnames = hostnames;
    return this;
  }

  public EndpointDetails addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<String>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Get hostnames
   * @return hostnames
  **/
  @ApiModelProperty(value = "")
  public List<String> getHostnames() {
    return hostnames;
  }

  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }

  public EndpointDetails id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EndpointDetails identity(String identity) {
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

  public EndpointDetails protocol(ProtocolEnum protocol) {
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

  public EndpointDetails publicAccessReadAllBlobs(Boolean publicAccessReadAllBlobs) {
    this.publicAccessReadAllBlobs = publicAccessReadAllBlobs;
    return this;
  }

   /**
   * Public read access for all objects
   * @return publicAccessReadAllBlobs
  **/
  @ApiModelProperty(example = "false", value = "Public read access for all objects")
  public Boolean isPublicAccessReadAllBlobs() {
    return publicAccessReadAllBlobs;
  }

  public void setPublicAccessReadAllBlobs(Boolean publicAccessReadAllBlobs) {
    this.publicAccessReadAllBlobs = publicAccessReadAllBlobs;
  }

  public EndpointDetails stat(EndpointStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @ApiModelProperty(value = "")
  public EndpointStat getStat() {
    return stat;
  }

  public void setStat(EndpointStat stat) {
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
    EndpointDetails endpointDetails = (EndpointDetails) o;
    return Objects.equals(this.bucket, endpointDetails.bucket) &&
        Objects.equals(this.credential, endpointDetails.credential) &&
        Objects.equals(this.endpointStorages, endpointDetails.endpointStorages) &&
        Objects.equals(this.hostnames, endpointDetails.hostnames) &&
        Objects.equals(this.id, endpointDetails.id) &&
        Objects.equals(this.identity, endpointDetails.identity) &&
        Objects.equals(this.protocol, endpointDetails.protocol) &&
        Objects.equals(this.publicAccessReadAllBlobs, endpointDetails.publicAccessReadAllBlobs) &&
        Objects.equals(this.stat, endpointDetails.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, credential, endpointStorages, hostnames, id, identity, protocol, publicAccessReadAllBlobs, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointDetails {\n");
    
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    endpointStorages: ").append(toIndentedString(endpointStorages)).append("\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    publicAccessReadAllBlobs: ").append(toIndentedString(publicAccessReadAllBlobs)).append("\n");
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

