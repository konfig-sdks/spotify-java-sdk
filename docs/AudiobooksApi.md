# AudiobooksApi

All URIs are relative to *https://api.spotify.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkUserSaved**](AudiobooksApi.md#checkUserSaved) | **GET** /me/audiobooks/contains | Check User&#39;s Saved Audiobooks  |
| [**getCatalogInfo**](AudiobooksApi.md#getCatalogInfo) | **GET** /audiobooks/{id} | Get an Audiobook  |
| [**getChaptersById**](AudiobooksApi.md#getChaptersById) | **GET** /audiobooks/{id}/chapters | Get Audiobook Chapters  |
| [**getSeveral**](AudiobooksApi.md#getSeveral) | **GET** /audiobooks | Get Several Audiobooks  |
| [**listSaved**](AudiobooksApi.md#listSaved) | **GET** /me/audiobooks | Get User&#39;s Saved Audiobooks  |
| [**removeFromLibrary**](AudiobooksApi.md#removeFromLibrary) | **DELETE** /me/audiobooks | Remove User&#39;s Saved Audiobooks  |
| [**saveCurrentUserLibrary**](AudiobooksApi.md#saveCurrentUserLibrary) | **PUT** /me/audiobooks | Save Audiobooks for Current User  |


<a name="checkUserSaved"></a>
# **checkUserSaved**
> List&lt;Boolean&gt; checkUserSaved(ids).execute();

Check User&#39;s Saved Audiobooks 

Check if one or more audiobooks are already saved in the current Spotify user&#39;s library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudiobooksApi;
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
    String ids = "18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe";
    try {
      List<Boolean> result = client
              .audiobooks
              .checkUserSaved(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#checkUserSaved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Boolean>> response = client
              .audiobooks
              .checkUserSaved(ids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#checkUserSaved");
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

<a name="getCatalogInfo"></a>
# **getCatalogInfo**
> AudiobookObject getCatalogInfo(id).market(market).execute();

Get an Audiobook 

Get Spotify catalog information for a single audiobook. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudiobooksApi;
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
    String id = "7iHfbu1YPACw6oZPAFJtqe";
    String market = "ES";
    try {
      AudiobookObject result = client
              .audiobooks
              .getCatalogInfo(id)
              .market(market)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAuthors());
      System.out.println(result.getAvailableMarkets());
      System.out.println(result.getCopyrights());
      System.out.println(result.getHtmlDescription());
      System.out.println(result.getEdition());
      System.out.println(result.getExplicit());
      System.out.println(result.getExternalUrls());
      System.out.println(result.getHref());
      System.out.println(result.getId());
      System.out.println(result.getImages());
      System.out.println(result.getLanguages());
      System.out.println(result.getMediaType());
      System.out.println(result.getName());
      System.out.println(result.getNarrators());
      System.out.println(result.getPublisher());
      System.out.println(result.getType());
      System.out.println(result.getUri());
      System.out.println(result.getTotalChapters());
      System.out.println(result.getChapters());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#getCatalogInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudiobookObject> response = client
              .audiobooks
              .getCatalogInfo(id)
              .market(market)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#getCatalogInfo");
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

[**AudiobookObject**](AudiobookObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An Audiobook |  -  |

<a name="getChaptersById"></a>
# **getChaptersById**
> PagingSimplifiedChapterObject getChaptersById(id).market(market).limit(limit).offset(offset).execute();

Get Audiobook Chapters 

Get Spotify catalog information about an audiobook&#39;s chapters. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudiobooksApi;
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
    String id = "7iHfbu1YPACw6oZPAFJtqe";
    String market = "ES";
    Integer limit = 20;
    Integer offset = 0;
    try {
      PagingSimplifiedChapterObject result = client
              .audiobooks
              .getChaptersById(id)
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
      System.err.println("Exception when calling AudiobooksApi#getChaptersById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingSimplifiedChapterObject> response = client
              .audiobooks
              .getChaptersById(id)
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
      System.err.println("Exception when calling AudiobooksApi#getChaptersById");
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

[**PagingSimplifiedChapterObject**](PagingSimplifiedChapterObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages of chapters |  -  |

<a name="getSeveral"></a>
# **getSeveral**
> AudiobooksGetSeveralResponse getSeveral(ids).market(market).execute();

Get Several Audiobooks 

Get Spotify catalog information for several audiobooks identified by their Spotify IDs. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudiobooksApi;
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
    String ids = "18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe";
    String market = "ES";
    try {
      AudiobooksGetSeveralResponse result = client
              .audiobooks
              .getSeveral(ids)
              .market(market)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudiobooks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#getSeveral");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudiobooksGetSeveralResponse> response = client
              .audiobooks
              .getSeveral(ids)
              .market(market)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#getSeveral");
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

[**AudiobooksGetSeveralResponse**](AudiobooksGetSeveralResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A set of audiobooks. If one of the requested audiobooks is unavailable then you&#39;ll find a &#x60;null&#x60; item in the &#x60;audiobooks&#x60; array where the audiobook object would otherwise be. |  -  |

<a name="listSaved"></a>
# **listSaved**
> PagingSimplifiedAudiobookObject listSaved().limit(limit).offset(offset).execute();

Get User&#39;s Saved Audiobooks 

Get a list of the audiobooks saved in the current Spotify user&#39;s &#39;Your Music&#39; library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudiobooksApi;
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
      PagingSimplifiedAudiobookObject result = client
              .audiobooks
              .listSaved()
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
      System.err.println("Exception when calling AudiobooksApi#listSaved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PagingSimplifiedAudiobookObject> response = client
              .audiobooks
              .listSaved()
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#listSaved");
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

[**PagingSimplifiedAudiobookObject**](PagingSimplifiedAudiobookObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pages of audiobooks |  -  |

<a name="removeFromLibrary"></a>
# **removeFromLibrary**
> removeFromLibrary(ids).execute();

Remove User&#39;s Saved Audiobooks 

Remove one or more audiobooks from the Spotify user&#39;s library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudiobooksApi;
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
    String ids = "18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe";
    try {
      client
              .audiobooks
              .removeFromLibrary(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#removeFromLibrary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .audiobooks
              .removeFromLibrary(ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#removeFromLibrary");
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

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audiobook(s) have been removed from the library |  -  |

<a name="saveCurrentUserLibrary"></a>
# **saveCurrentUserLibrary**
> saveCurrentUserLibrary(ids).execute();

Save Audiobooks for Current User 

Save one or more audiobooks to the current Spotify user&#39;s library. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudiobooksApi;
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
    String ids = "18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe";
    try {
      client
              .audiobooks
              .saveCurrentUserLibrary(ids)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#saveCurrentUserLibrary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .audiobooks
              .saveCurrentUserLibrary(ids)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudiobooksApi#saveCurrentUserLibrary");
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

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audiobook(s) are saved to the library |  -  |

