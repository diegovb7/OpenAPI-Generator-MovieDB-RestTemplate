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
import org.openapitools.client.model.GETAccount200ResponseAvatar;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GETAccount200Response
 */
@JsonPropertyOrder({
  GETAccount200Response.JSON_PROPERTY_AVATAR,
  GETAccount200Response.JSON_PROPERTY_ID,
  GETAccount200Response.JSON_PROPERTY_ISO6391,
  GETAccount200Response.JSON_PROPERTY_ISO31661,
  GETAccount200Response.JSON_PROPERTY_NAME,
  GETAccount200Response.JSON_PROPERTY_INCLUDE_ADULT,
  GETAccount200Response.JSON_PROPERTY_USERNAME
})
@JsonTypeName("GET_account_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T11:26:21.377642+02:00[Europe/Paris]")
public class GETAccount200Response {
  public static final String JSON_PROPERTY_AVATAR = "avatar";
  private GETAccount200ResponseAvatar avatar;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ISO6391 = "iso_639_1";
  private String iso6391;

  public static final String JSON_PROPERTY_ISO31661 = "iso_3166_1";
  private String iso31661;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INCLUDE_ADULT = "include_adult";
  private Boolean includeAdult;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public GETAccount200Response() {
  }

  public GETAccount200Response avatar(GETAccount200ResponseAvatar avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GETAccount200ResponseAvatar getAvatar() {
    return avatar;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvatar(GETAccount200ResponseAvatar avatar) {
    this.avatar = avatar;
  }


  public GETAccount200Response id(Integer id) {
    
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

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public GETAccount200Response iso6391(String iso6391) {
    
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


  public GETAccount200Response iso31661(String iso31661) {
    
    this.iso31661 = iso31661;
    return this;
  }

   /**
   * Get iso31661
   * @return iso31661
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISO31661)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIso31661() {
    return iso31661;
  }


  @JsonProperty(JSON_PROPERTY_ISO31661)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIso31661(String iso31661) {
    this.iso31661 = iso31661;
  }


  public GETAccount200Response name(String name) {
    
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


  public GETAccount200Response includeAdult(Boolean includeAdult) {
    
    this.includeAdult = includeAdult;
    return this;
  }

   /**
   * Get includeAdult
   * @return includeAdult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_ADULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeAdult() {
    return includeAdult;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_ADULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeAdult(Boolean includeAdult) {
    this.includeAdult = includeAdult;
  }


  public GETAccount200Response username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GETAccount200Response geTAccount200Response = (GETAccount200Response) o;
    return Objects.equals(this.avatar, geTAccount200Response.avatar) &&
        Objects.equals(this.id, geTAccount200Response.id) &&
        Objects.equals(this.iso6391, geTAccount200Response.iso6391) &&
        Objects.equals(this.iso31661, geTAccount200Response.iso31661) &&
        Objects.equals(this.name, geTAccount200Response.name) &&
        Objects.equals(this.includeAdult, geTAccount200Response.includeAdult) &&
        Objects.equals(this.username, geTAccount200Response.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, id, iso6391, iso31661, name, includeAdult, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GETAccount200Response {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iso6391: ").append(toIndentedString(iso6391)).append("\n");
    sb.append("    iso31661: ").append(toIndentedString(iso31661)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    includeAdult: ").append(toIndentedString(includeAdult)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

