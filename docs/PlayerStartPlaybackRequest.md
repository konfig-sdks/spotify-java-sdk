

# PlayerStartPlaybackRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contextUri** | **Map&lt;String, Object&gt;** | Optional. Spotify URI of the context to play. Valid contexts are albums, artists &amp; playlists. &#x60;{context_uri:\&quot;spotify:album:1Je1IMUlBXcx1Fz0WE7oPT\&quot;}&#x60;  |  [optional] |
|**uris** | **List&lt;String&gt;** | Optional. A JSON array of the Spotify track URIs to play. For example: &#x60;{\&quot;uris\&quot;: [\&quot;spotify:track:4iV5W9uYEdYUVa79Axb7Rh\&quot;, \&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot;]}&#x60;  |  [optional] |
|**offset** | **Map&lt;String, Object&gt;** | Optional. Indicates from where in the context playback should start. Only available when context_uri corresponds to an album or playlist object \&quot;position\&quot; is zero based and can’t be negative. Example: &#x60;\&quot;offset\&quot;: {\&quot;position\&quot;: 5}&#x60; \&quot;uri\&quot; is a string representing the uri of the item to start at. Example: &#x60;\&quot;offset\&quot;: {\&quot;uri\&quot;: \&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot;}&#x60;  |  [optional] |
|**positionMs** | **Map&lt;String, Object&gt;** | integer |  [optional] |



