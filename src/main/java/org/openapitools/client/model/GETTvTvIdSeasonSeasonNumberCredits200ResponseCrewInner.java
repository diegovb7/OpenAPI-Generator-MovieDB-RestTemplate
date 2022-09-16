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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner
 */
@JsonPropertyOrder({
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_ADULT,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_ID,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_KNOWN_FOR_DEPARTMENT,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_NAME,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_ORIGINAL_NAME,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_POPULARITY,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_PROFILE_PATH,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_CREDIT_ID,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_DEPARTMENT,
  GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.JSON_PROPERTY_JOB
})
@JsonTypeName("GET_tv_tv_id_season_season_number_credits_200_response_crew_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner {
  public static final String JSON_PROPERTY_ADULT = "adult";
  private Boolean adult;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_KNOWN_FOR_DEPARTMENT = "known_for_department";
  private String knownForDepartment;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORIGINAL_NAME = "original_name";
  private String originalName;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public static final String JSON_PROPERTY_PROFILE_PATH = "profile_path";
  private Object profilePath;

  public static final String JSON_PROPERTY_CREDIT_ID = "credit_id";
  private String creditId;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public static final String JSON_PROPERTY_JOB = "job";
  private String job;

  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner() {
  }

  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner adult(Boolean adult) {
    
    this.adult = adult;
    return this;
  }

   /**
   * Get adult
   * @return adult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdult() {
    return adult;
  }


  @JsonProperty(JSON_PROPERTY_ADULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner id(Integer id) {
    
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


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner knownForDepartment(String knownForDepartment) {
    
    this.knownForDepartment = knownForDepartment;
    return this;
  }

   /**
   * Get knownForDepartment
   * @return knownForDepartment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KNOWN_FOR_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKnownForDepartment() {
    return knownForDepartment;
  }


  @JsonProperty(JSON_PROPERTY_KNOWN_FOR_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKnownForDepartment(String knownForDepartment) {
    this.knownForDepartment = knownForDepartment;
  }


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner name(String name) {
    
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


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner originalName(String originalName) {
    
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalName() {
    return originalName;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner popularity(BigDecimal popularity) {
    
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * @return popularity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POPULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPopularity() {
    return popularity;
  }


  @JsonProperty(JSON_PROPERTY_POPULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopularity(BigDecimal popularity) {
    this.popularity = popularity;
  }


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner profilePath(Object profilePath) {
    
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


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner creditId(String creditId) {
    
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


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner department(String department) {
    
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


  public GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner job(String job) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner = (GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner) o;
    return Objects.equals(this.adult, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.adult) &&
        Objects.equals(this.id, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.id) &&
        Objects.equals(this.knownForDepartment, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.knownForDepartment) &&
        Objects.equals(this.name, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.name) &&
        Objects.equals(this.originalName, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.originalName) &&
        Objects.equals(this.popularity, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.popularity) &&
        Objects.equals(this.profilePath, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.profilePath) &&
        Objects.equals(this.creditId, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.creditId) &&
        Objects.equals(this.department, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.department) &&
        Objects.equals(this.job, geTTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner.job);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adult, id, knownForDepartment, name, originalName, popularity, profilePath, creditId, department, job);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner {\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    knownForDepartment: ").append(toIndentedString(knownForDepartment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    profilePath: ").append(toIndentedString(profilePath)).append("\n");
    sb.append("    creditId: ").append(toIndentedString(creditId)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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

