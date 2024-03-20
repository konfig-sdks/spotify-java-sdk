

# PlaylistsCreatePlaylistRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | value for playlist description as displayed in Spotify Clients and in the Web API.  |  [optional] |
|**name** | **String** | The name for the new playlist, for example &#x60;\&quot;Your Coolest Playlist\&quot;&#x60;. This name does not need to be unique; a user may have several playlists with the same name.  |  |
|**_public** | **Boolean** | Defaults to &#x60;true&#x60;. If &#x60;true&#x60; the playlist will be public, if &#x60;false&#x60; it will be private. To be able to create private playlists, the user must have granted the &#x60;playlist-modify-private&#x60; [scope](/documentation/web-api/concepts/scopes/#list-of-scopes)  |  [optional] |
|**collaborative** | **Boolean** | Defaults to &#x60;false&#x60;. If &#x60;true&#x60; the playlist will be collaborative. _**Note**: to create a collaborative playlist you must also set &#x60;public&#x60; to &#x60;false&#x60;. To create collaborative playlists you must have granted &#x60;playlist-modify-private&#x60; and &#x60;playlist-modify-public&#x60; [scopes](/documentation/web-api/concepts/scopes/#list-of-scopes)._  |  [optional] |



