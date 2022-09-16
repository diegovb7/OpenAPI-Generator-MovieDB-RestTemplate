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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseGuestStarsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response
 */
@JsonPropertyOrder({
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_AIR_DATE,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_CREW,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_EPISODE_NUMBER,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_GUEST_STARS,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_NAME,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_OVERVIEW,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_ID,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_SEASON_NUMBER,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_STILL_PATH,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_VOTE_AVERAGE,
  GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.JSON_PROPERTY_VOTE_COUNT
})
@JsonTypeName("GET_tv_tv_id_season_season_number_episode_episode_number_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response {
  public static final String JSON_PROPERTY_AIR_DATE = "air_date";
  private LocalDate airDate;

  public static final String JSON_PROPERTY_CREW = "crew";
  private List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner> crew = null;

  public static final String JSON_PROPERTY_EPISODE_NUMBER = "episode_number";
  private Integer episodeNumber;

  public static final String JSON_PROPERTY_GUEST_STARS = "guest_stars";
  private List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseGuestStarsInner> guestStars = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private String overview;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_SEASON_NUMBER = "season_number";
  private Integer seasonNumber;

  public static final String JSON_PROPERTY_STILL_PATH = "still_path";
  private Object stillPath;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private BigDecimal voteAverage;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response() {
  }

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response airDate(LocalDate airDate) {
    
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

  public LocalDate getAirDate() {
    return airDate;
  }


  @JsonProperty(JSON_PROPERTY_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAirDate(LocalDate airDate) {
    this.airDate = airDate;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response crew(List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner> crew) {
    
    this.crew = crew;
    return this;
  }

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response addCrewItem(GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner crewItem) {
    if (this.crew == null) {
      this.crew = new ArrayList<>();
    }
    this.crew.add(crewItem);
    return this;
  }

   /**
   * Get crew
   * @return crew
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner> getCrew() {
    return crew;
  }


  @JsonProperty(JSON_PROPERTY_CREW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrew(List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseCrewInner> crew) {
    this.crew = crew;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response episodeNumber(Integer episodeNumber) {
    
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


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response guestStars(List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseGuestStarsInner> guestStars) {
    
    this.guestStars = guestStars;
    return this;
  }

  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response addGuestStarsItem(GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseGuestStarsInner guestStarsItem) {
    if (this.guestStars == null) {
      this.guestStars = new ArrayList<>();
    }
    this.guestStars.add(guestStarsItem);
    return this;
  }

   /**
   * Get guestStars
   * @return guestStars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GUEST_STARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseGuestStarsInner> getGuestStars() {
    return guestStars;
  }


  @JsonProperty(JSON_PROPERTY_GUEST_STARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuestStars(List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200ResponseGuestStarsInner> guestStars) {
    this.guestStars = guestStars;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response name(String name) {
    
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


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response overview(String overview) {
    
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


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response id(Integer id) {
    
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


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response seasonNumber(Integer seasonNumber) {
    
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


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response stillPath(Object stillPath) {
    
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


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response voteAverage(BigDecimal voteAverage) {
    
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

  public BigDecimal getVoteAverage() {
    return voteAverage;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteAverage(BigDecimal voteAverage) {
    this.voteAverage = voteAverage;
  }


  public GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response voteCount(Integer voteCount) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response = (GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response) o;
    return Objects.equals(this.airDate, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.airDate) &&
        Objects.equals(this.crew, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.crew) &&
        Objects.equals(this.episodeNumber, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.episodeNumber) &&
        Objects.equals(this.guestStars, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.guestStars) &&
        Objects.equals(this.name, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.name) &&
        Objects.equals(this.overview, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.overview) &&
        Objects.equals(this.id, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.id) &&
        Objects.equals(this.seasonNumber, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.seasonNumber) &&
        Objects.equals(this.stillPath, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.stillPath) &&
        Objects.equals(this.voteAverage, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.voteAverage) &&
        Objects.equals(this.voteCount, geTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airDate, crew, episodeNumber, guestStars, name, overview, id, seasonNumber, stillPath, voteAverage, voteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber200Response {\n");
    sb.append("    airDate: ").append(toIndentedString(airDate)).append("\n");
    sb.append("    crew: ").append(toIndentedString(crew)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
    sb.append("    guestStars: ").append(toIndentedString(guestStars)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seasonNumber: ").append(toIndentedString(seasonNumber)).append("\n");
    sb.append("    stillPath: ").append(toIndentedString(stillPath)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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

