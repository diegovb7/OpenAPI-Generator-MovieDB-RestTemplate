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
 * GETSearchPerson200ResponseResultsInner
 */
@JsonPropertyOrder({
  GETSearchPerson200ResponseResultsInner.JSON_PROPERTY_PROFILE_PATH,
  GETSearchPerson200ResponseResultsInner.JSON_PROPERTY_ADULT,
  GETSearchPerson200ResponseResultsInner.JSON_PROPERTY_ID,
  GETSearchPerson200ResponseResultsInner.JSON_PROPERTY_KNOWN_FOR,
  GETSearchPerson200ResponseResultsInner.JSON_PROPERTY_NAME,
  GETSearchPerson200ResponseResultsInner.JSON_PROPERTY_POPULARITY
})
@JsonTypeName("GET_search_person_200_response_results_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETSearchPerson200ResponseResultsInner {
  public static final String JSON_PROPERTY_PROFILE_PATH = "profile_path";
  private Object profilePath;

  public static final String JSON_PROPERTY_ADULT = "adult";
  private Boolean adult;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_KNOWN_FOR = "known_for";
  private List<Object> knownFor = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private BigDecimal popularity;

  public GETSearchPerson200ResponseResultsInner() {
  }

  public GETSearchPerson200ResponseResultsInner profilePath(Object profilePath) {
    
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


  public GETSearchPerson200ResponseResultsInner adult(Boolean adult) {
    
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


  public GETSearchPerson200ResponseResultsInner id(Integer id) {
    
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


  public GETSearchPerson200ResponseResultsInner knownFor(List<Object> knownFor) {
    
    this.knownFor = knownFor;
    return this;
  }

  public GETSearchPerson200ResponseResultsInner addKnownForItem(Object knownForItem) {
    if (this.knownFor == null) {
      this.knownFor = new ArrayList<>();
    }
    this.knownFor.add(knownForItem);
    return this;
  }

   /**
   * Get knownFor
   * @return knownFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KNOWN_FOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getKnownFor() {
    return knownFor;
  }


  @JsonProperty(JSON_PROPERTY_KNOWN_FOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKnownFor(List<Object> knownFor) {
    this.knownFor = knownFor;
  }


  public GETSearchPerson200ResponseResultsInner name(String name) {
    
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


  public GETSearchPerson200ResponseResultsInner popularity(BigDecimal popularity) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETSearchPerson200ResponseResultsInner geTSearchPerson200ResponseResultsInner = (GETSearchPerson200ResponseResultsInner) o;
    return Objects.equals(this.profilePath, geTSearchPerson200ResponseResultsInner.profilePath) &&
        Objects.equals(this.adult, geTSearchPerson200ResponseResultsInner.adult) &&
        Objects.equals(this.id, geTSearchPerson200ResponseResultsInner.id) &&
        Objects.equals(this.knownFor, geTSearchPerson200ResponseResultsInner.knownFor) &&
        Objects.equals(this.name, geTSearchPerson200ResponseResultsInner.name) &&
        Objects.equals(this.popularity, geTSearchPerson200ResponseResultsInner.popularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profilePath, adult, id, knownFor, name, popularity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETSearchPerson200ResponseResultsInner {\n");
    sb.append("    profilePath: ").append(toIndentedString(profilePath)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    knownFor: ").append(toIndentedString(knownFor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
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

