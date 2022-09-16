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
import org.openapitools.client.model.GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200ResponseStillsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETPersonPersonIdImages200Response
 */
@JsonPropertyOrder({
  GETPersonPersonIdImages200Response.JSON_PROPERTY_ID,
  GETPersonPersonIdImages200Response.JSON_PROPERTY_PROFILES
})
@JsonTypeName("GET_person_person_id_images_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETPersonPersonIdImages200Response {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_PROFILES = "profiles";
  private List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200ResponseStillsInner> profiles = null;

  public GETPersonPersonIdImages200Response() {
  }

  public GETPersonPersonIdImages200Response id(Integer id) {
    
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


  public GETPersonPersonIdImages200Response profiles(List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200ResponseStillsInner> profiles) {
    
    this.profiles = profiles;
    return this;
  }

  public GETPersonPersonIdImages200Response addProfilesItem(GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200ResponseStillsInner profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200ResponseStillsInner> getProfiles() {
    return profiles;
  }


  @JsonProperty(JSON_PROPERTY_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfiles(List<GETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages200ResponseStillsInner> profiles) {
    this.profiles = profiles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETPersonPersonIdImages200Response geTPersonPersonIdImages200Response = (GETPersonPersonIdImages200Response) o;
    return Objects.equals(this.id, geTPersonPersonIdImages200Response.id) &&
        Objects.equals(this.profiles, geTPersonPersonIdImages200Response.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETPersonPersonIdImages200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

