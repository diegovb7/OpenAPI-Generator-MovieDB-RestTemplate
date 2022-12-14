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
 * GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner
 */
@JsonPropertyOrder({
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_AIR_DATE,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_EPISODE_NUMBER,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_ID,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_NAME,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_OVERVIEW,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_SEASON_NUMBER,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_SHOW_ID,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_STILL_PATH,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_VOTE_AVERAGE,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_VOTE_COUNT,
  GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.JSON_PROPERTY_ORDER
})
@JsonTypeName("GET_tv_episode_group_id_200_response_groups_inner_episodes_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner {
  public static final String JSON_PROPERTY_AIR_DATE = "air_date";
  private String airDate;

  public static final String JSON_PROPERTY_EPISODE_NUMBER = "episode_number";
  private Integer episodeNumber;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private String overview;

  public static final String JSON_PROPERTY_SEASON_NUMBER = "season_number";
  private Integer seasonNumber;

  public static final String JSON_PROPERTY_SHOW_ID = "show_id";
  private Integer showId;

  public static final String JSON_PROPERTY_STILL_PATH = "still_path";
  private Object stillPath;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private Integer voteAverage;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner() {
  }

  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner airDate(String airDate) {
    
    this.airDate = airDate;
    return this;
  }

   /**
   * Get airDate
   * @return airDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAirDate() {
    return airDate;
  }


  @JsonProperty(JSON_PROPERTY_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAirDate(String airDate) {
    this.airDate = airDate;
  }


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner episodeNumber(Integer episodeNumber) {
    
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


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner id(Integer id) {
    
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


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner name(String name) {
    
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


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner overview(String overview) {
    
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverview() {
    return overview;
  }


  @JsonProperty(JSON_PROPERTY_OVERVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverview(String overview) {
    this.overview = overview;
  }


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner seasonNumber(Integer seasonNumber) {
    
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


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner showId(Integer showId) {
    
    this.showId = showId;
    return this;
  }

   /**
   * Get showId
   * @return showId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShowId() {
    return showId;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowId(Integer showId) {
    this.showId = showId;
  }


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner stillPath(Object stillPath) {
    
    this.stillPath = stillPath;
    return this;
  }

   /**
   * Get stillPath
   * @return stillPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STILL_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getStillPath() {
    return stillPath;
  }


  @JsonProperty(JSON_PROPERTY_STILL_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStillPath(Object stillPath) {
    this.stillPath = stillPath;
  }


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner voteAverage(Integer voteAverage) {
    
    this.voteAverage = voteAverage;
    return this;
  }

   /**
   * Get voteAverage
   * @return voteAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTE_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVoteAverage() {
    return voteAverage;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteAverage(Integer voteAverage) {
    this.voteAverage = voteAverage;
  }


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner voteCount(Integer voteCount) {
    
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVoteCount() {
    return voteCount;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }


  public GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner = (GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner) o;
    return Objects.equals(this.airDate, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.airDate) &&
        Objects.equals(this.episodeNumber, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.episodeNumber) &&
        Objects.equals(this.id, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.id) &&
        Objects.equals(this.name, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.name) &&
        Objects.equals(this.overview, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.overview) &&
        Objects.equals(this.seasonNumber, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.seasonNumber) &&
        Objects.equals(this.showId, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.showId) &&
        Objects.equals(this.stillPath, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.stillPath) &&
        Objects.equals(this.voteAverage, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.voteAverage) &&
        Objects.equals(this.voteCount, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.voteCount) &&
        Objects.equals(this.order, geTTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airDate, episodeNumber, id, name, overview, seasonNumber, showId, stillPath, voteAverage, voteCount, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner {\n");
    sb.append("    airDate: ").append(toIndentedString(airDate)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    seasonNumber: ").append(toIndentedString(seasonNumber)).append("\n");
    sb.append("    showId: ").append(toIndentedString(showId)).append("\n");
    sb.append("    stillPath: ").append(toIndentedString(stillPath)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

