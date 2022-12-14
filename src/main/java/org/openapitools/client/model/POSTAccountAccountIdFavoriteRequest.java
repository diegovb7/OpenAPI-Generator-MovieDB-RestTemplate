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
 * POSTAccountAccountIdFavoriteRequest
 */
@JsonPropertyOrder({
  POSTAccountAccountIdFavoriteRequest.JSON_PROPERTY_MEDIA_TYPE,
  POSTAccountAccountIdFavoriteRequest.JSON_PROPERTY_MEDIA_ID,
  POSTAccountAccountIdFavoriteRequest.JSON_PROPERTY_FAVORITE
})
@JsonTypeName("POST_account_account_id_favorite_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class POSTAccountAccountIdFavoriteRequest {
  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    MOVIE("movie"),
    
    TV("tv");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String value) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MEDIA_TYPE = "media_type";
  private MediaTypeEnum mediaType;

  public static final String JSON_PROPERTY_MEDIA_ID = "media_id";
  private Integer mediaId;

  public static final String JSON_PROPERTY_FAVORITE = "favorite";
  private Boolean favorite;

  public POSTAccountAccountIdFavoriteRequest() {
  }

  public POSTAccountAccountIdFavoriteRequest mediaType(MediaTypeEnum mediaType) {
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MediaTypeEnum getMediaType() {
    return mediaType;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  public POSTAccountAccountIdFavoriteRequest mediaId(Integer mediaId) {
    
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Get mediaId
   * @return mediaId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMediaId() {
    return mediaId;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMediaId(Integer mediaId) {
    this.mediaId = mediaId;
  }


  public POSTAccountAccountIdFavoriteRequest favorite(Boolean favorite) {
    
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFavorite() {
    return favorite;
  }


  @JsonProperty(JSON_PROPERTY_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POSTAccountAccountIdFavoriteRequest poSTAccountAccountIdFavoriteRequest = (POSTAccountAccountIdFavoriteRequest) o;
    return Objects.equals(this.mediaType, poSTAccountAccountIdFavoriteRequest.mediaType) &&
        Objects.equals(this.mediaId, poSTAccountAccountIdFavoriteRequest.mediaId) &&
        Objects.equals(this.favorite, poSTAccountAccountIdFavoriteRequest.favorite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, mediaId, favorite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POSTAccountAccountIdFavoriteRequest {\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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

