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
import com.konfigthis.client.model.PlaylistsRemoveItemsRequestTracksInner;
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
 * PlaylistsRemoveItemsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PlaylistsRemoveItemsRequest {
  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @SerializedName(SERIALIZED_NAME_TRACKS)
  private List<PlaylistsRemoveItemsRequestTracksInner> tracks = new ArrayList<>();

  public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshot_id";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
  private String snapshotId;

  public PlaylistsRemoveItemsRequest() {
  }

  public PlaylistsRemoveItemsRequest tracks(List<PlaylistsRemoveItemsRequestTracksInner> tracks) {
    
    
    
    
    this.tracks = tracks;
    return this;
  }

  public PlaylistsRemoveItemsRequest addTracksItem(PlaylistsRemoveItemsRequestTracksInner tracksItem) {
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * An array of objects containing [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) of the tracks or episodes to remove. For example: &#x60;{ \&quot;tracks\&quot;: [{ \&quot;uri\&quot;: \&quot;spotify:track:4iV5W9uYEdYUVa79Axb7Rh\&quot; },{ \&quot;uri\&quot;: \&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot; }] }&#x60;. A maximum of 100 objects can be sent at once. 
   * @return tracks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of objects containing [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) of the tracks or episodes to remove. For example: `{ \"tracks\": [{ \"uri\": \"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\" },{ \"uri\": \"spotify:track:1301WleyT98MSxVHPZCA6M\" }] }`. A maximum of 100 objects can be sent at once. ")

  public List<PlaylistsRemoveItemsRequestTracksInner> getTracks() {
    return tracks;
  }


  public void setTracks(List<PlaylistsRemoveItemsRequestTracksInner> tracks) {
    
    
    
    this.tracks = tracks;
  }


  public PlaylistsRemoveItemsRequest snapshotId(String snapshotId) {
    
    
    
    
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * The playlist&#39;s snapshot ID against which you want to make the changes. The API will validate that the specified items exist and in the specified positions and make the changes, even if more recent changes have been made to the playlist. 
   * @return snapshotId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The playlist's snapshot ID against which you want to make the changes. The API will validate that the specified items exist and in the specified positions and make the changes, even if more recent changes have been made to the playlist. ")

  public String getSnapshotId() {
    return snapshotId;
  }


  public void setSnapshotId(String snapshotId) {
    
    
    
    this.snapshotId = snapshotId;
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
   * @return the PlaylistsRemoveItemsRequest instance itself
   */
  public PlaylistsRemoveItemsRequest putAdditionalProperty(String key, Object value) {
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
    PlaylistsRemoveItemsRequest playlistsRemoveItemsRequest = (PlaylistsRemoveItemsRequest) o;
    return Objects.equals(this.tracks, playlistsRemoveItemsRequest.tracks) &&
        Objects.equals(this.snapshotId, playlistsRemoveItemsRequest.snapshotId)&&
        Objects.equals(this.additionalProperties, playlistsRemoveItemsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracks, snapshotId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistsRemoveItemsRequest {\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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
    openapiFields.add("snapshot_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tracks");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlaylistsRemoveItemsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlaylistsRemoveItemsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlaylistsRemoveItemsRequest is not found in the empty JSON string", PlaylistsRemoveItemsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlaylistsRemoveItemsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("tracks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracks` to be an array in the JSON string but got `%s`", jsonObj.get("tracks").toString()));
      }

      JsonArray jsonArraytracks = jsonObj.getAsJsonArray("tracks");
      // validate the required field `tracks` (array)
      for (int i = 0; i < jsonArraytracks.size(); i++) {
        PlaylistsRemoveItemsRequestTracksInner.validateJsonObject(jsonArraytracks.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("snapshot_id") != null && !jsonObj.get("snapshot_id").isJsonNull()) && !jsonObj.get("snapshot_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapshot_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapshot_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlaylistsRemoveItemsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlaylistsRemoveItemsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlaylistsRemoveItemsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlaylistsRemoveItemsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PlaylistsRemoveItemsRequest>() {
           @Override
           public void write(JsonWriter out, PlaylistsRemoveItemsRequest value) throws IOException {
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
           public PlaylistsRemoveItemsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PlaylistsRemoveItemsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlaylistsRemoveItemsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlaylistsRemoveItemsRequest
  * @throws IOException if the JSON string is invalid with respect to PlaylistsRemoveItemsRequest
  */
  public static PlaylistsRemoveItemsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlaylistsRemoveItemsRequest.class);
  }

 /**
  * Convert an instance of PlaylistsRemoveItemsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

