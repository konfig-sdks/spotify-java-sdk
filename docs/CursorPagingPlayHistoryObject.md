

# CursorPagingPlayHistoryObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** | A link to the Web API endpoint returning the full result of the request. |  [optional] |
|**limit** | **Integer** | The maximum number of items in the response (as set in the query or by default). |  [optional] |
|**next** | **String** | URL to the next page of items. ( &#x60;null&#x60; if none) |  [optional] |
|**cursors** | [**CursorObject**](CursorObject.md) | The cursors used to find the next set of items. |  [optional] |
|**total** | **Integer** | The total number of items available to return. |  [optional] |
|**items** | [**List&lt;PlayHistoryObject&gt;**](PlayHistoryObject.md) |  |  [optional] |



