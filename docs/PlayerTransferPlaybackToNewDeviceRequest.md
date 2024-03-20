

# PlayerTransferPlaybackToNewDeviceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceIds** | **List&lt;String&gt;** | A JSON array containing the ID of the device on which playback should be started/transferred.&lt;br/&gt;For example:&#x60;{device_ids:[\&quot;74ASZWbe4lXaubB36ztrGX\&quot;]}&#x60;&lt;br/&gt;_**Note**: Although an array is accepted, only a single device_id is currently supported. Supplying more than one will return &#x60;400 Bad Request&#x60;_  |  |
|**play** | **Map&lt;String, Object&gt;** | **true**: ensure playback happens on new device.&lt;br/&gt;**false** or not provided: keep the current playback state.  |  [optional] |



