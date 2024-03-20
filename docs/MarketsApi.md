# MarketsApi

All URIs are relative to *https://api.spotify.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAvailable**](MarketsApi.md#listAvailable) | **GET** /markets | Get Available Markets  |


<a name="listAvailable"></a>
# **listAvailable**
> MarketsListAvailableResponse listAvailable().execute();

Get Available Markets 

Get the list of markets where Spotify is available. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Spotify;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MarketsApi;
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
      MarketsListAvailableResponse result = client
              .markets
              .listAvailable()
              .execute();
      System.out.println(result);
      System.out.println(result.getMarkets());
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketsApi#listAvailable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MarketsListAvailableResponse> response = client
              .markets
              .listAvailable()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketsApi#listAvailable");
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

[**MarketsListAvailableResponse**](MarketsListAvailableResponse.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A markets object with an array of country codes |  -  |

