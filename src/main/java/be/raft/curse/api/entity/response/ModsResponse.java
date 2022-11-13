package be.raft.curse.api.entity.response;

import be.raft.curse.api.entity.mod.Mod;

import java.util.ArrayList;

public class ModsResponse {
    ArrayList<Mod> data;

    public ModsResponse(ArrayList<Mod> data) {
        this.data = data;
    }

    public ArrayList<Mod> getData() {
        return data;
    }
}
