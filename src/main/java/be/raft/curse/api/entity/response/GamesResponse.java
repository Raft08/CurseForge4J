package be.raft.curse.api.entity.response;

import be.raft.curse.api.entity.game.Game;
import be.raft.curse.api.entity.misc.Pagination;

import java.util.ArrayList;

public class GamesResponse {
    ArrayList<Game> data;
    Pagination pagination;

    public GamesResponse(ArrayList<Game> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public ArrayList<Game> getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
