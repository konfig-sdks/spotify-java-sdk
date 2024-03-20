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
 * DisallowsObject
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DisallowsObject {
  public static final String SERIALIZED_NAME_INTERRUPTING_PLAYBACK = "interrupting_playback";
  @SerializedName(SERIALIZED_NAME_INTERRUPTING_PLAYBACK)
  private Boolean interruptingPlayback;

  public static final String SERIALIZED_NAME_PAUSING = "pausing";
  @SerializedName(SERIALIZED_NAME_PAUSING)
  private Boolean pausing;

  public static final String SERIALIZED_NAME_RESUMING = "resuming";
  @SerializedName(SERIALIZED_NAME_RESUMING)
  private Boolean resuming;

  public static final String SERIALIZED_NAME_SEEKING = "seeking";
  @SerializedName(SERIALIZED_NAME_SEEKING)
  private Boolean seeking;

  public static final String SERIALIZED_NAME_SKIPPING_NEXT = "skipping_next";
  @SerializedName(SERIALIZED_NAME_SKIPPING_NEXT)
  private Boolean skippingNext;

  public static final String SERIALIZED_NAME_SKIPPING_PREV = "skipping_prev";
  @SerializedName(SERIALIZED_NAME_SKIPPING_PREV)
  private Boolean skippingPrev;

  public static final String SERIALIZED_NAME_TOGGLING_REPEAT_CONTEXT = "toggling_repeat_context";
  @SerializedName(SERIALIZED_NAME_TOGGLING_REPEAT_CONTEXT)
  private Boolean togglingRepeatContext;

  public static final String SERIALIZED_NAME_TOGGLING_SHUFFLE = "toggling_shuffle";
  @SerializedName(SERIALIZED_NAME_TOGGLING_SHUFFLE)
  private Boolean togglingShuffle;

  public static final String SERIALIZED_NAME_TOGGLING_REPEAT_TRACK = "toggling_repeat_track";
  @SerializedName(SERIALIZED_NAME_TOGGLING_REPEAT_TRACK)
  private Boolean togglingRepeatTrack;

  public static final String SERIALIZED_NAME_TRANSFERRING_PLAYBACK = "transferring_playback";
  @SerializedName(SERIALIZED_NAME_TRANSFERRING_PLAYBACK)
  private Boolean transferringPlayback;

  public DisallowsObject() {
  }

  public DisallowsObject interruptingPlayback(Boolean interruptingPlayback) {
    
    
    
    
    this.interruptingPlayback = interruptingPlayback;
    return this;
  }

   /**
   * Interrupting playback. Optional field.
   * @return interruptingPlayback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interrupting playback. Optional field.")

  public Boolean getInterruptingPlayback() {
    return interruptingPlayback;
  }


  public void setInterruptingPlayback(Boolean interruptingPlayback) {
    
    
    
    this.interruptingPlayback = interruptingPlayback;
  }


  public DisallowsObject pausing(Boolean pausing) {
    
    
    
    
    this.pausing = pausing;
    return this;
  }

   /**
   * Pausing. Optional field.
   * @return pausing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pausing. Optional field.")

  public Boolean getPausing() {
    return pausing;
  }


  public void setPausing(Boolean pausing) {
    
    
    
    this.pausing = pausing;
  }


  public DisallowsObject resuming(Boolean resuming) {
    
    
    
    
    this.resuming = resuming;
    return this;
  }

   /**
   * Resuming. Optional field.
   * @return resuming
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resuming. Optional field.")

  public Boolean getResuming() {
    return resuming;
  }


  public void setResuming(Boolean resuming) {
    
    
    
    this.resuming = resuming;
  }


  public DisallowsObject seeking(Boolean seeking) {
    
    
    
    
    this.seeking = seeking;
    return this;
  }

   /**
   * Seeking playback location. Optional field.
   * @return seeking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seeking playback location. Optional field.")

  public Boolean getSeeking() {
    return seeking;
  }


  public void setSeeking(Boolean seeking) {
    
    
    
    this.seeking = seeking;
  }


  public DisallowsObject skippingNext(Boolean skippingNext) {
    
    
    
    
    this.skippingNext = skippingNext;
    return this;
  }

   /**
   * Skipping to the next context. Optional field.
   * @return skippingNext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skipping to the next context. Optional field.")

  public Boolean getSkippingNext() {
    return skippingNext;
  }


  public void setSkippingNext(Boolean skippingNext) {
    
    
    
    this.skippingNext = skippingNext;
  }


  public DisallowsObject skippingPrev(Boolean skippingPrev) {
    
    
    
    
    this.skippingPrev = skippingPrev;
    return this;
  }

   /**
   * Skipping to the previous context. Optional field.
   * @return skippingPrev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skipping to the previous context. Optional field.")

  public Boolean getSkippingPrev() {
    return skippingPrev;
  }


  public void setSkippingPrev(Boolean skippingPrev) {
    
    
    
    this.skippingPrev = skippingPrev;
  }


  public DisallowsObject togglingRepeatContext(Boolean togglingRepeatContext) {
    
    
    
    
    this.togglingRepeatContext = togglingRepeatContext;
    return this;
  }

   /**
   * Toggling repeat context flag. Optional field.
   * @return togglingRepeatContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toggling repeat context flag. Optional field.")

  public Boolean getTogglingRepeatContext() {
    return togglingRepeatContext;
  }


  public void setTogglingRepeatContext(Boolean togglingRepeatContext) {
    
    
    
    this.togglingRepeatContext = togglingRepeatContext;
  }


  public DisallowsObject togglingShuffle(Boolean togglingShuffle) {
    
    
    
    
    this.togglingShuffle = togglingShuffle;
    return this;
  }

   /**
   * Toggling shuffle flag. Optional field.
   * @return togglingShuffle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toggling shuffle flag. Optional field.")

  public Boolean getTogglingShuffle() {
    return togglingShuffle;
  }


  public void setTogglingShuffle(Boolean togglingShuffle) {
    
    
    
    this.togglingShuffle = togglingShuffle;
  }


  public DisallowsObject togglingRepeatTrack(Boolean togglingRepeatTrack) {
    
    
    
    
    this.togglingRepeatTrack = togglingRepeatTrack;
    return this;
  }

   /**
   * Toggling repeat track flag. Optional field.
   * @return togglingRepeatTrack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toggling repeat track flag. Optional field.")

  public Boolean getTogglingRepeatTrack() {
    return togglingRepeatTrack;
  }


  public void setTogglingRepeatTrack(Boolean togglingRepeatTrack) {
    
    
    
    this.togglingRepeatTrack = togglingRepeatTrack;
  }


  public DisallowsObject transferringPlayback(Boolean transferringPlayback) {
    
    
    
    
    this.transferringPlayback = transferringPlayback;
    return this;
  }

   /**
   * Transfering playback between devices. Optional field.
   * @return transferringPlayback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transfering playback between devices. Optional field.")

  public Boolean getTransferringPlayback() {
    return transferringPlayback;
  }


  public void setTransferringPlayback(Boolean transferringPlayback) {
    
    
    
    this.transferringPlayback = transferringPlayback;
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
   * @return the DisallowsObject instance itself
   */
  public DisallowsObject putAdditionalProperty(String key, Object value) {
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
    DisallowsObject disallowsObject = (DisallowsObject) o;
    return Objects.equals(this.interruptingPlayback, disallowsObject.interruptingPlayback) &&
        Objects.equals(this.pausing, disallowsObject.pausing) &&
        Objects.equals(this.resuming, disallowsObject.resuming) &&
        Objects.equals(this.seeking, disallowsObject.seeking) &&
        Objects.equals(this.skippingNext, disallowsObject.skippingNext) &&
        Objects.equals(this.skippingPrev, disallowsObject.skippingPrev) &&
        Objects.equals(this.togglingRepeatContext, disallowsObject.togglingRepeatContext) &&
        Objects.equals(this.togglingShuffle, disallowsObject.togglingShuffle) &&
        Objects.equals(this.togglingRepeatTrack, disallowsObject.togglingRepeatTrack) &&
        Objects.equals(this.transferringPlayback, disallowsObject.transferringPlayback)&&
        Objects.equals(this.additionalProperties, disallowsObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interruptingPlayback, pausing, resuming, seeking, skippingNext, skippingPrev, togglingRepeatContext, togglingShuffle, togglingRepeatTrack, transferringPlayback, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisallowsObject {\n");
    sb.append("    interruptingPlayback: ").append(toIndentedString(interruptingPlayback)).append("\n");
    sb.append("    pausing: ").append(toIndentedString(pausing)).append("\n");
    sb.append("    resuming: ").append(toIndentedString(resuming)).append("\n");
    sb.append("    seeking: ").append(toIndentedString(seeking)).append("\n");
    sb.append("    skippingNext: ").append(toIndentedString(skippingNext)).append("\n");
    sb.append("    skippingPrev: ").append(toIndentedString(skippingPrev)).append("\n");
    sb.append("    togglingRepeatContext: ").append(toIndentedString(togglingRepeatContext)).append("\n");
    sb.append("    togglingShuffle: ").append(toIndentedString(togglingShuffle)).append("\n");
    sb.append("    togglingRepeatTrack: ").append(toIndentedString(togglingRepeatTrack)).append("\n");
    sb.append("    transferringPlayback: ").append(toIndentedString(transferringPlayback)).append("\n");
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
    openapiFields.add("interrupting_playback");
    openapiFields.add("pausing");
    openapiFields.add("resuming");
    openapiFields.add("seeking");
    openapiFields.add("skipping_next");
    openapiFields.add("skipping_prev");
    openapiFields.add("toggling_repeat_context");
    openapiFields.add("toggling_shuffle");
    openapiFields.add("toggling_repeat_track");
    openapiFields.add("transferring_playback");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DisallowsObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DisallowsObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisallowsObject is not found in the empty JSON string", DisallowsObject.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisallowsObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisallowsObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisallowsObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisallowsObject.class));

       return (TypeAdapter<T>) new TypeAdapter<DisallowsObject>() {
           @Override
           public void write(JsonWriter out, DisallowsObject value) throws IOException {
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
           public DisallowsObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DisallowsObject instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DisallowsObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisallowsObject
  * @throws IOException if the JSON string is invalid with respect to DisallowsObject
  */
  public static DisallowsObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisallowsObject.class);
  }

 /**
  * Convert an instance of DisallowsObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

