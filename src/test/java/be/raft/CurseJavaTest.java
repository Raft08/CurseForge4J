package be.raft;

import be.raft.curse.api.CurseForgeApi;
import be.raft.curse.api.entity.enums.ModLoaderType;
import be.raft.curse.api.entity.enums.ModsSearchSortField;
import be.raft.curse.api.entity.game.Game;
import be.raft.curse.api.entity.response.*;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurseJavaTest {
    public static void main(String[] args) {
        CurseForgeApi api = new CurseForgeApi("$2a$10$72cJiy3p7SzQ5HwqdROTO.xr1h3MdE0/49irxdoP7MrfOoS72Ucqu");
        SearchModResponse modResponse = api.searchMod(432, "1.18.2", ModLoaderType.FORGE, ModsSearchSortField.FEATURED, 50, 0, "Mekanism");
        GamesResponse gamesResponse = api.getGames();
        CategoriesResponse categoriesResponse = api.getCategories(432);

        if (gamesResponse == gamesResponse);
    }
}
