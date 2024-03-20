# UsersApi

All URIs are relative to *https://api.spotify.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkFollowingArtistsUsers**](UsersApi.md#checkFollowingArtistsUsers) | **GET** /me/following/contains | Check If User Follows Artists or Users  |
| [**checkIfFollowsPlaylist**](UsersApi.md#checkIfFollowsPlaylist) | **GET** /playlists/{playlist_id}/followers/contains | Check if Users Follow Playlist  |
| [**followArtistsOrUsers**](UsersApi.md#followArtistsOrUsers) | **PUT** /me/following | Follow Artists or Users  |
| [**followPlaylist**](UsersApi.md#followPlaylist) | **PUT** /playlists/{playlist_id}/followers | Follow Playlist  |
| [**getCurrentUserProfile**](UsersApi.md#getCurrentUserProfile) | **GET** /me | Get Current User&#39;s Profile  |
| [**getFollowedArtists**](UsersApi.md#getFollowedArtists) | **GET** /me/following | Get Followed Artists  |
| [**getTopItems**](UsersApi.md#getTopItems) | **GET** /me/top/{type} | Get User&#39;s Top Items  |
| [**getUserPlaylists**](UsersApi.md#getUserPlaylists) | **GET** /users/{user_id}/playlists | Get User&#39;s Playlists  |
| [**getUserProfile**](UsersApi.md#getUserProfile) | **GET** /users/{user_id} | Get User&#39;s Profile  |
| [**unfollowArtistsUsers**](UsersApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users  |
| [**unfollowPlaylist**](UsersApi.md#unfollowPlaylist) | **DELETE** /playlists/{playlist_id}/followers | Unfollow Playlist  |


<a name="checkFollowingArtistsUsers"></a>
# **checkFollowingArtistsUsers**
> List&lt;Boolean&gt; checkFollowingArtistsUsers(type, ids).execute();

Check If User Follows Artists or Users 

Check to see if the current user is following one or more artists or other Spotify users. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String type = "artist";
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6";
    try {
      List<Boolean> result = client
              .users
              .checkFollowingArtistsUsers(type, ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#checkFollowingArtistsUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Boolean>> response = client
              .users
              .checkFollowingArtistsUsers(type, ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#checkFollowingArtistsUsers");
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
| **type** | **String**|  | [enum: artist, user] |
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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .checkIfFollowsPlaylist(playlistId, ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#checkIfFollowsPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Boolean>> response = client
              .users
              .checkIfFollowsPlaylist(playlistId, ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#checkIfFollowsPlaylist");
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

<a name="followArtistsOrUsers"></a>
# **followArtistsOrUsers**
> followArtistsOrUsers(type, ids).requestBody(requestBody).execute();

Follow Artists or Users 

Add the current user as a follower of one or more artists or other Spotify users. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    List<String> ids = Arrays.asList(); // A JSON array of the artist or user [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example: `{ids:[\\\"74ASZWbe4lXaubB36ztrGX\\\", \\\"08td7MxkoHQkXnWAYD8d6Q\\\"]}`. A maximum of 50 IDs can be sent in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs listed here in the body will be ignored._ 
    String type = "artist";
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6";
    try {
      client
              .users
              .followArtistsOrUsers(ids, type, ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#followArtistsOrUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .followArtistsOrUsers(ids, type, ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#followArtistsOrUsers");
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
| **type** | **String**|  | [enum: artist, user] |
| **ids** | **String**|  | |
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
| **204** | Artist or user followed |  -  |

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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .followPlaylist(playlistId)
              ._public(_public)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#followPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .followPlaylist(playlistId)
              ._public(_public)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#followPlaylist");
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

<a name="getCurrentUserProfile"></a>
# **getCurrentUserProfile**
> PrivateUserObject getCurrentUserProfile().execute();

Get Current User&#39;s Profile 

Get detailed profile information about the current user (including the current user&#39;s username). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    try {
      PrivateUserObject result = client
              .users
              .getCurrentUserProfile()
              .execute();
      System.out.println(result);
      System.out.println(result.getCountry());
      System.out.println(result.getDisplayName());
      System.out.println(result.getEmail());
      System.out.println(result.getExplicitContent());
      System.out.println(result.getExternalUrls());
      System.out.println(result.getFollowers());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getProduct());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getCurrentUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrivateUserObject> response = client
              .users
              .getCurrentUserProfile()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getCurrentUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrivateUserObject**](PrivateUserObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A user |  -  |

<a name="getFollowedArtists"></a>
# **getFollowedArtists**
> UsersGetFollowedArtistsResponse getFollowedArtists(type).after(after).limit(limit).execute();

Get Followed Artists 

Get the current user&#39;s followed artists. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String type = "artist";
    String after = "0I2XqVXqHScXjHhk6AYYRe";
    Integer limit = 20;
    try {
      UsersGetFollowedArtistsResponse result = client
              .users
              .getFollowedArtists(type)
              .after(after)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getArtists());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getFollowedArtists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetFollowedArtistsResponse> response = client
              .users
              .getFollowedArtists(type)
              .after(after)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getFollowedArtists");
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
| **type** | **String**|  | [enum: artist] |
| **after** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**UsersGetFollowedArtistsResponse**](UsersGetFollowedArtistsResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged set of artists |  -  |

<a name="getTopItems"></a>
# **getTopItems**
> UsersGetTopItemsResponse getTopItems(type).timeRange(timeRange).limit(limit).offset(offset).execute();

Get User&#39;s Top Items 

Get the current user&#39;s top artists or tracks based on calculated affinity. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String type = "artists";
    String timeRange = "medium_term";
    Integer limit = 20;
    Integer offset = 0;
    try {
      UsersGetTopItemsResponse result = client
              .users
              .getTopItems(type)
              .timeRange(timeRange)
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
      System.err.println("Exception when calling UsersApi#getTopItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetTopItemsResponse> response = client
              .users
              .getTopItems(type)
              .timeRange(timeRange)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getTopItems");
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
| **type** | **String**|  | [enum: artists, tracks] |
| **timeRange** | **String**|  | [optional] [default to medium_term] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**UsersGetTopItemsResponse**](UsersGetTopItemsResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages of artists or tracks |  -  |

<a name="getUserPlaylists"></a>
# **getUserPlaylists**
> PagingPlaylistObject getUserPlaylists(userId).limit(limit).offset(offset).execute();

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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .getUserPlaylists(userId)
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
      System.err.println("Exception when calling UsersApi#getUserPlaylists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingPlaylistObject> response = client
              .users
              .getUserPlaylists(userId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserPlaylists");
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

<a name="getUserProfile"></a>
# **getUserProfile**
> PublicUserObject getUserProfile(userId).execute();

Get User&#39;s Profile 

Get public profile information about a Spotify user. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    try {
      PublicUserObject result = client
              .users
              .getUserProfile(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDisplayName());
      System.out.println(result.getExternalUrls());
      System.out.println(result.getFollowers());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getType());
      System.out.println(result.getUri());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicUserObject> response = client
              .users
              .getUserProfile(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserProfile");
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

### Return type

[**PublicUserObject**](PublicUserObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A user |  -  |

<a name="unfollowArtistsUsers"></a>
# **unfollowArtistsUsers**
> unfollowArtistsUsers(type, ids).requestBody(requestBody).execute();

Unfollow Artists or Users 

Remove the current user as a follower of one or more artists or other Spotify users. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String type = "artist";
    String ids = "2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6";
    List<String> ids = Arrays.asList(); // A JSON array of the artist or user [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example: `{ids:[\\\"74ASZWbe4lXaubB36ztrGX\\\", \\\"08td7MxkoHQkXnWAYD8d6Q\\\"]}`. A maximum of 50 IDs can be sent in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs listed here in the body will be ignored._ 
    try {
      client
              .users
              .unfollowArtistsUsers(type, ids)
              .ids(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unfollowArtistsUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .unfollowArtistsUsers(type, ids)
              .ids(ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unfollowArtistsUsers");
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
| **type** | **String**|  | [enum: artist, user] |
| **ids** | **String**|  | |
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
| **200** | Artist or user unfollowed |  -  |

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
import com.konfigthis.client.api.UsersApi;
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
              .users
              .unfollowPlaylist(playlistId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unfollowPlaylist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .unfollowPlaylist(playlistId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unfollowPlaylist");
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

