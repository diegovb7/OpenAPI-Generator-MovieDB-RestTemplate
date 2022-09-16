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
import org.openapitools.client.model.GETSearchKeyword200ResponseResultsInner;
import org.openapitools.client.model.GETTvLatest200ResponseSeasonsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvLatest200Response
 */
@JsonPropertyOrder({
  GETTvLatest200Response.JSON_PROPERTY_BACKDROP_PATH,
  GETTvLatest200Response.JSON_PROPERTY_CREATED_BY,
  GETTvLatest200Response.JSON_PROPERTY_EPISODE_RUN_TIME,
  GETTvLatest200Response.JSON_PROPERTY_FIRST_AIR_DATE,
  GETTvLatest200Response.JSON_PROPERTY_GENRES,
  GETTvLatest200Response.JSON_PROPERTY_HOMEPAGE,
  GETTvLatest200Response.JSON_PROPERTY_ID,
  GETTvLatest200Response.JSON_PROPERTY_IN_PRODUCTION,
  GETTvLatest200Response.JSON_PROPERTY_LANGUAGES,
  GETTvLatest200Response.JSON_PROPERTY_LAST_AIR_DATE,
  GETTvLatest200Response.JSON_PROPERTY_NAME,
  GETTvLatest200Response.JSON_PROPERTY_NETWORKS,
  GETTvLatest200Response.JSON_PROPERTY_NUMBER_OF_EPISODES,
  GETTvLatest200Response.JSON_PROPERTY_NUMBER_OF_SEASONS,
  GETTvLatest200Response.JSON_PROPERTY_ORIGIN_COUNTRY,
  GETTvLatest200Response.JSON_PROPERTY_ORIGINAL_LANGUAGE,
  GETTvLatest200Response.JSON_PROPERTY_ORIGINAL_NAME,
  GETTvLatest200Response.JSON_PROPERTY_POPULARITY,
  GETTvLatest200Response.JSON_PROPERTY_POSTER_PATH,
  GETTvLatest200Response.JSON_PROPERTY_PRODUCTION_COMPANIES,
  GETTvLatest200Response.JSON_PROPERTY_SEASONS,
  GETTvLatest200Response.JSON_PROPERTY_STATUS,
  GETTvLatest200Response.JSON_PROPERTY_TYPE,
  GETTvLatest200Response.JSON_PROPERTY_VOTE_AVERAGE,
  GETTvLatest200Response.JSON_PROPERTY_VOTE_COUNT
})
@JsonTypeName("GET_tv_latest_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvLatest200Response {
  public static final String JSON_PROPERTY_BACKDROP_PATH = "backdrop_path";
  private Object backdropPath;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private List<Object> createdBy = null;

  public static final String JSON_PROPERTY_EPISODE_RUN_TIME = "episode_run_time";
  private List<Integer> episodeRunTime = null;

  public static final String JSON_PROPERTY_FIRST_AIR_DATE = "first_air_date";
  private String firstAirDate;

  public static final String JSON_PROPERTY_GENRES = "genres";
  private List<GETSearchKeyword200ResponseResultsInner> genres = null;

  public static final String JSON_PROPERTY_HOMEPAGE = "homepage";
  private String homepage;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_IN_PRODUCTION = "in_production";
  private Boolean inProduction;

  public static final String JSON_PROPERTY_LANGUAGES = "languages";
  private List<String> languages = null;

  public static final String JSON_PROPERTY_LAST_AIR_DATE = "last_air_date";
  private String lastAirDate;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NETWORKS = "networks";
  private List<GETSearchKeyword200ResponseResultsInner> networks = null;

  public static final String JSON_PROPERTY_NUMBER_OF_EPISODES = "number_of_episodes";
  private Integer numberOfEpisodes;

  public static final String JSON_PROPERTY_NUMBER_OF_SEASONS = "number_of_seasons";
  private Integer numberOfSeasons;

  public static final String JSON_PROPERTY_ORIGIN_COUNTRY = "origin_country";
  private List<String> originCountry = null;

  public static final String JSON_PROPERTY_ORIGINAL_LANGUAGE = "original_language";
  private String originalLanguage;

  public static final String JSON_PROPERTY_ORIGINAL_NAME = "original_name";
  private String originalName;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private Integer popularity;

  public static final String JSON_PROPERTY_POSTER_PATH = "poster_path";
  private Object posterPath;

  public static final String JSON_PROPERTY_PRODUCTION_COMPANIES = "production_companies";
  private List<Object> productionCompanies = null;

  public static final String JSON_PROPERTY_SEASONS = "seasons";
  private List<GETTvLatest200ResponseSeasonsInner> seasons = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private BigDecimal voteAverage;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public GETTvLatest200Response() {
  }

  public GETTvLatest200Response backdropPath(Object backdropPath) {
    
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


  public GETTvLatest200Response createdBy(List<Object> createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  public GETTvLatest200Response addCreatedByItem(Object createdByItem) {
    if (this.createdBy == null) {
      this.createdBy = new ArrayList<>();
    }
    this.createdBy.add(createdByItem);
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(List<Object> createdBy) {
    this.createdBy = createdBy;
  }


  public GETTvLatest200Response episodeRunTime(List<Integer> episodeRunTime) {
    
    this.episodeRunTime = episodeRunTime;
    return this;
  }

  public GETTvLatest200Response addEpisodeRunTimeItem(Integer episodeRunTimeItem) {
    if (this.episodeRunTime == null) {
      this.episodeRunTime = new ArrayList<>();
    }
    this.episodeRunTime.add(episodeRunTimeItem);
    return this;
  }

   /**
   * Get episodeRunTime
   * @return episodeRunTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EPISODE_RUN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getEpisodeRunTime() {
    return episodeRunTime;
  }


  @JsonProperty(JSON_PROPERTY_EPISODE_RUN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpisodeRunTime(List<Integer> episodeRunTime) {
    this.episodeRunTime = episodeRunTime;
  }


  public GETTvLatest200Response firstAirDate(String firstAirDate) {
    
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


  public GETTvLatest200Response genres(List<GETSearchKeyword200ResponseResultsInner> genres) {
    
    this.genres = genres;
    return this;
  }

  public GETTvLatest200Response addGenresItem(GETSearchKeyword200ResponseResultsInner genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

   /**
   * Get genres
   * @return genres
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETSearchKeyword200ResponseResultsInner> getGenres() {
    return genres;
  }


  @JsonProperty(JSON_PROPERTY_GENRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenres(List<GETSearchKeyword200ResponseResultsInner> genres) {
    this.genres = genres;
  }


  public GETTvLatest200Response homepage(String homepage) {
    
    this.homepage = homepage;
    return this;
  }

   /**
   * Get homepage
   * @return homepage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHomepage() {
    return homepage;
  }


  @JsonProperty(JSON_PROPERTY_HOMEPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }


  public GETTvLatest200Response id(Integer id) {
    
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


  public GETTvLatest200Response inProduction(Boolean inProduction) {
    
    this.inProduction = inProduction;
    return this;
  }

   /**
   * Get inProduction
   * @return inProduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IN_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInProduction() {
    return inProduction;
  }


  @JsonProperty(JSON_PROPERTY_IN_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInProduction(Boolean inProduction) {
    this.inProduction = inProduction;
  }


  public GETTvLatest200Response languages(List<String> languages) {
    
    this.languages = languages;
    return this;
  }

  public GETTvLatest200Response addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLanguages() {
    return languages;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }


  public GETTvLatest200Response lastAirDate(String lastAirDate) {
    
    this.lastAirDate = lastAirDate;
    return this;
  }

   /**
   * Get lastAirDate
   * @return lastAirDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastAirDate() {
    return lastAirDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_AIR_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastAirDate(String lastAirDate) {
    this.lastAirDate = lastAirDate;
  }


  public GETTvLatest200Response name(String name) {
    
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


  public GETTvLatest200Response networks(List<GETSearchKeyword200ResponseResultsInner> networks) {
    
    this.networks = networks;
    return this;
  }

  public GETTvLatest200Response addNetworksItem(GETSearchKeyword200ResponseResultsInner networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Get networks
   * @return networks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETSearchKeyword200ResponseResultsInner> getNetworks() {
    return networks;
  }


  @JsonProperty(JSON_PROPERTY_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworks(List<GETSearchKeyword200ResponseResultsInner> networks) {
    this.networks = networks;
  }


  public GETTvLatest200Response numberOfEpisodes(Integer numberOfEpisodes) {
    
    this.numberOfEpisodes = numberOfEpisodes;
    return this;
  }

   /**
   * Get numberOfEpisodes
   * @return numberOfEpisodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EPISODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfEpisodes() {
    return numberOfEpisodes;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EPISODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfEpisodes(Integer numberOfEpisodes) {
    this.numberOfEpisodes = numberOfEpisodes;
  }


  public GETTvLatest200Response numberOfSeasons(Integer numberOfSeasons) {
    
    this.numberOfSeasons = numberOfSeasons;
    return this;
  }

   /**
   * Get numberOfSeasons
   * @return numberOfSeasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SEASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfSeasons() {
    return numberOfSeasons;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SEASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfSeasons(Integer numberOfSeasons) {
    this.numberOfSeasons = numberOfSeasons;
  }


  public GETTvLatest200Response originCountry(List<String> originCountry) {
    
    this.originCountry = originCountry;
    return this;
  }

  public GETTvLatest200Response addOriginCountryItem(String originCountryItem) {
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


  public GETTvLatest200Response originalLanguage(String originalLanguage) {
    
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


  public GETTvLatest200Response originalName(String originalName) {
    
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


  public GETTvLatest200Response popularity(Integer popularity) {
    
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

  public Integer getPopularity() {
    return popularity;
  }


  @JsonProperty(JSON_PROPERTY_POPULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopularity(Integer popularity) {
    this.popularity = popularity;
  }


  public GETTvLatest200Response posterPath(Object posterPath) {
    
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


  public GETTvLatest200Response productionCompanies(List<Object> productionCompanies) {
    
    this.productionCompanies = productionCompanies;
    return this;
  }

  public GETTvLatest200Response addProductionCompaniesItem(Object productionCompaniesItem) {
    if (this.productionCompanies == null) {
      this.productionCompanies = new ArrayList<>();
    }
    this.productionCompanies.add(productionCompaniesItem);
    return this;
  }

   /**
   * Get productionCompanies
   * @return productionCompanies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCTION_COMPANIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getProductionCompanies() {
    return productionCompanies;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTION_COMPANIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductionCompanies(List<Object> productionCompanies) {
    this.productionCompanies = productionCompanies;
  }


  public GETTvLatest200Response seasons(List<GETTvLatest200ResponseSeasonsInner> seasons) {
    
    this.seasons = seasons;
    return this;
  }

  public GETTvLatest200Response addSeasonsItem(GETTvLatest200ResponseSeasonsInner seasonsItem) {
    if (this.seasons == null) {
      this.seasons = new ArrayList<>();
    }
    this.seasons.add(seasonsItem);
    return this;
  }

   /**
   * Get seasons
   * @return seasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvLatest200ResponseSeasonsInner> getSeasons() {
    return seasons;
  }


  @JsonProperty(JSON_PROPERTY_SEASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeasons(List<GETTvLatest200ResponseSeasonsInner> seasons) {
    this.seasons = seasons;
  }


  public GETTvLatest200Response status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public GETTvLatest200Response type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public GETTvLatest200Response voteAverage(BigDecimal voteAverage) {
    
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


  public GETTvLatest200Response voteCount(Integer voteCount) {
    
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
    GETTvLatest200Response geTTvLatest200Response = (GETTvLatest200Response) o;
    return Objects.equals(this.backdropPath, geTTvLatest200Response.backdropPath) &&
        Objects.equals(this.createdBy, geTTvLatest200Response.createdBy) &&
        Objects.equals(this.episodeRunTime, geTTvLatest200Response.episodeRunTime) &&
        Objects.equals(this.firstAirDate, geTTvLatest200Response.firstAirDate) &&
        Objects.equals(this.genres, geTTvLatest200Response.genres) &&
        Objects.equals(this.homepage, geTTvLatest200Response.homepage) &&
        Objects.equals(this.id, geTTvLatest200Response.id) &&
        Objects.equals(this.inProduction, geTTvLatest200Response.inProduction) &&
        Objects.equals(this.languages, geTTvLatest200Response.languages) &&
        Objects.equals(this.lastAirDate, geTTvLatest200Response.lastAirDate) &&
        Objects.equals(this.name, geTTvLatest200Response.name) &&
        Objects.equals(this.networks, geTTvLatest200Response.networks) &&
        Objects.equals(this.numberOfEpisodes, geTTvLatest200Response.numberOfEpisodes) &&
        Objects.equals(this.numberOfSeasons, geTTvLatest200Response.numberOfSeasons) &&
        Objects.equals(this.originCountry, geTTvLatest200Response.originCountry) &&
        Objects.equals(this.originalLanguage, geTTvLatest200Response.originalLanguage) &&
        Objects.equals(this.originalName, geTTvLatest200Response.originalName) &&
        Objects.equals(this.popularity, geTTvLatest200Response.popularity) &&
        Objects.equals(this.posterPath, geTTvLatest200Response.posterPath) &&
        Objects.equals(this.productionCompanies, geTTvLatest200Response.productionCompanies) &&
        Objects.equals(this.seasons, geTTvLatest200Response.seasons) &&
        Objects.equals(this.status, geTTvLatest200Response.status) &&
        Objects.equals(this.type, geTTvLatest200Response.type) &&
        Objects.equals(this.voteAverage, geTTvLatest200Response.voteAverage) &&
        Objects.equals(this.voteCount, geTTvLatest200Response.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backdropPath, createdBy, episodeRunTime, firstAirDate, genres, homepage, id, inProduction, languages, lastAirDate, name, networks, numberOfEpisodes, numberOfSeasons, originCountry, originalLanguage, originalName, popularity, posterPath, productionCompanies, seasons, status, type, voteAverage, voteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvLatest200Response {\n");
    sb.append("    backdropPath: ").append(toIndentedString(backdropPath)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    episodeRunTime: ").append(toIndentedString(episodeRunTime)).append("\n");
    sb.append("    firstAirDate: ").append(toIndentedString(firstAirDate)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inProduction: ").append(toIndentedString(inProduction)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    lastAirDate: ").append(toIndentedString(lastAirDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    numberOfEpisodes: ").append(toIndentedString(numberOfEpisodes)).append("\n");
    sb.append("    numberOfSeasons: ").append(toIndentedString(numberOfSeasons)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    originalLanguage: ").append(toIndentedString(originalLanguage)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
    sb.append("    productionCompanies: ").append(toIndentedString(productionCompanies)).append("\n");
    sb.append("    seasons: ").append(toIndentedString(seasons)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

