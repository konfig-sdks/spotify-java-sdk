

# PlaylistObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The playlist description. _Only returned for modified, verified playlists, otherwise_ &#x60;null&#x60;.  |  [optional] |
|**collaborative** | **Boolean** | &#x60;true&#x60; if the owner allows other users to modify the playlist.  |  [optional] |
|**externalUrls** | [**ExternalUrlObject**](ExternalUrlObject.md) | Known external URLs for this playlist.  |  [optional] |
|**followers** | [**FollowersObject**](FollowersObject.md) | Information about the followers of the playlist. |  [optional] |
|**href** | **String** | A link to the Web API endpoint providing full details of the playlist.  |  [optional] |
|**id** | **String** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.  |  [optional] |
|**images** | [**List&lt;ImageObject&gt;**](ImageObject.md) | Images for the playlist. The array may be empty or contain up to three images. The images are returned by size in descending order. See [Working with Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned, the source URL for the image (&#x60;url&#x60;) is temporary and will expire in less than a day._  |  [optional] |
|**name** | **String** | The name of the playlist.  |  [optional] |
|**owner** | [**PlaylistOwnerObject**](PlaylistOwnerObject.md) | The user who owns the playlist  |  [optional] |
|**_public** | **Boolean** | The playlist&#39;s public/private status: &#x60;true&#x60; the playlist is public, &#x60;false&#x60; the playlist is private, &#x60;null&#x60; the playlist status is not relevant. For more about public/private status, see [Working with Playlists](/documentation/web-api/concepts/playlists)  |  [optional] |
|**snapshotId** | **String** | The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version  |  [optional] |
|**tracks** | [**PagingPlaylistTrackObject**](PagingPlaylistTrackObject.md) | The tracks of the playlist.  |  [optional] |
|**type** | **String** | The object type: \&quot;playlist\&quot;  |  [optional] |
|**uri** | **String** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.  |  [optional] |



