package be.raft.curse.api.entity.response;

import be.raft.curse.api.entity.misc.Pagination;
import be.raft.curse.api.entity.mod.Mod;

import java.util.ArrayList;

public class SearchModResponse {
    ArrayList<Mod> data;
    Pagination pagination;

    public SearchModResponse(ArrayList<Mod> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public ArrayList<Mod> getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
