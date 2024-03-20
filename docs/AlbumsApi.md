# AlbumsApi

All URIs are relative to *https://api.spotify.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkSaved**](AlbumsApi.md#checkSaved) | **GET** /me/albums/contains | Check User&#39;s Saved Albums  |
| [**getAlbumsById**](AlbumsApi.md#getAlbumsById) | **GET** /artists/{id}/albums | Get Artist&#39;s Albums  |
| [**getInformation**](AlbumsApi.md#getInformation) | **GET** /albums/{id} | Get Album  |
| [**getNewReleases**](AlbumsApi.md#getNewReleases) | **GET** /browse/new-releases | Get New Releases  |
| [**getSaved**](AlbumsApi.md#getSaved) | **GET** /me/albums | Get User&#39;s Saved Albums  |
| [**getTracksById**](AlbumsApi.md#getTracksById) | **GET** /albums/{id}/tracks | Get Album Tracks  |
| [**listSeveral**](AlbumsApi.md#listSeveral) | **GET** /albums | Get Several Albums  |
| [**removeSaved**](AlbumsApi.md#removeSaved) | **DELETE** /me/albums | Remove Users&#39; Saved Albums  |
| [**saveCurrentUserLibrary**](AlbumsApi.md#saveCurrentUserLibrary) | **PUT** /me/albums | Save Albums for Current User  |


<a name="checkSaved"></a>
# **checkSaved**
> List&lt;Boolean&gt; checkSaved(ids).execute();

Check User&#39;s Saved Albums 

Check if one or more albums is already saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlbumsApi;
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
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc";
    try {
      List<Boolean> result = client
              .albums
              .checkSaved(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#checkSaved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Boolean>> response = client
              .albums
              .checkSaved(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#checkSaved");
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

<a name="getAlbumsById"></a>
# **getAlbumsById**
> PagingArtistDiscographyAlbumObject getAlbumsById(id).includeGroups(includeGroups).market(market).limit(limit).offset(offset).execute();

Get Artist&#39;s Albums 

Get Spotify catalog information about an artist&#39;s albums. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlbumsApi;
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
    String includeGroups = "single,appears_on";
    String market = "ES";
    Integer limit = 20;
    Integer offset = 0;
    try {
      PagingArtistDiscographyAlbumObject result = client
              .albums
              .getAlbumsById(id)
              .includeGroups(includeGroups)
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
      System.err.println("Exception when calling AlbumsApi#getAlbumsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingArtistDiscographyAlbumObject> response = client
              .albums
              .getAlbumsById(id)
              .includeGroups(includeGroups)
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
      System.err.println("Exception when calling AlbumsApi#getAlbumsById");
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
| **includeGroups** | **String**|  | [optional] |
| **market** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |

### Return type

[**PagingArtistDiscographyAlbumObject**](PagingArtistDiscographyAlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages of albums |  -  |

<a name="getInformation"></a>
# **getInformation**
> AlbumObject getInformation(id).market(market).execute();

Get Album 

Get Spotify catalog information for a single album. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlbumsApi;
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
    try {
      AlbumObject result = client
              .albums
              .getInformation(id)
              .market(market)
              .execute();
      System.out.println(result);
      System.out.println(result.getAlbumType());
      System.out.println(result.getTotalTracks());
      System.out.println(result.getAvailableMarkets());
      System.out.println(result.getExternalUrls());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getName());
      System.out.println(result.getReleaseDate());
      System.out.println(result.getReleaseDatePrecision());
      System.out.println(result.getRestrictions());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getArtists());
      System.out.println(result.getTracks());
      System.out.println(result.getCopyrights());
      System.out.println(result.getExternalIds());
      System.out.println(result.getGenres());
      System.out.println(result.getLabel());
      System.out.println(result.getPopularity());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AlbumObject> response = client
              .albums
              .getInformation(id)
              .market(market)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getInformation");
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

[**AlbumObject**](AlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An album |  -  |

<a name="getNewReleases"></a>
# **getNewReleases**
> AlbumsGetNewReleasesResponse getNewReleases().limit(limit).offset(offset).execute();

Get New Releases 

Get a list of new album releases featured in Spotify (shown, for example, on a Spotify player’s “Browse” tab). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlbumsApi;
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
      AlbumsGetNewReleasesResponse result = client
              .albums
              .getNewReleases()
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getAlbums());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getNewReleases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AlbumsGetNewReleasesResponse> response = client
              .albums
              .getNewReleases()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getNewReleases");
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

[**AlbumsGetNewReleasesResponse**](AlbumsGetNewReleasesResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged set of albums |  -  |

<a name="getSaved"></a>
# **getSaved**
> PagingSavedAlbumObject getSaved().limit(limit).offset(offset).market(market).execute();

Get User&#39;s Saved Albums 

Get a list of the albums saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlbumsApi;
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
    String market = "ES";
    try {
      PagingSavedAlbumObject result = client
              .albums
              .getSaved()
              .limit(limit)
              .offset(offset)
              .market(market)
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
      System.err.println("Exception when calling AlbumsApi#getSaved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingSavedAlbumObject> response = client
              .albums
              .getSaved()
              .limit(limit)
              .offset(offset)
              .market(market)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#getSaved");
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
| **market** | **String**|  | [optional] |

### Return type

[**PagingSavedAlbumObject**](PagingSavedAlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages of albums |  -  |

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
import com.konfigthis.client.api.AlbumsApi;
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
              .albums
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
      System.err.println("Exception when calling AlbumsApi#getTracksById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingSimplifiedTrackObject> response = client
              .albums
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
      System.err.println("Exception when calling AlbumsApi#getTracksById");
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

<a name="listSeveral"></a>
# **listSeveral**
> AlbumsListSeveralResponse listSeveral(ids).market(market).execute();

Get Several Albums 

Get Spotify catalog information for multiple albums identified by their Spotify IDs. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlbumsApi;
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
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc";
    String market = "ES";
    try {
      AlbumsListSeveralResponse result = client
              .albums
              .listSeveral(ids)
              .market(market)
              .execute();
      System.out.println(result);
      System.out.println(result.getAlbums());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#listSeveral");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AlbumsListSeveralResponse> response = client
              .albums
              .listSeveral(ids)
              .market(market)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#listSeveral");
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

[**AlbumsListSeveralResponse**](AlbumsListSeveralResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A set of albums |  -  |

<a name="removeSaved"></a>
# **removeSaved**
> removeSaved(ids).requestBody(requestBody).execute();

Remove Users&#39; Saved Albums 

Remove one or more albums from the current user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlbumsApi;
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
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc";
    List<String> ids = Arrays.asList(); // A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example: `[\\\"4iV5W9uYEdYUVa79Axb7Rh\\\", \\\"1301WleyT98MSxVHPZCA6M\\\"]`<br/>A maximum of 50 items can be specified in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs listed here in the body will be ignored._ 
    try {
      client
              .albums
              .removeSaved(ids)
              .ids(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#removeSaved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .albums
              .removeSaved(ids)
              .ids(ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#removeSaved");
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
| **200** | Album(s) have been removed from the library |  -  |

<a name="saveCurrentUserLibrary"></a>
# **saveCurrentUserLibrary**
> saveCurrentUserLibrary(ids).requestBody(requestBody).execute();

Save Albums for Current User 

Save one or more albums to the current user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlbumsApi;
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
    String ids = "382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc";
    List<String> ids = Arrays.asList(); // A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example: `[\\\"4iV5W9uYEdYUVa79Axb7Rh\\\", \\\"1301WleyT98MSxVHPZCA6M\\\"]`<br/>A maximum of 50 items can be specified in one request. _**Note**: if the `ids` parameter is present in the query string, any IDs listed here in the body will be ignored._ 
    try {
      client
              .albums
              .saveCurrentUserLibrary(ids)
              .ids(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#saveCurrentUserLibrary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .albums
              .saveCurrentUserLibrary(ids)
              .ids(ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AlbumsApi#saveCurrentUserLibrary");
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
| **200** | The album is saved |  -  |

