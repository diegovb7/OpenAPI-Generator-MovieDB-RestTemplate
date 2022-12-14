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
import org.openapitools.client.model.GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvEpisodeGroupId200ResponseGroupsInner
 */
@JsonPropertyOrder({
  GETTvEpisodeGroupId200ResponseGroupsInner.JSON_PROPERTY_ID,
  GETTvEpisodeGroupId200ResponseGroupsInner.JSON_PROPERTY_NAME,
  GETTvEpisodeGroupId200ResponseGroupsInner.JSON_PROPERTY_ORDER,
  GETTvEpisodeGroupId200ResponseGroupsInner.JSON_PROPERTY_EPISODES,
  GETTvEpisodeGroupId200ResponseGroupsInner.JSON_PROPERTY_LOCKED
})
@JsonTypeName("GET_tv_episode_group_id_200_response_groups_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvEpisodeGroupId200ResponseGroupsInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public static final String JSON_PROPERTY_EPISODES = "episodes";
  private List<GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner> episodes = null;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private Boolean locked;

  public GETTvEpisodeGroupId200ResponseGroupsInner() {
  }

  public GETTvEpisodeGroupId200ResponseGroupsInner id(String id) {
    
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


  public GETTvEpisodeGroupId200ResponseGroupsInner name(String name) {
    
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


  public GETTvEpisodeGroupId200ResponseGroupsInner order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  public GETTvEpisodeGroupId200ResponseGroupsInner episodes(List<GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner> episodes) {
    
    this.episodes = episodes;
    return this;
  }

  public GETTvEpisodeGroupId200ResponseGroupsInner addEpisodesItem(GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner episodesItem) {
    if (this.episodes == null) {
      this.episodes = new ArrayList<>();
    }
    this.episodes.add(episodesItem);
    return this;
  }

   /**
   * Get episodes
   * @return episodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EPISODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner> getEpisodes() {
    return episodes;
  }


  @JsonProperty(JSON_PROPERTY_EPISODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpisodes(List<GETTvEpisodeGroupId200ResponseGroupsInnerEpisodesInner> episodes) {
    this.episodes = episodes;
  }


  public GETTvEpisodeGroupId200ResponseGroupsInner locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLocked() {
    return locked;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvEpisodeGroupId200ResponseGroupsInner geTTvEpisodeGroupId200ResponseGroupsInner = (GETTvEpisodeGroupId200ResponseGroupsInner) o;
    return Objects.equals(this.id, geTTvEpisodeGroupId200ResponseGroupsInner.id) &&
        Objects.equals(this.name, geTTvEpisodeGroupId200ResponseGroupsInner.name) &&
        Objects.equals(this.order, geTTvEpisodeGroupId200ResponseGroupsInner.order) &&
        Objects.equals(this.episodes, geTTvEpisodeGroupId200ResponseGroupsInner.episodes) &&
        Objects.equals(this.locked, geTTvEpisodeGroupId200ResponseGroupsInner.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, episodes, locked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvEpisodeGroupId200ResponseGroupsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    episodes: ").append(toIndentedString(episodes)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

