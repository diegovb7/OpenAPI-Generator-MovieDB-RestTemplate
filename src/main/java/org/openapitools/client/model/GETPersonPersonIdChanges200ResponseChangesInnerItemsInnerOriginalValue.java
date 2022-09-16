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
import org.openapitools.client.model.GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValueProfile;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue
 */
@JsonPropertyOrder({
  GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue.JSON_PROPERTY_PROFILE
})
@JsonTypeName("GET_person_person_id_changes_200_response_changes_inner_items_inner_original_value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue {
  public static final String JSON_PROPERTY_PROFILE = "profile";
  private GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValueProfile profile;

  public GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue() {
  }

  public GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue profile(GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValueProfile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValueProfile getProfile() {
    return profile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfile(GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValueProfile profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue geTPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue = (GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue) o;
    return Objects.equals(this.profile, geTPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETPersonPersonIdChanges200ResponseChangesInnerItemsInnerOriginalValue {\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

