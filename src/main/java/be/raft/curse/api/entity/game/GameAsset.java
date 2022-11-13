package be.raft.curse.api.entity.game;

public class GameAsset {
    String iconUrl;
    String tileUrl;
    String coverUrl;

    public GameAsset(String iconUrl, String tileUrl, String coverUrl) {
        this.iconUrl = iconUrl;
        this.tileUrl = tileUrl;
        this.coverUrl = coverUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getTileUrl() {
        return tileUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }
}
