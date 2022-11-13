package be.raft.curse.api.entity.mod;

public class ModAsset {
    int id;
    int modId;
    String title;
    String description;
    String thumbnailUrl;
    String url;

    public ModAsset(int id, int modId, String title, String description, String thumbnailUrl, String url) {
        this.id = id;
        this.modId = modId;
        this.title = title;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public int getModId() {
        return modId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getUrl() {
        return url;
    }
}
