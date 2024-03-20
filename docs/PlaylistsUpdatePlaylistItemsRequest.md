

# PlaylistsUpdatePlaylistItemsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uris** | **List&lt;String&gt;** |  |  [optional] |
|**rangeStart** | **Integer** | The position of the first item to be reordered.  |  [optional] |
|**insertBefore** | **Integer** | The position where the items should be inserted.&lt;br/&gt;To reorder the items to the end of the playlist, simply set _insert_before_ to the position after the last item.&lt;br/&gt;Examples:&lt;br/&gt;To reorder the first item to the last position in a playlist with 10 items, set _range_start_ to 0, and _insert_before_ to 10.&lt;br/&gt;To reorder the last item in a playlist with 10 items to the start of the playlist, set _range_start_ to 9, and _insert_before_ to 0.  |  [optional] |
|**rangeLength** | **Integer** | The amount of items to be reordered. Defaults to 1 if not set.&lt;br/&gt;The range of items to be reordered begins from the _range_start_ position, and includes the _range_length_ subsequent items.&lt;br/&gt;Example:&lt;br/&gt;To move the items at index 9-10 to the start of the playlist, _range_start_ is set to 9, and _range_length_ is set to 2.  |  [optional] |
|**snapshotId** | **String** | The playlist&#39;s snapshot ID against which you want to make the changes.  |  [optional] |



