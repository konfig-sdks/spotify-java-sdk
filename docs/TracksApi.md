# TracksApi

All URIs are relative to *https://api.spotify.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItems**](TracksApi.md#addItems) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist  |
| [**checkSaved**](TracksApi.md#checkSaved) | **GET** /me/tracks/contains | Check User&#39;s Saved Tracks  |
| [**getAudioAnalysis**](TracksApi.md#getAudioAnalysis) | **GET** /audio-analysis/{id} | Get Track&#39;s Audio Analysis  |
| [**getAudioFeaturesById**](TracksApi.md#getAudioFeaturesById) | **GET** /audio-features/{id} | Get Track&#39;s Audio Features  |
| [**getBySpotifyId**](TracksApi.md#getBySpotifyId) | **GET** /tracks/{id} | Get Track  |
| [**getMultipleAudioFeatures**](TracksApi.md#getMultipleAudioFeatures) | **GET** /audio-features | Get Several Tracks&#39; Audio Features  |
| [**getMultipleByIds**](TracksApi.md#getMultipleByIds) | **GET** /tracks | Get Several Tracks  |
| [**getPlaylistItems**](TracksApi.md#getPlaylistItems) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items  |
| [**getRecommendations**](TracksApi.md#getRecommendations) | **GET** /recommendations | Get Recommendations  |
| [**getTopItems**](TracksApi.md#getTopItems) | **GET** /me/top/{type} | Get User&#39;s Top Items  |
| [**getTopTracks**](TracksApi.md#getTopTracks) | **GET** /artists/{id}/top-tracks | Get Artist&#39;s Top Tracks  |
| [**getTracksById**](TracksApi.md#getTracksById) | **GET** /albums/{id}/tracks | Get Album Tracks  |
| [**getUserSaved**](TracksApi.md#getUserSaved) | **GET** /me/tracks | Get User&#39;s Saved Tracks  |
| [**removeFromLibrary**](TracksApi.md#removeFromLibrary) | **DELETE** /me/tracks | Remove User&#39;s Saved Tracks  |
| [**removeItems**](TracksApi.md#removeItems) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items  |
| [**saveForCurrentUser**](TracksApi.md#saveForCurrentUser) | **PUT** /me/tracks | Save Tracks for Current User  |
| [**updatePlaylistItems**](TracksApi.md#updatePlaylistItems) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items  |


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
import com.konfigthis.client.api.TracksApi;
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
              .tracks
              .addItems(playlistId)
              .uris(uris)
              .position(position)
              .position(position)
              .uris(uris)
              .execute();
      System.out.println(result);
      System.out.println(result.getSnapshotId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#addItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlaylistsRemoveItemsResponse> response = client
              .tracks
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
      System.err.println("Exception when calling TracksApi#addItems");
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

<a name="checkSaved"></a>
# **checkSaved**
> List&lt;Boolean&gt; checkSaved(ids).execute();

Check User&#39;s Saved Tracks 

Check if one or more tracks is already saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";
    try {
      List<Boolean> result = client
              .tracks
              .checkSaved(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#checkSaved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Boolean>> response = client
              .tracks
              .checkSaved(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#checkSaved");
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

<a name="getAudioAnalysis"></a>
# **getAudioAnalysis**
> AudioAnalysisObject getAudioAnalysis(id).execute();

Get Track&#39;s Audio Analysis 

Get a low-level audio analysis for a track in the Spotify catalog. The audio analysis describes the track’s structure and musical content, including rhythm, pitch, and timbre. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String id = "11dFghVXANMlKmJXsNCbNl";
    try {
      AudioAnalysisObject result = client
              .tracks
              .getAudioAnalysis(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getTrack());
      System.out.println(result.getBars());
      System.out.println(result.getBeats());
      System.out.println(result.getSections());
      System.out.println(result.getSegments());
      System.out.println(result.getTatums());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getAudioAnalysis");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudioAnalysisObject> response = client
              .tracks
              .getAudioAnalysis(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getAudioAnalysis");
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
| **id** | **String**|  | |

### Return type

[**AudioAnalysisObject**](AudioAnalysisObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audio analysis for one track |  -  |

<a name="getAudioFeaturesById"></a>
# **getAudioFeaturesById**
> AudioFeaturesObject getAudioFeaturesById(id).execute();

Get Track&#39;s Audio Features 

Get audio feature information for a single track identified by its unique Spotify ID. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String id = "11dFghVXANMlKmJXsNCbNl";
    try {
      AudioFeaturesObject result = client
              .tracks
              .getAudioFeaturesById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getAcousticness());
      System.out.println(result.getAnalysisUrl());
      System.out.println(result.getDanceability());
      System.out.println(result.getDurationMs());
      System.out.println(result.getEnergy());
      System.out.println(result.getId());
      System.out.println(result.getInstrumentalness());
      System.out.println(result.getKey());
      System.out.println(result.getLiveness());
      System.out.println(result.getLoudness());
      System.out.println(result.getMode());
      System.out.println(result.getSpeechiness());
      System.out.println(result.getTempo());
      System.out.println(result.getTimeSignature());
      System.out.println(result.getTrackHref());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getValence());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getAudioFeaturesById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudioFeaturesObject> response = client
              .tracks
              .getAudioFeaturesById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getAudioFeaturesById");
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
| **id** | **String**|  | |

### Return type

[**AudioFeaturesObject**](AudioFeaturesObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audio features for one track |  -  |

<a name="getBySpotifyId"></a>
# **getBySpotifyId**
> TrackObject getBySpotifyId(id).market(market).execute();

Get Track 

Get Spotify catalog information for a single track identified by its unique Spotify ID. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String id = "11dFghVXANMlKmJXsNCbNl";
    String market = "ES";
    try {
      TrackObject result = client
              .tracks
              .getBySpotifyId(id)
              .market(market)
              .execute();
      System.out.println(result);
      System.out.println(result.getAlbum());
      System.out.println(result.getArtists());
      System.out.println(result.getAvailableMarkets());
      System.out.println(result.getDiscNumber());
      System.out.println(result.getDurationMs());
      System.out.println(result.getExplicit());
      System.out.println(result.getExternalIds());
      System.out.println(result.getExternalUrls());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getIsPlayable());
      System.out.println(result.getLinkedFrom());
      System.out.println(result.getRestrictions());
      System.out.println(result.getName());
      System.out.println(result.getPopularity());
      System.out.println(result.getPreviewUrl());
      System.out.println(result.getTrackNumber());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getIsLocal());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getBySpotifyId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrackObject> response = client
              .tracks
              .getBySpotifyId(id)
              .market(market)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getBySpotifyId");
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
| **id** | **String**|  | |
| **market** | **String**|  | [optional] |

### Return type

[**TrackObject**](TrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A track |  -  |

<a name="getMultipleAudioFeatures"></a>
# **getMultipleAudioFeatures**
> TracksGetMultipleAudioFeaturesResponse getMultipleAudioFeatures(ids).execute();

Get Several Tracks&#39; Audio Features 

Get audio features for multiple tracks based on their Spotify IDs. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";
    try {
      TracksGetMultipleAudioFeaturesResponse result = client
              .tracks
              .getMultipleAudioFeatures(ids)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudioFeatures());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getMultipleAudioFeatures");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TracksGetMultipleAudioFeaturesResponse> response = client
              .tracks
              .getMultipleAudioFeatures(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getMultipleAudioFeatures");
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
| **ids** | **String**|  | |

### Return type

[**TracksGetMultipleAudioFeaturesResponse**](TracksGetMultipleAudioFeaturesResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A set of audio features |  -  |

<a name="getMultipleByIds"></a>
# **getMultipleByIds**
> ArtistsGetTopTracksResponse getMultipleByIds(ids).market(market).execute();

Get Several Tracks 

Get Spotify catalog information for multiple tracks based on their Spotify IDs. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";
    String market = "ES";
    try {
      ArtistsGetTopTracksResponse result = client
              .tracks
              .getMultipleByIds(ids)
              .market(market)
              .execute();
      System.out.println(result);
      System.out.println(result.getTracks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getMultipleByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ArtistsGetTopTracksResponse> response = client
              .tracks
              .getMultipleByIds(ids)
              .market(market)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getMultipleByIds");
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
| **ids** | **String**|  | |
| **market** | **String**|  | [optional] |

### Return type

[**ArtistsGetTopTracksResponse**](ArtistsGetTopTracksResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A set of tracks |  -  |

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
import com.konfigthis.client.api.TracksApi;
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
              .tracks
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
      System.err.println("Exception when calling TracksApi#getPlaylistItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingPlaylistTrackObject> response = client
              .tracks
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
      System.err.println("Exception when calling TracksApi#getPlaylistItems");
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

<a name="getRecommendations"></a>
# **getRecommendations**
> RecommendationsObject getRecommendations(seedArtists, seedGenres, seedTracks).limit(limit).market(market).minAcousticness(minAcousticness).maxAcousticness(maxAcousticness).targetAcousticness(targetAcousticness).minDanceability(minDanceability).maxDanceability(maxDanceability).targetDanceability(targetDanceability).minDurationMs(minDurationMs).maxDurationMs(maxDurationMs).targetDurationMs(targetDurationMs).minEnergy(minEnergy).maxEnergy(maxEnergy).targetEnergy(targetEnergy).minInstrumentalness(minInstrumentalness).maxInstrumentalness(maxInstrumentalness).targetInstrumentalness(targetInstrumentalness).minKey(minKey).maxKey(maxKey).targetKey(targetKey).minLiveness(minLiveness).maxLiveness(maxLiveness).targetLiveness(targetLiveness).minLoudness(minLoudness).maxLoudness(maxLoudness).targetLoudness(targetLoudness).minMode(minMode).maxMode(maxMode).targetMode(targetMode).minPopularity(minPopularity).maxPopularity(maxPopularity).targetPopularity(targetPopularity).minSpeechiness(minSpeechiness).maxSpeechiness(maxSpeechiness).targetSpeechiness(targetSpeechiness).minTempo(minTempo).maxTempo(maxTempo).targetTempo(targetTempo).minTimeSignature(minTimeSignature).maxTimeSignature(maxTimeSignature).targetTimeSignature(targetTimeSignature).minValence(minValence).maxValence(maxValence).targetValence(targetValence).execute();

Get Recommendations 

Recommendations are generated based on the available information for a given seed entity and matched against similar artists and tracks. If there is sufficient information about the provided seeds, a list of tracks will be returned together with pool size details.  For artists and tracks that are very new or obscure there might not be enough data to generate a list of tracks. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String seedArtists = "4NHQUGzhtTLFvgF5SZesLK";
    String seedGenres = "classical,country";
    String seedTracks = "0c6xIDDpzE81m2q797ordA";
    Integer limit = 20;
    String market = "ES";
    Double minAcousticness = 3.4D;
    Double maxAcousticness = 3.4D;
    Double targetAcousticness = 3.4D;
    Double minDanceability = 3.4D;
    Double maxDanceability = 3.4D;
    Double targetDanceability = 3.4D;
    Integer minDurationMs = 56;
    Integer maxDurationMs = 56;
    Integer targetDurationMs = 56;
    Double minEnergy = 3.4D;
    Double maxEnergy = 3.4D;
    Double targetEnergy = 3.4D;
    Double minInstrumentalness = 3.4D;
    Double maxInstrumentalness = 3.4D;
    Double targetInstrumentalness = 3.4D;
    Integer minKey = 56;
    Integer maxKey = 56;
    Integer targetKey = 56;
    Double minLiveness = 3.4D;
    Double maxLiveness = 3.4D;
    Double targetLiveness = 3.4D;
    Double minLoudness = 3.4D;
    Double maxLoudness = 3.4D;
    Double targetLoudness = 3.4D;
    Integer minMode = 56;
    Integer maxMode = 56;
    Integer targetMode = 56;
    Integer minPopularity = 56;
    Integer maxPopularity = 56;
    Integer targetPopularity = 56;
    Double minSpeechiness = 3.4D;
    Double maxSpeechiness = 3.4D;
    Double targetSpeechiness = 3.4D;
    Double minTempo = 3.4D;
    Double maxTempo = 3.4D;
    Double targetTempo = 3.4D;
    Integer minTimeSignature = 56;
    Integer maxTimeSignature = 56;
    Integer targetTimeSignature = 56;
    Double minValence = 3.4D;
    Double maxValence = 3.4D;
    Double targetValence = 3.4D;
    try {
      RecommendationsObject result = client
              .tracks
              .getRecommendations(seedArtists, seedGenres, seedTracks)
              .limit(limit)
              .market(market)
              .minAcousticness(minAcousticness)
              .maxAcousticness(maxAcousticness)
              .targetAcousticness(targetAcousticness)
              .minDanceability(minDanceability)
              .maxDanceability(maxDanceability)
              .targetDanceability(targetDanceability)
              .minDurationMs(minDurationMs)
              .maxDurationMs(maxDurationMs)
              .targetDurationMs(targetDurationMs)
              .minEnergy(minEnergy)
              .maxEnergy(maxEnergy)
              .targetEnergy(targetEnergy)
              .minInstrumentalness(minInstrumentalness)
              .maxInstrumentalness(maxInstrumentalness)
              .targetInstrumentalness(targetInstrumentalness)
              .minKey(minKey)
              .maxKey(maxKey)
              .targetKey(targetKey)
              .minLiveness(minLiveness)
              .maxLiveness(maxLiveness)
              .targetLiveness(targetLiveness)
              .minLoudness(minLoudness)
              .maxLoudness(maxLoudness)
              .targetLoudness(targetLoudness)
              .minMode(minMode)
              .maxMode(maxMode)
              .targetMode(targetMode)
              .minPopularity(minPopularity)
              .maxPopularity(maxPopularity)
              .targetPopularity(targetPopularity)
              .minSpeechiness(minSpeechiness)
              .maxSpeechiness(maxSpeechiness)
              .targetSpeechiness(targetSpeechiness)
              .minTempo(minTempo)
              .maxTempo(maxTempo)
              .targetTempo(targetTempo)
              .minTimeSignature(minTimeSignature)
              .maxTimeSignature(maxTimeSignature)
              .targetTimeSignature(targetTimeSignature)
              .minValence(minValence)
              .maxValence(maxValence)
              .targetValence(targetValence)
              .execute();
      System.out.println(result);
      System.out.println(result.getSeeds());
      System.out.println(result.getTracks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getRecommendations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecommendationsObject> response = client
              .tracks
              .getRecommendations(seedArtists, seedGenres, seedTracks)
              .limit(limit)
              .market(market)
              .minAcousticness(minAcousticness)
              .maxAcousticness(maxAcousticness)
              .targetAcousticness(targetAcousticness)
              .minDanceability(minDanceability)
              .maxDanceability(maxDanceability)
              .targetDanceability(targetDanceability)
              .minDurationMs(minDurationMs)
              .maxDurationMs(maxDurationMs)
              .targetDurationMs(targetDurationMs)
              .minEnergy(minEnergy)
              .maxEnergy(maxEnergy)
              .targetEnergy(targetEnergy)
              .minInstrumentalness(minInstrumentalness)
              .maxInstrumentalness(maxInstrumentalness)
              .targetInstrumentalness(targetInstrumentalness)
              .minKey(minKey)
              .maxKey(maxKey)
              .targetKey(targetKey)
              .minLiveness(minLiveness)
              .maxLiveness(maxLiveness)
              .targetLiveness(targetLiveness)
              .minLoudness(minLoudness)
              .maxLoudness(maxLoudness)
              .targetLoudness(targetLoudness)
              .minMode(minMode)
              .maxMode(maxMode)
              .targetMode(targetMode)
              .minPopularity(minPopularity)
              .maxPopularity(maxPopularity)
              .targetPopularity(targetPopularity)
              .minSpeechiness(minSpeechiness)
              .maxSpeechiness(maxSpeechiness)
              .targetSpeechiness(targetSpeechiness)
              .minTempo(minTempo)
              .maxTempo(maxTempo)
              .targetTempo(targetTempo)
              .minTimeSignature(minTimeSignature)
              .maxTimeSignature(maxTimeSignature)
              .targetTimeSignature(targetTimeSignature)
              .minValence(minValence)
              .maxValence(maxValence)
              .targetValence(targetValence)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getRecommendations");
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
| **seedArtists** | **String**|  | |
| **seedGenres** | **String**|  | |
| **seedTracks** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **market** | **String**|  | [optional] |
| **minAcousticness** | **Double**|  | [optional] |
| **maxAcousticness** | **Double**|  | [optional] |
| **targetAcousticness** | **Double**|  | [optional] |
| **minDanceability** | **Double**|  | [optional] |
| **maxDanceability** | **Double**|  | [optional] |
| **targetDanceability** | **Double**|  | [optional] |
| **minDurationMs** | **Integer**|  | [optional] |
| **maxDurationMs** | **Integer**|  | [optional] |
| **targetDurationMs** | **Integer**|  | [optional] |
| **minEnergy** | **Double**|  | [optional] |
| **maxEnergy** | **Double**|  | [optional] |
| **targetEnergy** | **Double**|  | [optional] |
| **minInstrumentalness** | **Double**|  | [optional] |
| **maxInstrumentalness** | **Double**|  | [optional] |
| **targetInstrumentalness** | **Double**|  | [optional] |
| **minKey** | **Integer**|  | [optional] |
| **maxKey** | **Integer**|  | [optional] |
| **targetKey** | **Integer**|  | [optional] |
| **minLiveness** | **Double**|  | [optional] |
| **maxLiveness** | **Double**|  | [optional] |
| **targetLiveness** | **Double**|  | [optional] |
| **minLoudness** | **Double**|  | [optional] |
| **maxLoudness** | **Double**|  | [optional] |
| **targetLoudness** | **Double**|  | [optional] |
| **minMode** | **Integer**|  | [optional] |
| **maxMode** | **Integer**|  | [optional] |
| **targetMode** | **Integer**|  | [optional] |
| **minPopularity** | **Integer**|  | [optional] |
| **maxPopularity** | **Integer**|  | [optional] |
| **targetPopularity** | **Integer**|  | [optional] |
| **minSpeechiness** | **Double**|  | [optional] |
| **maxSpeechiness** | **Double**|  | [optional] |
| **targetSpeechiness** | **Double**|  | [optional] |
| **minTempo** | **Double**|  | [optional] |
| **maxTempo** | **Double**|  | [optional] |
| **targetTempo** | **Double**|  | [optional] |
| **minTimeSignature** | **Integer**|  | [optional] |
| **maxTimeSignature** | **Integer**|  | [optional] |
| **targetTimeSignature** | **Integer**|  | [optional] |
| **minValence** | **Double**|  | [optional] |
| **maxValence** | **Double**|  | [optional] |
| **targetValence** | **Double**|  | [optional] |

### Return type

[**RecommendationsObject**](RecommendationsObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A set of recommendations |  -  |

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
import com.konfigthis.client.api.TracksApi;
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
              .tracks
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
      System.err.println("Exception when calling TracksApi#getTopItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersGetTopItemsResponse> response = client
              .tracks
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
      System.err.println("Exception when calling TracksApi#getTopItems");
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

<a name="getTopTracks"></a>
# **getTopTracks**
> ArtistsGetTopTracksResponse getTopTracks(id).market(market).execute();

Get Artist&#39;s Top Tracks 

Get Spotify catalog information about an artist&#39;s top tracks by country. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String id = "0TnOYISbd1XYRBk9myaseg";
    String market = "ES";
    try {
      ArtistsGetTopTracksResponse result = client
              .tracks
              .getTopTracks(id)
              .market(market)
              .execute();
      System.out.println(result);
      System.out.println(result.getTracks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getTopTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ArtistsGetTopTracksResponse> response = client
              .tracks
              .getTopTracks(id)
              .market(market)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getTopTracks");
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
| **id** | **String**|  | |
| **market** | **String**|  | [optional] |

### Return type

[**ArtistsGetTopTracksResponse**](ArtistsGetTopTracksResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A set of tracks |  -  |

<a name="getTracksById"></a>
# **getTracksById**
> PagingSimplifiedTrackObject getTracksById(id).market(market).limit(limit).offset(offset).execute();

Get Album Tracks 

Get Spotify catalog information about an album’s tracks. Optional parameters can be used to limit the number of tracks returned. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String id = "4aawyAB9vmqN3uQ7FjRGTy";
    String market = "ES";
    Integer limit = 20;
    Integer offset = 0;
    try {
      PagingSimplifiedTrackObject result = client
              .tracks
              .getTracksById(id)
              .market(market)
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
      System.err.println("Exception when calling TracksApi#getTracksById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingSimplifiedTrackObject> response = client
              .tracks
              .getTracksById(id)
              .market(market)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getTracksById");
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
| **id** | **String**|  | |
| **market** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**PagingSimplifiedTrackObject**](PagingSimplifiedTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages of tracks |  -  |

<a name="getUserSaved"></a>
# **getUserSaved**
> PagingSavedTrackObject getUserSaved().market(market).limit(limit).offset(offset).execute();

Get User&#39;s Saved Tracks 

Get a list of the songs saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    Integer limit = 20;
    Integer offset = 0;
    try {
      PagingSavedTrackObject result = client
              .tracks
              .getUserSaved()
              .market(market)
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
      System.err.println("Exception when calling TracksApi#getUserSaved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingSavedTrackObject> response = client
              .tracks
              .getUserSaved()
              .market(market)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#getUserSaved");
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
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**PagingSavedTrackObject**](PagingSavedTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages of tracks |  -  |

<a name="removeFromLibrary"></a>
# **removeFromLibrary**
> removeFromLibrary(ids).requestBody(requestBody).execute();

Remove User&#39;s Saved Tracks 

Remove one or more tracks from the current user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";
    List<String> ids = Arrays.asList(); // A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example: `[\\\"4iV5W9uYEdYUVa79Axb7Rh\\\", \\\"1301WleyT98MSxVHPZCA6M\\\"]`<br/>A maximum of 50 items can be specified in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs listed here in the body will be ignored._ 
    try {
      client
              .tracks
              .removeFromLibrary(ids)
              .ids(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#removeFromLibrary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tracks
              .removeFromLibrary(ids)
              .ids(ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#removeFromLibrary");
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
| **200** | Track removed |  -  |

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
import com.konfigthis.client.api.TracksApi;
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
              .tracks
              .removeItems(tracks, playlistId)
              .snapshotId(snapshotId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSnapshotId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#removeItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlaylistsRemoveItemsResponse> response = client
              .tracks
              .removeItems(tracks, playlistId)
              .snapshotId(snapshotId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#removeItems");
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

<a name="saveForCurrentUser"></a>
# **saveForCurrentUser**
> saveForCurrentUser(ids).requestBody(requestBody).execute();

Save Tracks for Current User 

Save one or more tracks to the current user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TracksApi;
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
    String ids = "7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B";
    List<String> ids = Arrays.asList(); // A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example: `[\\\"4iV5W9uYEdYUVa79Axb7Rh\\\", \\\"1301WleyT98MSxVHPZCA6M\\\"]`<br/>A maximum of 50 items can be specified in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs listed here in the body will be ignored._ 
    try {
      client
              .tracks
              .saveForCurrentUser(ids)
              .ids(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#saveForCurrentUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tracks
              .saveForCurrentUser(ids)
              .ids(ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TracksApi#saveForCurrentUser");
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
| **200** | Track saved |  -  |

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
import com.konfigthis.client.api.TracksApi;
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
              .tracks
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
      System.err.println("Exception when calling TracksApi#updatePlaylistItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PlaylistsRemoveItemsResponse> response = client
              .tracks
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
      System.err.println("Exception when calling TracksApi#updatePlaylistItems");
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

