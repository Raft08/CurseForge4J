package be.raft.curse.api.entity.file;

public class FileModule {
    String name;
    long fingerprint;

    public FileModule(String name, long fingerprint) {
        this.name = name;
        this.fingerprint = fingerprint;
    }

    public String getName() {
        return name;
    }

    public long getFingerprint() {
        return fingerprint;
    }
}
