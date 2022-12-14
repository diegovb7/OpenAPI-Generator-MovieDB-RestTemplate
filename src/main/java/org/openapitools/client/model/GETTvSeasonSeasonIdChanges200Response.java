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
import org.openapitools.client.model.GETTvSeasonSeasonIdChanges200ResponseChangesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvSeasonSeasonIdChanges200Response
 */
@JsonPropertyOrder({
  GETTvSeasonSeasonIdChanges200Response.JSON_PROPERTY_CHANGES
})
@JsonTypeName("GET_tv_season_season_id_changes_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvSeasonSeasonIdChanges200Response {
  public static final String JSON_PROPERTY_CHANGES = "changes";
  private List<GETTvSeasonSeasonIdChanges200ResponseChangesInner> changes = null;

  public GETTvSeasonSeasonIdChanges200Response() {
  }

  public GETTvSeasonSeasonIdChanges200Response changes(List<GETTvSeasonSeasonIdChanges200ResponseChangesInner> changes) {
    
    this.changes = changes;
    return this;
  }

  public GETTvSeasonSeasonIdChanges200Response addChangesItem(GETTvSeasonSeasonIdChanges200ResponseChangesInner changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvSeasonSeasonIdChanges200ResponseChangesInner> getChanges() {
    return changes;
  }


  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChanges(List<GETTvSeasonSeasonIdChanges200ResponseChangesInner> changes) {
    this.changes = changes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvSeasonSeasonIdChanges200Response geTTvSeasonSeasonIdChanges200Response = (GETTvSeasonSeasonIdChanges200Response) o;
    return Objects.equals(this.changes, geTTvSeasonSeasonIdChanges200Response.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvSeasonSeasonIdChanges200Response {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

