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
import io.flexify.apiclient.model.MigrationSlotStat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * MigrationStat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-07T17:03:52.903+03:00")
public class MigrationStat {
  @JsonProperty("bytesFailed")
  private Long bytesFailed = null;

  @JsonProperty("bytesInSource")
  private Long bytesInSource = null;

  @JsonProperty("bytesProcessed")
  private Long bytesProcessed = null;

  @JsonProperty("bytesRemovedFromDestination")
  private Long bytesRemovedFromDestination = null;

  @JsonProperty("bytesSkipped")
  private Long bytesSkipped = null;

  @JsonProperty("bytesUploaded")
  private Long bytesUploaded = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("engines")
  private Integer engines = null;

  @JsonProperty("estimated")
  private DateTime estimated = null;

  @JsonProperty("finished")
  private DateTime finished = null;

  @JsonProperty("objectsFailed")
  private Long objectsFailed = null;

  @JsonProperty("objectsInSource")
  private Long objectsInSource = null;

  @JsonProperty("objectsProcessed")
  private Long objectsProcessed = null;

  @JsonProperty("objectsRemovedFromDestination")
  private Long objectsRemovedFromDestination = null;

  @JsonProperty("objectsSkipped")
  private Long objectsSkipped = null;

  @JsonProperty("objectsUploaded")
  private Long objectsUploaded = null;

  @JsonProperty("processingObjectsPerSecond")
  private Double processingObjectsPerSecond = null;

  @JsonProperty("progress")
  private Double progress = null;

  @JsonProperty("retried")
  private Long retried = null;

  @JsonProperty("slots")
  private List<MigrationSlotStat> slots = null;

