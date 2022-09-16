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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200ResponseResultsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response
 */
@JsonPropertyOrder({
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response.JSON_PROPERTY_ID,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response.JSON_PROPERTY_RESULTS
})
@JsonTypeName("GET_tv_tv_id_season_season_number_episode_episode_number_videos_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200ResponseResultsInner> results = null;

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response() {
  }

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response id(Integer id) {
    
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


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response results(List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200ResponseResultsInner> results) {
    
    this.results = results;
    return this;
  }

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response addResultsItem(GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200ResponseResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200ResponseResultsInner> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200ResponseResultsInner> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response = (GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response) o;
    return Objects.equals(this.id, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response.id) &&
        Objects.equals(this.results, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

