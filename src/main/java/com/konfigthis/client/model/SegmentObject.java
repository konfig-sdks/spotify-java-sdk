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
 * SegmentObject
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SegmentObject {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Double start;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Double confidence;

  public static final String SERIALIZED_NAME_LOUDNESS_START = "loudness_start";
  @SerializedName(SERIALIZED_NAME_LOUDNESS_START)
  private Double loudnessStart;

  public static final String SERIALIZED_NAME_LOUDNESS_MAX = "loudness_max";
  @SerializedName(SERIALIZED_NAME_LOUDNESS_MAX)
  private Double loudnessMax;

  public static final String SERIALIZED_NAME_LOUDNESS_MAX_TIME = "loudness_max_time";
  @SerializedName(SERIALIZED_NAME_LOUDNESS_MAX_TIME)
  private Double loudnessMaxTime;

  public static final String SERIALIZED_NAME_LOUDNESS_END = "loudness_end";
  @SerializedName(SERIALIZED_NAME_LOUDNESS_END)
  private Double loudnessEnd;

  public static final String SERIALIZED_NAME_PITCHES = "pitches";
  @SerializedName(SERIALIZED_NAME_PITCHES)
  private List<Double> pitches = null;

  public static final String SERIALIZED_NAME_TIMBRE = "timbre";
  @SerializedName(SERIALIZED_NAME_TIMBRE)
  private List<Double> timbre = null;

  public SegmentObject() {
  }

  public SegmentObject start(Double start) {
    
    
    
    
    this.start = start;
    return this;
  }

  public SegmentObject start(Integer start) {
    
    
    
    
    this.start = start.doubleValue();
    return this;
  }

   /**
   * The starting point (in seconds) of the segment.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.70154", value = "The starting point (in seconds) of the segment.")

  public Double getStart() {
    return start;
  }


  public void setStart(Double start) {
    
    
    
    this.start = start;
  }


  public SegmentObject duration(Double duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

  public SegmentObject duration(Integer duration) {
    
    
    
    
    this.duration = duration.doubleValue();
    return this;
  }

   /**
   * The duration (in seconds) of the segment.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.19891", value = "The duration (in seconds) of the segment.")

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    
    
    
    this.duration = duration;
  }


  public SegmentObject confidence(Double confidence) {
    if (confidence != null && confidence < 0) {
      throw new IllegalArgumentException("Invalid value for confidence. Must be greater than or equal to 0.");
    }
    if (confidence != null && confidence > 1) {
      throw new IllegalArgumentException("Invalid value for confidence. Must be less than or equal to 1.");
    }
    
    
    this.confidence = confidence;
    return this;
  }

  public SegmentObject confidence(Integer confidence) {
    if (confidence != null && confidence < 0) {
      throw new IllegalArgumentException("Invalid value for confidence. Must be greater than or equal to 0.");
    }
    if (confidence != null && confidence > 1) {
      throw new IllegalArgumentException("Invalid value for confidence. Must be less than or equal to 1.");
    }
    
    
    this.confidence = confidence.doubleValue();
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the segmentation. Segments of the song which are difficult to logically segment (e.g: noise) may correspond to low values in this field. 
   * minimum: 0
   * maximum: 1
   * @return confidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.435", value = "The confidence, from 0.0 to 1.0, of the reliability of the segmentation. Segments of the song which are difficult to logically segment (e.g: noise) may correspond to low values in this field. ")

  public Double getConfidence() {
    return confidence;
  }


  public void setConfidence(Double confidence) {
    if (confidence != null && confidence < 0) {
      throw new IllegalArgumentException("Invalid value for confidence. Must be greater than or equal to 0.");
    }
    if (confidence != null && confidence > 1) {
      throw new IllegalArgumentException("Invalid value for confidence. Must be less than or equal to 1.");
    }
    
    this.confidence = confidence;
  }


  public SegmentObject loudnessStart(Double loudnessStart) {
    
    
    
    
    this.loudnessStart = loudnessStart;
    return this;
  }

  public SegmentObject loudnessStart(Integer loudnessStart) {
    
    
    
    
    this.loudnessStart = loudnessStart.doubleValue();
    return this;
  }

   /**
   * The onset loudness of the segment in decibels (dB). Combined with &#x60;loudness_max&#x60; and &#x60;loudness_max_time&#x60;, these components can be used to describe the \&quot;attack\&quot; of the segment.
   * @return loudnessStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-23.053", value = "The onset loudness of the segment in decibels (dB). Combined with `loudness_max` and `loudness_max_time`, these components can be used to describe the \"attack\" of the segment.")

  public Double getLoudnessStart() {
    return loudnessStart;
  }


  public void setLoudnessStart(Double loudnessStart) {
    
    
    
    this.loudnessStart = loudnessStart;
  }


  public SegmentObject loudnessMax(Double loudnessMax) {
    
    
    
    
    this.loudnessMax = loudnessMax;
    return this;
  }

  public SegmentObject loudnessMax(Integer loudnessMax) {
    
    
    
    
    this.loudnessMax = loudnessMax.doubleValue();
    return this;
  }

   /**
   * The peak loudness of the segment in decibels (dB). Combined with &#x60;loudness_start&#x60; and &#x60;loudness_max_time&#x60;, these components can be used to describe the \&quot;attack\&quot; of the segment.
   * @return loudnessMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-14.25", value = "The peak loudness of the segment in decibels (dB). Combined with `loudness_start` and `loudness_max_time`, these components can be used to describe the \"attack\" of the segment.")

  public Double getLoudnessMax() {
    return loudnessMax;
  }


  public void setLoudnessMax(Double loudnessMax) {
    
    
    
    this.loudnessMax = loudnessMax;
  }


  public SegmentObject loudnessMaxTime(Double loudnessMaxTime) {
    
    
    
    
    this.loudnessMaxTime = loudnessMaxTime;
    return this;
  }

  public SegmentObject loudnessMaxTime(Integer loudnessMaxTime) {
    
    
    
    
    this.loudnessMaxTime = loudnessMaxTime.doubleValue();
    return this;
  }

   /**
   * The segment-relative offset of the segment peak loudness in seconds. Combined with &#x60;loudness_start&#x60; and &#x60;loudness_max&#x60;, these components can be used to desctibe the \&quot;attack\&quot; of the segment.
   * @return loudnessMaxTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.07305", value = "The segment-relative offset of the segment peak loudness in seconds. Combined with `loudness_start` and `loudness_max`, these components can be used to desctibe the \"attack\" of the segment.")

  public Double getLoudnessMaxTime() {
    return loudnessMaxTime;
  }


  public void setLoudnessMaxTime(Double loudnessMaxTime) {
    
    
    
    this.loudnessMaxTime = loudnessMaxTime;
  }


  public SegmentObject loudnessEnd(Double loudnessEnd) {
    
    
    
    
    this.loudnessEnd = loudnessEnd;
    return this;
  }

  public SegmentObject loudnessEnd(Integer loudnessEnd) {
    
    
    
    
    this.loudnessEnd = loudnessEnd.doubleValue();
    return this;
  }

   /**
   * The offset loudness of the segment in decibels (dB). This value should be equivalent to the loudness_start of the following segment.
   * @return loudnessEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The offset loudness of the segment in decibels (dB). This value should be equivalent to the loudness_start of the following segment.")

  public Double getLoudnessEnd() {
    return loudnessEnd;
  }


  public void setLoudnessEnd(Double loudnessEnd) {
    
    
    
    this.loudnessEnd = loudnessEnd;
  }


  public SegmentObject pitches(List<Double> pitches) {
    
    
    
    
    this.pitches = pitches;
    return this;
  }

  public SegmentObject addPitchesItem(Double pitchesItem) {
    if (this.pitches == null) {
      this.pitches = new ArrayList<>();
    }
    this.pitches.add(pitchesItem);
    return this;
  }

   /**
   * Pitch content is given by a “chroma” vector, corresponding to the 12 pitch classes C, C#, D to B, with values ranging from 0 to 1 that describe the relative dominance of every pitch in the chromatic scale. For example a C Major chord would likely be represented by large values of C, E and G (i.e. classes 0, 4, and 7).  Vectors are normalized to 1 by their strongest dimension, therefore noisy sounds are likely represented by values that are all close to 1, while pure tones are described by one value at 1 (the pitch) and others near 0. As can be seen below, the 12 vector indices are a combination of low-power spectrum values at their respective pitch frequencies. ![pitch vector](https://developer.spotify.com/assets/audio/Pitch_vector.png) 
   * @return pitches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[0.212,0.141,0.294]", value = "Pitch content is given by a “chroma” vector, corresponding to the 12 pitch classes C, C#, D to B, with values ranging from 0 to 1 that describe the relative dominance of every pitch in the chromatic scale. For example a C Major chord would likely be represented by large values of C, E and G (i.e. classes 0, 4, and 7).  Vectors are normalized to 1 by their strongest dimension, therefore noisy sounds are likely represented by values that are all close to 1, while pure tones are described by one value at 1 (the pitch) and others near 0. As can be seen below, the 12 vector indices are a combination of low-power spectrum values at their respective pitch frequencies. ![pitch vector](https://developer.spotify.com/assets/audio/Pitch_vector.png) ")

  public List<Double> getPitches() {
    return pitches;
  }


  public void setPitches(List<Double> pitches) {
    
    
    
    this.pitches = pitches;
  }


  public SegmentObject timbre(List<Double> timbre) {
    
    
    
    
    this.timbre = timbre;
    return this;
  }

  public SegmentObject addTimbreItem(Double timbreItem) {
    if (this.timbre == null) {
      this.timbre = new ArrayList<>();
    }
    this.timbre.add(timbreItem);
    return this;
  }

   /**
   * Timbre is the quality of a musical note or sound that distinguishes different types of musical instruments, or voices. It is a complex notion also referred to as sound color, texture, or tone quality, and is derived from the shape of a segment’s spectro-temporal surface, independently of pitch and loudness. The timbre feature is a vector that includes 12 unbounded values roughly centered around 0. Those values are high level abstractions of the spectral surface, ordered by degree of importance.  For completeness however, the first dimension represents the average loudness of the segment; second emphasizes brightness; third is more closely correlated to the flatness of a sound; fourth to sounds with a stronger attack; etc. See an image below representing the 12 basis functions (i.e. template segments). ![timbre basis functions](https://developer.spotify.com/assets/audio/Timbre_basis_functions.png)  The actual timbre of the segment is best described as a linear combination of these 12 basis functions weighted by the coefficient values: timbre &#x3D; c1 x b1 + c2 x b2 + ... + c12 x b12, where c1 to c12 represent the 12 coefficients and b1 to b12 the 12 basis functions as displayed below. Timbre vectors are best used in comparison with each other. 
   * @return timbre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[42.115,64.373,-0.233]", value = "Timbre is the quality of a musical note or sound that distinguishes different types of musical instruments, or voices. It is a complex notion also referred to as sound color, texture, or tone quality, and is derived from the shape of a segment’s spectro-temporal surface, independently of pitch and loudness. The timbre feature is a vector that includes 12 unbounded values roughly centered around 0. Those values are high level abstractions of the spectral surface, ordered by degree of importance.  For completeness however, the first dimension represents the average loudness of the segment; second emphasizes brightness; third is more closely correlated to the flatness of a sound; fourth to sounds with a stronger attack; etc. See an image below representing the 12 basis functions (i.e. template segments). ![timbre basis functions](https://developer.spotify.com/assets/audio/Timbre_basis_functions.png)  The actual timbre of the segment is best described as a linear combination of these 12 basis functions weighted by the coefficient values: timbre = c1 x b1 + c2 x b2 + ... + c12 x b12, where c1 to c12 represent the 12 coefficients and b1 to b12 the 12 basis functions as displayed below. Timbre vectors are best used in comparison with each other. ")

  public List<Double> getTimbre() {
    return timbre;
  }


  public void setTimbre(List<Double> timbre) {
    
    
    
    this.timbre = timbre;
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
   * @return the SegmentObject instance itself
   */
  public SegmentObject putAdditionalProperty(String key, Object value) {
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
    SegmentObject segmentObject = (SegmentObject) o;
    return Objects.equals(this.start, segmentObject.start) &&
        Objects.equals(this.duration, segmentObject.duration) &&
        Objects.equals(this.confidence, segmentObject.confidence) &&
        Objects.equals(this.loudnessStart, segmentObject.loudnessStart) &&
        Objects.equals(this.loudnessMax, segmentObject.loudnessMax) &&
        Objects.equals(this.loudnessMaxTime, segmentObject.loudnessMaxTime) &&
        Objects.equals(this.loudnessEnd, segmentObject.loudnessEnd) &&
        Objects.equals(this.pitches, segmentObject.pitches) &&
        Objects.equals(this.timbre, segmentObject.timbre)&&
        Objects.equals(this.additionalProperties, segmentObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, duration, confidence, loudnessStart, loudnessMax, loudnessMaxTime, loudnessEnd, pitches, timbre, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentObject {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    loudnessStart: ").append(toIndentedString(loudnessStart)).append("\n");
    sb.append("    loudnessMax: ").append(toIndentedString(loudnessMax)).append("\n");
    sb.append("    loudnessMaxTime: ").append(toIndentedString(loudnessMaxTime)).append("\n");
    sb.append("    loudnessEnd: ").append(toIndentedString(loudnessEnd)).append("\n");
    sb.append("    pitches: ").append(toIndentedString(pitches)).append("\n");
    sb.append("    timbre: ").append(toIndentedString(timbre)).append("\n");
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
    openapiFields.add("start");
    openapiFields.add("duration");
    openapiFields.add("confidence");
    openapiFields.add("loudness_start");
    openapiFields.add("loudness_max");
    openapiFields.add("loudness_max_time");
    openapiFields.add("loudness_end");
    openapiFields.add("pitches");
    openapiFields.add("timbre");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SegmentObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SegmentObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SegmentObject is not found in the empty JSON string", SegmentObject.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("pitches") != null && !jsonObj.get("pitches").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pitches` to be an array in the JSON string but got `%s`", jsonObj.get("pitches").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("timbre") != null && !jsonObj.get("timbre").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `timbre` to be an array in the JSON string but got `%s`", jsonObj.get("timbre").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SegmentObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SegmentObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SegmentObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SegmentObject.class));

       return (TypeAdapter<T>) new TypeAdapter<SegmentObject>() {
           @Override
           public void write(JsonWriter out, SegmentObject value) throws IOException {
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
           public SegmentObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SegmentObject instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SegmentObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SegmentObject
  * @throws IOException if the JSON string is invalid with respect to SegmentObject
  */
  public static SegmentObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SegmentObject.class);
  }

 /**
  * Convert an instance of SegmentObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

