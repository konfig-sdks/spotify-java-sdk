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
import com.konfigthis.client.model.EpisodeRestrictionObject;
import com.konfigthis.client.model.ExternalUrlObject;
import com.konfigthis.client.model.ImageObject;
import com.konfigthis.client.model.ResumePointObject;
import com.konfigthis.client.model.SimplifiedShowObject;
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
 * EpisodeObject
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EpisodeObject {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AUDIO_PREVIEW_URL = "audio_preview_url";
  @SerializedName(SERIALIZED_NAME_AUDIO_PREVIEW_URL)
  private String audioPreviewUrl;

  public static final String SERIALIZED_NAME_HTML_DESCRIPTION = "html_description";
  @SerializedName(SERIALIZED_NAME_HTML_DESCRIPTION)
  private String htmlDescription;

  public static final String SERIALIZED_NAME_DURATION_MS = "duration_ms";
  @SerializedName(SERIALIZED_NAME_DURATION_MS)
  private Integer durationMs;

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

  public static final String SERIALIZED_NAME_IS_PLAYABLE = "is_playable";
  @SerializedName(SERIALIZED_NAME_IS_PLAYABLE)
  private Boolean isPlayable;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<String> languages = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "release_date";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private String releaseDate;

  /**
   * The precision with which &#x60;release_date&#x60; value is known. 
   */
  @JsonAdapter(ReleaseDatePrecisionEnum.Adapter.class)
 public enum ReleaseDatePrecisionEnum {
    YEAR("year"),
    
    MONTH("month"),
    
    DAY("day");

    private String value;

    ReleaseDatePrecisionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReleaseDatePrecisionEnum fromValue(String value) {
      for (ReleaseDatePrecisionEnum b : ReleaseDatePrecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReleaseDatePrecisionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReleaseDatePrecisionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReleaseDatePrecisionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReleaseDatePrecisionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELEASE_DATE_PRECISION = "release_date_precision";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE_PRECISION)
  private ReleaseDatePrecisionEnum releaseDatePrecision;

  public static final String SERIALIZED_NAME_RESUME_POINT = "resume_point";
  @SerializedName(SERIALIZED_NAME_RESUME_POINT)
  private ResumePointObject resumePoint;

  /**
   * The object type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    EPISODE("episode");

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

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  private EpisodeRestrictionObject restrictions;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private SimplifiedShowObject show;

  public EpisodeObject() {
  }

  public EpisodeObject description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description of the episode. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed. 
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us. ", required = true, value = "A description of the episode. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public EpisodeObject audioPreviewUrl(String audioPreviewUrl) {
    
    
    
    
    this.audioPreviewUrl = audioPreviewUrl;
    return this;
  }

   /**
   * A URL to a 30 second preview (MP3 format) of the episode. &#x60;null&#x60; if not available. 
   * @return audioPreviewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17", required = true, value = "A URL to a 30 second preview (MP3 format) of the episode. `null` if not available. ")

  public String getAudioPreviewUrl() {
    return audioPreviewUrl;
  }


  public void setAudioPreviewUrl(String audioPreviewUrl) {
    
    
    
    this.audioPreviewUrl = audioPreviewUrl;
  }


  public EpisodeObject htmlDescription(String htmlDescription) {
    
    
    
    
    this.htmlDescription = htmlDescription;
    return this;
  }

   /**
   * A description of the episode. This field may contain HTML tags. 
   * @return htmlDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "<p>A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.</p> ", required = true, value = "A description of the episode. This field may contain HTML tags. ")

  public String getHtmlDescription() {
    return htmlDescription;
  }


  public void setHtmlDescription(String htmlDescription) {
    
    
    
    this.htmlDescription = htmlDescription;
  }


  public EpisodeObject durationMs(Integer durationMs) {
    
    
    
    
    this.durationMs = durationMs;
    return this;
  }

   /**
   * The episode length in milliseconds. 
   * @return durationMs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1686230", required = true, value = "The episode length in milliseconds. ")

  public Integer getDurationMs() {
    return durationMs;
  }


  public void setDurationMs(Integer durationMs) {
    
    
    
    this.durationMs = durationMs;
  }


  public EpisodeObject explicit(Boolean explicit) {
    
    
    
    
    this.explicit = explicit;
    return this;
  }

   /**
   * Whether or not the episode has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown). 
   * @return explicit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether or not the episode has explicit content (true = yes it does; false = no it does not OR unknown). ")

  public Boolean getExplicit() {
    return explicit;
  }


  public void setExplicit(Boolean explicit) {
    
    
    
    this.explicit = explicit;
  }


  public EpisodeObject externalUrls(ExternalUrlObject externalUrls) {
    
    
    
    
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * External URLs for this episode. 
   * @return externalUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "External URLs for this episode. ")

  public ExternalUrlObject getExternalUrls() {
    return externalUrls;
  }


  public void setExternalUrls(ExternalUrlObject externalUrls) {
    
    
    
    this.externalUrls = externalUrls;
  }


  public EpisodeObject href(String href) {
    
    
    
    
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the episode. 
   * @return href
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ", required = true, value = "A link to the Web API endpoint providing full details of the episode. ")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    
    
    
    this.href = href;
  }


  public EpisodeObject id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the episode. 
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5Xt5DXGzch68nYYamXrNxZ", required = true, value = "The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the episode. ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public EpisodeObject images(List<ImageObject> images) {
    
    
    
    
    this.images = images;
    return this;
  }

  public EpisodeObject addImagesItem(ImageObject imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The cover art for the episode in various sizes, widest first. 
   * @return images
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The cover art for the episode in various sizes, widest first. ")

  public List<ImageObject> getImages() {
    return images;
  }


  public void setImages(List<ImageObject> images) {
    
    
    
    this.images = images;
  }


  public EpisodeObject isExternallyHosted(Boolean isExternallyHosted) {
    
    
    
    
    this.isExternallyHosted = isExternallyHosted;
    return this;
  }

   /**
   * True if the episode is hosted outside of Spotify&#39;s CDN. 
   * @return isExternallyHosted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True if the episode is hosted outside of Spotify's CDN. ")

  public Boolean getIsExternallyHosted() {
    return isExternallyHosted;
  }


  public void setIsExternallyHosted(Boolean isExternallyHosted) {
    
    
    
    this.isExternallyHosted = isExternallyHosted;
  }


  public EpisodeObject isPlayable(Boolean isPlayable) {
    
    
    
    
    this.isPlayable = isPlayable;
    return this;
  }

   /**
   * True if the episode is playable in the given market. Otherwise false. 
   * @return isPlayable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True if the episode is playable in the given market. Otherwise false. ")

  public Boolean getIsPlayable() {
    return isPlayable;
  }


  public void setIsPlayable(Boolean isPlayable) {
    
    
    
    this.isPlayable = isPlayable;
  }


  public EpisodeObject language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * The language used in the episode, identified by a [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. This field is deprecated and might be removed in the future. Please use the &#x60;languages&#x60; field instead. 
   * @return language
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "The language used in the episode, identified by a [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. This field is deprecated and might be removed in the future. Please use the `languages` field instead. ")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public EpisodeObject languages(List<String> languages) {
    
    
    
    
    this.languages = languages;
    return this;
  }

  public EpisodeObject addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * A list of the languages used in the episode, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code. 
   * @return languages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"fr\",\"en\"]", required = true, value = "A list of the languages used in the episode, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code. ")

  public List<String> getLanguages() {
    return languages;
  }


  public void setLanguages(List<String> languages) {
    
    
    
    this.languages = languages;
  }


  public EpisodeObject name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the episode. 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators ", required = true, value = "The name of the episode. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public EpisodeObject releaseDate(String releaseDate) {
    
    
    
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * The date the episode was first released, for example &#x60;\&quot;1981-12-15\&quot;&#x60;. Depending on the precision, it might be shown as &#x60;\&quot;1981\&quot;&#x60; or &#x60;\&quot;1981-12\&quot;&#x60;. 
   * @return releaseDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1981-12-15", required = true, value = "The date the episode was first released, for example `\"1981-12-15\"`. Depending on the precision, it might be shown as `\"1981\"` or `\"1981-12\"`. ")

  public String getReleaseDate() {
    return releaseDate;
  }


  public void setReleaseDate(String releaseDate) {
    
    
    
    this.releaseDate = releaseDate;
  }


  public EpisodeObject releaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
    
    
    
    
    this.releaseDatePrecision = releaseDatePrecision;
    return this;
  }

   /**
   * The precision with which &#x60;release_date&#x60; value is known. 
   * @return releaseDatePrecision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DAY", required = true, value = "The precision with which `release_date` value is known. ")

  public ReleaseDatePrecisionEnum getReleaseDatePrecision() {
    return releaseDatePrecision;
  }


  public void setReleaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
    
    
    
    this.releaseDatePrecision = releaseDatePrecision;
  }


  public EpisodeObject resumePoint(ResumePointObject resumePoint) {
    
    
    
    
    this.resumePoint = resumePoint;
    return this;
  }

   /**
   * The user&#39;s most recent position in the episode. Set if the supplied access token is a user token and has the scope &#39;user-read-playback-position&#39;. 
   * @return resumePoint
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The user's most recent position in the episode. Set if the supplied access token is a user token and has the scope 'user-read-playback-position'. ")

  public ResumePointObject getResumePoint() {
    return resumePoint;
  }


  public void setResumePoint(ResumePointObject resumePoint) {
    
    
    
    this.resumePoint = resumePoint;
  }


  public EpisodeObject type(TypeEnum type) {
    
    
    
    
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


  public EpisodeObject uri(String uri) {
    
    
    
    
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the episode. 
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "spotify:episode:0zLhl3WsOCQHbe1BPTiHgr", required = true, value = "The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the episode. ")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    
    
    
    this.uri = uri;
  }


  public EpisodeObject restrictions(EpisodeRestrictionObject restrictions) {
    
    
    
    
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Included in the response when a content restriction is applied. 
   * @return restrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Included in the response when a content restriction is applied. ")

  public EpisodeRestrictionObject getRestrictions() {
    return restrictions;
  }


  public void setRestrictions(EpisodeRestrictionObject restrictions) {
    
    
    
    this.restrictions = restrictions;
  }


  public EpisodeObject show(SimplifiedShowObject show) {
    
    
    
    
    this.show = show;
    return this;
  }

   /**
   * Get show
   * @return show
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SimplifiedShowObject getShow() {
    return show;
  }


  public void setShow(SimplifiedShowObject show) {
    
    
    
    this.show = show;
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
   * @return the EpisodeObject instance itself
   */
  public EpisodeObject putAdditionalProperty(String key, Object value) {
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
    EpisodeObject episodeObject = (EpisodeObject) o;
    return Objects.equals(this.description, episodeObject.description) &&
        Objects.equals(this.audioPreviewUrl, episodeObject.audioPreviewUrl) &&
        Objects.equals(this.htmlDescription, episodeObject.htmlDescription) &&
        Objects.equals(this.durationMs, episodeObject.durationMs) &&
        Objects.equals(this.explicit, episodeObject.explicit) &&
        Objects.equals(this.externalUrls, episodeObject.externalUrls) &&
        Objects.equals(this.href, episodeObject.href) &&
        Objects.equals(this.id, episodeObject.id) &&
        Objects.equals(this.images, episodeObject.images) &&
        Objects.equals(this.isExternallyHosted, episodeObject.isExternallyHosted) &&
        Objects.equals(this.isPlayable, episodeObject.isPlayable) &&
        Objects.equals(this.language, episodeObject.language) &&
        Objects.equals(this.languages, episodeObject.languages) &&
        Objects.equals(this.name, episodeObject.name) &&
        Objects.equals(this.releaseDate, episodeObject.releaseDate) &&
        Objects.equals(this.releaseDatePrecision, episodeObject.releaseDatePrecision) &&
        Objects.equals(this.resumePoint, episodeObject.resumePoint) &&
        Objects.equals(this.type, episodeObject.type) &&
        Objects.equals(this.uri, episodeObject.uri) &&
        Objects.equals(this.restrictions, episodeObject.restrictions) &&
        Objects.equals(this.show, episodeObject.show)&&
        Objects.equals(this.additionalProperties, episodeObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, audioPreviewUrl, htmlDescription, durationMs, explicit, externalUrls, href, id, images, isExternallyHosted, isPlayable, language, languages, name, releaseDate, releaseDatePrecision, resumePoint, type, uri, restrictions, show, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpisodeObject {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    audioPreviewUrl: ").append(toIndentedString(audioPreviewUrl)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    isExternallyHosted: ").append(toIndentedString(isExternallyHosted)).append("\n");
    sb.append("    isPlayable: ").append(toIndentedString(isPlayable)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    releaseDatePrecision: ").append(toIndentedString(releaseDatePrecision)).append("\n");
    sb.append("    resumePoint: ").append(toIndentedString(resumePoint)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
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
    openapiFields.add("audio_preview_url");
    openapiFields.add("html_description");
    openapiFields.add("duration_ms");
    openapiFields.add("explicit");
    openapiFields.add("external_urls");
    openapiFields.add("href");
    openapiFields.add("id");
    openapiFields.add("images");
    openapiFields.add("is_externally_hosted");
    openapiFields.add("is_playable");
    openapiFields.add("language");
    openapiFields.add("languages");
    openapiFields.add("name");
    openapiFields.add("release_date");
    openapiFields.add("release_date_precision");
    openapiFields.add("resume_point");
    openapiFields.add("type");
    openapiFields.add("uri");
    openapiFields.add("restrictions");
    openapiFields.add("show");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("audio_preview_url");
    openapiRequiredFields.add("html_description");
    openapiRequiredFields.add("duration_ms");
    openapiRequiredFields.add("explicit");
    openapiRequiredFields.add("external_urls");
    openapiRequiredFields.add("href");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("images");
    openapiRequiredFields.add("is_externally_hosted");
    openapiRequiredFields.add("is_playable");
    openapiRequiredFields.add("languages");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("release_date");
    openapiRequiredFields.add("release_date_precision");
    openapiRequiredFields.add("resume_point");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("uri");
    openapiRequiredFields.add("show");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EpisodeObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EpisodeObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EpisodeObject is not found in the empty JSON string", EpisodeObject.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EpisodeObject.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("audio_preview_url").isJsonNull() && !jsonObj.get("audio_preview_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audio_preview_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audio_preview_url").toString()));
      }
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
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("languages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("languages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `languages` to be an array in the JSON string but got `%s`", jsonObj.get("languages").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("release_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_date").toString()));
      }
      if (!jsonObj.get("release_date_precision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_date_precision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_date_precision").toString()));
      }
      // validate the required field `resume_point`
      ResumePointObject.validateJsonObject(jsonObj.getAsJsonObject("resume_point"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      // validate the optional field `restrictions`
      if (jsonObj.get("restrictions") != null && !jsonObj.get("restrictions").isJsonNull()) {
        EpisodeRestrictionObject.validateJsonObject(jsonObj.getAsJsonObject("restrictions"));
      }
      // validate the required field `show`
      SimplifiedShowObject.validateJsonObject(jsonObj.getAsJsonObject("show"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EpisodeObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EpisodeObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EpisodeObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EpisodeObject.class));

       return (TypeAdapter<T>) new TypeAdapter<EpisodeObject>() {
           @Override
           public void write(JsonWriter out, EpisodeObject value) throws IOException {
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
           public EpisodeObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EpisodeObject instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EpisodeObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EpisodeObject
  * @throws IOException if the JSON string is invalid with respect to EpisodeObject
  */
  public static EpisodeObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EpisodeObject.class);
  }

 /**
  * Convert an instance of EpisodeObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

