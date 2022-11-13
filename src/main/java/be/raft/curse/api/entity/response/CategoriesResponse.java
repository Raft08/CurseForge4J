package be.raft.curse.api.entity.response;

import be.raft.curse.api.entity.category.Category;

import java.util.ArrayList;

public class CategoriesResponse {
    ArrayList<Category> data;

    public CategoriesResponse(ArrayList<Category> data) {
        this.data = data;
    }

    public ArrayList<Category> getData() {
        return data;
    }
}
