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
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberCredits200ResponseCastInner;
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvTvIdSeasonSeasonNumberCredits200Response
 */
@JsonPropertyOrder({
  GETTvTvIdSeasonSeasonNumberCredits200Response.JSON_PROPERTY_CAST,
  GETTvTvIdSeasonSeasonNumberCredits200Response.JSON_PROPERTY_CREW,
  GETTvTvIdSeasonSeasonNumberCredits200Response.JSON_PROPERTY_ID
})
@JsonTypeName("GET_tv_tv_id_season_season_number_credits_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvIdSeasonSeasonNumberCredits200Response {
  public static final String JSON_PROPERTY_CAST = "cast";
  private List<GETTvTvIdSeasonSeasonNumberCredits200ResponseCastInner> cast = null;

  public static final String JSON_PROPERTY_CREW = "crew";
  private List<GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner> crew = null;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public GETTvTvIdSeasonSeasonNumberCredits200Response() {
  }

  public GETTvTvIdSeasonSeasonNumberCredits200Response cast(List<GETTvTvIdSeasonSeasonNumberCredits200ResponseCastInner> cast) {
    
    this.cast = cast;
    return this;
  }

  public GETTvTvIdSeasonSeasonNumberCredits200Response addCastItem(GETTvTvIdSeasonSeasonNumberCredits200ResponseCastInner castItem) {
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

  public List<GETTvTvIdSeasonSeasonNumberCredits200ResponseCastInner> getCast() {
    return cast;
  }


  @JsonProperty(JSON_PROPERTY_CAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCast(List<GETTvTvIdSeasonSeasonNumberCredits200ResponseCastInner> cast) {
    this.cast = cast;
  }


  public GETTvTvIdSeasonSeasonNumberCredits200Response crew(List<GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner> crew) {
    
    this.crew = crew;
    return this;
  }

  public GETTvTvIdSeasonSeasonNumberCredits200Response addCrewItem(GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner crewItem) {
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

  public List<GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner> getCrew() {
    return crew;
  }


  @JsonProperty(JSON_PROPERTY_CREW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrew(List<GETTvTvIdSeasonSeasonNumberCredits200ResponseCrewInner> crew) {
    this.crew = crew;
  }


  public GETTvTvIdSeasonSeasonNumberCredits200Response id(Integer id) {
    
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
    GETTvTvIdSeasonSeasonNumberCredits200Response geTTvTvIdSeasonSeasonNumberCredits200Response = (GETTvTvIdSeasonSeasonNumberCredits200Response) o;
    return Objects.equals(this.cast, geTTvTvIdSeasonSeasonNumberCredits200Response.cast) &&
        Objects.equals(this.crew, geTTvTvIdSeasonSeasonNumberCredits200Response.crew) &&
        Objects.equals(this.id, geTTvTvIdSeasonSeasonNumberCredits200Response.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cast, crew, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdSeasonSeasonNumberCredits200Response {\n");
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

