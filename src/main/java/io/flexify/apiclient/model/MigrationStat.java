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
import io.flexify.apiclient.model.CleanupStat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * MigrationStat
 */




public class MigrationStat {
  @JsonProperty("activeEngines")
  private Long activeEngines = null;

  @JsonProperty("activeSlots")
  private Long activeSlots = null;

  @JsonProperty("activeStreams")
  private Long activeStreams = null;

  @JsonProperty("bytesFailed")
  private Long bytesFailed = null;

  @JsonProperty("bytesNotMatchingPattern")
  private Long bytesNotMatchingPattern = null;

  @JsonProperty("bytesProcessed")
  private Long bytesProcessed = null;

  @JsonProperty("bytesSkipped")
  private Long bytesSkipped = null;

  @JsonProperty("bytesSkippedGlacier")
  private Long bytesSkippedGlacier = null;

  @JsonProperty("bytesUploaded")
  private Long bytesUploaded = null;

  @JsonProperty("cleanup")
  private CleanupStat cleanup = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("dstRegion")
  private String dstRegion = null;

  @JsonProperty("estimated")
  private DateTime estimated = null;

  @JsonProperty("finished")
  private DateTime finished = null;

  @JsonProperty("initialBytes")
  private Long initialBytes = null;

  @JsonProperty("initialObjects")
  private Long initialObjects = null;

  @JsonProperty("objectsFailed")
  private Long objectsFailed = null;

  @JsonProperty("objectsNotMatchingPattern")
  private Long objectsNotMatchingPattern = null;

  @JsonProperty("objectsProcessed")
  private Long objectsProcessed = null;

  @JsonProperty("objectsSkipped")
  private Long objectsSkipped = null;

  @JsonProperty("objectsSkippedGlacier")
  private Long objectsSkippedGlacier = null;

  @JsonProperty("objectsUploaded")
  private Long objectsUploaded = null;

  @JsonProperty("processingObjectsPerSecond")
  private Double processingObjectsPerSecond = null;

  @JsonProperty("progress")
  private Double progress = null;

  @JsonProperty("retried")
  private Long retried = null;

  @JsonProperty("srcRegion")
  private String srcRegion = null;

  @JsonProperty("started")
  private DateTime started = null;

  /**
   * State of migration on its part
   */
  public enum StateEnum {
    DEPLOYING("DEPLOYING"),
    
