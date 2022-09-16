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
 * POSTMovieMovieIdRatingRequest
 */
@JsonPropertyOrder({
  POSTMovieMovieIdRatingRequest.JSON_PROPERTY_VALUE
})
@JsonTypeName("POST_movie_movie_id_rating_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class POSTMovieMovieIdRatingRequest {
  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public POSTMovieMovieIdRatingRequest() {
  }

  public POSTMovieMovieIdRatingRequest value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * This is the value of the rating you want to submit. The value is expected to be between 0.5 and 10.0.
   * minimum: 0.5
   * maximum: 1E+1
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This is the value of the rating you want to submit. The value is expected to be between 0.5 and 10.0.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POSTMovieMovieIdRatingRequest poSTMovieMovieIdRatingRequest = (POSTMovieMovieIdRatingRequest) o;
    return Objects.equals(this.value, poSTMovieMovieIdRatingRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POSTMovieMovieIdRatingRequest {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

