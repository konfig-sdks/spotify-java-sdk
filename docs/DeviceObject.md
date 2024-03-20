

# DeviceObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The device ID. This ID is unique and persistent to some extent. However, this is not guaranteed and any cached &#x60;device_id&#x60; should periodically be cleared out and refetched as necessary. |  [optional] |
|**isActive** | **Boolean** | If this device is the currently active device. |  [optional] |
|**isPrivateSession** | **Boolean** | If this device is currently in a private session. |  [optional] |
|**isRestricted** | **Boolean** | Whether controlling this device is restricted. At present if this is \&quot;true\&quot; then no Web API commands will be accepted by this device. |  [optional] |
|**name** | **String** | A human-readable name for the device. Some devices have a name that the user can configure (e.g. \\\&quot;Loudest speaker\\\&quot;) and some devices have a generic name associated with the manufacturer or device model. |  [optional] |
|**type** | **String** | Device type, such as \&quot;computer\&quot;, \&quot;smartphone\&quot; or \&quot;speaker\&quot;. |  [optional] |
|**volumePercent** | **Integer** | The current volume in percent. |  [optional] |
|**supportsVolume** | **Boolean** | If this device can be used to set the volume. |  [optional] |



