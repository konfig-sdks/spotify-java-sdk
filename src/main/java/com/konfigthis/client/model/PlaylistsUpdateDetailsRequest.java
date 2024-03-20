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
 * PlaylistsUpdateDetailsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PlaylistsUpdateDetailsRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_COLLABORATIVE = "collaborative";
  @SerializedName(SERIALIZED_NAME_COLLABORATIVE)
  private Boolean collaborative;

  public PlaylistsUpdateDetailsRequest() {
  }

  public PlaylistsUpdateDetailsRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Value for playlist description as displayed in Spotify Clients and in the Web API. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Updated playlist description", value = "Value for playlist description as displayed in Spotify Clients and in the Web API. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PlaylistsUpdateDetailsRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The new name for the playlist, for example &#x60;\&quot;My New Playlist Title\&quot;&#x60; 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Updated Playlist Name", value = "The new name for the playlist, for example `\"My New Playlist Title\"` ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PlaylistsUpdateDetailsRequest _public(Boolean _public) {
    
    
    
    
    this._public = _public;
    return this;
  }

   /**
   * If &#x60;true&#x60; the playlist will be public, if &#x60;false&#x60; it will be private. 
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "If `true` the playlist will be public, if `false` it will be private. ")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    
    
    
    this._public = _public;
  }


  public PlaylistsUpdateDetailsRequest collaborative(Boolean collaborative) {
    
    
    
    
    this.collaborative = collaborative;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the playlist will become collaborative and other users will be able to modify the playlist in their Spotify client. &lt;br/&gt; _**Note**: You can only set &#x60;collaborative&#x60; to &#x60;true&#x60; on non-public playlists._ 
   * @return collaborative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, the playlist will become collaborative and other users will be able to modify the playlist in their Spotify client. <br/> _**Note**: You can only set `collaborative` to `true` on non-public playlists._ ")

  public Boolean getCollaborative() {
    return collaborative;
  }


  public void setCollaborative(Boolean collaborative) {
    
    
    
    this.collaborative = collaborative;
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
   * @return the PlaylistsUpdateDetailsRequest instance itself
   */
  public PlaylistsUpdateDetailsRequest putAdditionalProperty(String key, Object value) {
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
    PlaylistsUpdateDetailsRequest playlistsUpdateDetailsRequest = (PlaylistsUpdateDetailsRequest) o;
    return Objects.equals(this.description, playlistsUpdateDetailsRequest.description) &&
        Objects.equals(this.name, playlistsUpdateDetailsRequest.name) &&
        Objects.equals(this._public, playlistsUpdateDetailsRequest._public) &&
        Objects.equals(this.collaborative, playlistsUpdateDetailsRequest.collaborative)&&
        Objects.equals(this.additionalProperties, playlistsUpdateDetailsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, _public, collaborative, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistsUpdateDetailsRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    collaborative: ").append(toIndentedString(collaborative)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("public");
    openapiFields.add("collaborative");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlaylistsUpdateDetailsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PlaylistsUpdateDetailsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlaylistsUpdateDetailsRequest is not found in the empty JSON string", PlaylistsUpdateDetailsRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlaylistsUpdateDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlaylistsUpdateDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlaylistsUpdateDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlaylistsUpdateDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PlaylistsUpdateDetailsRequest>() {
           @Override
           public void write(JsonWriter out, PlaylistsUpdateDetailsRequest value) throws IOException {
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
           public PlaylistsUpdateDetailsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PlaylistsUpdateDetailsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlaylistsUpdateDetailsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlaylistsUpdateDetailsRequest
  * @throws IOException if the JSON string is invalid with respect to PlaylistsUpdateDetailsRequest
  */
  public static PlaylistsUpdateDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlaylistsUpdateDetailsRequest.class);
  }

 /**
  * Convert an instance of PlaylistsUpdateDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

