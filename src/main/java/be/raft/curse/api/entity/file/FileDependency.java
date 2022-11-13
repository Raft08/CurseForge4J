package be.raft.curse.api.entity.file;

public class FileDependency {
    int modId;
    int relationType;

    public FileDependency(int modId, int relationType) {
        this.modId = modId;
        this.relationType = relationType;
    }

    public int getModId() {
        return modId;
    }

    public int getRelationType() {
        return relationType;
    }
}
