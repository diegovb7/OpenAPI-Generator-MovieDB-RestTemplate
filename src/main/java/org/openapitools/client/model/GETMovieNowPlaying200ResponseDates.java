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
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETMovieNowPlaying200ResponseDates
 */
@JsonPropertyOrder({
  GETMovieNowPlaying200ResponseDates.JSON_PROPERTY_MAXIMUM,
  GETMovieNowPlaying200ResponseDates.JSON_PROPERTY_MINIMUM
})
@JsonTypeName("GET_movie_now_playing_200_response_dates")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETMovieNowPlaying200ResponseDates {
  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private LocalDate maximum;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private LocalDate minimum;

  public GETMovieNowPlaying200ResponseDates() {
  }

  public GETMovieNowPlaying200ResponseDates maximum(LocalDate maximum) {
    
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(LocalDate maximum) {
    this.maximum = maximum;
  }


  public GETMovieNowPlaying200ResponseDates minimum(LocalDate minimum) {
    
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(LocalDate minimum) {
    this.minimum = minimum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETMovieNowPlaying200ResponseDates geTMovieNowPlaying200ResponseDates = (GETMovieNowPlaying200ResponseDates) o;
    return Objects.equals(this.maximum, geTMovieNowPlaying200ResponseDates.maximum) &&
        Objects.equals(this.minimum, geTMovieNowPlaying200ResponseDates.minimum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximum, minimum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETMovieNowPlaying200ResponseDates {\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
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
