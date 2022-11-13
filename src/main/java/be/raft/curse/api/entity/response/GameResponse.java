package be.raft.curse.api.entity.response;

import be.raft.curse.api.entity.game.Game;

public class GameResponse {
    Game data;

    public GameResponse(Game data) {
        this.data = data;
    }

    public Game getData() {
        return data;
    }
}
