/*
 * Spotify Web API
 * You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ImageObject;
import com.konfigthis.client.model.PagingFeaturedPlaylistObject;
import com.konfigthis.client.model.PagingPlaylistObject;
import com.konfigthis.client.model.PagingPlaylistTrackObject;
import com.konfigthis.client.model.PlaylistObject;
import com.konfigthis.client.model.PlaylistsAddItemsRequest;
import com.konfigthis.client.model.PlaylistsCreatePlaylistRequest;
import com.konfigthis.client.model.PlaylistsRemoveItemsRequest;
import com.konfigthis.client.model.PlaylistsRemoveItemsRequestTracksInner;
import com.konfigthis.client.model.PlaylistsRemoveItemsResponse;
import com.konfigthis.client.model.PlaylistsUpdateDetailsRequest;
import com.konfigthis.client.model.PlaylistsUpdatePlaylistItemsRequest;
import com.konfigthis.client.model.UsersFollowPlaylistRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlaylistsApi
 */
@Disabled
public class PlaylistsApiTest {

    private static PlaylistsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PlaylistsApi(apiClient);
    }

    /**
     * Add Items to Playlist 
     *
     * Add one or more items to a user&#39;s playlist. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addItemsTest() throws ApiException {
        String playlistId = null;
        List<String> uris = null;
        Integer position = null;
        Integer position = null;
        String uris = null;
        PlaylistsRemoveItemsResponse response = api.addItems(playlistId)
                .uris(uris)
                .position(position)
                .position(position)
                .uris(uris)
                .execute();
        // TODO: test validations
    }

    /**
     * Check if Users Follow Playlist 
     *
     * Check to see if one or more Spotify users are following a specified playlist. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkIfFollowsPlaylistTest() throws ApiException {
        String playlistId = null;
        String ids = null;
        List<Boolean> response = api.checkIfFollowsPlaylist(playlistId, ids)
                .execute();
        // TODO: test validations
    }

    /**
     * Create Playlist 
     *
     * Create a playlist for a Spotify user. (The playlist will be empty until you [add tracks](/documentation/web-api/reference/add-tracks-to-playlist).) Each user is generally limited to a maximum of 11000 playlists. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPlaylistTest() throws ApiException {
        String name = null;
        String userId = null;
        String description = null;
        Boolean _public = null;
        Boolean collaborative = null;
        PlaylistObject response = api.createPlaylist(name, userId)
                .description(description)
                ._public(_public)
                .collaborative(collaborative)
                .execute();
        // TODO: test validations
    }

    /**
     * Follow Playlist 
     *
     * Add the current user as a follower of a playlist. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void followPlaylistTest() throws ApiException {
        String playlistId = null;
        Boolean _public = null;
        api.followPlaylist(playlistId)
                ._public(_public)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Category&#39;s Playlists 
     *
     * Get a list of Spotify playlists tagged with a particular category. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCategoryPlaylistsTest() throws ApiException {
        String categoryId = null;
        Integer limit = null;
        Integer offset = null;
        PagingFeaturedPlaylistObject response = api.getCategoryPlaylists(categoryId)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Playlist Cover Image 
     *
     * Get the current image associated with a specific playlist. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCoverImageTest() throws ApiException {
        String playlistId = null;
        List<ImageObject> response = api.getCoverImage(playlistId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Featured Playlists 
     *
     * Get a list of Spotify featured playlists (shown, for example, on a Spotify player&#39;s &#39;Browse&#39; tab). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFeaturedTest() throws ApiException {
        String locale = null;
        Integer limit = null;
        Integer offset = null;
        PagingFeaturedPlaylistObject response = api.getFeatured()
                .locale(locale)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Playlist 
     *
     * Get a playlist owned by a Spotify user. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlaylistByIdTest() throws ApiException {
        String playlistId = null;
        String market = null;
        String fields = null;
        String additionalTypes = null;
        PlaylistObject response = api.getPlaylistById(playlistId)
                .market(market)
                .fields(fields)
                .additionalTypes(additionalTypes)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Playlist Items 
     *
     * Get full details of the items of a playlist owned by a Spotify user. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlaylistItemsTest() throws ApiException {
        String playlistId = null;
        String market = null;
        String fields = null;
        Integer limit = null;
        Integer offset = null;
        String additionalTypes = null;
        PagingPlaylistTrackObject response = api.getPlaylistItems(playlistId)
                .market(market)
                .fields(fields)
                .limit(limit)
                .offset(offset)
                .additionalTypes(additionalTypes)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Current User&#39;s Playlists 
     *
     * Get a list of the playlists owned or followed by the current Spotify user. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserPlaylistsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        PagingPlaylistObject response = api.getUserPlaylists()
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Get User&#39;s Playlists 
     *
     * Get a list of the playlists owned or followed by a Spotify user. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserPlaylists_0Test() throws ApiException {
        String userId = null;
        Integer limit = null;
        Integer offset = null;
        PagingPlaylistObject response = api.getUserPlaylists_0(userId)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove Playlist Items 
     *
     * Remove one or more items from a user&#39;s playlist. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeItemsTest() throws ApiException {
        List<PlaylistsRemoveItemsRequestTracksInner> tracks = null;
        String playlistId = null;
        String snapshotId = null;
        PlaylistsRemoveItemsResponse response = api.removeItems(tracks, playlistId)
                .snapshotId(snapshotId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add Custom Playlist Cover Image 
     *
     * Replace the image used to represent a specific playlist. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceCoverImageTest() throws ApiException {
        String playlistId = null;
        api.replaceCoverImage(playlistId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unfollow Playlist 
     *
     * Remove the current user as a follower of a playlist. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unfollowPlaylistTest() throws ApiException {
        String playlistId = null;
        api.unfollowPlaylist(playlistId)
                .execute();
        // TODO: test validations
    }

    /**
     * Change Playlist Details 
     *
     * Change a playlist&#39;s name and public/private state. (The user must, of course, own the playlist.) 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDetailsTest() throws ApiException {
        String playlistId = null;
        String description = null;
        String name = null;
        Boolean _public = null;
        Boolean collaborative = null;
        api.updateDetails(playlistId)
                .description(description)
                .name(name)
                ._public(_public)
                .collaborative(collaborative)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Playlist Items 
     *
     * Either reorder or replace items in a playlist depending on the request&#39;s parameters. To reorder items, include &#x60;range_start&#x60;, &#x60;insert_before&#x60;, &#x60;range_length&#x60; and &#x60;snapshot_id&#x60; in the request&#39;s body. To replace items, include &#x60;uris&#x60; as either a query parameter or in the request&#39;s body. Replacing items in a playlist will overwrite its existing items. This operation can be used for replacing or clearing items in a playlist. &lt;br/&gt; **Note**: Replace and reorder are mutually exclusive operations which share the same endpoint, but have different parameters. These operations can&#39;t be applied together in a single request. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePlaylistItemsTest() throws ApiException {
        String playlistId = null;
        List<String> uris = null;
        Integer rangeStart = null;
        Integer insertBefore = null;
        Integer rangeLength = null;
        String snapshotId = null;
        String uris = null;
        PlaylistsRemoveItemsResponse response = api.updatePlaylistItems(playlistId)
                .uris(uris)
                .rangeStart(rangeStart)
                .insertBefore(insertBefore)
                .rangeLength(rangeLength)
                .snapshotId(snapshotId)
                .uris(uris)
                .execute();
        // TODO: test validations
    }

}
