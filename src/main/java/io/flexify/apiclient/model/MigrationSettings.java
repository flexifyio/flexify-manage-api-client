/*
 * Flexify.IO User REST API
 * + Get API token + Authorize using `Bearer TOKEN` + Enjoy Flexify.IO REST API
 *
 * OpenAPI spec version: 2.12.4-SNAPSHOT
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
import io.flexify.apiclient.model.CloudLocationReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Start new migration request
 */
@ApiModel(description = "Start new migration request")




public class MigrationSettings {
  /**
   * Conflict resolution
   */
  public enum ConflictResolutionEnum {
    BOTH("BOTH"),
    
    DESTINATION("DESTINATION"),
    
    NEWER("NEWER"),
    
    SOURCE("SOURCE");

    private String value;

    ConflictResolutionEnum(String value) {
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
    public static ConflictResolutionEnum fromValue(String text) {
      for (ConflictResolutionEnum b : ConflictResolutionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("conflictResolution")
  private ConflictResolutionEnum conflictResolution = null;

  /**
   * The type of engine deployment
   */
  public enum DeploymentTypeEnum {
    AUTO("AUTO"),
    
    DEPLOYMENT("DEPLOYMENT"),
    
    SELECTION("SELECTION");

    private String value;

    DeploymentTypeEnum(String value) {
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
    public static DeploymentTypeEnum fromValue(String text) {
      for (DeploymentTypeEnum b : DeploymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deploymentType")
  private DeploymentTypeEnum deploymentType = null;

  @JsonProperty("dryRun")
  private Boolean dryRun = null;

  @JsonProperty("enginesLocation")
  private CloudLocationReq enginesLocation = null;

  /**
   * Keep or clean data in destination before migration (identical with source objects keep in any cases)
   */
  public enum ExistingDataInDestinationEnum {
    CLEAN("CLEAN"),
    
    KEEP("KEEP");

    private String value;

    ExistingDataInDestinationEnum(String value) {
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
    public static ExistingDataInDestinationEnum fromValue(String text) {
      for (ExistingDataInDestinationEnum b : ExistingDataInDestinationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("existingDataInDestination")
  private ExistingDataInDestinationEnum existingDataInDestination = null;

  @JsonProperty("lastModifiedFrom")
  private DateTime lastModifiedFrom = null;

  @JsonProperty("maxEngines")
  private Integer maxEngines = null;

  @JsonProperty("maxRetries")
  private Integer maxRetries = null;

  @JsonProperty("maxRetriesForCopy")
  private Integer maxRetriesForCopy = null;

  @JsonProperty("maxRetryTimeout")
  private Integer maxRetryTimeout = null;

  @JsonProperty("maxStreams")
  private Integer maxStreams = null;

  /**
   * Migration mode
   */
  public enum MigrationModeEnum {
    COPY("COPY"),
    
    MOVE("MOVE");

    private String value;

    MigrationModeEnum(String value) {
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
    public static MigrationModeEnum fromValue(String text) {
      for (MigrationModeEnum b : MigrationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("migrationMode")
  private MigrationModeEnum migrationMode = null;

  @JsonProperty("multipartConcurrency")
  private Integer multipartConcurrency = null;

  @JsonProperty("multipartLimit")
  private Long multipartLimit = null;

  @JsonProperty("multipartPartSize")
  private Long multipartPartSize = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("objectKeyFilter")
  private String objectKeyFilter = null;

  @JsonProperty("retryTimeout")
  private Integer retryTimeout = null;

  @JsonProperty("skipIfHashMatches")
  private Boolean skipIfHashMatches = null;

  @JsonProperty("slotsPerMapping")
  private Integer slotsPerMapping = null;

  public MigrationSettings conflictResolution(ConflictResolutionEnum conflictResolution) {
    this.conflictResolution = conflictResolution;
    return this;
  }

   /**
   * Conflict resolution
   * @return conflictResolution
  **/
  @ApiModelProperty(example = "NEWER", value = "Conflict resolution")
  public ConflictResolutionEnum getConflictResolution() {
    return conflictResolution;
  }

  public void setConflictResolution(ConflictResolutionEnum conflictResolution) {
    this.conflictResolution = conflictResolution;
  }

  public MigrationSettings deploymentType(DeploymentTypeEnum deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

   /**
   * The type of engine deployment
   * @return deploymentType
  **/
  @ApiModelProperty(value = "The type of engine deployment")
  public DeploymentTypeEnum getDeploymentType() {
    return deploymentType;
  }

  public void setDeploymentType(DeploymentTypeEnum deploymentType) {
    this.deploymentType = deploymentType;
  }

  public MigrationSettings dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Dry run mode
   * @return dryRun
  **/
  @ApiModelProperty(value = "Dry run mode")
  public Boolean isDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public MigrationSettings enginesLocation(CloudLocationReq enginesLocation) {
    this.enginesLocation = enginesLocation;
    return this;
  }

   /**
   * Location of the engines to migrate
   * @return enginesLocation
  **/
  @ApiModelProperty(value = "Location of the engines to migrate")
  public CloudLocationReq getEnginesLocation() {
    return enginesLocation;
  }

  public void setEnginesLocation(CloudLocationReq enginesLocation) {
    this.enginesLocation = enginesLocation;
  }

  public MigrationSettings existingDataInDestination(ExistingDataInDestinationEnum existingDataInDestination) {
    this.existingDataInDestination = existingDataInDestination;
    return this;
  }

   /**
   * Keep or clean data in destination before migration (identical with source objects keep in any cases)
   * @return existingDataInDestination
  **/
  @ApiModelProperty(example = "KEEP", value = "Keep or clean data in destination before migration (identical with source objects keep in any cases)")
  public ExistingDataInDestinationEnum getExistingDataInDestination() {
    return existingDataInDestination;
  }

  public void setExistingDataInDestination(ExistingDataInDestinationEnum existingDataInDestination) {
    this.existingDataInDestination = existingDataInDestination;
  }

  public MigrationSettings lastModifiedFrom(DateTime lastModifiedFrom) {
    this.lastModifiedFrom = lastModifiedFrom;
    return this;
  }

   /**
   * Migrate objects modified on or after specified date
   * @return lastModifiedFrom
  **/
  @ApiModelProperty(example = "1593080831081", value = "Migrate objects modified on or after specified date")
  public DateTime getLastModifiedFrom() {
    return lastModifiedFrom;
  }

  public void setLastModifiedFrom(DateTime lastModifiedFrom) {
    this.lastModifiedFrom = lastModifiedFrom;
  }

  public MigrationSettings maxEngines(Integer maxEngines) {
    this.maxEngines = maxEngines;
    return this;
  }

   /**
   * Maximum number of engines this migration uses (experimental)
   * @return maxEngines
  **/
  @ApiModelProperty(example = "1", value = "Maximum number of engines this migration uses (experimental)")
  public Integer getMaxEngines() {
    return maxEngines;
  }

  public void setMaxEngines(Integer maxEngines) {
    this.maxEngines = maxEngines;
  }

  public MigrationSettings maxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

   /**
   * Maximum number of retries
   * @return maxRetries
  **/
  @ApiModelProperty(example = "100", value = "Maximum number of retries")
  public Integer getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
  }

  public MigrationSettings maxRetriesForCopy(Integer maxRetriesForCopy) {
    this.maxRetriesForCopy = maxRetriesForCopy;
    return this;
  }

   /**
   * Maximum number of retries after copy started
   * @return maxRetriesForCopy
  **/
  @ApiModelProperty(example = "10", value = "Maximum number of retries after copy started")
  public Integer getMaxRetriesForCopy() {
    return maxRetriesForCopy;
  }

  public void setMaxRetriesForCopy(Integer maxRetriesForCopy) {
    this.maxRetriesForCopy = maxRetriesForCopy;
  }

  public MigrationSettings maxRetryTimeout(Integer maxRetryTimeout) {
    this.maxRetryTimeout = maxRetryTimeout;
    return this;
  }

   /**
   * Maximum timeout between retries in seconds
   * @return maxRetryTimeout
  **/
  @ApiModelProperty(example = "5", value = "Maximum timeout between retries in seconds")
  public Integer getMaxRetryTimeout() {
    return maxRetryTimeout;
  }

  public void setMaxRetryTimeout(Integer maxRetryTimeout) {
    this.maxRetryTimeout = maxRetryTimeout;
  }

  public MigrationSettings maxStreams(Integer maxStreams) {
    this.maxStreams = maxStreams;
    return this;
  }

   /**
   * Maximum streams that migration will use across all engines
   * @return maxStreams
  **/
  @ApiModelProperty(example = "16", value = "Maximum streams that migration will use across all engines")
  public Integer getMaxStreams() {
    return maxStreams;
  }

  public void setMaxStreams(Integer maxStreams) {
    this.maxStreams = maxStreams;
  }

  public MigrationSettings migrationMode(MigrationModeEnum migrationMode) {
    this.migrationMode = migrationMode;
    return this;
  }

   /**
   * Migration mode
   * @return migrationMode
  **/
  @ApiModelProperty(example = "COPY", value = "Migration mode")
  public MigrationModeEnum getMigrationMode() {
    return migrationMode;
  }

  public void setMigrationMode(MigrationModeEnum migrationMode) {
    this.migrationMode = migrationMode;
  }

  public MigrationSettings multipartConcurrency(Integer multipartConcurrency) {
    this.multipartConcurrency = multipartConcurrency;
    return this;
  }

   /**
   * Maximum parts for parallel upload for a single object
   * @return multipartConcurrency
  **/
  @ApiModelProperty(example = "16", value = "Maximum parts for parallel upload for a single object")
  public Integer getMultipartConcurrency() {
    return multipartConcurrency;
  }

  public void setMultipartConcurrency(Integer multipartConcurrency) {
    this.multipartConcurrency = multipartConcurrency;
  }

  public MigrationSettings multipartLimit(Long multipartLimit) {
    this.multipartLimit = multipartLimit;
    return this;
  }

   /**
   * Minimum size in bytes for multipart upload
   * @return multipartLimit
  **/
  @ApiModelProperty(example = "524288000", value = "Minimum size in bytes for multipart upload")
  public Long getMultipartLimit() {
    return multipartLimit;
  }

  public void setMultipartLimit(Long multipartLimit) {
    this.multipartLimit = multipartLimit;
  }

  public MigrationSettings multipartPartSize(Long multipartPartSize) {
    this.multipartPartSize = multipartPartSize;
    return this;
  }

   /**
   * Part size for multipart upload
   * @return multipartPartSize
  **/
  @ApiModelProperty(example = "104857600", value = "Part size for multipart upload")
  public Long getMultipartPartSize() {
    return multipartPartSize;
  }

  public void setMultipartPartSize(Long multipartPartSize) {
    this.multipartPartSize = multipartPartSize;
  }

  public MigrationSettings name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the migration
   * @return name
  **/
  @ApiModelProperty(example = "Copy from source to destination", value = "Name of the migration")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MigrationSettings objectKeyFilter(String objectKeyFilter) {
    this.objectKeyFilter = objectKeyFilter;
    return this;
  }

   /**
   * Migrate objects matching pattern
   * @return objectKeyFilter
  **/
  @ApiModelProperty(example = "*", value = "Migrate objects matching pattern")
  public String getObjectKeyFilter() {
    return objectKeyFilter;
  }

  public void setObjectKeyFilter(String objectKeyFilter) {
    this.objectKeyFilter = objectKeyFilter;
  }

  public MigrationSettings retryTimeout(Integer retryTimeout) {
    this.retryTimeout = retryTimeout;
    return this;
  }

   /**
   * Initial timeout between retries in seconds
   * @return retryTimeout
  **/
  @ApiModelProperty(example = "5", value = "Initial timeout between retries in seconds")
  public Integer getRetryTimeout() {
    return retryTimeout;
  }

  public void setRetryTimeout(Integer retryTimeout) {
    this.retryTimeout = retryTimeout;
  }

  public MigrationSettings skipIfHashMatches(Boolean skipIfHashMatches) {
    this.skipIfHashMatches = skipIfHashMatches;
    return this;
  }

   /**
   * Skip migration if source and destination object hash match
   * @return skipIfHashMatches
  **/
  @ApiModelProperty(example = "true", value = "Skip migration if source and destination object hash match")
  public Boolean isSkipIfHashMatches() {
    return skipIfHashMatches;
  }

  public void setSkipIfHashMatches(Boolean skipIfHashMatches) {
    this.skipIfHashMatches = skipIfHashMatches;
  }

  public MigrationSettings slotsPerMapping(Integer slotsPerMapping) {
    this.slotsPerMapping = slotsPerMapping;
    return this;
  }

   /**
   * Number of slots of storage mapping (bucket)
   * @return slotsPerMapping
  **/
  @ApiModelProperty(example = "1", value = "Number of slots of storage mapping (bucket)")
  public Integer getSlotsPerMapping() {
    return slotsPerMapping;
  }

  public void setSlotsPerMapping(Integer slotsPerMapping) {
    this.slotsPerMapping = slotsPerMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationSettings migrationSettings = (MigrationSettings) o;
    return Objects.equals(this.conflictResolution, migrationSettings.conflictResolution) &&
        Objects.equals(this.deploymentType, migrationSettings.deploymentType) &&
        Objects.equals(this.dryRun, migrationSettings.dryRun) &&
        Objects.equals(this.enginesLocation, migrationSettings.enginesLocation) &&
        Objects.equals(this.existingDataInDestination, migrationSettings.existingDataInDestination) &&
        Objects.equals(this.lastModifiedFrom, migrationSettings.lastModifiedFrom) &&
        Objects.equals(this.maxEngines, migrationSettings.maxEngines) &&
        Objects.equals(this.maxRetries, migrationSettings.maxRetries) &&
        Objects.equals(this.maxRetriesForCopy, migrationSettings.maxRetriesForCopy) &&
        Objects.equals(this.maxRetryTimeout, migrationSettings.maxRetryTimeout) &&
        Objects.equals(this.maxStreams, migrationSettings.maxStreams) &&
        Objects.equals(this.migrationMode, migrationSettings.migrationMode) &&
        Objects.equals(this.multipartConcurrency, migrationSettings.multipartConcurrency) &&
        Objects.equals(this.multipartLimit, migrationSettings.multipartLimit) &&
        Objects.equals(this.multipartPartSize, migrationSettings.multipartPartSize) &&
        Objects.equals(this.name, migrationSettings.name) &&
        Objects.equals(this.objectKeyFilter, migrationSettings.objectKeyFilter) &&
        Objects.equals(this.retryTimeout, migrationSettings.retryTimeout) &&
        Objects.equals(this.skipIfHashMatches, migrationSettings.skipIfHashMatches) &&
        Objects.equals(this.slotsPerMapping, migrationSettings.slotsPerMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conflictResolution, deploymentType, dryRun, enginesLocation, existingDataInDestination, lastModifiedFrom, maxEngines, maxRetries, maxRetriesForCopy, maxRetryTimeout, maxStreams, migrationMode, multipartConcurrency, multipartLimit, multipartPartSize, name, objectKeyFilter, retryTimeout, skipIfHashMatches, slotsPerMapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationSettings {\n");
    
    sb.append("    conflictResolution: ").append(toIndentedString(conflictResolution)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    enginesLocation: ").append(toIndentedString(enginesLocation)).append("\n");
    sb.append("    existingDataInDestination: ").append(toIndentedString(existingDataInDestination)).append("\n");
    sb.append("    lastModifiedFrom: ").append(toIndentedString(lastModifiedFrom)).append("\n");
    sb.append("    maxEngines: ").append(toIndentedString(maxEngines)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    maxRetriesForCopy: ").append(toIndentedString(maxRetriesForCopy)).append("\n");
    sb.append("    maxRetryTimeout: ").append(toIndentedString(maxRetryTimeout)).append("\n");
    sb.append("    maxStreams: ").append(toIndentedString(maxStreams)).append("\n");
    sb.append("    migrationMode: ").append(toIndentedString(migrationMode)).append("\n");
    sb.append("    multipartConcurrency: ").append(toIndentedString(multipartConcurrency)).append("\n");
    sb.append("    multipartLimit: ").append(toIndentedString(multipartLimit)).append("\n");
    sb.append("    multipartPartSize: ").append(toIndentedString(multipartPartSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectKeyFilter: ").append(toIndentedString(objectKeyFilter)).append("\n");
    sb.append("    retryTimeout: ").append(toIndentedString(retryTimeout)).append("\n");
    sb.append("    skipIfHashMatches: ").append(toIndentedString(skipIfHashMatches)).append("\n");
    sb.append("    slotsPerMapping: ").append(toIndentedString(slotsPerMapping)).append("\n");
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

