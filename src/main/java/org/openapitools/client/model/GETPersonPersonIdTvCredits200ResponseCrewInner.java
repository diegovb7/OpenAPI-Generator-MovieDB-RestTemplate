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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETPersonPersonIdTvCredits200ResponseCrewInner
 */
@JsonPropertyOrder({
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_ID,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_DEPARTMENT,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_ORIGINAL_LANGUAGE,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_EPISODE_COUNT,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_JOB,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_OVERVIEW,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_ORIGIN_COUNTRY,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_ORIGINAL_NAME,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_GENRE_IDS,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_NAME,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_FIRST_AIR_DATE,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_BACKDROP_PATH,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_POPULARITY,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_VOTE_COUNT,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_VOTE_AVERAGE,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_POSTER_PATH,
  GETPersonPersonIdTvCredits200ResponseCrewInner.JSON_PROPERTY_CREDIT_ID
})
@JsonTypeName("GET_person_person_id_tv_credits_200_response_crew_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETPersonPersonIdTvCredits200ResponseCrewInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public static final String JSON_PROPERTY_ORIGINAL_LANGUAGE = "original_language";
  private String originalLanguage;

  public static final String JSON_PROPERTY_EPISODE_COUNT = "episode_count";
  private Integer episodeCount;

  public static final String JSON_PROPERTY_JOB = "job";
  private String job;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private String overview;

  public static final String JSON_PROPERTY_ORIGIN_COUNTRY = "origin_country";
  private List<String> originCountry = null;

  public static final String JSON_PROPERTY_ORIGINAL_NAME = "original_name";
  private String originalName;

  public static final String JSON_PROPERTY_GENRE_IDS = "genre_ids";
  private List<Integer> genreIds = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FIRST_AIR_DATE = "first_air_date";
  private String firstAirDate;

  public static final String JSON_PROPERTY_BACKDROP_PATH = "backdrop_path";
  private Object backdropPath;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private BigDecimal voteAverage;

  public static final String JSON_PROPERTY_POSTER_PATH = "poster_path";
  private Object posterPath;

  public static final String JSON_PROPERTY_CREDIT_ID = "credit_id";
  private String creditId;

  public GETPersonPersonIdTvCredits200ResponseCrewInner() {
  }

  public GETPersonPersonIdTvCredits200ResponseCrewInner id(Integer id) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner department(String department) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner originalLanguage(String originalLanguage) {
    
    this.originalLanguage = originalLanguage;
    return this;
  }

   /**
   * Get originalLanguage
   * @return originalLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalLanguage() {
    return originalLanguage;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalLanguage(String originalLanguage) {
    this.originalLanguage = originalLanguage;
  }


  public GETPersonPersonIdTvCredits200ResponseCrewInner episodeCount(Integer episodeCount) {
    
    this.episodeCount = episodeCount;
    return this;
  }

   /**
   * Get episodeCount
   * @return episodeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EPISODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEpisodeCount() {
    return episodeCount;
  }


  @JsonProperty(JSON_PROPERTY_EPISODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpisodeCount(Integer episodeCount) {
    this.episodeCount = episodeCount;
  }


  public GETPersonPersonIdTvCredits200ResponseCrewInner job(String job) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner overview(String overview) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner originCountry(List<String> originCountry) {
    
    this.originCountry = originCountry;
    return this;
  }

  public GETPersonPersonIdTvCredits200ResponseCrewInner addOriginCountryItem(String originCountryItem) {
    if (this.originCountry == null) {
      this.originCountry = new ArrayList<>();
    }
    this.originCountry.add(originCountryItem);
    return this;
  }

   /**
   * Get originCountry
   * @return originCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGIN_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOriginCountry() {
    return originCountry;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginCountry(List<String> originCountry) {
    this.originCountry = originCountry;
  }


  public GETPersonPersonIdTvCredits200ResponseCrewInner originalName(String originalName) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner genreIds(List<Integer> genreIds) {
    
    this.genreIds = genreIds;
    return this;
  }

  public GETPersonPersonIdTvCredits200ResponseCrewInner addGenreIdsItem(Integer genreIdsItem) {
    if (this.genreIds == null) {
      this.genreIds = new ArrayList<>();
    }
    this.genreIds.add(genreIdsItem);
    return this;
  }

   /**
   * Get genreIds
   * @return genreIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENRE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getGenreIds() {
    return genreIds;
  }


  @JsonProperty(JSON_PROPERTY_GENRE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenreIds(List<Integer> genreIds) {
    this.genreIds = genreIds;
  }


  public GETPersonPersonIdTvCredits200ResponseCrewInner name(String name) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner firstAirDate(String firstAirDate) {
    
    this.firstAirDate = firstAirDate;
    return this;
  }

   /**
   * Get firstAirDate
   * @return firstAirDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstAirDate() {
    return firstAirDate;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstAirDate(String firstAirDate) {
    this.firstAirDate = firstAirDate;
  }


  public GETPersonPersonIdTvCredits200ResponseCrewInner backdropPath(Object backdropPath) {
    
    this.backdropPath = backdropPath;
    return this;
  }

   /**
   * Get backdropPath
   * @return backdropPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKDROP_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getBackdropPath() {
    return backdropPath;
  }


  @JsonProperty(JSON_PROPERTY_BACKDROP_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackdropPath(Object backdropPath) {
    this.backdropPath = backdropPath;
  }


  public GETPersonPersonIdTvCredits200ResponseCrewInner popularity(BigDecimal popularity) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner voteCount(Integer voteCount) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner voteAverage(BigDecimal voteAverage) {
    
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


  public GETPersonPersonIdTvCredits200ResponseCrewInner posterPath(Object posterPath) {
    
    this.posterPath = posterPath;
    return this;
  }

   /**
   * Get posterPath
   * @return posterPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTER_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPosterPath() {
    return posterPath;
  }


  @JsonProperty(JSON_PROPERTY_POSTER_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosterPath(Object posterPath) {
    this.posterPath = posterPath;
  }


  public GETPersonPersonIdTvCredits200ResponseCrewInner creditId(String creditId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETPersonPersonIdTvCredits200ResponseCrewInner geTPersonPersonIdTvCredits200ResponseCrewInner = (GETPersonPersonIdTvCredits200ResponseCrewInner) o;
    return Objects.equals(this.id, geTPersonPersonIdTvCredits200ResponseCrewInner.id) &&
        Objects.equals(this.department, geTPersonPersonIdTvCredits200ResponseCrewInner.department) &&
        Objects.equals(this.originalLanguage, geTPersonPersonIdTvCredits200ResponseCrewInner.originalLanguage) &&
        Objects.equals(this.episodeCount, geTPersonPersonIdTvCredits200ResponseCrewInner.episodeCount) &&
        Objects.equals(this.job, geTPersonPersonIdTvCredits200ResponseCrewInner.job) &&
        Objects.equals(this.overview, geTPersonPersonIdTvCredits200ResponseCrewInner.overview) &&
        Objects.equals(this.originCountry, geTPersonPersonIdTvCredits200ResponseCrewInner.originCountry) &&
        Objects.equals(this.originalName, geTPersonPersonIdTvCredits200ResponseCrewInner.originalName) &&
        Objects.equals(this.genreIds, geTPersonPersonIdTvCredits200ResponseCrewInner.genreIds) &&
        Objects.equals(this.name, geTPersonPersonIdTvCredits200ResponseCrewInner.name) &&
        Objects.equals(this.firstAirDate, geTPersonPersonIdTvCredits200ResponseCrewInner.firstAirDate) &&
        Objects.equals(this.backdropPath, geTPersonPersonIdTvCredits200ResponseCrewInner.backdropPath) &&
        Objects.equals(this.popularity, geTPersonPersonIdTvCredits200ResponseCrewInner.popularity) &&
        Objects.equals(this.voteCount, geTPersonPersonIdTvCredits200ResponseCrewInner.voteCount) &&
        Objects.equals(this.voteAverage, geTPersonPersonIdTvCredits200ResponseCrewInner.voteAverage) &&
        Objects.equals(this.posterPath, geTPersonPersonIdTvCredits200ResponseCrewInner.posterPath) &&
        Objects.equals(this.creditId, geTPersonPersonIdTvCredits200ResponseCrewInner.creditId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, department, originalLanguage, episodeCount, job, overview, originCountry, originalName, genreIds, name, firstAirDate, backdropPath, popularity, voteCount, voteAverage, posterPath, creditId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETPersonPersonIdTvCredits200ResponseCrewInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    episodeCount: ").append(toIndentedString(episodeCount)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstAirDate: ").append(toIndentedString(firstAirDate)).append("\n");
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    creditId: ").append(toIndentedString(creditId)).append("\n");
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

