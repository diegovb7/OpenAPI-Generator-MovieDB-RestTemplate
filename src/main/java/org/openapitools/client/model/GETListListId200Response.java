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
import org.openapitools.client.model.MovieListObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETListListId200Response
 */
@JsonPropertyOrder({
  GETListListId200Response.JSON_PROPERTY_CREATED_BY,
  GETListListId200Response.JSON_PROPERTY_DESCRIPTION,
  GETListListId200Response.JSON_PROPERTY_FAVORITE_COUNT,
  GETListListId200Response.JSON_PROPERTY_ID,
  GETListListId200Response.JSON_PROPERTY_ITEMS,
  GETListListId200Response.JSON_PROPERTY_ITEM_COUNT,
  GETListListId200Response.JSON_PROPERTY_ISO6391,
  GETListListId200Response.JSON_PROPERTY_NAME,
  GETListListId200Response.JSON_PROPERTY_POSTER_PATH
})
@JsonTypeName("GET_list_list_id_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETListListId200Response {
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FAVORITE_COUNT = "favorite_count";
  private Integer favoriteCount;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<MovieListObject> items = null;

  public static final String JSON_PROPERTY_ITEM_COUNT = "item_count";
  private Integer itemCount;

  public static final String JSON_PROPERTY_ISO6391 = "iso_639_1";
  private String iso6391;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POSTER_PATH = "poster_path";
  private Object posterPath;

  public GETListListId200Response() {
  }

  public GETListListId200Response createdBy(String createdBy) {
    
    this.createdBy = createdBy;
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

  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public GETListListId200Response description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public GETListListId200Response favoriteCount(Integer favoriteCount) {
    
    this.favoriteCount = favoriteCount;
    return this;
  }

   /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAVORITE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFavoriteCount() {
    return favoriteCount;
  }


  @JsonProperty(JSON_PROPERTY_FAVORITE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFavoriteCount(Integer favoriteCount) {
    this.favoriteCount = favoriteCount;
  }


  public GETListListId200Response id(String id) {
    
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public GETListListId200Response items(List<MovieListObject> items) {
    
    this.items = items;
    return this;
  }

  public GETListListId200Response addItemsItem(MovieListObject itemsItem) {
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

  public List<MovieListObject> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<MovieListObject> items) {
    this.items = items;
  }


  public GETListListId200Response itemCount(Integer itemCount) {
    
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getItemCount() {
    return itemCount;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  public GETListListId200Response iso6391(String iso6391) {
    
    this.iso6391 = iso6391;
    return this;
  }

   /**
   * Get iso6391
   * @return iso6391
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISO6391)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIso6391() {
    return iso6391;
  }


  @JsonProperty(JSON_PROPERTY_ISO6391)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIso6391(String iso6391) {
    this.iso6391 = iso6391;
  }


  public GETListListId200Response name(String name) {
    
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


  public GETListListId200Response posterPath(Object posterPath) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETListListId200Response geTListListId200Response = (GETListListId200Response) o;
    return Objects.equals(this.createdBy, geTListListId200Response.createdBy) &&
        Objects.equals(this.description, geTListListId200Response.description) &&
        Objects.equals(this.favoriteCount, geTListListId200Response.favoriteCount) &&
        Objects.equals(this.id, geTListListId200Response.id) &&
        Objects.equals(this.items, geTListListId200Response.items) &&
        Objects.equals(this.itemCount, geTListListId200Response.itemCount) &&
        Objects.equals(this.iso6391, geTListListId200Response.iso6391) &&
        Objects.equals(this.name, geTListListId200Response.name) &&
        Objects.equals(this.posterPath, geTListListId200Response.posterPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, description, favoriteCount, id, items, itemCount, iso6391, name, posterPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETListListId200Response {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    posterPath: ").append(toIndentedString(posterPath)).append("\n");
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

