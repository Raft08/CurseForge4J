package be.raft.curse.api.entity.file;

public class FileHash {
    String value;
    int algo;

    public FileHash(String value, int algo) {
        this.value = value;
        this.algo = algo;
    }

    public String getValue() {
        return value;
    }

    public int getAlgo() {
        return algo;
    }
}
