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
 * GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue
 */
@JsonPropertyOrder({
  GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue.JSON_PROPERTY_EPISODE_ID,
  GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue.JSON_PROPERTY_EPISODE_NUMBER
})
@JsonTypeName("GET_tv_season_season_id_changes_200_response_changes_inner_items_inner_value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue {
  public static final String JSON_PROPERTY_EPISODE_ID = "episode_id";
  private Integer episodeId;

  public static final String JSON_PROPERTY_EPISODE_NUMBER = "episode_number";
  private Integer episodeNumber;

  public GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue() {
  }

  public GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue episodeId(Integer episodeId) {
    
    this.episodeId = episodeId;
    return this;
  }

   /**
   * Get episodeId
   * @return episodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EPISODE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEpisodeId() {
    return episodeId;
  }


  @JsonProperty(JSON_PROPERTY_EPISODE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpisodeId(Integer episodeId) {
    this.episodeId = episodeId;
  }


  public GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue episodeNumber(Integer episodeNumber) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue geTTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue = (GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue) o;
    return Objects.equals(this.episodeId, geTTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue.episodeId) &&
        Objects.equals(this.episodeNumber, geTTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue.episodeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(episodeId, episodeNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvSeasonSeasonIdChanges200ResponseChangesInnerItemsInnerValue {\n");
    sb.append("    episodeId: ").append(toIndentedString(episodeId)).append("\n");
    sb.append("    episodeNumber: ").append(toIndentedString(episodeNumber)).append("\n");
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

