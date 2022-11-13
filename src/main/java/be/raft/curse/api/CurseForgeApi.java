package be.raft.curse.api;

import be.raft.curse.api.entity.enums.ModLoaderType;
import be.raft.curse.api.entity.enums.ModsSearchSortField;
import be.raft.curse.api.entity.mod.Mod;
import be.raft.curse.api.entity.response.*;
import be.raft.curse.api.utils.GsonUtils;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CurseForgeApi {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final String apiKey;
    private final String apiUrl = "https://api.curseforge.com";

    public CurseForgeApi(String apiKey) {
        this.apiKey = apiKey;
        logger.debug("New Api instance created!");
        logger.debug("Testing api connection");
        try {
            //Initialize connection with CurseForge servers
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl + "/v1/games").openConnection();
            connection.addRequestProperty("x-api-key", apiKey);
            //Try to get response
            connection.setRequestMethod("GET");
            //If Respond code isn't 200 something went wrong
            if (connection.getResponseCode() != 200) {
                logger.error("Unable to establish connection to api! Code " + connection.getResponseCode());
                if (connection.getResponseCode() == 403) logger.error("(Are you sure key is valid?)");
            }
            logger.info("Successfully connected to api!");
        } catch (Exception e) {
            logger.error("Error while testing connection! " + e.getMessage());
        }
    }

    public String  getApiUrl() {
        return this.apiUrl;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public SearchModResponse searchMod(int gameId, String gameVersion, ModLoaderType modLoader, ModsSearchSortField sortField, int count, int skipCount, String modName){        return (SearchModResponse) request("/v1/mods/search?gameId="+gameId + "&classId=6" +
            "&gameVersion="+gameVersion + "&modLoaderType=" + modLoader.getValue() +
            "&sortOrder=desc&sortField="+sortField.getValue() + "&pageSize="+count + "&index="+ skipCount, SearchModResponse.class);
    }

    public SearchModResponse searchMod(int gameId, String gameVersion, ModLoaderType modLoader, ModsSearchSortField sortField, int count, int skipCount, String modName, int categoryId){
        return (SearchModResponse) request("/v1/mods/search?gameId="+gameId + "&classId=6" +
                "&gameVersion="+gameVersion + "&modLoaderType=" + modLoader.getValue() +
                "&sortOrder=desc&sortField="+sortField.getValue() + "&pageSize="+count + "&index="+ skipCount +
                "&searchFilter="+modName + "categoryId="+categoryId, SearchModResponse.class);
    }

    public SearchModResponse getAllMods(int gameId, String gameVersion, ModLoaderType modLoader, ModsSearchSortField sortField, int count, int skipCount, int categoryId){
        return (SearchModResponse) request("/v1/mods/search?gameId="+gameId + "&classId=6" +
                "&gameVersion="+gameVersion + "&modLoaderType=" + modLoader.getValue() +
                "&sortOrder=desc&sortField="+sortField.getValue() + "&pageSize="+count + "&index="+ skipCount +
                "categoryId="+categoryId, SearchModResponse.class);
    }

    /*
    Retrieves all mods with selected values
    You can set how many mods you want te retrieve (MAX:50)
    */
    public SearchModResponse getAllMods(int gameId, String gameVersion, ModLoaderType modLoader, ModsSearchSortField sortField, int count, int skipCount){
        return (SearchModResponse) request("/v1/mods/search?gameId="+gameId + "&classId=6" +
                "&gameVersion="+gameVersion + "&modLoaderType=" + modLoader.getValue() +
                "&sortOrder=desc&sortField="+sortField.getValue() + "&pageSize="+count + "&index="+ skipCount, SearchModResponse.class);
    }

    public Mod getMod(int modId) {
        ModResponse response = (ModResponse) request("/v1/mods/" + modId, ModResponse.class);
        assert response != null;
        return response.getData();
    }

    public String getModDescription(int modId) {
        StringResponse response = (StringResponse) request("/v1/mods/" + modId +"/description", StringResponse.class);
        assert response != null;
        return response.getData();
    }
    public GamesResponse getGames() {
        return (GamesResponse) request("/v1/games", GamesResponse.class);
    }

    public GameVersionsResponse getVersions(int gameId) {
        return (GameVersionsResponse) request("/v1/games/" + gameId + "/versions", GameVersionsResponse.class);
    }

    public GameVersionTypeResponse getVersionTypes(int gameId) {
        return (GameVersionTypeResponse) request("/v1/games/" + gameId + "/version-types", GameVersionTypeResponse.class);
    }

    public CategoriesResponse getCategories(int gameId) {
        return (CategoriesResponse) request("/v1/categories?gameId="+gameId + "&classId=6", CategoriesResponse.class);
    }

    private Object request(String path, Class<?> returnClass) {
        try {
            //Initialize connection with CurseForge api servers
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl + path).openConnection();
            logger.debug("Opened connection to " + apiUrl + path);
            connection.addRequestProperty("x-api-key", apiKey);

            //Try to get response
            connection.setRequestMethod("GET");

            //If Respond code isn't 200 something went wrong
            if (connection.getResponseCode() != 200) {
                logger.warn("Response code " + connection.getResponseCode());
                if (connection.getResponseCode() == 403) logger.warn("Are you sure the key is valid?");
            }
            logger.debug("Response code " + connection.getResponseCode());

            //Convert in usable data for the program
            Gson gson = new Gson();
            return gson.fromJson(IOUtils.toString(connection.getInputStream(), StandardCharsets.UTF_8), returnClass);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }
}