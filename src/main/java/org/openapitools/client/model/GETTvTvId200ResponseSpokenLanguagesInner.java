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
 * GETTvTvId200ResponseSpokenLanguagesInner
 */
@JsonPropertyOrder({
  GETTvTvId200ResponseSpokenLanguagesInner.JSON_PROPERTY_ENGLISH_NAME,
  GETTvTvId200ResponseSpokenLanguagesInner.JSON_PROPERTY_ISO6391,
  GETTvTvId200ResponseSpokenLanguagesInner.JSON_PROPERTY_NAME
})
@JsonTypeName("GET_tv_tv_id_200_response_spoken_languages_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETTvTvId200ResponseSpokenLanguagesInner {
  public static final String JSON_PROPERTY_ENGLISH_NAME = "english_name";
  private String englishName;

  public static final String JSON_PROPERTY_ISO6391 = "iso_639_1";
  private String iso6391;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public GETTvTvId200ResponseSpokenLanguagesInner() {
  }

  public GETTvTvId200ResponseSpokenLanguagesInner englishName(String englishName) {
    
    this.englishName = englishName;
    return this;
  }

   /**
   * Get englishName
   * @return englishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENGLISH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnglishName() {
    return englishName;
  }


  @JsonProperty(JSON_PROPERTY_ENGLISH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }


  public GETTvTvId200ResponseSpokenLanguagesInner iso6391(String iso6391) {
    
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


  public GETTvTvId200ResponseSpokenLanguagesInner name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETTvTvId200ResponseSpokenLanguagesInner geTTvTvId200ResponseSpokenLanguagesInner = (GETTvTvId200ResponseSpokenLanguagesInner) o;
    return Objects.equals(this.englishName, geTTvTvId200ResponseSpokenLanguagesInner.englishName) &&
        Objects.equals(this.iso6391, geTTvTvId200ResponseSpokenLanguagesInner.iso6391) &&
        Objects.equals(this.name, geTTvTvId200ResponseSpokenLanguagesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(englishName, iso6391, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETTvTvId200ResponseSpokenLanguagesInner {\n");
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

