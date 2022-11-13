package be.raft.curse.api.entity.response;

import be.raft.curse.api.entity.game.version.GameVersionByType;

import java.util.ArrayList;

public class GameVersionsResponse {
    ArrayList<GameVersionByType> data;

    public GameVersionsResponse(ArrayList<GameVersionByType> data) {
        this.data = data;
    }

    public ArrayList<GameVersionByType> getData() {
        return data;
    }
}
