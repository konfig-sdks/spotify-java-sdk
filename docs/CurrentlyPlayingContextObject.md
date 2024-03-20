

# CurrentlyPlayingContextObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**device** | [**DeviceObject**](DeviceObject.md) | The device that is currently active.  |  [optional] |
|**repeatState** | **String** | off, track, context |  [optional] |
|**shuffleState** | **Boolean** | If shuffle is on or off. |  [optional] |
|**context** | [**ContextObject**](ContextObject.md) | A Context Object. Can be &#x60;null&#x60;. |  [optional] |
|**timestamp** | **Integer** | Unix Millisecond Timestamp when data was fetched. |  [optional] |
|**progressMs** | **Integer** | Progress into the currently playing track or episode. Can be &#x60;null&#x60;. |  [optional] |
|**isPlaying** | **Boolean** | If something is currently playing, return &#x60;true&#x60;. |  [optional] |
|**item** | **Object** |  |  [optional] |
|**currentlyPlayingType** | **String** | The object type of the currently playing item. Can be one of &#x60;track&#x60;, &#x60;episode&#x60;, &#x60;ad&#x60; or &#x60;unknown&#x60;.  |  [optional] |
|**actions** | [**DisallowsObject**](DisallowsObject.md) | Allows to update the user interface based on which playback actions are available within the current context.  |  [optional] |