  /**
   * Migration state
   */
  public enum StateEnum {
    NOT_ASSIGNED("NOT_ASSIGNED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    IN_PROGRESS_CANCELING("IN_PROGRESS_CANCELING"),
    
    CANCELED("CANCELED"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED");

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
   * Migration step
   */
  public enum StepEnum {
    COUNT("COUNT"),
    
    CLEAN("CLEAN"),
    
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

  @JsonProperty("uploadingBytesPerSecond")
  private Double uploadingBytesPerSecond = null;

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

  public MigrationStat bytesInSource(Long bytesInSource) {
    this.bytesInSource = bytesInSource;
    return this;
  }

   /**
   * Get bytesInSource
   * @return bytesInSource
  **/
  @ApiModelProperty(value = "")
  public Long getBytesInSource() {
    return bytesInSource;
  }

  public void setBytesInSource(Long bytesInSource) {
    this.bytesInSource = bytesInSource;
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

  public MigrationStat bytesRemovedFromDestination(Long bytesRemovedFromDestination) {
    this.bytesRemovedFromDestination = bytesRemovedFromDestination;
    return this;
  }

   /**
   * Get bytesRemovedFromDestination
   * @return bytesRemovedFromDestination
  **/
  @ApiModelProperty(value = "")
  public Long getBytesRemovedFromDestination() {
    return bytesRemovedFromDestination;
  }

  public void setBytesRemovedFromDestination(Long bytesRemovedFromDestination) {
    this.bytesRemovedFromDestination = bytesRemovedFromDestination;
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

  public MigrationStat engines(Integer engines) {
    this.engines = engines;
    return this;
  }

   /**
   * Number of active engines
   * @return engines
  **/
  @ApiModelProperty(example = "3", value = "Number of active engines")
  public Integer getEngines() {
    return engines;
  }

  public void setEngines(Integer engines) {
    this.engines = engines;
  }

  public MigrationStat estimated(DateTime estimated) {
    this.estimated = estimated;
    return this;
  }

   /**
   * Estimated time
   * @return estimated
  **/
  @ApiModelProperty(value = "Estimated time")
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

  public MigrationStat objectsInSource(Long objectsInSource) {
    this.objectsInSource = objectsInSource;
    return this;
  }

   /**
   * Get objectsInSource
   * @return objectsInSource
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsInSource() {
    return objectsInSource;
  }

  public void setObjectsInSource(Long objectsInSource) {
    this.objectsInSource = objectsInSource;
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

  public MigrationStat objectsRemovedFromDestination(Long objectsRemovedFromDestination) {
    this.objectsRemovedFromDestination = objectsRemovedFromDestination;
    return this;
  }

   /**
   * Get objectsRemovedFromDestination
   * @return objectsRemovedFromDestination
  **/
  @ApiModelProperty(value = "")
  public Long getObjectsRemovedFromDestination() {
    return objectsRemovedFromDestination;
  }

  public void setObjectsRemovedFromDestination(Long objectsRemovedFromDestination) {
    this.objectsRemovedFromDestination = objectsRemovedFromDestination;
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
   * Get processingObjectsPerSecond
   * @return processingObjectsPerSecond
  **/
  @ApiModelProperty(value = "")
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
   * Progress in percents
   * @return progress
  **/
  @ApiModelProperty(example = "50.0", value = "Progress in percents")
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
   * Get retried
   * @return retried
  **/
  @ApiModelProperty(value = "")
  public Long getRetried() {
    return retried;
  }

  public void setRetried(Long retried) {
    this.retried = retried;
  }

  public MigrationStat slots(List<MigrationSlotStat> slots) {
    this.slots = slots;
    return this;
  }

  public MigrationStat addSlotsItem(MigrationSlotStat slotsItem) {
    if (this.slots == null) {
      this.slots = new ArrayList<MigrationSlotStat>();
    }
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * Migration&#39;s slots statistics
   * @return slots
  **/
  @ApiModelProperty(value = "Migration's slots statistics")
  public List<MigrationSlotStat> getSlots() {
    return slots;
  }

  public void setSlots(List<MigrationSlotStat> slots) {
    this.slots = slots;
  }

  public MigrationStat state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Migration state
   * @return state
  **/
  @ApiModelProperty(example = "IN_PROGRESS", value = "Migration state")
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
   * Migration step
   * @return step
  **/
  @ApiModelProperty(example = "MIGRATE", value = "Migration step")
  public StepEnum getStep() {
    return step;
  }

  public void setStep(StepEnum step) {
    this.step = step;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationStat migrationStat = (MigrationStat) o;
    return Objects.equals(this.bytesFailed, migrationStat.bytesFailed) &&
        Objects.equals(this.bytesInSource, migrationStat.bytesInSource) &&
        Objects.equals(this.bytesProcessed, migrationStat.bytesProcessed) &&
        Objects.equals(this.bytesRemovedFromDestination, migrationStat.bytesRemovedFromDestination) &&
        Objects.equals(this.bytesSkipped, migrationStat.bytesSkipped) &&
        Objects.equals(this.bytesUploaded, migrationStat.bytesUploaded) &&
        Objects.equals(this.created, migrationStat.created) &&
        Objects.equals(this.engines, migrationStat.engines) &&
        Objects.equals(this.estimated, migrationStat.estimated) &&
        Objects.equals(this.finished, migrationStat.finished) &&
        Objects.equals(this.objectsFailed, migrationStat.objectsFailed) &&
        Objects.equals(this.objectsInSource, migrationStat.objectsInSource) &&
        Objects.equals(this.objectsProcessed, migrationStat.objectsProcessed) &&
        Objects.equals(this.objectsRemovedFromDestination, migrationStat.objectsRemovedFromDestination) &&
        Objects.equals(this.objectsSkipped, migrationStat.objectsSkipped) &&
        Objects.equals(this.objectsUploaded, migrationStat.objectsUploaded) &&
        Objects.equals(this.processingObjectsPerSecond, migrationStat.processingObjectsPerSecond) &&
        Objects.equals(this.progress, migrationStat.progress) &&
        Objects.equals(this.retried, migrationStat.retried) &&
        Objects.equals(this.slots, migrationStat.slots) &&
        Objects.equals(this.state, migrationStat.state) &&
        Objects.equals(this.step, migrationStat.step) &&
        Objects.equals(this.uploadingBytesPerSecond, migrationStat.uploadingBytesPerSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesFailed, bytesInSource, bytesProcessed, bytesRemovedFromDestination, bytesSkipped, bytesUploaded, created, engines, estimated, finished, objectsFailed, objectsInSource, objectsProcessed, objectsRemovedFromDestination, objectsSkipped, objectsUploaded, processingObjectsPerSecond, progress, retried, slots, state, step, uploadingBytesPerSecond);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationStat {\n");
    
    sb.append("    bytesFailed: ").append(toIndentedString(bytesFailed)).append("\n");
    sb.append("    bytesInSource: ").append(toIndentedString(bytesInSource)).append("\n");
    sb.append("    bytesProcessed: ").append(toIndentedString(bytesProcessed)).append("\n");
    sb.append("    bytesRemovedFromDestination: ").append(toIndentedString(bytesRemovedFromDestination)).append("\n");
    sb.append("    bytesSkipped: ").append(toIndentedString(bytesSkipped)).append("\n");
    sb.append("    bytesUploaded: ").append(toIndentedString(bytesUploaded)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    engines: ").append(toIndentedString(engines)).append("\n");
    sb.append("    estimated: ").append(toIndentedString(estimated)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    objectsFailed: ").append(toIndentedString(objectsFailed)).append("\n");
    sb.append("    objectsInSource: ").append(toIndentedString(objectsInSource)).append("\n");
    sb.append("    objectsProcessed: ").append(toIndentedString(objectsProcessed)).append("\n");
    sb.append("    objectsRemovedFromDestination: ").append(toIndentedString(objectsRemovedFromDestination)).append("\n");
    sb.append("    objectsSkipped: ").append(toIndentedString(objectsSkipped)).append("\n");
    sb.append("    objectsUploaded: ").append(toIndentedString(objectsUploaded)).append("\n");
    sb.append("    processingObjectsPerSecond: ").append(toIndentedString(processingObjectsPerSecond)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    retried: ").append(toIndentedString(retried)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    uploadingBytesPerSecond: ").append(toIndentedString(uploadingBytesPerSecond)).append("\n");
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

