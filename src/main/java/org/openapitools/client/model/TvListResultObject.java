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
 * TvListResultObject
 */
@JsonPropertyOrder({
  TvListResultObject.JSON_PROPERTY_POSTER_PATH,
  TvListResultObject.JSON_PROPERTY_POPULARITY,
  TvListResultObject.JSON_PROPERTY_ID,
  TvListResultObject.JSON_PROPERTY_BACKDROP_PATH,
  TvListResultObject.JSON_PROPERTY_VOTE_AVERAGE,
  TvListResultObject.JSON_PROPERTY_OVERVIEW,
  TvListResultObject.JSON_PROPERTY_FIRST_AIR_DATE,
  TvListResultObject.JSON_PROPERTY_ORIGIN_COUNTRY,
  TvListResultObject.JSON_PROPERTY_GENRE_IDS,
  TvListResultObject.JSON_PROPERTY_ORIGINAL_LANGUAGE,
  TvListResultObject.JSON_PROPERTY_VOTE_COUNT,
  TvListResultObject.JSON_PROPERTY_NAME,
  TvListResultObject.JSON_PROPERTY_ORIGINAL_NAME
})
@JsonTypeName("tv-list-result-object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class TvListResultObject {
  public static final String JSON_PROPERTY_POSTER_PATH = "poster_path";
  private Object posterPath;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_BACKDROP_PATH = "backdrop_path";
  private Object backdropPath;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private BigDecimal voteAverage;

  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private String overview;

  public static final String JSON_PROPERTY_FIRST_AIR_DATE = "first_air_date";
  private String firstAirDate;

  public static final String JSON_PROPERTY_ORIGIN_COUNTRY = "origin_country";
  private List<String> originCountry = null;

  public static final String JSON_PROPERTY_GENRE_IDS = "genre_ids";
  private List<Integer> genreIds = null;

  public static final String JSON_PROPERTY_ORIGINAL_LANGUAGE = "original_language";
  private String originalLanguage;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORIGINAL_NAME = "original_name";
  private String originalName;

  public TvListResultObject() {
  }

  public TvListResultObject posterPath(Object posterPath) {
    
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


  public TvListResultObject popularity(BigDecimal popularity) {
    
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


  public TvListResultObject id(Integer id) {
    
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


  public TvListResultObject backdropPath(Object backdropPath) {
    
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


  public TvListResultObject voteAverage(BigDecimal voteAverage) {
    
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


  public TvListResultObject overview(String overview) {
    
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


  public TvListResultObject firstAirDate(String firstAirDate) {
    
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


  public TvListResultObject originCountry(List<String> originCountry) {
    
    this.originCountry = originCountry;
    return this;
  }

  public TvListResultObject addOriginCountryItem(String originCountryItem) {
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


  public TvListResultObject genreIds(List<Integer> genreIds) {
    
    this.genreIds = genreIds;
    return this;
  }

  public TvListResultObject addGenreIdsItem(Integer genreIdsItem) {
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


  public TvListResultObject originalLanguage(String originalLanguage) {
    
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


  public TvListResultObject voteCount(Integer voteCount) {
    
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


  public TvListResultObject name(String name) {
    
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


  public TvListResultObject originalName(String originalName) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TvListResultObject tvListResultObject = (TvListResultObject) o;
    return Objects.equals(this.posterPath, tvListResultObject.posterPath) &&
        Objects.equals(this.popularity, tvListResultObject.popularity) &&
        Objects.equals(this.id, tvListResultObject.id) &&
        Objects.equals(this.backdropPath, tvListResultObject.backdropPath) &&
        Objects.equals(this.voteAverage, tvListResultObject.voteAverage) &&
        Objects.equals(this.overview, tvListResultObject.overview) &&
        Objects.equals(this.firstAirDate, tvListResultObject.firstAirDate) &&
        Objects.equals(this.originCountry, tvListResultObject.originCountry) &&
        Objects.equals(this.genreIds, tvListResultObject.genreIds) &&
        Objects.equals(this.originalLanguage, tvListResultObject.originalLanguage) &&
        Objects.equals(this.voteCount, tvListResultObject.voteCount) &&
        Objects.equals(this.name, tvListResultObject.name) &&
        Objects.equals(this.originalName, tvListResultObject.originalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posterPath, popularity, id, backdropPath, voteAverage, overview, firstAirDate, originCountry, genreIds, originalLanguage, voteCount, name, originalName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TvListResultObject {\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    firstAirDate: ").append(toIndentedString(firstAirDate)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    genreIds: ").append(toIndentedString(genreIds)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
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

