

# AudioAnalysisObjectMeta


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analyzerVersion** | **String** | The version of the Analyzer used to analyze this track. |  [optional] |
|**platform** | **String** | The platform used to read the track&#39;s audio data. |  [optional] |
|**detailedStatus** | **String** | A detailed status code for this track. If analysis data is missing, this code may explain why. |  [optional] |
|**statusCode** | **Integer** | The return code of the analyzer process. 0 if successful, 1 if any errors occurred. |  [optional] |
|**timestamp** | **Integer** | The Unix timestamp (in seconds) at which this track was analyzed. |  [optional] |
|**analysisTime** | **Double** | The amount of time taken to analyze this track. |  [optional] |
|**inputProcess** | **String** | The method used to read the track&#39;s audio data. |  [optional] |



