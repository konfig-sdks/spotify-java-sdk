/*
 * Spotify Web API
 * You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.CopyrightObject;
import com.konfigthis.client.model.ExternalUrlObject;
import com.konfigthis.client.model.ImageObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * SimplifiedShowObject
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SimplifiedShowObject {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AVAILABLE_MARKETS = "available_markets";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_MARKETS)
  private List<String> availableMarkets = new ArrayList<>();

  public static final String SERIALIZED_NAME_COPYRIGHTS = "copyrights";
  @SerializedName(SERIALIZED_NAME_COPYRIGHTS)
  private List<CopyrightObject> copyrights = new ArrayList<>();

  public static final String SERIALIZED_NAME_HTML_DESCRIPTION = "html_description";
  @SerializedName(SERIALIZED_NAME_HTML_DESCRIPTION)
  private String htmlDescription;

  public static final String SERIALIZED_NAME_EXPLICIT = "explicit";
  @SerializedName(SERIALIZED_NAME_EXPLICIT)
  private Boolean explicit;

  public static final String SERIALIZED_NAME_EXTERNAL_URLS = "external_urls";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URLS)
  private ExternalUrlObject externalUrls;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ImageObject> images = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_EXTERNALLY_HOSTED = "is_externally_hosted";
  @SerializedName(SERIALIZED_NAME_IS_EXTERNALLY_HOSTED)
  private Boolean isExternallyHosted;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<String> languages = new ArrayList<>();

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private String publisher;

  /**
   * The object type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    SHOW("show");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_TOTAL_EPISODES = "total_episodes";
  @SerializedName(SERIALIZED_NAME_TOTAL_EPISODES)
  private Integer totalEpisodes;

  public SimplifiedShowObject() {
  }

  public SimplifiedShowObject description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description of the show. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed. 
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A description of the show. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SimplifiedShowObject availableMarkets(List<String> availableMarkets) {
    
    
    
    
    this.availableMarkets = availableMarkets;
    return this;
  }

  public SimplifiedShowObject addAvailableMarketsItem(String availableMarketsItem) {
    this.availableMarkets.add(availableMarketsItem);
    return this;
  }

   /**
   * A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. 
   * @return availableMarkets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. ")

  public List<String> getAvailableMarkets() {
    return availableMarkets;
  }


  public void setAvailableMarkets(List<String> availableMarkets) {
    
    
    
    this.availableMarkets = availableMarkets;
  }


  public SimplifiedShowObject copyrights(List<CopyrightObject> copyrights) {
    
    
    
    
    this.copyrights = copyrights;
    return this;
  }

  public SimplifiedShowObject addCopyrightsItem(CopyrightObject copyrightsItem) {
    this.copyrights.add(copyrightsItem);
    return this;
  }

   /**
   * The copyright statements of the show. 
   * @return copyrights
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The copyright statements of the show. ")

  public List<CopyrightObject> getCopyrights() {
    return copyrights;
  }


  public void setCopyrights(List<CopyrightObject> copyrights) {
    
    
    
    this.copyrights = copyrights;
  }


  public SimplifiedShowObject htmlDescription(String htmlDescription) {
    
    
    
    
    this.htmlDescription = htmlDescription;
    return this;
  }

   /**
   * A description of the show. This field may contain HTML tags. 
   * @return htmlDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A description of the show. This field may contain HTML tags. ")

  public String getHtmlDescription() {
    return htmlDescription;
  }


  public void setHtmlDescription(String htmlDescription) {
    
    
    
    this.htmlDescription = htmlDescription;
  }


  public SimplifiedShowObject explicit(Boolean explicit) {
    
    
    
    
    this.explicit = explicit;
    return this;
  }

   /**
   * Whether or not the show has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown). 
   * @return explicit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether or not the show has explicit content (true = yes it does; false = no it does not OR unknown). ")

  public Boolean getExplicit() {
    return explicit;
  }


  public void setExplicit(Boolean explicit) {
    
    
    
    this.explicit = explicit;
  }


  public SimplifiedShowObject externalUrls(ExternalUrlObject externalUrls) {
    
    
    
    
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * External URLs for this show. 
   * @return externalUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "External URLs for this show. ")

  public ExternalUrlObject getExternalUrls() {
    return externalUrls;
  }


  public void setExternalUrls(ExternalUrlObject externalUrls) {
    
    
    
    this.externalUrls = externalUrls;
  }


  public SimplifiedShowObject href(String href) {
    
    
    
    
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the show. 
   * @return href
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A link to the Web API endpoint providing full details of the show. ")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    
    
    
    this.href = href;
  }


  public SimplifiedShowObject id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show. 
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show. ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SimplifiedShowObject images(List<ImageObject> images) {
    
    
    
    
    this.images = images;
    return this;
  }

  public SimplifiedShowObject addImagesItem(ImageObject imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The cover art for the show in various sizes, widest first. 
   * @return images
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The cover art for the show in various sizes, widest first. ")

  public List<ImageObject> getImages() {
    return images;
  }


  public void setImages(List<ImageObject> images) {
    
    
    
    this.images = images;
  }


  public SimplifiedShowObject isExternallyHosted(Boolean isExternallyHosted) {
    
    
    
    
    this.isExternallyHosted = isExternallyHosted;
    return this;
  }

   /**
   * True if all of the shows episodes are hosted outside of Spotify&#39;s CDN. This field might be &#x60;null&#x60; in some cases. 
   * @return isExternallyHosted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True if all of the shows episodes are hosted outside of Spotify's CDN. This field might be `null` in some cases. ")

  public Boolean getIsExternallyHosted() {
    return isExternallyHosted;
  }


  public void setIsExternallyHosted(Boolean isExternallyHosted) {
    
    
    
    this.isExternallyHosted = isExternallyHosted;
  }


  public SimplifiedShowObject languages(List<String> languages) {
    
    
    
    
    this.languages = languages;
    return this;
  }

  public SimplifiedShowObject addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * A list of the languages used in the show, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. 
   * @return languages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of the languages used in the show, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. ")

  public List<String> getLanguages() {
    return languages;
  }


  public void setLanguages(List<String> languages) {
    
    
    
    this.languages = languages;
  }


  public SimplifiedShowObject mediaType(String mediaType) {
    
    
    
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The media type of the show. 
   * @return mediaType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The media type of the show. ")

  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    
    
    
    this.mediaType = mediaType;
  }


  public SimplifiedShowObject name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the episode. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the episode. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public SimplifiedShowObject publisher(String publisher) {
    
    
    
    
    this.publisher = publisher;
    return this;
  }

   /**
   * The publisher of the show. 
   * @return publisher
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The publisher of the show. ")

  public String getPublisher() {
    return publisher;
  }


  public void setPublisher(String publisher) {
    
    
    
    this.publisher = publisher;
  }


  public SimplifiedShowObject type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The object type. 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The object type. ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public SimplifiedShowObject uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the show. 
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the show. ")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public SimplifiedShowObject totalEpisodes(Integer totalEpisodes) {
    
    
    
    
    this.totalEpisodes = totalEpisodes;
    return this;
  }

   /**
   * The total number of episodes in the show. 
   * @return totalEpisodes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total number of episodes in the show. ")

  public Integer getTotalEpisodes() {
    return totalEpisodes;
  }


  public void setTotalEpisodes(Integer totalEpisodes) {
    
    
    
    this.totalEpisodes = totalEpisodes;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SimplifiedShowObject instance itself
   */
  public SimplifiedShowObject putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplifiedShowObject simplifiedShowObject = (SimplifiedShowObject) o;
    return Objects.equals(this.description, simplifiedShowObject.description) &&
        Objects.equals(this.availableMarkets, simplifiedShowObject.availableMarkets) &&
        Objects.equals(this.copyrights, simplifiedShowObject.copyrights) &&
        Objects.equals(this.htmlDescription, simplifiedShowObject.htmlDescription) &&
        Objects.equals(this.explicit, simplifiedShowObject.explicit) &&
        Objects.equals(this.externalUrls, simplifiedShowObject.externalUrls) &&
        Objects.equals(this.href, simplifiedShowObject.href) &&
        Objects.equals(this.id, simplifiedShowObject.id) &&
        Objects.equals(this.images, simplifiedShowObject.images) &&
        Objects.equals(this.isExternallyHosted, simplifiedShowObject.isExternallyHosted) &&
        Objects.equals(this.languages, simplifiedShowObject.languages) &&
        Objects.equals(this.mediaType, simplifiedShowObject.mediaType) &&
        Objects.equals(this.name, simplifiedShowObject.name) &&
        Objects.equals(this.publisher, simplifiedShowObject.publisher) &&
        Objects.equals(this.type, simplifiedShowObject.type) &&
        Objects.equals(this.uri, simplifiedShowObject.uri) &&
        Objects.equals(this.totalEpisodes, simplifiedShowObject.totalEpisodes)&&
        Objects.equals(this.additionalProperties, simplifiedShowObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, availableMarkets, copyrights, htmlDescription, explicit, externalUrls, href, id, images, isExternallyHosted, languages, mediaType, name, publisher, type, uri, totalEpisodes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedShowObject {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    availableMarkets: ").append(toIndentedString(availableMarkets)).append("\n");
    sb.append("    copyrights: ").append(toIndentedString(copyrights)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    isExternallyHosted: ").append(toIndentedString(isExternallyHosted)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    totalEpisodes: ").append(toIndentedString(totalEpisodes)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("available_markets");
    openapiFields.add("copyrights");
    openapiFields.add("html_description");
    openapiFields.add("explicit");
    openapiFields.add("external_urls");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("images");
    openapiFields.add("is_externally_hosted");
    openapiFields.add("languages");
    openapiFields.add("media_type");
    openapiFields.add("name");
    openapiFields.add("publisher");
    openapiFields.add("type");
    openapiFields.add("uri");
    openapiFields.add("total_episodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("available_markets");
    openapiRequiredFields.add("copyrights");
    openapiRequiredFields.add("html_description");
    openapiRequiredFields.add("explicit");
    openapiRequiredFields.add("external_urls");
    openapiRequiredFields.add("href");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("images");
    openapiRequiredFields.add("is_externally_hosted");
    openapiRequiredFields.add("languages");
    openapiRequiredFields.add("media_type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("publisher");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("uri");
    openapiRequiredFields.add("total_episodes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimplifiedShowObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimplifiedShowObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedShowObject is not found in the empty JSON string", SimplifiedShowObject.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimplifiedShowObject.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("available_markets") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("available_markets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_markets` to be an array in the JSON string but got `%s`", jsonObj.get("available_markets").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("copyrights").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `copyrights` to be an array in the JSON string but got `%s`", jsonObj.get("copyrights").toString()));
      }

      JsonArray jsonArraycopyrights = jsonObj.getAsJsonArray("copyrights");
      // validate the required field `copyrights` (array)
      for (int i = 0; i < jsonArraycopyrights.size(); i++) {
        CopyrightObject.validateJsonObject(jsonArraycopyrights.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("html_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_description").toString()));
      }
      // validate the required field `external_urls`
      ExternalUrlObject.validateJsonObject(jsonObj.getAsJsonObject("external_urls"));
      if (!jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
      }

      JsonArray jsonArrayimages = jsonObj.getAsJsonArray("images");
      // validate the required field `images` (array)
      for (int i = 0; i < jsonArrayimages.size(); i++) {
        ImageObject.validateJsonObject(jsonArrayimages.get(i).getAsJsonObject());
      };
      // ensure the required json array is present
      if (jsonObj.get("languages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("languages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `languages` to be an array in the JSON string but got `%s`", jsonObj.get("languages").toString()));
      }
      if (!jsonObj.get("media_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media_type").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("publisher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publisher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publisher").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedShowObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedShowObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedShowObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedShowObject.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedShowObject>() {
           @Override
           public void write(JsonWriter out, SimplifiedShowObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SimplifiedShowObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SimplifiedShowObject instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimplifiedShowObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimplifiedShowObject
  * @throws IOException if the JSON string is invalid with respect to SimplifiedShowObject
  */
  public static SimplifiedShowObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedShowObject.class);
  }

 /**
  * Convert an instance of SimplifiedShowObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

