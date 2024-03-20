package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.spotify.com/v1";
        
        // Configure OAuth2 access token for authorization: oauth_2_0
        configuration.accessToken = "YOUR ACCESS TOKEN";
        Spotify client = new Spotify(configuration);
        assertNotNull(client);
    }
}
