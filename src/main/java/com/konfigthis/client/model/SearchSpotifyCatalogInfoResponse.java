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
import com.konfigthis.client.model.PagingArtistObject;
import com.konfigthis.client.model.PagingPlaylistObject;
import com.konfigthis.client.model.PagingSimplifiedAlbumObject;
import com.konfigthis.client.model.PagingSimplifiedAudiobookObject;
import com.konfigthis.client.model.PagingSimplifiedEpisodeObject;
import com.konfigthis.client.model.PagingSimplifiedShowObject;
import com.konfigthis.client.model.PagingTrackObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * SearchSpotifyCatalogInfoResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SearchSpotifyCatalogInfoResponse {
  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @SerializedName(SERIALIZED_NAME_TRACKS)
  private PagingTrackObject tracks;

  public static final String SERIALIZED_NAME_ARTISTS = "artists";
  @SerializedName(SERIALIZED_NAME_ARTISTS)
  private PagingArtistObject artists;

  public static final String SERIALIZED_NAME_ALBUMS = "albums";
  @SerializedName(SERIALIZED_NAME_ALBUMS)
  private PagingSimplifiedAlbumObject albums;

  public static final String SERIALIZED_NAME_PLAYLISTS = "playlists";
  @SerializedName(SERIALIZED_NAME_PLAYLISTS)
  private PagingPlaylistObject playlists;

  public static final String SERIALIZED_NAME_SHOWS = "shows";
  @SerializedName(SERIALIZED_NAME_SHOWS)
  private PagingSimplifiedShowObject shows;

  public static final String SERIALIZED_NAME_EPISODES = "episodes";
  @SerializedName(SERIALIZED_NAME_EPISODES)
  private PagingSimplifiedEpisodeObject episodes;

  public static final String SERIALIZED_NAME_AUDIOBOOKS = "audiobooks";
  @SerializedName(SERIALIZED_NAME_AUDIOBOOKS)
  private PagingSimplifiedAudiobookObject audiobooks;

  public SearchSpotifyCatalogInfoResponse() {
  }

  public SearchSpotifyCatalogInfoResponse tracks(PagingTrackObject tracks) {
    
    
    
    
    this.tracks = tracks;
    return this;
  }

   /**
   * Get tracks
   * @return tracks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PagingTrackObject getTracks() {
    return tracks;
  }


  public void setTracks(PagingTrackObject tracks) {
    
    
    
    this.tracks = tracks;
  }


  public SearchSpotifyCatalogInfoResponse artists(PagingArtistObject artists) {
    
    
    
    
    this.artists = artists;
    return this;
  }

   /**
   * Get artists
   * @return artists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PagingArtistObject getArtists() {
    return artists;
  }


  public void setArtists(PagingArtistObject artists) {
    
    
    
    this.artists = artists;
  }


  public SearchSpotifyCatalogInfoResponse albums(PagingSimplifiedAlbumObject albums) {
    
    
    
    
    this.albums = albums;
    return this;
  }

   /**
   * Get albums
   * @return albums
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PagingSimplifiedAlbumObject getAlbums() {
    return albums;
  }


  public void setAlbums(PagingSimplifiedAlbumObject albums) {
    
    
    
    this.albums = albums;
  }


  public SearchSpotifyCatalogInfoResponse playlists(PagingPlaylistObject playlists) {
    
    
    
    
    this.playlists = playlists;
    return this;
  }

   /**
   * Get playlists
   * @return playlists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PagingPlaylistObject getPlaylists() {
    return playlists;
  }


  public void setPlaylists(PagingPlaylistObject playlists) {
    
    
    
    this.playlists = playlists;
  }


  public SearchSpotifyCatalogInfoResponse shows(PagingSimplifiedShowObject shows) {
    
    
    
    
    this.shows = shows;
    return this;
  }

   /**
   * Get shows
   * @return shows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PagingSimplifiedShowObject getShows() {
    return shows;
  }


  public void setShows(PagingSimplifiedShowObject shows) {
    
    
    
    this.shows = shows;
  }


  public SearchSpotifyCatalogInfoResponse episodes(PagingSimplifiedEpisodeObject episodes) {
    
    
    
    
    this.episodes = episodes;
    return this;
  }

   /**
   * Get episodes
   * @return episodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PagingSimplifiedEpisodeObject getEpisodes() {
    return episodes;
  }


  public void setEpisodes(PagingSimplifiedEpisodeObject episodes) {
    
    
    
    this.episodes = episodes;
  }


  public SearchSpotifyCatalogInfoResponse audiobooks(PagingSimplifiedAudiobookObject audiobooks) {
    
    
    
    
    this.audiobooks = audiobooks;
    return this;
  }

   /**
   * Get audiobooks
   * @return audiobooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PagingSimplifiedAudiobookObject getAudiobooks() {
    return audiobooks;
  }


  public void setAudiobooks(PagingSimplifiedAudiobookObject audiobooks) {
    
    
    
    this.audiobooks = audiobooks;
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
   * @return the SearchSpotifyCatalogInfoResponse instance itself
   */
  public SearchSpotifyCatalogInfoResponse putAdditionalProperty(String key, Object value) {
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
    SearchSpotifyCatalogInfoResponse searchSpotifyCatalogInfoResponse = (SearchSpotifyCatalogInfoResponse) o;
    return Objects.equals(this.tracks, searchSpotifyCatalogInfoResponse.tracks) &&
        Objects.equals(this.artists, searchSpotifyCatalogInfoResponse.artists) &&
        Objects.equals(this.albums, searchSpotifyCatalogInfoResponse.albums) &&
        Objects.equals(this.playlists, searchSpotifyCatalogInfoResponse.playlists) &&
        Objects.equals(this.shows, searchSpotifyCatalogInfoResponse.shows) &&
        Objects.equals(this.episodes, searchSpotifyCatalogInfoResponse.episodes) &&
        Objects.equals(this.audiobooks, searchSpotifyCatalogInfoResponse.audiobooks)&&
        Objects.equals(this.additionalProperties, searchSpotifyCatalogInfoResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracks, artists, albums, playlists, shows, episodes, audiobooks, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSpotifyCatalogInfoResponse {\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    albums: ").append(toIndentedString(albums)).append("\n");
    sb.append("    playlists: ").append(toIndentedString(playlists)).append("\n");
    sb.append("    shows: ").append(toIndentedString(shows)).append("\n");
    sb.append("    episodes: ").append(toIndentedString(episodes)).append("\n");
    sb.append("    audiobooks: ").append(toIndentedString(audiobooks)).append("\n");
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
    openapiFields.add("tracks");
    openapiFields.add("artists");
    openapiFields.add("albums");
    openapiFields.add("playlists");
    openapiFields.add("shows");
    openapiFields.add("episodes");
    openapiFields.add("audiobooks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchSpotifyCatalogInfoResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchSpotifyCatalogInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchSpotifyCatalogInfoResponse is not found in the empty JSON string", SearchSpotifyCatalogInfoResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `tracks`
      if (jsonObj.get("tracks") != null && !jsonObj.get("tracks").isJsonNull()) {
        PagingTrackObject.validateJsonObject(jsonObj.getAsJsonObject("tracks"));
      }
      // validate the optional field `artists`
      if (jsonObj.get("artists") != null && !jsonObj.get("artists").isJsonNull()) {
        PagingArtistObject.validateJsonObject(jsonObj.getAsJsonObject("artists"));
      }
      // validate the optional field `albums`
      if (jsonObj.get("albums") != null && !jsonObj.get("albums").isJsonNull()) {
        PagingSimplifiedAlbumObject.validateJsonObject(jsonObj.getAsJsonObject("albums"));
      }
      // validate the optional field `playlists`
      if (jsonObj.get("playlists") != null && !jsonObj.get("playlists").isJsonNull()) {
        PagingPlaylistObject.validateJsonObject(jsonObj.getAsJsonObject("playlists"));
      }
      // validate the optional field `shows`
      if (jsonObj.get("shows") != null && !jsonObj.get("shows").isJsonNull()) {
        PagingSimplifiedShowObject.validateJsonObject(jsonObj.getAsJsonObject("shows"));
      }
      // validate the optional field `episodes`
      if (jsonObj.get("episodes") != null && !jsonObj.get("episodes").isJsonNull()) {
        PagingSimplifiedEpisodeObject.validateJsonObject(jsonObj.getAsJsonObject("episodes"));
      }
      // validate the optional field `audiobooks`
      if (jsonObj.get("audiobooks") != null && !jsonObj.get("audiobooks").isJsonNull()) {
        PagingSimplifiedAudiobookObject.validateJsonObject(jsonObj.getAsJsonObject("audiobooks"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchSpotifyCatalogInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchSpotifyCatalogInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchSpotifyCatalogInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchSpotifyCatalogInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchSpotifyCatalogInfoResponse>() {
           @Override
           public void write(JsonWriter out, SearchSpotifyCatalogInfoResponse value) throws IOException {
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
           public SearchSpotifyCatalogInfoResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchSpotifyCatalogInfoResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchSpotifyCatalogInfoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchSpotifyCatalogInfoResponse
  * @throws IOException if the JSON string is invalid with respect to SearchSpotifyCatalogInfoResponse
  */
  public static SearchSpotifyCatalogInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchSpotifyCatalogInfoResponse.class);
  }

 /**
  * Convert an instance of SearchSpotifyCatalogInfoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

