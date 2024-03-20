# PlaylistsApi

All URIs are relative to *https://api.spotify.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItems**](PlaylistsApi.md#addItems) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist  |
| [**checkIfFollowsPlaylist**](PlaylistsApi.md#checkIfFollowsPlaylist) | **GET** /playlists/{playlist_id}/followers/contains | Check if Users Follow Playlist  |
| [**createPlaylist**](PlaylistsApi.md#createPlaylist) | **POST** /users/{user_id}/playlists | Create Playlist  |
| [**followPlaylist**](PlaylistsApi.md#followPlaylist) | **PUT** /playlists/{playlist_id}/followers | Follow Playlist  |
| [**getCategoryPlaylists**](PlaylistsApi.md#getCategoryPlaylists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#39;s Playlists  |
| [**getCoverImage**](PlaylistsApi.md#getCoverImage) | **GET** /playlists/{playlist_id}/images | Get Playlist Cover Image  |
| [**getFeatured**](PlaylistsApi.md#getFeatured) | **GET** /browse/featured-playlists | Get Featured Playlists  |
| [**getPlaylistById**](PlaylistsApi.md#getPlaylistById) | **GET** /playlists/{playlist_id} | Get Playlist  |
| [**getPlaylistItems**](PlaylistsApi.md#getPlaylistItems) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items  |
| [**getUserPlaylists**](PlaylistsApi.md#getUserPlaylists) | **GET** /me/playlists | Get Current User&#39;s Playlists  |
| [**getUserPlaylists_0**](PlaylistsApi.md#getUserPlaylists_0) | **GET** /users/{user_id}/playlists | Get User&#39;s Playlists  |
| [**removeItems**](PlaylistsApi.md#removeItems) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items  |
| [**replaceCoverImage**](PlaylistsApi.md#replaceCoverImage) | **PUT** /playlists/{playlist_id}/images | Add Custom Playlist Cover Image  |
| [**unfollowPlaylist**](PlaylistsApi.md#unfollowPlaylist) | **DELETE** /playlists/{playlist_id}/followers | Unfollow Playlist  |
| [**updateDetails**](PlaylistsApi.md#updateDetails) | **PUT** /playlists/{playlist_id} | Change Playlist Details  |
| [**updatePlaylistItems**](PlaylistsApi.md#updatePlaylistItems) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items  |


<a name="addItems"></a>
# **addItems**
> PlaylistsRemoveItemsResponse addItems(playlistId).position(position).uris(uris).requestBody(requestBody).execute();

Add Items to Playlist 

Add one or more items to a user&#39;s playlist. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    List<String> uris = Arrays.asList(); // A JSON array of the [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) to add. For example: `{\\\"uris\\\": [\\\"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\\\",\\\"spotify:track:1301WleyT98MSxVHPZCA6M\\\", \\\"spotify:episode:512ojhOuo1ktJprKbVcKyQ\\\"]}`<br/>A maximum of 100 items can be added in one request. _**Note**: if the `uris` parameter is present in the query string, any URIs listed here in the body will be ignored._ 
    Integer position = 56; // The position to insert the items, a zero-based index. For example, to insert the items in the first position: `position=0` ; to insert the items in the third position: `position=2`. If omitted, the items will be appended to the playlist. Items are added in the order they appear in the uris array. For example: `{\\\"uris\\\": [\\\"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\\\",\\\"spotify:track:1301WleyT98MSxVHPZCA6M\\\"], \\\"position\\\": 3}` 
    Integer position = 0;
    String uris = "spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M";
    try {
      PlaylistsRemoveItemsResponse result = client
              .playlists
              .addItems(playlistId)
              .uris(uris)
              .position(position)
              .position(position)
              .uris(uris)
              .execute();
      System.out.println(result);
      System.out.println(result.getSnapshotId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#addItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlaylistsRemoveItemsResponse> response = client
              .playlists
              .addItems(playlistId)
              .uris(uris)
              .position(position)
              .position(position)
              .uris(uris)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#addItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **position** | **Integer**|  | [optional] |
| **uris** | **String**|  | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

[**PlaylistsRemoveItemsResponse**](PlaylistsRemoveItemsResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A snapshot ID for the playlist |  -  |

<a name="checkIfFollowsPlaylist"></a>
# **checkIfFollowsPlaylist**
> List&lt;Boolean&gt; checkIfFollowsPlaylist(playlistId, ids).execute();

Check if Users Follow Playlist 

Check to see if one or more Spotify users are following a specified playlist. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    String ids = "jmperezperez,thelinmichael,wizzler";
    try {
      List<Boolean> result = client
              .playlists
              .checkIfFollowsPlaylist(playlistId, ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#checkIfFollowsPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Boolean>> response = client
              .playlists
              .checkIfFollowsPlaylist(playlistId, ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#checkIfFollowsPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **ids** | **String**|  | |

### Return type

**List&lt;Boolean&gt;**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of booleans |  -  |

<a name="createPlaylist"></a>
# **createPlaylist**
> PlaylistObject createPlaylist(userId).requestBody(requestBody).execute();

Create Playlist 

Create a playlist for a Spotify user. (The playlist will be empty until you [add tracks](/documentation/web-api/reference/add-tracks-to-playlist).) Each user is generally limited to a maximum of 11000 playlists. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String name = "name_example"; // The name for the new playlist, for example `\\\"Your Coolest Playlist\\\"`. This name does not need to be unique; a user may have several playlists with the same name. 
    String userId = "smedjan";
    String description = "description_example"; // value for playlist description as displayed in Spotify Clients and in the Web API. 
    Boolean _public = true; // Defaults to `true`. If `true` the playlist will be public, if `false` it will be private. To be able to create private playlists, the user must have granted the `playlist-modify-private` [scope](/documentation/web-api/concepts/scopes/#list-of-scopes) 
    Boolean collaborative = true; // Defaults to `false`. If `true` the playlist will be collaborative. _**Note**: to create a collaborative playlist you must also set `public` to `false`. To create collaborative playlists you must have granted `playlist-modify-private` and `playlist-modify-public` [scopes](/documentation/web-api/concepts/scopes/#list-of-scopes)._ 
    try {
      PlaylistObject result = client
              .playlists
              .createPlaylist(name, userId)
              .description(description)
              ._public(_public)
              .collaborative(collaborative)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getCollaborative());
      System.out.println(result.getExternalUrls());
      System.out.println(result.getFollowers());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getName());
      System.out.println(result.getOwner());
      System.out.println(result.getPublic());
      System.out.println(result.getSnapshotId());
      System.out.println(result.getTracks());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#createPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlaylistObject> response = client
              .playlists
              .createPlaylist(name, userId)
              .description(description)
              ._public(_public)
              .collaborative(collaborative)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#createPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**|  | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

[**PlaylistObject**](PlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A playlist |  -  |

<a name="followPlaylist"></a>
# **followPlaylist**
> followPlaylist(playlistId).requestBody(requestBody).execute();

Follow Playlist 

Add the current user as a follower of a playlist. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    Boolean _public = true; // Defaults to `true`. If `true` the playlist will be included in user's public playlists, if `false` it will remain private. 
    try {
      client
              .playlists
              .followPlaylist(playlistId)
              ._public(_public)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#followPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .playlists
              .followPlaylist(playlistId)
              ._public(_public)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#followPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Playlist followed |  -  |

<a name="getCategoryPlaylists"></a>
# **getCategoryPlaylists**
> PagingFeaturedPlaylistObject getCategoryPlaylists(categoryId).limit(limit).offset(offset).execute();

Get Category&#39;s Playlists 

Get a list of Spotify playlists tagged with a particular category. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String categoryId = "dinner";
    Integer limit = 20;
    Integer offset = 0;
    try {
      PagingFeaturedPlaylistObject result = client
              .playlists
              .getCategoryPlaylists(categoryId)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getPlaylists());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getCategoryPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingFeaturedPlaylistObject> response = client
              .playlists
              .getCategoryPlaylists(categoryId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getCategoryPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **categoryId** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**PagingFeaturedPlaylistObject**](PagingFeaturedPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged set of playlists |  -  |

<a name="getCoverImage"></a>
# **getCoverImage**
> List&lt;ImageObject&gt; getCoverImage(playlistId).execute();

Get Playlist Cover Image 

Get the current image associated with a specific playlist. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    try {
      List<ImageObject> result = client
              .playlists
              .getCoverImage(playlistId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getCoverImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ImageObject>> response = client
              .playlists
              .getCoverImage(playlistId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getCoverImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |

### Return type

[**List&lt;ImageObject&gt;**](ImageObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A set of images |  -  |

<a name="getFeatured"></a>
# **getFeatured**
> PagingFeaturedPlaylistObject getFeatured().locale(locale).limit(limit).offset(offset).execute();

Get Featured Playlists 

Get a list of Spotify featured playlists (shown, for example, on a Spotify player&#39;s &#39;Browse&#39; tab). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String locale = "sv_SE";
    Integer limit = 20;
    Integer offset = 0;
    try {
      PagingFeaturedPlaylistObject result = client
              .playlists
              .getFeatured()
              .locale(locale)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getPlaylists());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getFeatured");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingFeaturedPlaylistObject> response = client
              .playlists
              .getFeatured()
              .locale(locale)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getFeatured");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **locale** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**PagingFeaturedPlaylistObject**](PagingFeaturedPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged set of playlists |  -  |

<a name="getPlaylistById"></a>
# **getPlaylistById**
> PlaylistObject getPlaylistById(playlistId).market(market).fields(fields).additionalTypes(additionalTypes).execute();

Get Playlist 

Get a playlist owned by a Spotify user. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    String market = "ES";
    String fields = "items(added_by.id,track(name,href,album(name,href)))";
    String additionalTypes = "additionalTypes_example";
    try {
      PlaylistObject result = client
              .playlists
              .getPlaylistById(playlistId)
              .market(market)
              .fields(fields)
              .additionalTypes(additionalTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getCollaborative());
      System.out.println(result.getExternalUrls());
      System.out.println(result.getFollowers());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getName());
      System.out.println(result.getOwner());
      System.out.println(result.getPublic());
      System.out.println(result.getSnapshotId());
      System.out.println(result.getTracks());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlaylistObject> response = client
              .playlists
              .getPlaylistById(playlistId)
              .market(market)
              .fields(fields)
              .additionalTypes(additionalTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **market** | **String**|  | [optional] |
| **fields** | **String**|  | [optional] |
| **additionalTypes** | **String**|  | [optional] |

### Return type

[**PlaylistObject**](PlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A playlist |  -  |

<a name="getPlaylistItems"></a>
# **getPlaylistItems**
> PagingPlaylistTrackObject getPlaylistItems(playlistId).market(market).fields(fields).limit(limit).offset(offset).additionalTypes(additionalTypes).execute();

Get Playlist Items 

Get full details of the items of a playlist owned by a Spotify user. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    String market = "ES";
    String fields = "items(added_by.id,track(name,href,album(name,href)))";
    Integer limit = 20;
    Integer offset = 0;
    String additionalTypes = "additionalTypes_example";
    try {
      PagingPlaylistTrackObject result = client
              .playlists
              .getPlaylistItems(playlistId)
              .market(market)
              .fields(fields)
              .limit(limit)
              .offset(offset)
              .additionalTypes(additionalTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getHref());
      System.out.println(result.getLimit());
      System.out.println(result.getNext());
      System.out.println(result.getOffset());
      System.out.println(result.getPrevious());
      System.out.println(result.getTotal());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingPlaylistTrackObject> response = client
              .playlists
              .getPlaylistItems(playlistId)
              .market(market)
              .fields(fields)
              .limit(limit)
              .offset(offset)
              .additionalTypes(additionalTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **market** | **String**|  | [optional] |
| **fields** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **additionalTypes** | **String**|  | [optional] |

### Return type

[**PagingPlaylistTrackObject**](PagingPlaylistTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages of tracks |  -  |

<a name="getUserPlaylists"></a>
# **getUserPlaylists**
> PagingPlaylistObject getUserPlaylists().limit(limit).offset(offset).execute();

Get Current User&#39;s Playlists 

Get a list of the playlists owned or followed by the current Spotify user. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    Integer limit = 20;
    Integer offset = 0;
    try {
      PagingPlaylistObject result = client
              .playlists
              .getUserPlaylists()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getHref());
      System.out.println(result.getLimit());
      System.out.println(result.getNext());
      System.out.println(result.getOffset());
      System.out.println(result.getPrevious());
      System.out.println(result.getTotal());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getUserPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingPlaylistObject> response = client
              .playlists
              .getUserPlaylists()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getUserPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**PagingPlaylistObject**](PagingPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged set of playlists |  -  |

<a name="getUserPlaylists_0"></a>
# **getUserPlaylists_0**
> PagingPlaylistObject getUserPlaylists_0(userId).limit(limit).offset(offset).execute();

Get User&#39;s Playlists 

Get a list of the playlists owned or followed by a Spotify user. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String userId = "smedjan";
    Integer limit = 20;
    Integer offset = 0;
    try {
      PagingPlaylistObject result = client
              .playlists
              .getUserPlaylists_0(userId)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getHref());
      System.out.println(result.getLimit());
      System.out.println(result.getNext());
      System.out.println(result.getOffset());
      System.out.println(result.getPrevious());
      System.out.println(result.getTotal());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getUserPlaylists_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingPlaylistObject> response = client
              .playlists
              .getUserPlaylists_0(userId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getUserPlaylists_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**PagingPlaylistObject**](PagingPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged set of playlists |  -  |

<a name="removeItems"></a>
# **removeItems**
> PlaylistsRemoveItemsResponse removeItems(playlistId).playlistsRemoveItemsRequest(playlistsRemoveItemsRequest).execute();

Remove Playlist Items 

Remove one or more items from a user&#39;s playlist. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    List<PlaylistsRemoveItemsRequestTracksInner> tracks = Arrays.asList(); // An array of objects containing [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) of the tracks or episodes to remove. For example: `{ \\\"tracks\\\": [{ \\\"uri\\\": \\\"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\\\" },{ \\\"uri\\\": \\\"spotify:track:1301WleyT98MSxVHPZCA6M\\\" }] }`. A maximum of 100 objects can be sent at once. 
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    String snapshotId = "snapshotId_example"; // The playlist's snapshot ID against which you want to make the changes. The API will validate that the specified items exist and in the specified positions and make the changes, even if more recent changes have been made to the playlist. 
    try {
      PlaylistsRemoveItemsResponse result = client
              .playlists
              .removeItems(tracks, playlistId)
              .snapshotId(snapshotId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSnapshotId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#removeItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlaylistsRemoveItemsResponse> response = client
              .playlists
              .removeItems(tracks, playlistId)
              .snapshotId(snapshotId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#removeItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **playlistsRemoveItemsRequest** | [**PlaylistsRemoveItemsRequest**](PlaylistsRemoveItemsRequest.md)|  | [optional] |

### Return type

[**PlaylistsRemoveItemsResponse**](PlaylistsRemoveItemsResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A snapshot ID for the playlist |  -  |

<a name="replaceCoverImage"></a>
# **replaceCoverImage**
> replaceCoverImage(playlistId).body(body).execute();

Add Custom Playlist Cover Image 

Replace the image used to represent a specific playlist. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    try {
      client
              .playlists
              .replaceCoverImage(playlistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#replaceCoverImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .playlists
              .replaceCoverImage(playlistId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#replaceCoverImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **body** | **byte[]**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: image/jpeg
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Image uploaded |  -  |

<a name="unfollowPlaylist"></a>
# **unfollowPlaylist**
> unfollowPlaylist(playlistId).execute();

Unfollow Playlist 

Remove the current user as a follower of a playlist. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    try {
      client
              .playlists
              .unfollowPlaylist(playlistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#unfollowPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .playlists
              .unfollowPlaylist(playlistId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#unfollowPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Playlist unfollowed |  -  |

<a name="updateDetails"></a>
# **updateDetails**
> updateDetails(playlistId).requestBody(requestBody).execute();

Change Playlist Details 

Change a playlist&#39;s name and public/private state. (The user must, of course, own the playlist.) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    String description = "description_example"; // Value for playlist description as displayed in Spotify Clients and in the Web API. 
    String name = "name_example"; // The new name for the playlist, for example `\\\"My New Playlist Title\\\"` 
    Boolean _public = true; // If `true` the playlist will be public, if `false` it will be private. 
    Boolean collaborative = true; // If `true`, the playlist will become collaborative and other users will be able to modify the playlist in their Spotify client. <br/> _**Note**: You can only set `collaborative` to `true` on non-public playlists._ 
    try {
      client
              .playlists
              .updateDetails(playlistId)
              .description(description)
              .name(name)
              ._public(_public)
              .collaborative(collaborative)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .playlists
              .updateDetails(playlistId)
              .description(description)
              .name(name)
              ._public(_public)
              .collaborative(collaborative)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Playlist updated |  -  |

<a name="updatePlaylistItems"></a>
# **updatePlaylistItems**
> PlaylistsRemoveItemsResponse updatePlaylistItems(playlistId).uris(uris).requestBody(requestBody).execute();

Update Playlist Items 

Either reorder or replace items in a playlist depending on the request&#39;s parameters. To reorder items, include &#x60;range_start&#x60;, &#x60;insert_before&#x60;, &#x60;range_length&#x60; and &#x60;snapshot_id&#x60; in the request&#39;s body. To replace items, include &#x60;uris&#x60; as either a query parameter or in the request&#39;s body. Replacing items in a playlist will overwrite its existing items. This operation can be used for replacing or clearing items in a playlist. &lt;br/&gt; **Note**: Replace and reorder are mutually exclusive operations which share the same endpoint, but have different parameters. These operations can&#39;t be applied together in a single request. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlaylistsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.spotify.com/v1";
    
    // Configure OAuth2 access token for authorization: oauth_2_0
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Spotify client = new Spotify(configuration);
    String playlistId = "3cEYpjA9oz9GiPac4AsH4n";
    List<String> uris = Arrays.asList();
    Integer rangeStart = 56; // The position of the first item to be reordered. 
    Integer insertBefore = 56; // The position where the items should be inserted.<br/>To reorder the items to the end of the playlist, simply set _insert_before_ to the position after the last item.<br/>Examples:<br/>To reorder the first item to the last position in a playlist with 10 items, set _range_start_ to 0, and _insert_before_ to 10.<br/>To reorder the last item in a playlist with 10 items to the start of the playlist, set _range_start_ to 9, and _insert_before_ to 0. 
    Integer rangeLength = 56; // The amount of items to be reordered. Defaults to 1 if not set.<br/>The range of items to be reordered begins from the _range_start_ position, and includes the _range_length_ subsequent items.<br/>Example:<br/>To move the items at index 9-10 to the start of the playlist, _range_start_ is set to 9, and _range_length_ is set to 2. 
    String snapshotId = "snapshotId_example"; // The playlist's snapshot ID against which you want to make the changes. 
    String uris = "uris_example";
    try {
      PlaylistsRemoveItemsResponse result = client
              .playlists
              .updatePlaylistItems(playlistId)
              .uris(uris)
              .rangeStart(rangeStart)
              .insertBefore(insertBefore)
              .rangeLength(rangeLength)
              .snapshotId(snapshotId)
              .uris(uris)
              .execute();
      System.out.println(result);
      System.out.println(result.getSnapshotId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#updatePlaylistItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlaylistsRemoveItemsResponse> response = client
              .playlists
              .updatePlaylistItems(playlistId)
              .uris(uris)
              .rangeStart(rangeStart)
              .insertBefore(insertBefore)
              .rangeLength(rangeLength)
              .snapshotId(snapshotId)
              .uris(uris)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#updatePlaylistItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **playlistId** | **String**|  | |
| **uris** | **String**|  | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

### Return type

[**PlaylistsRemoveItemsResponse**](PlaylistsRemoveItemsResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A snapshot ID for the playlist |  -  |

