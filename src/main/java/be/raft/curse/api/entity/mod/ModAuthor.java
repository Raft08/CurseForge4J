package be.raft.curse.api.entity.mod;

public class ModAuthor {
    int id;
    String name;
    String url;

    public ModAuthor(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
