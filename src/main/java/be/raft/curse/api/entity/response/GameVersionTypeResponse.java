package be.raft.curse.api.entity.response;

import be.raft.curse.api.entity.game.version.GameVersionType;

import java.util.ArrayList;

public class GameVersionTypeResponse {
    ArrayList<GameVersionType> data;

    public GameVersionTypeResponse(ArrayList<GameVersionType> data) {
        this.data = data;
    }

    public ArrayList<GameVersionType> getData() {
        return data;
    }
}
