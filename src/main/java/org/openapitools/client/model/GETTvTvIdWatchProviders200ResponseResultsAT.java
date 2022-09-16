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
import org.openapitools.client.model.GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETTvTvIdWatchProviders200ResponseResultsAT
 */
@JsonPropertyOrder({
  GETTvTvIdWatchProviders200ResponseResultsAT.JSON_PROPERTY_LINK,
  GETTvTvIdWatchProviders200ResponseResultsAT.JSON_PROPERTY_BUY,
  GETTvTvIdWatchProviders200ResponseResultsAT.JSON_PROPERTY_FLATRATE
})
@JsonTypeName("GET_tv_tv_id_watch_providers_200_response_results_AT")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvIdWatchProviders200ResponseResultsAT {
  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_BUY = "buy";
  private List<GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner> buy = null;

  public static final String JSON_PROPERTY_FLATRATE = "flatrate";
  private List<GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner> flatrate = null;

  public GETTvTvIdWatchProviders200ResponseResultsAT() {
  }

  public GETTvTvIdWatchProviders200ResponseResultsAT link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(String link) {
    this.link = link;
  }


  public GETTvTvIdWatchProviders200ResponseResultsAT buy(List<GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner> buy) {
    
    this.buy = buy;
    return this;
  }

  public GETTvTvIdWatchProviders200ResponseResultsAT addBuyItem(GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner buyItem) {
    if (this.buy == null) {
      this.buy = new ArrayList<>();
    }
    this.buy.add(buyItem);
    return this;
  }

   /**
   * Get buy
   * @return buy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner> getBuy() {
    return buy;
  }


  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuy(List<GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner> buy) {
    this.buy = buy;
  }


  public GETTvTvIdWatchProviders200ResponseResultsAT flatrate(List<GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner> flatrate) {
    
    this.flatrate = flatrate;
    return this;
  }

  public GETTvTvIdWatchProviders200ResponseResultsAT addFlatrateItem(GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner flatrateItem) {
    if (this.flatrate == null) {
      this.flatrate = new ArrayList<>();
    }
    this.flatrate.add(flatrateItem);
    return this;
  }

   /**
   * Get flatrate
   * @return flatrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FLATRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner> getFlatrate() {
    return flatrate;
  }


  @JsonProperty(JSON_PROPERTY_FLATRATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlatrate(List<GETTvTvIdWatchProviders200ResponseResultsARFlatrateInner> flatrate) {
    this.flatrate = flatrate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvIdWatchProviders200ResponseResultsAT geTTvTvIdWatchProviders200ResponseResultsAT = (GETTvTvIdWatchProviders200ResponseResultsAT) o;
    return Objects.equals(this.link, geTTvTvIdWatchProviders200ResponseResultsAT.link) &&
        Objects.equals(this.buy, geTTvTvIdWatchProviders200ResponseResultsAT.buy) &&
        Objects.equals(this.flatrate, geTTvTvIdWatchProviders200ResponseResultsAT.flatrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, buy, flatrate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvIdWatchProviders200ResponseResultsAT {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    flatrate: ").append(toIndentedString(flatrate)).append("\n");
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
