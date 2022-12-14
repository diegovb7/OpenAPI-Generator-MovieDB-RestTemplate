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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETMovieMovieIdImages200ResponseBackdropsInner
 */
@JsonPropertyOrder({
  GETMovieMovieIdImages200ResponseBackdropsInner.JSON_PROPERTY_ASPECT_RATIO,
  GETMovieMovieIdImages200ResponseBackdropsInner.JSON_PROPERTY_FILE_PATH,
  GETMovieMovieIdImages200ResponseBackdropsInner.JSON_PROPERTY_HEIGHT,
  GETMovieMovieIdImages200ResponseBackdropsInner.JSON_PROPERTY_VOTE_AVERAGE,
  GETMovieMovieIdImages200ResponseBackdropsInner.JSON_PROPERTY_VOTE_COUNT,
  GETMovieMovieIdImages200ResponseBackdropsInner.JSON_PROPERTY_WIDTH
})
@JsonTypeName("GET_movie_movie_id_images_200_response_backdrops_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETMovieMovieIdImages200ResponseBackdropsInner {
  public static final String JSON_PROPERTY_ASPECT_RATIO = "aspect_ratio";
  private BigDecimal aspectRatio;

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  private String filePath;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_VOTE_AVERAGE = "vote_average";
  private Integer voteAverage;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private Integer voteCount;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public GETMovieMovieIdImages200ResponseBackdropsInner() {
  }

  public GETMovieMovieIdImages200ResponseBackdropsInner aspectRatio(BigDecimal aspectRatio) {
    
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * Get aspectRatio
   * @return aspectRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAspectRatio() {
    return aspectRatio;
  }


  @JsonProperty(JSON_PROPERTY_ASPECT_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAspectRatio(BigDecimal aspectRatio) {
    this.aspectRatio = aspectRatio;
  }


  public GETMovieMovieIdImages200ResponseBackdropsInner filePath(String filePath) {
    
    this.filePath = filePath;
    return this;
  }

   /**
   * Get filePath
   * @return filePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilePath() {
    return filePath;
  }


  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  public GETMovieMovieIdImages200ResponseBackdropsInner height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public GETMovieMovieIdImages200ResponseBackdropsInner voteAverage(Integer voteAverage) {
    
    this.voteAverage = voteAverage;
    return this;
  }

   /**
   * Get voteAverage
   * @return voteAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTE_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVoteAverage() {
    return voteAverage;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteAverage(Integer voteAverage) {
    this.voteAverage = voteAverage;
  }


  public GETMovieMovieIdImages200ResponseBackdropsInner voteCount(Integer voteCount) {
    
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVoteCount() {
    return voteCount;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteCount(Integer voteCount) {
    this.voteCount = voteCount;
  }


  public GETMovieMovieIdImages200ResponseBackdropsInner width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETMovieMovieIdImages200ResponseBackdropsInner geTMovieMovieIdImages200ResponseBackdropsInner = (GETMovieMovieIdImages200ResponseBackdropsInner) o;
    return Objects.equals(this.aspectRatio, geTMovieMovieIdImages200ResponseBackdropsInner.aspectRatio) &&
        Objects.equals(this.filePath, geTMovieMovieIdImages200ResponseBackdropsInner.filePath) &&
        Objects.equals(this.height, geTMovieMovieIdImages200ResponseBackdropsInner.height) &&
        Objects.equals(this.voteAverage, geTMovieMovieIdImages200ResponseBackdropsInner.voteAverage) &&
        Objects.equals(this.voteCount, geTMovieMovieIdImages200ResponseBackdropsInner.voteCount) &&
        Objects.equals(this.width, geTMovieMovieIdImages200ResponseBackdropsInner.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspectRatio, filePath, height, voteAverage, voteCount, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETMovieMovieIdImages200ResponseBackdropsInner {\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    voteAverage: ").append(toIndentedString(voteAverage)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

