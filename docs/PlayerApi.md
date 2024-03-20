# PlayerApi

All URIs are relative to *https://api.spotify.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItemToQueue**](PlayerApi.md#addItemToQueue) | **POST** /me/player/queue | Add Item to Playback Queue  |
| [**getAvailableDevices**](PlayerApi.md#getAvailableDevices) | **GET** /me/player/devices | Get Available Devices  |
| [**getCurrentPlaybackState**](PlayerApi.md#getCurrentPlaybackState) | **GET** /me/player | Get Playback State  |
| [**getCurrentlyPlayingTrack**](PlayerApi.md#getCurrentlyPlayingTrack) | **GET** /me/player/currently-playing | Get Currently Playing Track  |
| [**getRecentlyPlayedTracks**](PlayerApi.md#getRecentlyPlayedTracks) | **GET** /me/player/recently-played | Get Recently Played Tracks  |
| [**getUserQueue**](PlayerApi.md#getUserQueue) | **GET** /me/player/queue | Get the User&#39;s Queue  |
| [**pausePlayback**](PlayerApi.md#pausePlayback) | **PUT** /me/player/pause | Pause Playback  |
| [**seekToPosition**](PlayerApi.md#seekToPosition) | **PUT** /me/player/seek | Seek To Position  |
| [**setPlaybackVolume**](PlayerApi.md#setPlaybackVolume) | **PUT** /me/player/volume | Set Playback Volume  |
| [**setRepeatMode**](PlayerApi.md#setRepeatMode) | **PUT** /me/player/repeat | Set Repeat Mode  |
| [**skipToNextTrack**](PlayerApi.md#skipToNextTrack) | **POST** /me/player/next | Skip To Next  |
| [**skipToPreviousTrack**](PlayerApi.md#skipToPreviousTrack) | **POST** /me/player/previous | Skip To Previous  |
| [**startPlayback**](PlayerApi.md#startPlayback) | **PUT** /me/player/play | Start/Resume Playback  |
| [**togglePlaybackShuffle**](PlayerApi.md#togglePlaybackShuffle) | **PUT** /me/player/shuffle | Toggle Playback Shuffle  |
| [**transferPlaybackToNewDevice**](PlayerApi.md#transferPlaybackToNewDevice) | **PUT** /me/player | Transfer Playback  |


<a name="addItemToQueue"></a>
# **addItemToQueue**
> addItemToQueue(uri).deviceId(deviceId).execute();

Add Item to Playback Queue 

Add an item to the end of the user&#39;s current playback queue. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    String uri = "spotify:track:4iV5W9uYEdYUVa79Axb7Rh";
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .addItemToQueue(uri)
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#addItemToQueue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .addItemToQueue(uri)
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#addItemToQueue");
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
| **uri** | **String**|  | |
| **deviceId** | **String**|  | [optional] |

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
| **204** | Command received |  -  |

<a name="getAvailableDevices"></a>
# **getAvailableDevices**
> PlayerGetAvailableDevicesResponse getAvailableDevices().execute();

Get Available Devices 

Get information about a user’s available Spotify Connect devices. Some device models are not supported and will not be listed in the API response. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
      PlayerGetAvailableDevicesResponse result = client
              .player
              .getAvailableDevices()
              .execute();
      System.out.println(result);
      System.out.println(result.getDevices());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getAvailableDevices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlayerGetAvailableDevicesResponse> response = client
              .player
              .getAvailableDevices()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getAvailableDevices");
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

[**PlayerGetAvailableDevicesResponse**](PlayerGetAvailableDevicesResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A set of devices |  -  |

<a name="getCurrentPlaybackState"></a>
# **getCurrentPlaybackState**
> CurrentlyPlayingContextObject getCurrentPlaybackState().market(market).additionalTypes(additionalTypes).execute();

Get Playback State 

Get information about the user’s current playback state, including track or episode, progress, and active device. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    String market = "ES";
    String additionalTypes = "additionalTypes_example";
    try {
      CurrentlyPlayingContextObject result = client
              .player
              .getCurrentPlaybackState()
              .market(market)
              .additionalTypes(additionalTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getDevice());
      System.out.println(result.getRepeatState());
      System.out.println(result.getShuffleState());
      System.out.println(result.getContext());
      System.out.println(result.getTimestamp());
      System.out.println(result.getProgressMs());
      System.out.println(result.getIsPlaying());
      System.out.println(result.getItem());
      System.out.println(result.getCurrentlyPlayingType());
      System.out.println(result.getActions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getCurrentPlaybackState");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CurrentlyPlayingContextObject> response = client
              .player
              .getCurrentPlaybackState()
              .market(market)
              .additionalTypes(additionalTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getCurrentPlaybackState");
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
| **market** | **String**|  | [optional] |
| **additionalTypes** | **String**|  | [optional] |

### Return type

[**CurrentlyPlayingContextObject**](CurrentlyPlayingContextObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about playback |  -  |
| **204** | Playback not available or active |  -  |

<a name="getCurrentlyPlayingTrack"></a>
# **getCurrentlyPlayingTrack**
> CurrentlyPlayingContextObject getCurrentlyPlayingTrack().market(market).additionalTypes(additionalTypes).execute();

Get Currently Playing Track 

Get the object currently being played on the user&#39;s Spotify account. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    String market = "ES";
    String additionalTypes = "additionalTypes_example";
    try {
      CurrentlyPlayingContextObject result = client
              .player
              .getCurrentlyPlayingTrack()
              .market(market)
              .additionalTypes(additionalTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getDevice());
      System.out.println(result.getRepeatState());
      System.out.println(result.getShuffleState());
      System.out.println(result.getContext());
      System.out.println(result.getTimestamp());
      System.out.println(result.getProgressMs());
      System.out.println(result.getIsPlaying());
      System.out.println(result.getItem());
      System.out.println(result.getCurrentlyPlayingType());
      System.out.println(result.getActions());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getCurrentlyPlayingTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CurrentlyPlayingContextObject> response = client
              .player
              .getCurrentlyPlayingTrack()
              .market(market)
              .additionalTypes(additionalTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getCurrentlyPlayingTrack");
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
| **market** | **String**|  | [optional] |
| **additionalTypes** | **String**|  | [optional] |

### Return type

[**CurrentlyPlayingContextObject**](CurrentlyPlayingContextObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about the currently playing track |  -  |

<a name="getRecentlyPlayedTracks"></a>
# **getRecentlyPlayedTracks**
> CursorPagingPlayHistoryObject getRecentlyPlayedTracks().limit(limit).after(after).before(before).execute();

Get Recently Played Tracks 

Get tracks from the current user&#39;s recently played tracks. _**Note**: Currently doesn&#39;t support podcast episodes._ 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    Integer after = 1484811043508;
    Integer before = 56;
    try {
      CursorPagingPlayHistoryObject result = client
              .player
              .getRecentlyPlayedTracks()
              .limit(limit)
              .after(after)
              .before(before)
              .execute();
      System.out.println(result);
      System.out.println(result.getHref());
      System.out.println(result.getLimit());
      System.out.println(result.getNext());
      System.out.println(result.getCursors());
      System.out.println(result.getTotal());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getRecentlyPlayedTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CursorPagingPlayHistoryObject> response = client
              .player
              .getRecentlyPlayedTracks()
              .limit(limit)
              .after(after)
              .before(before)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getRecentlyPlayedTracks");
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
| **after** | **Integer**|  | [optional] |
| **before** | **Integer**|  | [optional] |

### Return type

[**CursorPagingPlayHistoryObject**](CursorPagingPlayHistoryObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged set of tracks |  -  |

<a name="getUserQueue"></a>
# **getUserQueue**
> QueueObject getUserQueue().execute();

Get the User&#39;s Queue 

Get the list of objects that make up the user&#39;s queue. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
      QueueObject result = client
              .player
              .getUserQueue()
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrentlyPlaying());
      System.out.println(result.getQueue());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getUserQueue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QueueObject> response = client
              .player
              .getUserQueue()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#getUserQueue");
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

[**QueueObject**](QueueObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Information about the queue |  -  |

<a name="pausePlayback"></a>
# **pausePlayback**
> pausePlayback().deviceId(deviceId).execute();

Pause Playback 

Pause playback on the user&#39;s account. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .pausePlayback()
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#pausePlayback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .pausePlayback()
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#pausePlayback");
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
| **deviceId** | **String**|  | [optional] |

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
| **204** | Playback paused |  -  |

<a name="seekToPosition"></a>
# **seekToPosition**
> seekToPosition(positionMs).deviceId(deviceId).execute();

Seek To Position 

Seeks to the given position in the user’s currently playing track. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    Integer positionMs = 25000;
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .seekToPosition(positionMs)
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#seekToPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .seekToPosition(positionMs)
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#seekToPosition");
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
| **positionMs** | **Integer**|  | |
| **deviceId** | **String**|  | [optional] |

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
| **204** | Command sent |  -  |

<a name="setPlaybackVolume"></a>
# **setPlaybackVolume**
> setPlaybackVolume(volumePercent).deviceId(deviceId).execute();

Set Playback Volume 

Set the volume for the user’s current playback device. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    Integer volumePercent = 50;
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .setPlaybackVolume(volumePercent)
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#setPlaybackVolume");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .setPlaybackVolume(volumePercent)
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#setPlaybackVolume");
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
| **volumePercent** | **Integer**|  | |
| **deviceId** | **String**|  | [optional] |

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
| **204** | Command sent |  -  |

<a name="setRepeatMode"></a>
# **setRepeatMode**
> setRepeatMode(state).deviceId(deviceId).execute();

Set Repeat Mode 

Set the repeat mode for the user&#39;s playback. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    String state = "context";
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .setRepeatMode(state)
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#setRepeatMode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .setRepeatMode(state)
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#setRepeatMode");
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
| **state** | **String**|  | |
| **deviceId** | **String**|  | [optional] |

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
| **204** | Command sent |  -  |

<a name="skipToNextTrack"></a>
# **skipToNextTrack**
> skipToNextTrack().deviceId(deviceId).execute();

Skip To Next 

Skips to next track in the user’s queue. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .skipToNextTrack()
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#skipToNextTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .skipToNextTrack()
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#skipToNextTrack");
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
| **deviceId** | **String**|  | [optional] |

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
| **204** | Command sent |  -  |

<a name="skipToPreviousTrack"></a>
# **skipToPreviousTrack**
> skipToPreviousTrack().deviceId(deviceId).execute();

Skip To Previous 

Skips to previous track in the user’s queue. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .skipToPreviousTrack()
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#skipToPreviousTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .skipToPreviousTrack()
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#skipToPreviousTrack");
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
| **deviceId** | **String**|  | [optional] |

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
| **204** | Command sent |  -  |

<a name="startPlayback"></a>
# **startPlayback**
> startPlayback().deviceId(deviceId).requestBody(requestBody).execute();

Start/Resume Playback 

Start a new context or resume current playback on the user&#39;s active device. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    Map<String, Object> contextUri = new HashMap(); // Optional. Spotify URI of the context to play. Valid contexts are albums, artists & playlists. `{context_uri:\\\"spotify:album:1Je1IMUlBXcx1Fz0WE7oPT\\\"}` 
    List<String> uris = Arrays.asList(); // Optional. A JSON array of the Spotify track URIs to play. For example: `{\\\"uris\\\": [\\\"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\\\", \\\"spotify:track:1301WleyT98MSxVHPZCA6M\\\"]}` 
    Map<String, Object> offset = new HashMap(); // Optional. Indicates from where in the context playback should start. Only available when context_uri corresponds to an album or playlist object \\\"position\\\" is zero based and can’t be negative. Example: `\\\"offset\\\": {\\\"position\\\": 5}` \\\"uri\\\" is a string representing the uri of the item to start at. Example: `\\\"offset\\\": {\\\"uri\\\": \\\"spotify:track:1301WleyT98MSxVHPZCA6M\\\"}` 
    Map<String, Object> positionMs = new HashMap(); // integer
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .startPlayback()
              .contextUri(contextUri)
              .uris(uris)
              .offset(offset)
              .positionMs(positionMs)
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#startPlayback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .startPlayback()
              .contextUri(contextUri)
              .uris(uris)
              .offset(offset)
              .positionMs(positionMs)
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#startPlayback");
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
| **deviceId** | **String**|  | [optional] |
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
| **204** | Playback started |  -  |

<a name="togglePlaybackShuffle"></a>
# **togglePlaybackShuffle**
> togglePlaybackShuffle(state).deviceId(deviceId).execute();

Toggle Playback Shuffle 

Toggle shuffle on or off for user’s playback. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    Boolean state = true;
    String deviceId = "0d1841b0976bae2a3a310dd74c0f3df354899bc8";
    try {
      client
              .player
              .togglePlaybackShuffle(state)
              .deviceId(deviceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#togglePlaybackShuffle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .togglePlaybackShuffle(state)
              .deviceId(deviceId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#togglePlaybackShuffle");
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
| **state** | **Boolean**|  | |
| **deviceId** | **String**|  | [optional] |

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
| **204** | Command sent |  -  |

<a name="transferPlaybackToNewDevice"></a>
# **transferPlaybackToNewDevice**
> transferPlaybackToNewDevice().requestBody(requestBody).execute();

Transfer Playback 

Transfer playback to a new device and optionally begin playback. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlayerApi;
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
    List<String> deviceIds = Arrays.asList(); // A JSON array containing the ID of the device on which playback should be started/transferred.<br/>For example:`{device_ids:[\\\"74ASZWbe4lXaubB36ztrGX\\\"]}`<br/>_**Note**: Although an array is accepted, only a single device_id is currently supported. Supplying more than one will return `400 Bad Request`_ 
    Map<String, Object> play = new HashMap(); // **true**: ensure playback happens on new device.<br/>**false** or not provided: keep the current playback state. 
    try {
      client
              .player
              .transferPlaybackToNewDevice(deviceIds)
              .play(play)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#transferPlaybackToNewDevice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .player
              .transferPlaybackToNewDevice(deviceIds)
              .play(play)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayerApi#transferPlaybackToNewDevice");
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
| **204** | Playback transferred |  -  |

