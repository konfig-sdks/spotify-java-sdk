<div align="left">

[![Visit Spotify](./header.png)](https://developer.spotify.com)

# [Spotify](https://developer.spotify.com)

You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.

In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href="https://developer.spotify.com/documentation/general/guides/authorization-guide/">OAuth 2.0</a>.

The base URI for all Web API requests is `https://api.spotify.com/v1`.

Need help? See our <a href="https://developer.spotify.com/documentation/web-api/guides/">Web API guides</a> for more information, or visit the <a href="https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer">Spotify for Developers community forum</a> to ask questions and connect with other developers.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Spotify&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>spotify-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:spotify-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/spotify-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.spotify.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlbumsApi* | [**checkSaved**](docs/AlbumsApi.md#checkSaved) | **GET** /me/albums/contains | Check User&#39;s Saved Albums 
*AlbumsApi* | [**getAlbumsById**](docs/AlbumsApi.md#getAlbumsById) | **GET** /artists/{id}/albums | Get Artist&#39;s Albums 
*AlbumsApi* | [**getInformation**](docs/AlbumsApi.md#getInformation) | **GET** /albums/{id} | Get Album 
*AlbumsApi* | [**getNewReleases**](docs/AlbumsApi.md#getNewReleases) | **GET** /browse/new-releases | Get New Releases 
*AlbumsApi* | [**getSaved**](docs/AlbumsApi.md#getSaved) | **GET** /me/albums | Get User&#39;s Saved Albums 
*AlbumsApi* | [**getTracksById**](docs/AlbumsApi.md#getTracksById) | **GET** /albums/{id}/tracks | Get Album Tracks 
*AlbumsApi* | [**listSeveral**](docs/AlbumsApi.md#listSeveral) | **GET** /albums | Get Several Albums 
*AlbumsApi* | [**removeSaved**](docs/AlbumsApi.md#removeSaved) | **DELETE** /me/albums | Remove Users&#39; Saved Albums 
*AlbumsApi* | [**saveCurrentUserLibrary**](docs/AlbumsApi.md#saveCurrentUserLibrary) | **PUT** /me/albums | Save Albums for Current User 
*ArtistsApi* | [**checkFollowingArtistsUsers**](docs/ArtistsApi.md#checkFollowingArtistsUsers) | **GET** /me/following/contains | Check If User Follows Artists or Users 
*ArtistsApi* | [**followArtistsOrUsers**](docs/ArtistsApi.md#followArtistsOrUsers) | **PUT** /me/following | Follow Artists or Users 
*ArtistsApi* | [**getAlbumsById**](docs/ArtistsApi.md#getAlbumsById) | **GET** /artists/{id}/albums | Get Artist&#39;s Albums 
*ArtistsApi* | [**getCatalogInfo**](docs/ArtistsApi.md#getCatalogInfo) | **GET** /artists/{id} | Get Artist 
*ArtistsApi* | [**getCatalogInfo_0**](docs/ArtistsApi.md#getCatalogInfo_0) | **GET** /artists | Get Several Artists 
*ArtistsApi* | [**getFollowedArtists**](docs/ArtistsApi.md#getFollowedArtists) | **GET** /me/following | Get Followed Artists 
*ArtistsApi* | [**getRelatedArtists**](docs/ArtistsApi.md#getRelatedArtists) | **GET** /artists/{id}/related-artists | Get Artist&#39;s Related Artists 
*ArtistsApi* | [**getTopTracks**](docs/ArtistsApi.md#getTopTracks) | **GET** /artists/{id}/top-tracks | Get Artist&#39;s Top Tracks 
*ArtistsApi* | [**unfollowArtistsUsers**](docs/ArtistsApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users 
*AudiobooksApi* | [**checkUserSaved**](docs/AudiobooksApi.md#checkUserSaved) | **GET** /me/audiobooks/contains | Check User&#39;s Saved Audiobooks 
*AudiobooksApi* | [**getCatalogInfo**](docs/AudiobooksApi.md#getCatalogInfo) | **GET** /audiobooks/{id} | Get an Audiobook 
*AudiobooksApi* | [**getChaptersById**](docs/AudiobooksApi.md#getChaptersById) | **GET** /audiobooks/{id}/chapters | Get Audiobook Chapters 
*AudiobooksApi* | [**getSeveral**](docs/AudiobooksApi.md#getSeveral) | **GET** /audiobooks | Get Several Audiobooks 
*AudiobooksApi* | [**listSaved**](docs/AudiobooksApi.md#listSaved) | **GET** /me/audiobooks | Get User&#39;s Saved Audiobooks 
*AudiobooksApi* | [**removeFromLibrary**](docs/AudiobooksApi.md#removeFromLibrary) | **DELETE** /me/audiobooks | Remove User&#39;s Saved Audiobooks 
*AudiobooksApi* | [**saveCurrentUserLibrary**](docs/AudiobooksApi.md#saveCurrentUserLibrary) | **PUT** /me/audiobooks | Save Audiobooks for Current User 
*CategoriesApi* | [**getCategoryPlaylists**](docs/CategoriesApi.md#getCategoryPlaylists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#39;s Playlists 
*CategoriesApi* | [**getSingle**](docs/CategoriesApi.md#getSingle) | **GET** /browse/categories/{category_id} | Get Single Browse Category 
*CategoriesApi* | [**listSeveral**](docs/CategoriesApi.md#listSeveral) | **GET** /browse/categories | Get Several Browse Categories 
*ChaptersApi* | [**getChapterInfo**](docs/ChaptersApi.md#getChapterInfo) | **GET** /chapters/{id} | Get a Chapter 
*ChaptersApi* | [**getChaptersById**](docs/ChaptersApi.md#getChaptersById) | **GET** /audiobooks/{id}/chapters | Get Audiobook Chapters 
*ChaptersApi* | [**getMultipleByIds**](docs/ChaptersApi.md#getMultipleByIds) | **GET** /chapters | Get Several Chapters 
*EpisodesApi* | [**checkSavedEpisodes**](docs/EpisodesApi.md#checkSavedEpisodes) | **GET** /me/episodes/contains | Check User&#39;s Saved Episodes 
*EpisodesApi* | [**getEpisodesById**](docs/EpisodesApi.md#getEpisodesById) | **GET** /shows/{id}/episodes | Get Show Episodes 
*EpisodesApi* | [**getSeveral**](docs/EpisodesApi.md#getSeveral) | **GET** /episodes | Get Several Episodes 
*EpisodesApi* | [**getSingleById**](docs/EpisodesApi.md#getSingleById) | **GET** /episodes/{id} | Get Episode 
*EpisodesApi* | [**getUserSavedEpisodes**](docs/EpisodesApi.md#getUserSavedEpisodes) | **GET** /me/episodes | Get User&#39;s Saved Episodes 
*EpisodesApi* | [**removeFromLibrary**](docs/EpisodesApi.md#removeFromLibrary) | **DELETE** /me/episodes | Remove User&#39;s Saved Episodes 
*EpisodesApi* | [**saveCurrentUserLibrary**](docs/EpisodesApi.md#saveCurrentUserLibrary) | **PUT** /me/episodes | Save Episodes for Current User 
*GenresApi* | [**getAvailableSeeds**](docs/GenresApi.md#getAvailableSeeds) | **GET** /recommendations/available-genre-seeds | Get Available Genre Seeds 
*LibraryApi* | [**checkFollowingArtistsUsers**](docs/LibraryApi.md#checkFollowingArtistsUsers) | **GET** /me/following/contains | Check If User Follows Artists or Users 
*LibraryApi* | [**checkSaved**](docs/LibraryApi.md#checkSaved) | **GET** /me/albums/contains | Check User&#39;s Saved Albums 
*LibraryApi* | [**checkSavedEpisodes**](docs/LibraryApi.md#checkSavedEpisodes) | **GET** /me/episodes/contains | Check User&#39;s Saved Episodes 
*LibraryApi* | [**checkSavedShows**](docs/LibraryApi.md#checkSavedShows) | **GET** /me/shows/contains | Check User&#39;s Saved Shows 
*LibraryApi* | [**checkSaved_0**](docs/LibraryApi.md#checkSaved_0) | **GET** /me/tracks/contains | Check User&#39;s Saved Tracks 
*LibraryApi* | [**checkUserSaved**](docs/LibraryApi.md#checkUserSaved) | **GET** /me/audiobooks/contains | Check User&#39;s Saved Audiobooks 
*LibraryApi* | [**createPlaylist**](docs/LibraryApi.md#createPlaylist) | **POST** /users/{user_id}/playlists | Create Playlist 
*LibraryApi* | [**followArtistsOrUsers**](docs/LibraryApi.md#followArtistsOrUsers) | **PUT** /me/following | Follow Artists or Users 
*LibraryApi* | [**getFollowedArtists**](docs/LibraryApi.md#getFollowedArtists) | **GET** /me/following | Get Followed Artists 
*LibraryApi* | [**getSaved**](docs/LibraryApi.md#getSaved) | **GET** /me/albums | Get User&#39;s Saved Albums 
*LibraryApi* | [**getTopItems**](docs/LibraryApi.md#getTopItems) | **GET** /me/top/{type} | Get User&#39;s Top Items 
*LibraryApi* | [**getUserPlaylists**](docs/LibraryApi.md#getUserPlaylists) | **GET** /me/playlists | Get Current User&#39;s Playlists 
*LibraryApi* | [**getUserSaved**](docs/LibraryApi.md#getUserSaved) | **GET** /me/tracks | Get User&#39;s Saved Tracks 
*LibraryApi* | [**getUserSavedEpisodes**](docs/LibraryApi.md#getUserSavedEpisodes) | **GET** /me/episodes | Get User&#39;s Saved Episodes 
*LibraryApi* | [**getUserSavedShows**](docs/LibraryApi.md#getUserSavedShows) | **GET** /me/shows | Get User&#39;s Saved Shows 
*LibraryApi* | [**listSaved**](docs/LibraryApi.md#listSaved) | **GET** /me/audiobooks | Get User&#39;s Saved Audiobooks 
*LibraryApi* | [**removeFromLibrary**](docs/LibraryApi.md#removeFromLibrary) | **DELETE** /me/audiobooks | Remove User&#39;s Saved Audiobooks 
*LibraryApi* | [**removeFromLibrary_0**](docs/LibraryApi.md#removeFromLibrary_0) | **DELETE** /me/tracks | Remove User&#39;s Saved Tracks 
*LibraryApi* | [**removeFromLibrary_1**](docs/LibraryApi.md#removeFromLibrary_1) | **DELETE** /me/episodes | Remove User&#39;s Saved Episodes 
*LibraryApi* | [**removeSaved**](docs/LibraryApi.md#removeSaved) | **DELETE** /me/albums | Remove Users&#39; Saved Albums 
*LibraryApi* | [**removeUserLibrary**](docs/LibraryApi.md#removeUserLibrary) | **DELETE** /me/shows | Remove User&#39;s Saved Shows 
*LibraryApi* | [**saveCurrentUserLibrary**](docs/LibraryApi.md#saveCurrentUserLibrary) | **PUT** /me/audiobooks | Save Audiobooks for Current User 
*LibraryApi* | [**saveCurrentUserLibrary_0**](docs/LibraryApi.md#saveCurrentUserLibrary_0) | **PUT** /me/albums | Save Albums for Current User 
*LibraryApi* | [**saveCurrentUserLibrary_1**](docs/LibraryApi.md#saveCurrentUserLibrary_1) | **PUT** /me/episodes | Save Episodes for Current User 
*LibraryApi* | [**saveCurrentUserLibrary_2**](docs/LibraryApi.md#saveCurrentUserLibrary_2) | **PUT** /me/shows | Save Shows for Current User 
*LibraryApi* | [**saveForCurrentUser**](docs/LibraryApi.md#saveForCurrentUser) | **PUT** /me/tracks | Save Tracks for Current User 
*LibraryApi* | [**unfollowArtistsUsers**](docs/LibraryApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users 
*LibraryApi* | [**updateDetails**](docs/LibraryApi.md#updateDetails) | **PUT** /playlists/{playlist_id} | Change Playlist Details 
*MarketsApi* | [**listAvailable**](docs/MarketsApi.md#listAvailable) | **GET** /markets | Get Available Markets 
*PlayerApi* | [**addItemToQueue**](docs/PlayerApi.md#addItemToQueue) | **POST** /me/player/queue | Add Item to Playback Queue 
*PlayerApi* | [**getAvailableDevices**](docs/PlayerApi.md#getAvailableDevices) | **GET** /me/player/devices | Get Available Devices 
*PlayerApi* | [**getCurrentPlaybackState**](docs/PlayerApi.md#getCurrentPlaybackState) | **GET** /me/player | Get Playback State 
*PlayerApi* | [**getCurrentlyPlayingTrack**](docs/PlayerApi.md#getCurrentlyPlayingTrack) | **GET** /me/player/currently-playing | Get Currently Playing Track 
*PlayerApi* | [**getRecentlyPlayedTracks**](docs/PlayerApi.md#getRecentlyPlayedTracks) | **GET** /me/player/recently-played | Get Recently Played Tracks 
*PlayerApi* | [**getUserQueue**](docs/PlayerApi.md#getUserQueue) | **GET** /me/player/queue | Get the User&#39;s Queue 
*PlayerApi* | [**pausePlayback**](docs/PlayerApi.md#pausePlayback) | **PUT** /me/player/pause | Pause Playback 
*PlayerApi* | [**seekToPosition**](docs/PlayerApi.md#seekToPosition) | **PUT** /me/player/seek | Seek To Position 
*PlayerApi* | [**setPlaybackVolume**](docs/PlayerApi.md#setPlaybackVolume) | **PUT** /me/player/volume | Set Playback Volume 
*PlayerApi* | [**setRepeatMode**](docs/PlayerApi.md#setRepeatMode) | **PUT** /me/player/repeat | Set Repeat Mode 
*PlayerApi* | [**skipToNextTrack**](docs/PlayerApi.md#skipToNextTrack) | **POST** /me/player/next | Skip To Next 
*PlayerApi* | [**skipToPreviousTrack**](docs/PlayerApi.md#skipToPreviousTrack) | **POST** /me/player/previous | Skip To Previous 
*PlayerApi* | [**startPlayback**](docs/PlayerApi.md#startPlayback) | **PUT** /me/player/play | Start/Resume Playback 
*PlayerApi* | [**togglePlaybackShuffle**](docs/PlayerApi.md#togglePlaybackShuffle) | **PUT** /me/player/shuffle | Toggle Playback Shuffle 
*PlayerApi* | [**transferPlaybackToNewDevice**](docs/PlayerApi.md#transferPlaybackToNewDevice) | **PUT** /me/player | Transfer Playback 
*PlaylistsApi* | [**addItems**](docs/PlaylistsApi.md#addItems) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist 
*PlaylistsApi* | [**checkIfFollowsPlaylist**](docs/PlaylistsApi.md#checkIfFollowsPlaylist) | **GET** /playlists/{playlist_id}/followers/contains | Check if Users Follow Playlist 
*PlaylistsApi* | [**createPlaylist**](docs/PlaylistsApi.md#createPlaylist) | **POST** /users/{user_id}/playlists | Create Playlist 
*PlaylistsApi* | [**followPlaylist**](docs/PlaylistsApi.md#followPlaylist) | **PUT** /playlists/{playlist_id}/followers | Follow Playlist 
*PlaylistsApi* | [**getCategoryPlaylists**](docs/PlaylistsApi.md#getCategoryPlaylists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#39;s Playlists 
*PlaylistsApi* | [**getCoverImage**](docs/PlaylistsApi.md#getCoverImage) | **GET** /playlists/{playlist_id}/images | Get Playlist Cover Image 
*PlaylistsApi* | [**getFeatured**](docs/PlaylistsApi.md#getFeatured) | **GET** /browse/featured-playlists | Get Featured Playlists 
*PlaylistsApi* | [**getPlaylistById**](docs/PlaylistsApi.md#getPlaylistById) | **GET** /playlists/{playlist_id} | Get Playlist 
*PlaylistsApi* | [**getPlaylistItems**](docs/PlaylistsApi.md#getPlaylistItems) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items 
*PlaylistsApi* | [**getUserPlaylists**](docs/PlaylistsApi.md#getUserPlaylists) | **GET** /me/playlists | Get Current User&#39;s Playlists 
*PlaylistsApi* | [**getUserPlaylists_0**](docs/PlaylistsApi.md#getUserPlaylists_0) | **GET** /users/{user_id}/playlists | Get User&#39;s Playlists 
*PlaylistsApi* | [**removeItems**](docs/PlaylistsApi.md#removeItems) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items 
*PlaylistsApi* | [**replaceCoverImage**](docs/PlaylistsApi.md#replaceCoverImage) | **PUT** /playlists/{playlist_id}/images | Add Custom Playlist Cover Image 
*PlaylistsApi* | [**unfollowPlaylist**](docs/PlaylistsApi.md#unfollowPlaylist) | **DELETE** /playlists/{playlist_id}/followers | Unfollow Playlist 
*PlaylistsApi* | [**updateDetails**](docs/PlaylistsApi.md#updateDetails) | **PUT** /playlists/{playlist_id} | Change Playlist Details 
*PlaylistsApi* | [**updatePlaylistItems**](docs/PlaylistsApi.md#updatePlaylistItems) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items 
*SearchApi* | [**spotifyCatalogInfo**](docs/SearchApi.md#spotifyCatalogInfo) | **GET** /search | Search for Item 
*ShowsApi* | [**checkSavedShows**](docs/ShowsApi.md#checkSavedShows) | **GET** /me/shows/contains | Check User&#39;s Saved Shows 
*ShowsApi* | [**getEpisodesById**](docs/ShowsApi.md#getEpisodesById) | **GET** /shows/{id}/episodes | Get Show Episodes 
*ShowsApi* | [**getInformation**](docs/ShowsApi.md#getInformation) | **GET** /shows/{id} | Get Show 
*ShowsApi* | [**getMultipleShowsInfo**](docs/ShowsApi.md#getMultipleShowsInfo) | **GET** /shows | Get Several Shows 
*ShowsApi* | [**getUserSavedShows**](docs/ShowsApi.md#getUserSavedShows) | **GET** /me/shows | Get User&#39;s Saved Shows 
*ShowsApi* | [**removeUserLibrary**](docs/ShowsApi.md#removeUserLibrary) | **DELETE** /me/shows | Remove User&#39;s Saved Shows 
*ShowsApi* | [**saveCurrentUserLibrary**](docs/ShowsApi.md#saveCurrentUserLibrary) | **PUT** /me/shows | Save Shows for Current User 
*TracksApi* | [**addItems**](docs/TracksApi.md#addItems) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist 
*TracksApi* | [**checkSaved**](docs/TracksApi.md#checkSaved) | **GET** /me/tracks/contains | Check User&#39;s Saved Tracks 
*TracksApi* | [**getAudioAnalysis**](docs/TracksApi.md#getAudioAnalysis) | **GET** /audio-analysis/{id} | Get Track&#39;s Audio Analysis 
*TracksApi* | [**getAudioFeaturesById**](docs/TracksApi.md#getAudioFeaturesById) | **GET** /audio-features/{id} | Get Track&#39;s Audio Features 
*TracksApi* | [**getBySpotifyId**](docs/TracksApi.md#getBySpotifyId) | **GET** /tracks/{id} | Get Track 
*TracksApi* | [**getMultipleAudioFeatures**](docs/TracksApi.md#getMultipleAudioFeatures) | **GET** /audio-features | Get Several Tracks&#39; Audio Features 
*TracksApi* | [**getMultipleByIds**](docs/TracksApi.md#getMultipleByIds) | **GET** /tracks | Get Several Tracks 
*TracksApi* | [**getPlaylistItems**](docs/TracksApi.md#getPlaylistItems) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items 
*TracksApi* | [**getRecommendations**](docs/TracksApi.md#getRecommendations) | **GET** /recommendations | Get Recommendations 
*TracksApi* | [**getTopItems**](docs/TracksApi.md#getTopItems) | **GET** /me/top/{type} | Get User&#39;s Top Items 
*TracksApi* | [**getTopTracks**](docs/TracksApi.md#getTopTracks) | **GET** /artists/{id}/top-tracks | Get Artist&#39;s Top Tracks 
*TracksApi* | [**getTracksById**](docs/TracksApi.md#getTracksById) | **GET** /albums/{id}/tracks | Get Album Tracks 
*TracksApi* | [**getUserSaved**](docs/TracksApi.md#getUserSaved) | **GET** /me/tracks | Get User&#39;s Saved Tracks 
*TracksApi* | [**removeFromLibrary**](docs/TracksApi.md#removeFromLibrary) | **DELETE** /me/tracks | Remove User&#39;s Saved Tracks 
*TracksApi* | [**removeItems**](docs/TracksApi.md#removeItems) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items 
*TracksApi* | [**saveForCurrentUser**](docs/TracksApi.md#saveForCurrentUser) | **PUT** /me/tracks | Save Tracks for Current User 
*TracksApi* | [**updatePlaylistItems**](docs/TracksApi.md#updatePlaylistItems) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items 
*UsersApi* | [**checkFollowingArtistsUsers**](docs/UsersApi.md#checkFollowingArtistsUsers) | **GET** /me/following/contains | Check If User Follows Artists or Users 
*UsersApi* | [**checkIfFollowsPlaylist**](docs/UsersApi.md#checkIfFollowsPlaylist) | **GET** /playlists/{playlist_id}/followers/contains | Check if Users Follow Playlist 
*UsersApi* | [**followArtistsOrUsers**](docs/UsersApi.md#followArtistsOrUsers) | **PUT** /me/following | Follow Artists or Users 
*UsersApi* | [**followPlaylist**](docs/UsersApi.md#followPlaylist) | **PUT** /playlists/{playlist_id}/followers | Follow Playlist 
*UsersApi* | [**getCurrentUserProfile**](docs/UsersApi.md#getCurrentUserProfile) | **GET** /me | Get Current User&#39;s Profile 
*UsersApi* | [**getFollowedArtists**](docs/UsersApi.md#getFollowedArtists) | **GET** /me/following | Get Followed Artists 
*UsersApi* | [**getTopItems**](docs/UsersApi.md#getTopItems) | **GET** /me/top/{type} | Get User&#39;s Top Items 
*UsersApi* | [**getUserPlaylists**](docs/UsersApi.md#getUserPlaylists) | **GET** /users/{user_id}/playlists | Get User&#39;s Playlists 
*UsersApi* | [**getUserProfile**](docs/UsersApi.md#getUserProfile) | **GET** /users/{user_id} | Get User&#39;s Profile 
*UsersApi* | [**unfollowArtistsUsers**](docs/UsersApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users 
*UsersApi* | [**unfollowPlaylist**](docs/UsersApi.md#unfollowPlaylist) | **DELETE** /playlists/{playlist_id}/followers | Unfollow Playlist 


## Documentation for Models

 - [AlbumBase](docs/AlbumBase.md)
 - [AlbumObject](docs/AlbumObject.md)
 - [AlbumObjectAllOf](docs/AlbumObjectAllOf.md)
 - [AlbumRestrictionObject](docs/AlbumRestrictionObject.md)
 - [AlbumsGetNewReleasesResponse](docs/AlbumsGetNewReleasesResponse.md)
 - [AlbumsListSeveralResponse](docs/AlbumsListSeveralResponse.md)
 - [AlbumsRemoveSavedRequest](docs/AlbumsRemoveSavedRequest.md)
 - [AlbumsSaveCurrentUserLibraryRequest](docs/AlbumsSaveCurrentUserLibraryRequest.md)
 - [ArtistDiscographyAlbumObject](docs/ArtistDiscographyAlbumObject.md)
 - [ArtistDiscographyAlbumObjectAllOf](docs/ArtistDiscographyAlbumObjectAllOf.md)
 - [ArtistObject](docs/ArtistObject.md)
 - [ArtistsGetCatalogInfoResponse](docs/ArtistsGetCatalogInfoResponse.md)
 - [ArtistsGetTopTracksResponse](docs/ArtistsGetTopTracksResponse.md)
 - [AudioAnalysisObject](docs/AudioAnalysisObject.md)
 - [AudioAnalysisObjectMeta](docs/AudioAnalysisObjectMeta.md)
 - [AudioAnalysisObjectTrack](docs/AudioAnalysisObjectTrack.md)
 - [AudioFeaturesObject](docs/AudioFeaturesObject.md)
 - [AudiobookBase](docs/AudiobookBase.md)
 - [AudiobookObject](docs/AudiobookObject.md)
 - [AudiobookObjectAllOf](docs/AudiobookObjectAllOf.md)
 - [AudiobooksGetSeveralResponse](docs/AudiobooksGetSeveralResponse.md)
 - [AuthorObject](docs/AuthorObject.md)
 - [CategoriesListSeveralResponse](docs/CategoriesListSeveralResponse.md)
 - [CategoriesListSeveralResponseCategories](docs/CategoriesListSeveralResponseCategories.md)
 - [CategoriesListSeveralResponseCategoriesAllOf](docs/CategoriesListSeveralResponseCategoriesAllOf.md)
 - [CategoryObject](docs/CategoryObject.md)
 - [ChapterBase](docs/ChapterBase.md)
 - [ChapterObject](docs/ChapterObject.md)
 - [ChapterObjectAllOf](docs/ChapterObjectAllOf.md)
 - [ChapterRestrictionObject](docs/ChapterRestrictionObject.md)
 - [ChaptersGetMultipleByIdsResponse](docs/ChaptersGetMultipleByIdsResponse.md)
 - [ContextObject](docs/ContextObject.md)
 - [CopyrightObject](docs/CopyrightObject.md)
 - [CurrentlyPlayingContextObject](docs/CurrentlyPlayingContextObject.md)
 - [CursorObject](docs/CursorObject.md)
 - [CursorPagingObject](docs/CursorPagingObject.md)
 - [CursorPagingPlayHistoryObject](docs/CursorPagingPlayHistoryObject.md)
 - [CursorPagingPlayHistoryObjectAllOf](docs/CursorPagingPlayHistoryObjectAllOf.md)
 - [CursorPagingSimplifiedArtistObject](docs/CursorPagingSimplifiedArtistObject.md)
 - [CursorPagingSimplifiedArtistObjectAllOf](docs/CursorPagingSimplifiedArtistObjectAllOf.md)
 - [DeviceObject](docs/DeviceObject.md)
 - [DisallowsObject](docs/DisallowsObject.md)
 - [EpisodeBase](docs/EpisodeBase.md)
 - [EpisodeObject](docs/EpisodeObject.md)
 - [EpisodeObjectAllOf](docs/EpisodeObjectAllOf.md)
 - [EpisodeRestrictionObject](docs/EpisodeRestrictionObject.md)
 - [EpisodesGetSeveralResponse](docs/EpisodesGetSeveralResponse.md)
 - [EpisodesRemoveFromLibraryRequest](docs/EpisodesRemoveFromLibraryRequest.md)
 - [EpisodesSaveCurrentUserLibraryRequest](docs/EpisodesSaveCurrentUserLibraryRequest.md)
 - [ErrorObject](docs/ErrorObject.md)
 - [ExplicitContentSettingsObject](docs/ExplicitContentSettingsObject.md)
 - [ExternalIdObject](docs/ExternalIdObject.md)
 - [ExternalUrlObject](docs/ExternalUrlObject.md)
 - [FollowersObject](docs/FollowersObject.md)
 - [GenresGetAvailableSeedsResponse](docs/GenresGetAvailableSeedsResponse.md)
 - [ImageObject](docs/ImageObject.md)
 - [LinkedTrackObject](docs/LinkedTrackObject.md)
 - [MarketsListAvailableResponse](docs/MarketsListAvailableResponse.md)
 - [NarratorObject](docs/NarratorObject.md)
 - [PagingArtistDiscographyAlbumObject](docs/PagingArtistDiscographyAlbumObject.md)
 - [PagingArtistDiscographyAlbumObjectAllOf](docs/PagingArtistDiscographyAlbumObjectAllOf.md)
 - [PagingArtistObject](docs/PagingArtistObject.md)
 - [PagingFeaturedPlaylistObject](docs/PagingFeaturedPlaylistObject.md)
 - [PagingObject](docs/PagingObject.md)
 - [PagingPlaylistObject](docs/PagingPlaylistObject.md)
 - [PagingPlaylistObjectAllOf](docs/PagingPlaylistObjectAllOf.md)
 - [PagingPlaylistTrackObject](docs/PagingPlaylistTrackObject.md)
 - [PagingPlaylistTrackObjectAllOf](docs/PagingPlaylistTrackObjectAllOf.md)
 - [PagingSavedAlbumObject](docs/PagingSavedAlbumObject.md)
 - [PagingSavedAlbumObjectAllOf](docs/PagingSavedAlbumObjectAllOf.md)
 - [PagingSavedEpisodeObject](docs/PagingSavedEpisodeObject.md)
 - [PagingSavedEpisodeObjectAllOf](docs/PagingSavedEpisodeObjectAllOf.md)
 - [PagingSavedShowObject](docs/PagingSavedShowObject.md)
 - [PagingSavedShowObjectAllOf](docs/PagingSavedShowObjectAllOf.md)
 - [PagingSavedTrackObject](docs/PagingSavedTrackObject.md)
 - [PagingSavedTrackObjectAllOf](docs/PagingSavedTrackObjectAllOf.md)
 - [PagingSimplifiedAlbumObject](docs/PagingSimplifiedAlbumObject.md)
 - [PagingSimplifiedAlbumObjectAllOf](docs/PagingSimplifiedAlbumObjectAllOf.md)
 - [PagingSimplifiedAudiobookObject](docs/PagingSimplifiedAudiobookObject.md)
 - [PagingSimplifiedAudiobookObjectAllOf](docs/PagingSimplifiedAudiobookObjectAllOf.md)
 - [PagingSimplifiedChapterObject](docs/PagingSimplifiedChapterObject.md)
 - [PagingSimplifiedChapterObjectAllOf](docs/PagingSimplifiedChapterObjectAllOf.md)
 - [PagingSimplifiedEpisodeObject](docs/PagingSimplifiedEpisodeObject.md)
 - [PagingSimplifiedEpisodeObjectAllOf](docs/PagingSimplifiedEpisodeObjectAllOf.md)
 - [PagingSimplifiedShowObject](docs/PagingSimplifiedShowObject.md)
 - [PagingSimplifiedShowObjectAllOf](docs/PagingSimplifiedShowObjectAllOf.md)
 - [PagingSimplifiedTrackObject](docs/PagingSimplifiedTrackObject.md)
 - [PagingSimplifiedTrackObjectAllOf](docs/PagingSimplifiedTrackObjectAllOf.md)
 - [PagingTrackObject](docs/PagingTrackObject.md)
 - [PagingTrackObjectAllOf](docs/PagingTrackObjectAllOf.md)
 - [PlayHistoryObject](docs/PlayHistoryObject.md)
 - [PlayerGetAvailableDevicesResponse](docs/PlayerGetAvailableDevicesResponse.md)
 - [PlayerStartPlaybackRequest](docs/PlayerStartPlaybackRequest.md)
 - [PlayerTransferPlaybackToNewDeviceRequest](docs/PlayerTransferPlaybackToNewDeviceRequest.md)
 - [PlaylistObject](docs/PlaylistObject.md)
 - [PlaylistOwnerObject](docs/PlaylistOwnerObject.md)
 - [PlaylistOwnerObjectAllOf](docs/PlaylistOwnerObjectAllOf.md)
 - [PlaylistTrackObject](docs/PlaylistTrackObject.md)
 - [PlaylistTracksRefObject](docs/PlaylistTracksRefObject.md)
 - [PlaylistUserObject](docs/PlaylistUserObject.md)
 - [PlaylistsAddItemsRequest](docs/PlaylistsAddItemsRequest.md)
 - [PlaylistsCreatePlaylistRequest](docs/PlaylistsCreatePlaylistRequest.md)
 - [PlaylistsRemoveItemsRequest](docs/PlaylistsRemoveItemsRequest.md)
 - [PlaylistsRemoveItemsRequestTracksInner](docs/PlaylistsRemoveItemsRequestTracksInner.md)
 - [PlaylistsRemoveItemsResponse](docs/PlaylistsRemoveItemsResponse.md)
 - [PlaylistsUpdateDetailsRequest](docs/PlaylistsUpdateDetailsRequest.md)
 - [PlaylistsUpdatePlaylistItemsRequest](docs/PlaylistsUpdatePlaylistItemsRequest.md)
 - [PrivateUserObject](docs/PrivateUserObject.md)
 - [PublicUserObject](docs/PublicUserObject.md)
 - [QueueObject](docs/QueueObject.md)
 - [RecommendationSeedObject](docs/RecommendationSeedObject.md)
 - [RecommendationsObject](docs/RecommendationsObject.md)
 - [ResumePointObject](docs/ResumePointObject.md)
 - [SavedAlbumObject](docs/SavedAlbumObject.md)
 - [SavedEpisodeObject](docs/SavedEpisodeObject.md)
 - [SavedShowObject](docs/SavedShowObject.md)
 - [SavedTrackObject](docs/SavedTrackObject.md)
 - [SearchSpotifyCatalogInfoResponse](docs/SearchSpotifyCatalogInfoResponse.md)
 - [SectionObject](docs/SectionObject.md)
 - [SegmentObject](docs/SegmentObject.md)
 - [ShowBase](docs/ShowBase.md)
 - [ShowObject](docs/ShowObject.md)
 - [ShowObjectAllOf](docs/ShowObjectAllOf.md)
 - [ShowsGetMultipleShowsInfoResponse](docs/ShowsGetMultipleShowsInfoResponse.md)
 - [SimplifiedAlbumObject](docs/SimplifiedAlbumObject.md)
 - [SimplifiedAlbumObjectAllOf](docs/SimplifiedAlbumObjectAllOf.md)
 - [SimplifiedArtistObject](docs/SimplifiedArtistObject.md)
 - [SimplifiedAudiobookObject](docs/SimplifiedAudiobookObject.md)
 - [SimplifiedChapterObject](docs/SimplifiedChapterObject.md)
 - [SimplifiedEpisodeObject](docs/SimplifiedEpisodeObject.md)
 - [SimplifiedPlaylistObject](docs/SimplifiedPlaylistObject.md)
 - [SimplifiedShowObject](docs/SimplifiedShowObject.md)
 - [SimplifiedTrackObject](docs/SimplifiedTrackObject.md)
 - [TimeIntervalObject](docs/TimeIntervalObject.md)
 - [TrackObject](docs/TrackObject.md)
 - [TrackRestrictionObject](docs/TrackRestrictionObject.md)
 - [TracksGetMultipleAudioFeaturesResponse](docs/TracksGetMultipleAudioFeaturesResponse.md)
 - [TracksRemoveFromLibraryRequest](docs/TracksRemoveFromLibraryRequest.md)
 - [TracksSaveForCurrentUserRequest](docs/TracksSaveForCurrentUserRequest.md)
 - [UsersFollowArtistsOrUsersRequest](docs/UsersFollowArtistsOrUsersRequest.md)
 - [UsersFollowPlaylistRequest](docs/UsersFollowPlaylistRequest.md)
 - [UsersGetFollowedArtistsResponse](docs/UsersGetFollowedArtistsResponse.md)
 - [UsersGetTopItemsResponse](docs/UsersGetTopItemsResponse.md)
 - [UsersGetTopItemsResponseAllOf](docs/UsersGetTopItemsResponseAllOf.md)
 - [UsersUnfollowArtistsUsersRequest](docs/UsersUnfollowArtistsUsersRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
