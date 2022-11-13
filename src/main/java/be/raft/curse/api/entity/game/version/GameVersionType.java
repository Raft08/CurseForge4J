package be.raft.curse.api.entity.game.version;

public class GameVersionType {
    int id;
    int gameId;
    String name;
    String slug;

    public GameVersionType(int id, int gameId, String name, String slug) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
        this.slug = slug;
    }

    public int getId() {
        return id;
    }

    public int getGameId() {
        return gameId;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }
}
