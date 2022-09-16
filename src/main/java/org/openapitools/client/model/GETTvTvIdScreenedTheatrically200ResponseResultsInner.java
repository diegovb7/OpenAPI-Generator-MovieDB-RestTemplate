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
 * GETTvTvIdScreenedTheatrically200ResponseResultsInner
 */
@JsonPropertyOrder({
  GETTvTvIdScreenedTheatrically200ResponseResultsInner.JSON_PROPERTY_ID,
  GETTvTvIdScreenedTheatrically200ResponseResultsInner.JSON_PROPERTY_EPISODE_NUMBER,
  GETTvTvIdScreenedTheatrically200ResponseResultsInner.JSON_PROPERTY_SEASON_NUMBER
})
@JsonTypeName("GET_tv_tv_id_screened_theatrically_200_response_results_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvIdScreenedTheatrically200ResponseResultsInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_EPISODE_NUMBER = "episode_number";
  private Integer episodeNumber;

  public static final String JSON_PROPERTY_SEASON_NUMBER = "season_number";
  private Integer seasonNumber;

  public GETTvTvIdScreenedTheatrically200ResponseResultsInner() {
  }

  public GETTvTvIdScreenedTheatrically200ResponseResultsInner id(Integer id) {
    
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


  public GETTvTvIdScreenedTheatrically200ResponseResultsInner episodeNumber(Integer episodeNumber) {
    
    this.episodeNumber = episodeNumber;
    return this;
  }

   /**
   * Get episodeNumber
   * @return episodeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EPISODE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEpisodeNumber() {
    return episodeNumber;
  }


  @JsonProperty(JSON_PROPERTY_EPISODE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpisodeNumber(Integer episodeNumber) {
    this.episodeNumber = episodeNumber;
  }


  public GETTvTvIdScreenedTheatrically200ResponseResultsInner seasonNumber(Integer seasonNumber) {
    
    this.seasonNumber = seasonNumber;
    return this;
  }

   /**
   * Get seasonNumber
   * @return seasonNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEASON_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSeasonNumber() {
    return seasonNumber;
  }


  @JsonProperty(JSON_PROPERTY_SEASON_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeasonNumber(Integer seasonNumber) {
    this.seasonNumber = seasonNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvIdScreenedTheatrically200ResponseResultsInner geTTvTvIdScreenedTheatrically200ResponseResultsInner = (GETTvTvIdScreenedTheatrically200ResponseResultsInner) o;
    return Objects.equals(this.id, geTTvTvIdScreenedTheatrically200ResponseResultsInner.id) &&
        Objects.equals(this.episodeNumber, geTTvTvIdScreenedTheatrically200ResponseResultsInner.episodeNumber) &&
        Objects.equals(this.seasonNumber, geTTvTvIdScreenedTheatrically200ResponseResultsInner.seasonNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, episodeNumber, seasonNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdScreenedTheatrically200ResponseResultsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    seasonNumber: ").append(toIndentedString(seasonNumber)).append("\n");
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
