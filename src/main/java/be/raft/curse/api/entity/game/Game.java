package be.raft.curse.api.entity.game;

public class Game {
    int id;
    String name;
    String slug;
    String dateModified;
    GameAsset assets;
    int status;
    int apiStatus;

    public Game(int id, String name, String slug, String dateModified, GameAsset asset, int status, int apiStatus) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.dateModified = dateModified;
        this.assets = asset;
        this.status = status;
        this.apiStatus = apiStatus;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getDateModified() {
        return dateModified;
    }

    public GameAsset getAssets() {
        return assets;
    }

    public int getStatus() {
        return status;
    }

    public int getApiStatus() {
        return apiStatus;
    }
}
