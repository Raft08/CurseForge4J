package be.raft.curse.api.entity.game.version;

public class SortableGameVersion {
    String gameVersionName;
    String gameVersionPadded;
    String gameVersion;
    String gameVersionReleaseDate;
    int gameVersionTypeId;

    public SortableGameVersion(String gameVersionName, String gameVersionPadded, String gameVersion, String gameVersionReleaseDate, int gameVersionTypeId) {
        this.gameVersionName = gameVersionName;
        this.gameVersionPadded = gameVersionPadded;
        this.gameVersion = gameVersion;
        this.gameVersionReleaseDate = gameVersionReleaseDate;
        this.gameVersionTypeId = gameVersionTypeId;
    }

    public String getGameVersionName() {
        return gameVersionName;
    }

    public String getGameVersionPadded() {
        return gameVersionPadded;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public String getGameVersionReleaseDate() {
        return gameVersionReleaseDate;
    }

    public int getGameVersionTypeId() {
        return gameVersionTypeId;
    }
}