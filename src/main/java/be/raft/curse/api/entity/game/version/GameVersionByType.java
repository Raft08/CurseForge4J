package be.raft.curse.api.entity.game.version;

import java.util.ArrayList;

public class GameVersionByType {
    int type;
    ArrayList<String> versions;

    public GameVersionByType(int type, ArrayList<String> versions) {
        this.type = type;
        this.versions = versions;
    }

    public int getType() {
        return type;
    }

    public ArrayList<String> getVersions() {
        return versions;
    }
}
