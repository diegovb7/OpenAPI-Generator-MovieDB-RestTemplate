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
import org.openapitools.client.model.GETCertificationTvList200ResponseCertifications;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETCertificationTvList200Response
 */
@JsonPropertyOrder({
  GETCertificationTvList200Response.JSON_PROPERTY_CERTIFICATIONS
})
@JsonTypeName("GET_certification_tv_list_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETCertificationTvList200Response {
  public static final String JSON_PROPERTY_CERTIFICATIONS = "certifications";
  private GETCertificationTvList200ResponseCertifications certifications;

  public GETCertificationTvList200Response() {
  }

  public GETCertificationTvList200Response certifications(GETCertificationTvList200ResponseCertifications certifications) {
    
    this.certifications = certifications;
    return this;
  }

   /**
   * Get certifications
   * @return certifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CERTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GETCertificationTvList200ResponseCertifications getCertifications() {
    return certifications;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertifications(GETCertificationTvList200ResponseCertifications certifications) {
    this.certifications = certifications;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETCertificationTvList200Response geTCertificationTvList200Response = (GETCertificationTvList200Response) o;
    return Objects.equals(this.certifications, geTCertificationTvList200Response.certifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETCertificationTvList200Response {\n");
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
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

