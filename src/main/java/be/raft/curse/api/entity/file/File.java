package be.raft.curse.api.entity.file;

import be.raft.curse.api.entity.game.version.SortableGameVersion;

import java.util.ArrayList;

public class File {
    int id;
    int gameId;
    int modId;
    boolean isAvailable;
    String displayName;
    String fileName;
    int releaseType;
    int fileStatus;
    ArrayList<FileHash> hashes;
    String fileDate;
    long fileLength;
    long downloadCount;
    String downloadUrl;
    ArrayList<String> gameVersions;
    ArrayList<SortableGameVersion> sortableGameVersions;
    ArrayList<FileDependency> dependencies;
    boolean exposeAsAlternative;
    int parentProjectFileId;
    int alternateFileId;
    boolean isServerPack;
    int serverPackFileId;
    long fileFingerprint;
    ArrayList<FileModule> modules;

    public File(int id, int gameId, int modId, boolean isAvailable, String displayName, String fileName, int releaseType, int fileStatus, ArrayList<FileHash> hashes, String fileDate, long fileLength, long downloadCount, String downloadUrl, ArrayList<String> gameVersions, ArrayList<SortableGameVersion> sortableGameVersions, ArrayList<FileDependency> dependencies, boolean exposeAsAlternative, int parentProjectFileId, int alternateFileId, boolean isServerPack, int serverPackFileId, long fileFingerprint, ArrayList<FileModule> modules) {
        this.id = id;
        this.gameId = gameId;
        this.modId = modId;
        this.isAvailable = isAvailable;
        this.displayName = displayName;
        this.fileName = fileName;
        this.releaseType = releaseType;
        this.fileStatus = fileStatus;
        this.hashes = hashes;
        this.fileDate = fileDate;
        this.fileLength = fileLength;
        this.downloadCount = downloadCount;
        this.downloadUrl = downloadUrl;
        this.gameVersions = gameVersions;
        this.sortableGameVersions = sortableGameVersions;
        this.dependencies = dependencies;
        this.exposeAsAlternative = exposeAsAlternative;
        this.parentProjectFileId = parentProjectFileId;
        this.alternateFileId = alternateFileId;
        this.isServerPack = isServerPack;
        this.serverPackFileId = serverPackFileId;
        this.fileFingerprint = fileFingerprint;
        this.modules = modules;
    }

    public int getId() {
        return id;
    }

    public int getGameId() {
        return gameId;
    }

    public int getModId() {
        return modId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFileName() {
        return fileName;
    }

    public int getReleaseType() {
        return releaseType;
    }

    public int getFileStatus() {
        return fileStatus;
    }

    public ArrayList<FileHash> getHashes() {
        return hashes;
    }

    public String getFileDate() {
        return fileDate;
    }

    public long getFileLength() {
        return fileLength;
    }

    public long getDownloadCount() {
        return downloadCount;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public ArrayList<String> getGameVersions() {
        return gameVersions;
    }

    public ArrayList<SortableGameVersion> getSortableGameVersions() {
        return sortableGameVersions;
    }

    public ArrayList<FileDependency> getDependencies() {
        return dependencies;
    }

    public boolean isExposeAsAlternative() {
        return exposeAsAlternative;
    }

    public int getParentProjectFileId() {
        return parentProjectFileId;
    }

    public int getAlternateFileId() {
        return alternateFileId;
    }

    public boolean isServerPack() {
        return isServerPack;
    }

    public int getServerPackFileId() {
        return serverPackFileId;
    }

    public long getFileFingerprint() {
        return fileFingerprint;
    }

    public ArrayList<FileModule> getModules() {
        return modules;
    }
}
