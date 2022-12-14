/*
 * API
 * ## Welcome  This is a place to put general notes and extra information, for internal use.  To get started designing/documenting this API, select a version on the left. # Title No Description
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner
 */
@JsonPropertyOrder({
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.JSON_PROPERTY_ID,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.JSON_PROPERTY_CREDIT_ID,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.JSON_PROPERTY_NAME,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.JSON_PROPERTY_DEPARTMENT,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.JSON_PROPERTY_JOB,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.JSON_PROPERTY_PROFILE_PATH
})
@JsonTypeName("GET_tv_tv_id_season_season_number_episode_episode_number_200_response_crew_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_CREDIT_ID = "credit_id";
  private String creditId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public static final String JSON_PROPERTY_JOB = "job";
  private String job;

  public static final String JSON_PROPERTY_PROFILE_PATH = "profile_path";
  private Object profilePath;

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner() {
  }

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner creditId(String creditId) {
    
    this.creditId = creditId;
    return this;
  }

   /**
   * Get creditId
   * @return creditId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreditId() {
    return creditId;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditId(String creditId) {
    this.creditId = creditId;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner department(String department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepartment() {
    return department;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepartment(String department) {
    this.department = department;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner job(String job) {
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJob() {
    return job;
  }


  @JsonProperty(JSON_PROPERTY_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJob(String job) {
    this.job = job;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner profilePath(Object profilePath) {
    
    this.profilePath = profilePath;
    return this;
  }

   /**
   * Get profilePath
   * @return profilePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getProfilePath() {
    return profilePath;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfilePath(Object profilePath) {
    this.profilePath = profilePath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner = (GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner) o;
    return Objects.equals(this.id, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.id) &&
        Objects.equals(this.creditId, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.creditId) &&
        Objects.equals(this.name, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.name) &&
        Objects.equals(this.department, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.department) &&
        Objects.equals(this.job, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.job) &&
        Objects.equals(this.profilePath, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner.profilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creditId, name, department, job, profilePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creditId: ").append(toIndentedString(creditId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    profilePath: ").append(toIndentedString(profilePath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

