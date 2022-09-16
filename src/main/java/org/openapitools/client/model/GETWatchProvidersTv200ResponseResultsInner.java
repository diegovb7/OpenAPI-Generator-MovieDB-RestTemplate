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
 * GETWatchProvidersTv200ResponseResultsInner
 */
@JsonPropertyOrder({
  GETWatchProvidersTv200ResponseResultsInner.JSON_PROPERTY_DISPLAY_PRIORITY,
  GETWatchProvidersTv200ResponseResultsInner.JSON_PROPERTY_LOGO_PATH,
  GETWatchProvidersTv200ResponseResultsInner.JSON_PROPERTY_PROVIDER_NAME,
  GETWatchProvidersTv200ResponseResultsInner.JSON_PROPERTY_PROVIDER_ID
})
@JsonTypeName("GET_watch_providers_tv_200_response_results_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETWatchProvidersTv200ResponseResultsInner {
  public static final String JSON_PROPERTY_DISPLAY_PRIORITY = "display_priority";
  private Integer displayPriority;

  public static final String JSON_PROPERTY_LOGO_PATH = "logo_path";
  private String logoPath;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "provider_name";
  private String providerName;

  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private Integer providerId;

  public GETWatchProvidersTv200ResponseResultsInner() {
  }

  public GETWatchProvidersTv200ResponseResultsInner displayPriority(Integer displayPriority) {
    
    this.displayPriority = displayPriority;
    return this;
  }

   /**
   * Get displayPriority
   * @return displayPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDisplayPriority() {
    return displayPriority;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayPriority(Integer displayPriority) {
    this.displayPriority = displayPriority;
  }


  public GETWatchProvidersTv200ResponseResultsInner logoPath(String logoPath) {
    
    this.logoPath = logoPath;
    return this;
  }

   /**
   * Get logoPath
   * @return logoPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoPath() {
    return logoPath;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoPath(String logoPath) {
    this.logoPath = logoPath;
  }


  public GETWatchProvidersTv200ResponseResultsInner providerName(String providerName) {
    
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderName() {
    return providerName;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public GETWatchProvidersTv200ResponseResultsInner providerId(Integer providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETWatchProvidersTv200ResponseResultsInner geTWatchProvidersTv200ResponseResultsInner = (GETWatchProvidersTv200ResponseResultsInner) o;
    return Objects.equals(this.displayPriority, geTWatchProvidersTv200ResponseResultsInner.displayPriority) &&
        Objects.equals(this.logoPath, geTWatchProvidersTv200ResponseResultsInner.logoPath) &&
        Objects.equals(this.providerName, geTWatchProvidersTv200ResponseResultsInner.providerName) &&
        Objects.equals(this.providerId, geTWatchProvidersTv200ResponseResultsInner.providerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayPriority, logoPath, providerName, providerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETWatchProvidersTv200ResponseResultsInner {\n");
    sb.append("    displayPriority: ").append(toIndentedString(displayPriority)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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

