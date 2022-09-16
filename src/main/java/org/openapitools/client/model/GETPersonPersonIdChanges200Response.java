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
import org.openapitools.client.model.GETPersonPersonIdChanges200ResponseChangesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETPersonPersonIdChanges200Response
 */
@JsonPropertyOrder({
  GETPersonPersonIdChanges200Response.JSON_PROPERTY_CHANGES
})
@JsonTypeName("GET_person_person_id_changes_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETPersonPersonIdChanges200Response {
  public static final String JSON_PROPERTY_CHANGES = "changes";
  private List<GETPersonPersonIdChanges200ResponseChangesInner> changes = null;

  public GETPersonPersonIdChanges200Response() {
  }

  public GETPersonPersonIdChanges200Response changes(List<GETPersonPersonIdChanges200ResponseChangesInner> changes) {
    
    this.changes = changes;
    return this;
  }

  public GETPersonPersonIdChanges200Response addChangesItem(GETPersonPersonIdChanges200ResponseChangesInner changesItem) {
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

  public List<GETPersonPersonIdChanges200ResponseChangesInner> getChanges() {
    return changes;
  }


  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChanges(List<GETPersonPersonIdChanges200ResponseChangesInner> changes) {
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
    GETPersonPersonIdChanges200Response geTPersonPersonIdChanges200Response = (GETPersonPersonIdChanges200Response) o;
    return Objects.equals(this.changes, geTPersonPersonIdChanges200Response.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETPersonPersonIdChanges200Response {\n");
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
