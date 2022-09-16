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
import org.openapitools.client.model.GETPersonPersonIdMovieCredits200ResponseCastInner;
import org.openapitools.client.model.GETPersonPersonIdMovieCredits200ResponseCrewInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETPersonPersonIdMovieCredits200Response
 */
@JsonPropertyOrder({
  GETPersonPersonIdMovieCredits200Response.JSON_PROPERTY_CAST,
  GETPersonPersonIdMovieCredits200Response.JSON_PROPERTY_CREW,
  GETPersonPersonIdMovieCredits200Response.JSON_PROPERTY_ID
})
@JsonTypeName("GET_person_person_id_movie_credits_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETPersonPersonIdMovieCredits200Response {
  public static final String JSON_PROPERTY_CAST = "cast";
  private List<GETPersonPersonIdMovieCredits200ResponseCastInner> cast = null;

  public static final String JSON_PROPERTY_CREW = "crew";
  private List<GETPersonPersonIdMovieCredits200ResponseCrewInner> crew = null;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public GETPersonPersonIdMovieCredits200Response() {
  }

  public GETPersonPersonIdMovieCredits200Response cast(List<GETPersonPersonIdMovieCredits200ResponseCastInner> cast) {
    
    this.cast = cast;
    return this;
  }

  public GETPersonPersonIdMovieCredits200Response addCastItem(GETPersonPersonIdMovieCredits200ResponseCastInner castItem) {
    if (this.cast == null) {
      this.cast = new ArrayList<>();
    }
    this.cast.add(castItem);
    return this;
  }

   /**
   * Get cast
   * @return cast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETPersonPersonIdMovieCredits200ResponseCastInner> getCast() {
    return cast;
  }


  @JsonProperty(JSON_PROPERTY_CAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCast(List<GETPersonPersonIdMovieCredits200ResponseCastInner> cast) {
    this.cast = cast;
  }


  public GETPersonPersonIdMovieCredits200Response crew(List<GETPersonPersonIdMovieCredits200ResponseCrewInner> crew) {
    
    this.crew = crew;
    return this;
  }

  public GETPersonPersonIdMovieCredits200Response addCrewItem(GETPersonPersonIdMovieCredits200ResponseCrewInner crewItem) {
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

  public List<GETPersonPersonIdMovieCredits200ResponseCrewInner> getCrew() {
    return crew;
  }


  @JsonProperty(JSON_PROPERTY_CREW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrew(List<GETPersonPersonIdMovieCredits200ResponseCrewInner> crew) {
    this.crew = crew;
  }


  public GETPersonPersonIdMovieCredits200Response id(Integer id) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETPersonPersonIdMovieCredits200Response geTPersonPersonIdMovieCredits200Response = (GETPersonPersonIdMovieCredits200Response) o;
    return Objects.equals(this.cast, geTPersonPersonIdMovieCredits200Response.cast) &&
        Objects.equals(this.crew, geTPersonPersonIdMovieCredits200Response.crew) &&
        Objects.equals(this.id, geTPersonPersonIdMovieCredits200Response.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cast, crew, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETPersonPersonIdMovieCredits200Response {\n");
    sb.append("    cast: ").append(toIndentedString(cast)).append("\n");
    sb.append("    crew: ").append(toIndentedString(crew)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

