package com.konfigthis.client;

import com.konfigthis.client.api.AlbumsApi;
import com.konfigthis.client.api.ArtistsApi;
import com.konfigthis.client.api.AudiobooksApi;
import com.konfigthis.client.api.CategoriesApi;
import com.konfigthis.client.api.ChaptersApi;
import com.konfigthis.client.api.EpisodesApi;
import com.konfigthis.client.api.GenresApi;
import com.konfigthis.client.api.LibraryApi;
import com.konfigthis.client.api.MarketsApi;
import com.konfigthis.client.api.PlayerApi;
import com.konfigthis.client.api.PlaylistsApi;
import com.konfigthis.client.api.SearchApi;
import com.konfigthis.client.api.ShowsApi;
import com.konfigthis.client.api.TracksApi;
import com.konfigthis.client.api.UsersApi;

public class Spotify {
    private ApiClient apiClient;
    public final AlbumsApi albums;
    public final ArtistsApi artists;
    public final AudiobooksApi audiobooks;
    public final CategoriesApi categories;
    public final ChaptersApi chapters;
    public final EpisodesApi episodes;
    public final GenresApi genres;
    public final LibraryApi library;
    public final MarketsApi markets;
    public final PlayerApi player;
    public final PlaylistsApi playlists;
    public final SearchApi search;
    public final ShowsApi shows;
    public final TracksApi tracks;
    public final UsersApi users;

    public Spotify() {
        this(null);
    }

    public Spotify(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.albums = new AlbumsApi(this.apiClient);
        this.artists = new ArtistsApi(this.apiClient);
        this.audiobooks = new AudiobooksApi(this.apiClient);
        this.categories = new CategoriesApi(this.apiClient);
        this.chapters = new ChaptersApi(this.apiClient);
        this.episodes = new EpisodesApi(this.apiClient);
        this.genres = new GenresApi(this.apiClient);
        this.library = new LibraryApi(this.apiClient);
        this.markets = new MarketsApi(this.apiClient);
        this.player = new PlayerApi(this.apiClient);
        this.playlists = new PlaylistsApi(this.apiClient);
        this.search = new SearchApi(this.apiClient);
        this.shows = new ShowsApi(this.apiClient);
        this.tracks = new TracksApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
