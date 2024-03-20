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
 * SectionObject
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SectionObject {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Double start;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Double confidence;

  public static final String SERIALIZED_NAME_LOUDNESS = "loudness";
  @SerializedName(SERIALIZED_NAME_LOUDNESS)
  private Double loudness;

  public static final String SERIALIZED_NAME_TEMPO = "tempo";
  @SerializedName(SERIALIZED_NAME_TEMPO)
  private Double tempo;

  public static final String SERIALIZED_NAME_TEMPO_CONFIDENCE = "tempo_confidence";
  @SerializedName(SERIALIZED_NAME_TEMPO_CONFIDENCE)
  private Double tempoConfidence;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private Integer key;

  public static final String SERIALIZED_NAME_KEY_CONFIDENCE = "key_confidence";
  @SerializedName(SERIALIZED_NAME_KEY_CONFIDENCE)
  private Double keyConfidence;

  /**
   * Indicates the modality (major or minor) of a section, the type of scale from which its melodic content is derived. This field will contain a 0 for \&quot;minor\&quot;, a 1 for \&quot;major\&quot;, or a -1 for no result. Note that the major key (e.g. C major) could more likely be confused with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same pitches.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
 public enum ModeEnum {
    NUMBER_MINUS_1(-1),
    
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Double value;

    ModeEnum(Double value) {
      this.value = value;
    }

    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(Double value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(new BigDecimal(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

  public static final String SERIALIZED_NAME_MODE_CONFIDENCE = "mode_confidence";
  @SerializedName(SERIALIZED_NAME_MODE_CONFIDENCE)
  private Double modeConfidence;

  public static final String SERIALIZED_NAME_TIME_SIGNATURE = "time_signature";
  @SerializedName(SERIALIZED_NAME_TIME_SIGNATURE)
  private Integer timeSignature;

  public static final String SERIALIZED_NAME_TIME_SIGNATURE_CONFIDENCE = "time_signature_confidence";
  @SerializedName(SERIALIZED_NAME_TIME_SIGNATURE_CONFIDENCE)
  private Double timeSignatureConfidence;

  public SectionObject() {
  }

  public SectionObject start(Double start) {
    
    
    
    
    this.start = start;
    return this;
  }

  public SectionObject start(Integer start) {
    
    
    
    
    this.start = start.doubleValue();
    return this;
  }

   /**
   * The starting point (in seconds) of the section.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The starting point (in seconds) of the section.")

  public Double getStart() {
    return start;
  }


  public void setStart(Double start) {
    
    
    
    this.start = start;
  }


  public SectionObject duration(Double duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

  public SectionObject duration(Integer duration) {
    
    
    
    
    this.duration = duration.doubleValue();
    return this;
  }

   /**
   * The duration (in seconds) of the section.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6.97092", value = "The duration (in seconds) of the section.")

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    
    
    
    this.duration = duration;
  }


  public SectionObject confidence(Double confidence) {
    if (confidence != null && confidence < 0) {
      throw new IllegalArgumentException("Invalid value for confidence. Must be greater than or equal to 0.");
    }
    if (confidence != null && confidence > 1) {
      throw new IllegalArgumentException("Invalid value for confidence. Must be less than or equal to 1.");
    }
    
    
    this.confidence = confidence;
    return this;
  }

  public SectionObject confidence(Integer confidence) {
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
   * The confidence, from 0.0 to 1.0, of the reliability of the section&#39;s \&quot;designation\&quot;.
   * minimum: 0
   * maximum: 1
   * @return confidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The confidence, from 0.0 to 1.0, of the reliability of the section's \"designation\".")

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


  public SectionObject loudness(Double loudness) {
    
    
    
    
    this.loudness = loudness;
    return this;
  }

  public SectionObject loudness(Integer loudness) {
    
    
    
    
    this.loudness = loudness.doubleValue();
    return this;
  }

   /**
   * The overall loudness of the section in decibels (dB). Loudness values are useful for comparing relative loudness of sections within tracks.
   * @return loudness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-14.938", value = "The overall loudness of the section in decibels (dB). Loudness values are useful for comparing relative loudness of sections within tracks.")

  public Double getLoudness() {
    return loudness;
  }


  public void setLoudness(Double loudness) {
    
    
    
    this.loudness = loudness;
  }


  public SectionObject tempo(Double tempo) {
    
    
    
    
    this.tempo = tempo;
    return this;
  }

  public SectionObject tempo(Integer tempo) {
    
    
    
    
    this.tempo = tempo.doubleValue();
    return this;
  }

   /**
   * The overall estimated tempo of the section in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration.
   * @return tempo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "113.178", value = "The overall estimated tempo of the section in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration.")

  public Double getTempo() {
    return tempo;
  }


  public void setTempo(Double tempo) {
    
    
    
    this.tempo = tempo;
  }


  public SectionObject tempoConfidence(Double tempoConfidence) {
    if (tempoConfidence != null && tempoConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for tempoConfidence. Must be greater than or equal to 0.");
    }
    if (tempoConfidence != null && tempoConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for tempoConfidence. Must be less than or equal to 1.");
    }
    
    
    this.tempoConfidence = tempoConfidence;
    return this;
  }

  public SectionObject tempoConfidence(Integer tempoConfidence) {
    if (tempoConfidence != null && tempoConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for tempoConfidence. Must be greater than or equal to 0.");
    }
    if (tempoConfidence != null && tempoConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for tempoConfidence. Must be less than or equal to 1.");
    }
    
    
    this.tempoConfidence = tempoConfidence.doubleValue();
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the tempo. Some tracks contain tempo changes or sounds which don&#39;t contain tempo (like pure speech) which would correspond to a low value in this field.
   * minimum: 0
   * maximum: 1
   * @return tempoConfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.647", value = "The confidence, from 0.0 to 1.0, of the reliability of the tempo. Some tracks contain tempo changes or sounds which don't contain tempo (like pure speech) which would correspond to a low value in this field.")

  public Double getTempoConfidence() {
    return tempoConfidence;
  }


  public void setTempoConfidence(Double tempoConfidence) {
    if (tempoConfidence != null && tempoConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for tempoConfidence. Must be greater than or equal to 0.");
    }
    if (tempoConfidence != null && tempoConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for tempoConfidence. Must be less than or equal to 1.");
    }
    
    this.tempoConfidence = tempoConfidence;
  }


  public SectionObject key(Integer key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * The estimated overall key of the section. The values in this field ranging from 0 to 11 mapping to pitches using standard Pitch Class notation (E.g. 0 &#x3D; C, 1 &#x3D; C♯/D♭, 2 &#x3D; D, and so on). If no key was detected, the value is -1.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "The estimated overall key of the section. The values in this field ranging from 0 to 11 mapping to pitches using standard Pitch Class notation (E.g. 0 = C, 1 = C♯/D♭, 2 = D, and so on). If no key was detected, the value is -1.")

  public Integer getKey() {
    return key;
  }


  public void setKey(Integer key) {
    
    
    
    this.key = key;
  }


  public SectionObject keyConfidence(Double keyConfidence) {
    if (keyConfidence != null && keyConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for keyConfidence. Must be greater than or equal to 0.");
    }
    if (keyConfidence != null && keyConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for keyConfidence. Must be less than or equal to 1.");
    }
    
    
    this.keyConfidence = keyConfidence;
    return this;
  }

  public SectionObject keyConfidence(Integer keyConfidence) {
    if (keyConfidence != null && keyConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for keyConfidence. Must be greater than or equal to 0.");
    }
    if (keyConfidence != null && keyConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for keyConfidence. Must be less than or equal to 1.");
    }
    
    
    this.keyConfidence = keyConfidence.doubleValue();
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the key. Songs with many key changes may correspond to low values in this field.
   * minimum: 0
   * maximum: 1
   * @return keyConfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.297", value = "The confidence, from 0.0 to 1.0, of the reliability of the key. Songs with many key changes may correspond to low values in this field.")

  public Double getKeyConfidence() {
    return keyConfidence;
  }


  public void setKeyConfidence(Double keyConfidence) {
    if (keyConfidence != null && keyConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for keyConfidence. Must be greater than or equal to 0.");
    }
    if (keyConfidence != null && keyConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for keyConfidence. Must be less than or equal to 1.");
    }
    
    this.keyConfidence = keyConfidence;
  }


  public SectionObject mode(ModeEnum mode) {
    
    
    
    
    this.mode = mode;
    return this;
  }

  public SectionObject mode(Integer mode) {
    
    
    
    
    this.mode = mode.doubleValue();
    return this;
  }

   /**
   * Indicates the modality (major or minor) of a section, the type of scale from which its melodic content is derived. This field will contain a 0 for \&quot;minor\&quot;, a 1 for \&quot;major\&quot;, or a -1 for no result. Note that the major key (e.g. C major) could more likely be confused with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same pitches.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the modality (major or minor) of a section, the type of scale from which its melodic content is derived. This field will contain a 0 for \"minor\", a 1 for \"major\", or a -1 for no result. Note that the major key (e.g. C major) could more likely be confused with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same pitches.")

  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
    
    
    
    this.mode = mode;
  }


  public SectionObject modeConfidence(Double modeConfidence) {
    if (modeConfidence != null && modeConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for modeConfidence. Must be greater than or equal to 0.");
    }
    if (modeConfidence != null && modeConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for modeConfidence. Must be less than or equal to 1.");
    }
    
    
    this.modeConfidence = modeConfidence;
    return this;
  }

  public SectionObject modeConfidence(Integer modeConfidence) {
    if (modeConfidence != null && modeConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for modeConfidence. Must be greater than or equal to 0.");
    }
    if (modeConfidence != null && modeConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for modeConfidence. Must be less than or equal to 1.");
    }
    
    
    this.modeConfidence = modeConfidence.doubleValue();
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the &#x60;mode&#x60;.
   * minimum: 0
   * maximum: 1
   * @return modeConfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.471", value = "The confidence, from 0.0 to 1.0, of the reliability of the `mode`.")

  public Double getModeConfidence() {
    return modeConfidence;
  }


  public void setModeConfidence(Double modeConfidence) {
    if (modeConfidence != null && modeConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for modeConfidence. Must be greater than or equal to 0.");
    }
    if (modeConfidence != null && modeConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for modeConfidence. Must be less than or equal to 1.");
    }
    
    this.modeConfidence = modeConfidence;
  }


  public SectionObject timeSignature(Integer timeSignature) {
    if (timeSignature != null && timeSignature < 3) {
      throw new IllegalArgumentException("Invalid value for timeSignature. Must be greater than or equal to 3.");
    }
    if (timeSignature != null && timeSignature > 7) {
      throw new IllegalArgumentException("Invalid value for timeSignature. Must be less than or equal to 7.");
    }
    
    
    this.timeSignature = timeSignature;
    return this;
  }

   /**
   * An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of \&quot;3/4\&quot;, to \&quot;7/4\&quot;.
   * minimum: 3
   * maximum: 7
   * @return timeSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of \"3/4\", to \"7/4\".")

  public Integer getTimeSignature() {
    return timeSignature;
  }


  public void setTimeSignature(Integer timeSignature) {
    if (timeSignature != null && timeSignature < 3) {
      throw new IllegalArgumentException("Invalid value for timeSignature. Must be greater than or equal to 3.");
    }
    if (timeSignature != null && timeSignature > 7) {
      throw new IllegalArgumentException("Invalid value for timeSignature. Must be less than or equal to 7.");
    }
    
    this.timeSignature = timeSignature;
  }


  public SectionObject timeSignatureConfidence(Double timeSignatureConfidence) {
    if (timeSignatureConfidence != null && timeSignatureConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for timeSignatureConfidence. Must be greater than or equal to 0.");
    }
    if (timeSignatureConfidence != null && timeSignatureConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for timeSignatureConfidence. Must be less than or equal to 1.");
    }
    
    
    this.timeSignatureConfidence = timeSignatureConfidence;
    return this;
  }

  public SectionObject timeSignatureConfidence(Integer timeSignatureConfidence) {
    if (timeSignatureConfidence != null && timeSignatureConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for timeSignatureConfidence. Must be greater than or equal to 0.");
    }
    if (timeSignatureConfidence != null && timeSignatureConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for timeSignatureConfidence. Must be less than or equal to 1.");
    }
    
    
    this.timeSignatureConfidence = timeSignatureConfidence.doubleValue();
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the &#x60;time_signature&#x60;. Sections with time signature changes may correspond to low values in this field.
   * minimum: 0
   * maximum: 1
   * @return timeSignatureConfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`. Sections with time signature changes may correspond to low values in this field.")

  public Double getTimeSignatureConfidence() {
    return timeSignatureConfidence;
  }


  public void setTimeSignatureConfidence(Double timeSignatureConfidence) {
    if (timeSignatureConfidence != null && timeSignatureConfidence < 0) {
      throw new IllegalArgumentException("Invalid value for timeSignatureConfidence. Must be greater than or equal to 0.");
    }
    if (timeSignatureConfidence != null && timeSignatureConfidence > 1) {
      throw new IllegalArgumentException("Invalid value for timeSignatureConfidence. Must be less than or equal to 1.");
    }
    
    this.timeSignatureConfidence = timeSignatureConfidence;
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
   * @return the SectionObject instance itself
   */
  public SectionObject putAdditionalProperty(String key, Object value) {
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
    SectionObject sectionObject = (SectionObject) o;
    return Objects.equals(this.start, sectionObject.start) &&
        Objects.equals(this.duration, sectionObject.duration) &&
        Objects.equals(this.confidence, sectionObject.confidence) &&
        Objects.equals(this.loudness, sectionObject.loudness) &&
        Objects.equals(this.tempo, sectionObject.tempo) &&
        Objects.equals(this.tempoConfidence, sectionObject.tempoConfidence) &&
        Objects.equals(this.key, sectionObject.key) &&
        Objects.equals(this.keyConfidence, sectionObject.keyConfidence) &&
        Objects.equals(this.mode, sectionObject.mode) &&
        Objects.equals(this.modeConfidence, sectionObject.modeConfidence) &&
        Objects.equals(this.timeSignature, sectionObject.timeSignature) &&
        Objects.equals(this.timeSignatureConfidence, sectionObject.timeSignatureConfidence)&&
        Objects.equals(this.additionalProperties, sectionObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, duration, confidence, loudness, tempo, tempoConfidence, key, keyConfidence, mode, modeConfidence, timeSignature, timeSignatureConfidence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionObject {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    loudness: ").append(toIndentedString(loudness)).append("\n");
    sb.append("    tempo: ").append(toIndentedString(tempo)).append("\n");
    sb.append("    tempoConfidence: ").append(toIndentedString(tempoConfidence)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyConfidence: ").append(toIndentedString(keyConfidence)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    modeConfidence: ").append(toIndentedString(modeConfidence)).append("\n");
    sb.append("    timeSignature: ").append(toIndentedString(timeSignature)).append("\n");
    sb.append("    timeSignatureConfidence: ").append(toIndentedString(timeSignatureConfidence)).append("\n");
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
    openapiFields.add("loudness");
    openapiFields.add("tempo");
    openapiFields.add("tempo_confidence");
    openapiFields.add("key");
    openapiFields.add("key_confidence");
    openapiFields.add("mode");
    openapiFields.add("mode_confidence");
    openapiFields.add("time_signature");
    openapiFields.add("time_signature_confidence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SectionObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SectionObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SectionObject is not found in the empty JSON string", SectionObject.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SectionObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SectionObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SectionObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SectionObject.class));

       return (TypeAdapter<T>) new TypeAdapter<SectionObject>() {
           @Override
           public void write(JsonWriter out, SectionObject value) throws IOException {
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
           public SectionObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SectionObject instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SectionObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SectionObject
  * @throws IOException if the JSON string is invalid with respect to SectionObject
  */
  public static SectionObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SectionObject.class);
  }

 /**
  * Convert an instance of SectionObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

