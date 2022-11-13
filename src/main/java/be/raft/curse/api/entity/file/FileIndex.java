package be.raft.curse.api.entity.file;

import com.google.gson.annotations.SerializedName;

public class FileIndex {
    String gameVersion;
    int fileId;
    @SerializedName("filename")
    String fileName;
    int releaseType;
    int gameVersionTypeId;
    int modLoader;

    public FileIndex(String gameVersion, int fileId, String fileName, int releaseType, int gameVersionTypeId, int modLoader) {
        this.gameVersion = gameVersion;
        this.fileId = fileId;
        this.fileName = fileName;
        this.releaseType = releaseType;
        this.gameVersionTypeId = gameVersionTypeId;
        this.modLoader = modLoader;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public int getFileId() {
        return fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public int getReleaseType() {
        return releaseType;
    }

    public int getGameVersionTypeId() {
        return gameVersionTypeId;
    }

    public int getModLoader() {
        return modLoader;
    }
}
