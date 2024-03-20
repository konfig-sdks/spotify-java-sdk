# SearchApi

All URIs are relative to *https://api.spotify.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**spotifyCatalogInfo**](SearchApi.md#spotifyCatalogInfo) | **GET** /search | Search for Item  |


<a name="spotifyCatalogInfo"></a>
# **spotifyCatalogInfo**
> SearchSpotifyCatalogInfoResponse spotifyCatalogInfo(q, type).market(market).limit(limit).offset(offset).includeExternal(includeExternal).execute();

Search for Item 

Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or audiobooks that match a keyword string. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String q = "remaster%20track:Doxy%20artist:Miles%20Davis";
    List<String> type = Arrays.asList();
    String market = "ES";
    Integer limit = 20;
    Integer offset = 0;
    String includeExternal = "audio";
    try {
      SearchSpotifyCatalogInfoResponse result = client
              .search
              .spotifyCatalogInfo(q, type)
              .market(market)
              .limit(limit)
              .offset(offset)
              .includeExternal(includeExternal)
              .execute();
      System.out.println(result);
      System.out.println(result.getTracks());
      System.out.println(result.getArtists());
      System.out.println(result.getAlbums());
      System.out.println(result.getPlaylists());
      System.out.println(result.getShows());
      System.out.println(result.getEpisodes());
      System.out.println(result.getAudiobooks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#spotifyCatalogInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SearchSpotifyCatalogInfoResponse> response = client
              .search
              .spotifyCatalogInfo(q, type)
              .market(market)
              .limit(limit)
              .offset(offset)
              .includeExternal(includeExternal)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#spotifyCatalogInfo");
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
| **q** | **String**|  | |
| **type** | [**List&lt;String&gt;**](String.md)|  | [enum: album, artist, playlist, track, show, episode, audiobook] |
| **market** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **includeExternal** | **String**|  | [optional] [enum: audio] |

### Return type

[**SearchSpotifyCatalogInfoResponse**](SearchSpotifyCatalogInfoResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search response |  -  |

