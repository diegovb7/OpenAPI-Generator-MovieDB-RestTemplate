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
import org.openapitools.client.model.GETTvTvIdChanges200ResponseChangesInnerItemsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvTvIdChanges200ResponseChangesInner
 */
@JsonPropertyOrder({
  GETTvTvIdChanges200ResponseChangesInner.JSON_PROPERTY_KEY,
  GETTvTvIdChanges200ResponseChangesInner.JSON_PROPERTY_ITEMS
})
@JsonTypeName("GET_tv_tv_id_changes_200_response_changes_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvIdChanges200ResponseChangesInner {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<GETTvTvIdChanges200ResponseChangesInnerItemsInner> items = null;

  public GETTvTvIdChanges200ResponseChangesInner() {
  }

  public GETTvTvIdChanges200ResponseChangesInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public GETTvTvIdChanges200ResponseChangesInner items(List<GETTvTvIdChanges200ResponseChangesInnerItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public GETTvTvIdChanges200ResponseChangesInner addItemsItem(GETTvTvIdChanges200ResponseChangesInnerItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvTvIdChanges200ResponseChangesInnerItemsInner> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<GETTvTvIdChanges200ResponseChangesInnerItemsInner> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvIdChanges200ResponseChangesInner geTTvTvIdChanges200ResponseChangesInner = (GETTvTvIdChanges200ResponseChangesInner) o;
    return Objects.equals(this.key, geTTvTvIdChanges200ResponseChangesInner.key) &&
        Objects.equals(this.items, geTTvTvIdChanges200ResponseChangesInner.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdChanges200ResponseChangesInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

