

# SectionObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**start** | **Double** | The starting point (in seconds) of the section. |  [optional] |
|**duration** | **Double** | The duration (in seconds) of the section. |  [optional] |
|**confidence** | **Double** | The confidence, from 0.0 to 1.0, of the reliability of the section&#39;s \&quot;designation\&quot;. |  [optional] |
|**loudness** | **Double** | The overall loudness of the section in decibels (dB). Loudness values are useful for comparing relative loudness of sections within tracks. |  [optional] |
|**tempo** | **Double** | The overall estimated tempo of the section in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration. |  [optional] |
|**tempoConfidence** | **Double** | The confidence, from 0.0 to 1.0, of the reliability of the tempo. Some tracks contain tempo changes or sounds which don&#39;t contain tempo (like pure speech) which would correspond to a low value in this field. |  [optional] |
|**key** | **Integer** | The estimated overall key of the section. The values in this field ranging from 0 to 11 mapping to pitches using standard Pitch Class notation (E.g. 0 &#x3D; C, 1 &#x3D; C♯/D♭, 2 &#x3D; D, and so on). If no key was detected, the value is -1. |  [optional] |
|**keyConfidence** | **Double** | The confidence, from 0.0 to 1.0, of the reliability of the key. Songs with many key changes may correspond to low values in this field. |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | Indicates the modality (major or minor) of a section, the type of scale from which its melodic content is derived. This field will contain a 0 for \&quot;minor\&quot;, a 1 for \&quot;major\&quot;, or a -1 for no result. Note that the major key (e.g. C major) could more likely be confused with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same pitches. |  [optional] |
|**modeConfidence** | **Double** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;mode&#x60;. |  [optional] |
|**timeSignature** | **Integer** | An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of \&quot;3/4\&quot;, to \&quot;7/4\&quot;. |  [optional] |
|**timeSignatureConfidence** | **Double** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;time_signature&#x60;. Sections with time signature changes may correspond to low values in this field. |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_1 | -1 |
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



