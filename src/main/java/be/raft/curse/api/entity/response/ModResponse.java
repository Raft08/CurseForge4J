package be.raft.curse.api.entity.response;

import be.raft.curse.api.entity.mod.Mod;

public class ModResponse {
    Mod data;

    public ModResponse(Mod data) {
        this.data = data;
    }

    public Mod getData() {
        return data;
    }
}
