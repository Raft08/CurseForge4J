package be.raft.curse.api.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtils {


    public static Object fromJson(String json, Class<?> type){
        return new Gson().fromJson(json, type);
    }
}