    FAILED("FAILED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    NO_CONNECTION_TO_ENGINE("NO_CONNECTION_TO_ENGINE"),
    
    RESTARTING("RESTARTING"),
    
    STARTING("STARTING"),
    
    STOPPED("STOPPED"),
    
    STOPPING("STOPPING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    WAITING("WAITING");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  /**
   * Step that this mapping is currently doing
   */
  public enum StepEnum {
    CLEAN("CLEAN"),
    
    COUNT("COUNT"),
    
    MIGRATE("MIGRATE");

    private String value;

    StepEnum(String value) {
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
    public static StepEnum fromValue(String text) {
      for (StepEnum b : StepEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("step")
  private StepEnum step = null;

  @JsonProperty("totalUpload")
  private Long totalUpload = null;

  @JsonProperty("uploadingBytesPerSecond")
  private Double uploadingBytesPerSecond = null;

  @JsonProperty("uploadingObjectsPerSecond")
  private Double uploadingObjectsPerSecond = null;

  public MigrationStat activeEngines(Long activeEngines) {
    this.activeEngines = activeEngines;
    return this;
  }

   /**
   * Number of engines that are busy with this
   * @return activeEngines
  **/
  @ApiModelProperty(value = "Number of engines that are busy with this")
  public Long getActiveEngines() {
    return activeEngines;
  }

  public void setActiveEngines(Long activeEngines) {
    this.activeEngines = activeEngines;
  }

  public MigrationStat activeSlots(Long activeSlots) {
    this.activeSlots = activeSlots;
    return this;
  }

   /**
   * Number fo currently active slots
   * @return activeSlots
  **/
  @ApiModelProperty(value = "Number fo currently active slots")
  public Long getActiveSlots() {
    return activeSlots;
  }

  public void setActiveSlots(Long activeSlots) {
    this.activeSlots = activeSlots;
  }

  public MigrationStat activeStreams(Long activeStreams) {
    this.activeStreams = activeStreams;
    return this;
  }

   /**
   * Number of currently active streams
   * @return activeStreams
  **/
  @ApiModelProperty(value = "Number of currently active streams")
  public Long getActiveStreams() {
    return activeStreams;
  }

  public void setActiveStreams(Long activeStreams) {
    this.activeStreams = activeStreams;
  }

  public MigrationStat bytesFailed(Long bytesFailed) {
    this.bytesFailed = bytesFailed;
    return this;
  }

   /**
   * Get bytesFailed
   * @return bytesFailed
  **/
  @ApiModelProperty(value = "")
  public Long getBytesFailed() {
    return bytesFailed;
  }

  public void setBytesFailed(Long bytesFailed) {
    this.bytesFailed = bytesFailed;
  }

  public MigrationStat bytesNotMatchingPattern(Long bytesNotMatchingPattern) {
    this.bytesNotMatchingPattern = bytesNotMatchingPattern;
    return this;
  }

   /**
   * Get bytesNotMatchingPattern
   * @return bytesNotMatchingPattern
  **/
  @ApiModelProperty(value = "")
  public Long getBytesNotMatchingPattern() {
    return bytesNotMatchingPattern;
  }

  public void setBytesNotMatchingPattern(Long bytesNotMatchingPattern) {
    this.bytesNotMatchingPattern = bytesNotMatchingPattern;
  }

  public MigrationStat bytesProcessed(Long bytesProcessed) {
    this.bytesProcessed = bytesProcessed;
    return this;
  }

   /**
   * Get bytesProcessed
   * @return bytesProcessed
  **/
  @ApiModelProperty(value = "")
  public Long getBytesProcessed() {
    return bytesProcessed;
  }

  public void setBytesProcessed(Long bytesProcessed) {
    this.bytesProcessed = bytesProcessed;
  }

  public MigrationStat bytesSkipped(Long bytesSkipped) {
    this.bytesSkipped = bytesSkipped;
    return this;
  }

   /**
   * Get bytesSkipped
   * @return bytesSkipped
  **/
  @ApiModelProperty(value = "")
  public Long getBytesSkipped() {
    return bytesSkipped;
  }

  public void setBytesSkipped(Long bytesSkipped) {
    this.bytesSkipped = bytesSkipped;
  }

  public MigrationStat bytesSkippedGlacier(Long bytesSkippedGlacier) {
    this.bytesSkippedGlacier = bytesSkippedGlacier;
    return this;
  }

   /**
   * Get bytesSkippedGlacier
   * @return bytesSkippedGlacier
  **/
  @ApiModelProperty(value = "")
  public Long getBytesSkippedGlacier() {
    return bytesSkippedGlacier;
  }

  public void setBytesSkippedGlacier(Long bytesSkippedGlacier) {
    this.bytesSkippedGlacier = bytesSkippedGlacier;
  }

  public MigrationStat bytesUploaded(Long bytesUploaded) {
    this.bytesUploaded = bytesUploaded;
    return this;
  }

   /**
   * Get bytesUploaded
   * @return bytesUploaded
  **/
  @ApiModelProperty(value = "")
  public Long getBytesUploaded() {
    return bytesUploaded;
  }

  public void setBytesUploaded(Long bytesUploaded) {
    this.bytesUploaded = bytesUploaded;
  }

  public MigrationStat cleanup(CleanupStat cleanup) {
    this.cleanup = cleanup;
    return this;
  }

   /**
   * Cleanup that may be performed before migration
   * @return cleanup
  **/
  @ApiModelProperty(value = "Cleanup that may be performed before migration")
  public CleanupStat getCleanup() {
    return cleanup;
  }

  public void setCleanup(CleanupStat cleanup) {
    this.cleanup = cleanup;
  }

  public MigrationStat created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Creation time
   * @return created
  **/
  @ApiModelProperty(value = "Creation time")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public MigrationStat dstRegion(String dstRegion) {
    this.dstRegion = dstRegion;
    return this;
  }

   /**
   * Get dstRegion
   * @return dstRegion
  **/
  @ApiModelProperty(value = "")
  public String getDstRegion() {
    return dstRegion;
  }

  public void setDstRegion(String dstRegion) {
    this.dstRegion = dstRegion;
  }

  public MigrationStat estimated(DateTime estimated) {
    this.estimated = estimated;
    return this;
  }

   /**
   * Estimated finish time
   * @return estimated
  **/
  @ApiModelProperty(value = "Estimated finish time")
  public DateTime getEstimated() {
    return estimated;
  }

  public void setEstimated(DateTime estimated) {
    this.estimated = estimated;
  }

  public MigrationStat finished(DateTime finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Finished time
   * @return finished
  **/
  @ApiModelProperty(value = "Finished time")
  public DateTime getFinished() {
    return finished;
  }

  public void setFinished(DateTime finished) {
    this.finished = finished;
  }

  public MigrationStat initialBytes(Long initialBytes) {
    this.initialBytes = initialBytes;
    return this;
  }

   /**
   * Initial size of all objects in source storage (if known)
   * @return initialBytes
  **/
  @ApiModelProperty(value = "Initial size of all objects in source storage (if known)")
  public Long getInitialBytes() {
    return initialBytes;
  }

  public void setInitialBytes(Long initialBytes) {
    this.initialBytes = initialBytes;
  }

  public MigrationStat initialObjects(Long initialObjects) {
    this.initialObjects = initialObjects;
    return this;
  }

   /**
   * Initial number of objects in source storage (if known)
   * @return initialObjects
  **/
  @ApiModelProperty(value = "Initial number of objects in source storage (if known)")
  public Long getInitialObjects() {
    return initialObjects;
  }

  public void setInitialObjects(Long initialObjects) {
    this.initialObjects = initialObjects;
  }

  public MigrationStat objectsFailed(Long objectsFailed) {
    this.objectsFailed = objectsFailed;
    return this;
  }

   /**
   * Get objectsFailed
   * @return objectsFailed
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsFailed() {
    return objectsFailed;
  }

  public void setObjectsFailed(Long objectsFailed) {
    this.objectsFailed = objectsFailed;
  }

  public MigrationStat objectsNotMatchingPattern(Long objectsNotMatchingPattern) {
    this.objectsNotMatchingPattern = objectsNotMatchingPattern;
    return this;
  }

   /**
   * Get objectsNotMatchingPattern
   * @return objectsNotMatchingPattern
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsNotMatchingPattern() {
    return objectsNotMatchingPattern;
  }

  public void setObjectsNotMatchingPattern(Long objectsNotMatchingPattern) {
    this.objectsNotMatchingPattern = objectsNotMatchingPattern;
  }

  public MigrationStat objectsProcessed(Long objectsProcessed) {
    this.objectsProcessed = objectsProcessed;
    return this;
  }

   /**
   * Get objectsProcessed
   * @return objectsProcessed
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsProcessed() {
    return objectsProcessed;
  }

  public void setObjectsProcessed(Long objectsProcessed) {
    this.objectsProcessed = objectsProcessed;
  }

  public MigrationStat objectsSkipped(Long objectsSkipped) {
    this.objectsSkipped = objectsSkipped;
    return this;
  }

   /**
   * Get objectsSkipped
   * @return objectsSkipped
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsSkipped() {
    return objectsSkipped;
  }

  public void setObjectsSkipped(Long objectsSkipped) {
    this.objectsSkipped = objectsSkipped;
  }

  public MigrationStat objectsSkippedGlacier(Long objectsSkippedGlacier) {
    this.objectsSkippedGlacier = objectsSkippedGlacier;
    return this;
  }

   /**
   * Get objectsSkippedGlacier
   * @return objectsSkippedGlacier
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsSkippedGlacier() {
    return objectsSkippedGlacier;
  }

  public void setObjectsSkippedGlacier(Long objectsSkippedGlacier) {
    this.objectsSkippedGlacier = objectsSkippedGlacier;
  }

  public MigrationStat objectsUploaded(Long objectsUploaded) {
    this.objectsUploaded = objectsUploaded;
    return this;
  }

   /**
   * Get objectsUploaded
   * @return objectsUploaded
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsUploaded() {
    return objectsUploaded;
  }

  public void setObjectsUploaded(Long objectsUploaded) {
    this.objectsUploaded = objectsUploaded;
  }

  public MigrationStat processingObjectsPerSecond(Double processingObjectsPerSecond) {
    this.processingObjectsPerSecond = processingObjectsPerSecond;
    return this;
  }

   /**
   * Objects/second processed
   * @return processingObjectsPerSecond
  **/
  @ApiModelProperty(value = "Objects/second processed")
  public Double getProcessingObjectsPerSecond() {
    return processingObjectsPerSecond;
  }

  public void setProcessingObjectsPerSecond(Double processingObjectsPerSecond) {
    this.processingObjectsPerSecond = processingObjectsPerSecond;
  }

  public MigrationStat progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Progress from 0.0 to 1.0
   * @return progress
  **/
  @ApiModelProperty(example = "0.27", value = "Progress from 0.0 to 1.0")
  public Double getProgress() {
    return progress;
  }

  public void setProgress(Double progress) {
    this.progress = progress;
  }

  public MigrationStat retried(Long retried) {
    this.retried = retried;
    return this;
  }

   /**
   * Number of retries
   * @return retried
  **/
  @ApiModelProperty(value = "Number of retries")
  public Long getRetried() {
    return retried;
  }

  public void setRetried(Long retried) {
    this.retried = retried;
  }

  public MigrationStat srcRegion(String srcRegion) {
    this.srcRegion = srcRegion;
    return this;
  }

   /**
   * Get srcRegion
   * @return srcRegion
  **/
  @ApiModelProperty(value = "")
  public String getSrcRegion() {
    return srcRegion;
  }

  public void setSrcRegion(String srcRegion) {
    this.srcRegion = srcRegion;
  }

  public MigrationStat started(DateTime started) {
    this.started = started;
    return this;
  }

   /**
   * Started time
   * @return started
  **/
  @ApiModelProperty(value = "Started time")
  public DateTime getStarted() {
    return started;
  }

  public void setStarted(DateTime started) {
    this.started = started;
  }

  public MigrationStat state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of migration on its part
   * @return state
  **/
  @ApiModelProperty(example = "IN_PROGRESS", value = "State of migration on its part")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public MigrationStat step(StepEnum step) {
    this.step = step;
    return this;
  }

   /**
   * Step that this mapping is currently doing
   * @return step
  **/
  @ApiModelProperty(example = "MIGRATE", value = "Step that this mapping is currently doing")
  public StepEnum getStep() {
    return step;
  }

  public void setStep(StepEnum step) {
    this.step = step;
  }

  public MigrationStat totalUpload(Long totalUpload) {
    this.totalUpload = totalUpload;
    return this;
  }

   /**
   * Get totalUpload
   * @return totalUpload
  **/
  @ApiModelProperty(value = "")
  public Long getTotalUpload() {
    return totalUpload;
  }

  public void setTotalUpload(Long totalUpload) {
    this.totalUpload = totalUpload;
  }

  public MigrationStat uploadingBytesPerSecond(Double uploadingBytesPerSecond) {
    this.uploadingBytesPerSecond = uploadingBytesPerSecond;
    return this;
  }

   /**
   * Get uploadingBytesPerSecond
   * @return uploadingBytesPerSecond
  **/
  @ApiModelProperty(value = "")
  public Double getUploadingBytesPerSecond() {
    return uploadingBytesPerSecond;
  }

  public void setUploadingBytesPerSecond(Double uploadingBytesPerSecond) {
    this.uploadingBytesPerSecond = uploadingBytesPerSecond;
  }

  public MigrationStat uploadingObjectsPerSecond(Double uploadingObjectsPerSecond) {
    this.uploadingObjectsPerSecond = uploadingObjectsPerSecond;
    return this;
  }

   /**
   * Get uploadingObjectsPerSecond
   * @return uploadingObjectsPerSecond
  **/
  @ApiModelProperty(value = "")
  public Double getUploadingObjectsPerSecond() {
    return uploadingObjectsPerSecond;
  }

  public void setUploadingObjectsPerSecond(Double uploadingObjectsPerSecond) {
    this.uploadingObjectsPerSecond = uploadingObjectsPerSecond;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationStat migrationStat = (MigrationStat) o;
    return Objects.equals(this.activeEngines, migrationStat.activeEngines) &&
        Objects.equals(this.activeSlots, migrationStat.activeSlots) &&
        Objects.equals(this.activeStreams, migrationStat.activeStreams) &&
        Objects.equals(this.bytesFailed, migrationStat.bytesFailed) &&
        Objects.equals(this.bytesNotMatchingPattern, migrationStat.bytesNotMatchingPattern) &&
        Objects.equals(this.bytesProcessed, migrationStat.bytesProcessed) &&
        Objects.equals(this.bytesSkipped, migrationStat.bytesSkipped) &&
        Objects.equals(this.bytesSkippedGlacier, migrationStat.bytesSkippedGlacier) &&
        Objects.equals(this.bytesUploaded, migrationStat.bytesUploaded) &&
        Objects.equals(this.cleanup, migrationStat.cleanup) &&
        Objects.equals(this.created, migrationStat.created) &&
        Objects.equals(this.dstRegion, migrationStat.dstRegion) &&
        Objects.equals(this.estimated, migrationStat.estimated) &&
        Objects.equals(this.finished, migrationStat.finished) &&
        Objects.equals(this.initialBytes, migrationStat.initialBytes) &&
        Objects.equals(this.initialObjects, migrationStat.initialObjects) &&
        Objects.equals(this.objectsFailed, migrationStat.objectsFailed) &&
        Objects.equals(this.objectsNotMatchingPattern, migrationStat.objectsNotMatchingPattern) &&
        Objects.equals(this.objectsProcessed, migrationStat.objectsProcessed) &&
        Objects.equals(this.objectsSkipped, migrationStat.objectsSkipped) &&
        Objects.equals(this.objectsSkippedGlacier, migrationStat.objectsSkippedGlacier) &&
        Objects.equals(this.objectsUploaded, migrationStat.objectsUploaded) &&
        Objects.equals(this.processingObjectsPerSecond, migrationStat.processingObjectsPerSecond) &&
        Objects.equals(this.progress, migrationStat.progress) &&
        Objects.equals(this.retried, migrationStat.retried) &&
        Objects.equals(this.srcRegion, migrationStat.srcRegion) &&
        Objects.equals(this.started, migrationStat.started) &&
        Objects.equals(this.state, migrationStat.state) &&
        Objects.equals(this.step, migrationStat.step) &&
        Objects.equals(this.totalUpload, migrationStat.totalUpload) &&
        Objects.equals(this.uploadingBytesPerSecond, migrationStat.uploadingBytesPerSecond) &&
        Objects.equals(this.uploadingObjectsPerSecond, migrationStat.uploadingObjectsPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeEngines, activeSlots, activeStreams, bytesFailed, bytesNotMatchingPattern, bytesProcessed, bytesSkipped, bytesSkippedGlacier, bytesUploaded, cleanup, created, dstRegion, estimated, finished, initialBytes, initialObjects, objectsFailed, objectsNotMatchingPattern, objectsProcessed, objectsSkipped, objectsSkippedGlacier, objectsUploaded, processingObjectsPerSecond, progress, retried, srcRegion, started, state, step, totalUpload, uploadingBytesPerSecond, uploadingObjectsPerSecond);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationStat {\n");
    
    sb.append("    activeEngines: ").append(toIndentedString(activeEngines)).append("\n");
    sb.append("    activeSlots: ").append(toIndentedString(activeSlots)).append("\n");
    sb.append("    activeStreams: ").append(toIndentedString(activeStreams)).append("\n");
    sb.append("    bytesFailed: ").append(toIndentedString(bytesFailed)).append("\n");
    sb.append("    bytesNotMatchingPattern: ").append(toIndentedString(bytesNotMatchingPattern)).append("\n");
    sb.append("    bytesProcessed: ").append(toIndentedString(bytesProcessed)).append("\n");
    sb.append("    bytesSkipped: ").append(toIndentedString(bytesSkipped)).append("\n");
    sb.append("    bytesSkippedGlacier: ").append(toIndentedString(bytesSkippedGlacier)).append("\n");
    sb.append("    bytesUploaded: ").append(toIndentedString(bytesUploaded)).append("\n");
    sb.append("    cleanup: ").append(toIndentedString(cleanup)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    dstRegion: ").append(toIndentedString(dstRegion)).append("\n");
    sb.append("    estimated: ").append(toIndentedString(estimated)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    initialBytes: ").append(toIndentedString(initialBytes)).append("\n");
    sb.append("    initialObjects: ").append(toIndentedString(initialObjects)).append("\n");
    sb.append("    objectsFailed: ").append(toIndentedString(objectsFailed)).append("\n");
    sb.append("    objectsNotMatchingPattern: ").append(toIndentedString(objectsNotMatchingPattern)).append("\n");
    sb.append("    objectsProcessed: ").append(toIndentedString(objectsProcessed)).append("\n");
    sb.append("    objectsSkipped: ").append(toIndentedString(objectsSkipped)).append("\n");
    sb.append("    objectsSkippedGlacier: ").append(toIndentedString(objectsSkippedGlacier)).append("\n");
    sb.append("    objectsUploaded: ").append(toIndentedString(objectsUploaded)).append("\n");
    sb.append("    processingObjectsPerSecond: ").append(toIndentedString(processingObjectsPerSecond)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    retried: ").append(toIndentedString(retried)).append("\n");
    sb.append("    srcRegion: ").append(toIndentedString(srcRegion)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    totalUpload: ").append(toIndentedString(totalUpload)).append("\n");
    sb.append("    uploadingBytesPerSecond: ").append(toIndentedString(uploadingBytesPerSecond)).append("\n");
    sb.append("    uploadingObjectsPerSecond: ").append(toIndentedString(uploadingObjectsPerSecond)).append("\n");
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

