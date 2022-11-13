package be.raft.curse.api.entity.mod;

import be.raft.curse.api.entity.file.File;
import be.raft.curse.api.entity.file.FileIndex;
import be.raft.curse.api.entity.category.Category;

import java.util.ArrayList;

public class Mod {
    int id;
    int gameId;
    String name;
    String slug;
    ModLinks links;
    String summary;
    int status;
    long downloadCount;
    boolean isFeatured;
    int primaryCategoryId;
    ArrayList<Category> categories;
    int classId;
    ArrayList<ModAuthor> authors;
    ModAsset logo;
    ArrayList<ModAsset> screenshots;
    int mainFileId;
    ArrayList<File> latestFiles;
    ArrayList<FileIndex> latestFilesIndexes;
    String dateCreated;
    String dateModified;
    String dateReleased;
    boolean allowModDistribution;
    int gamePopularityRank;
    boolean isAvailable;
    int thumbsUpCount;

    public Mod(int id, int gameId, String name, String slug, ModLinks links, String summary, int status, long downloadCount, boolean isFeatured, int primaryCategoryId, ArrayList<Category> categories, int classId, ArrayList<ModAuthor> authors, ModAsset logo, ArrayList<ModAsset> screenshots, int mainField, ArrayList<File> latestFiles, ArrayList<FileIndex> latestFilesIndexes, String dateCreated, String dateModified, String dateReleased, boolean allowModDistribution, int gamePopularityRank, boolean isAvailable, int thumbsUpCount) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
        this.slug = slug;
        this.links = links;
        this.summary = summary;
        this.status = status;
        this.downloadCount = downloadCount;
        this.isFeatured = isFeatured;
        this.primaryCategoryId = primaryCategoryId;
        this.categories = categories;
        this.classId = classId;
        this.authors = authors;
        this.logo = logo;
        this.screenshots = screenshots;
        this.mainFileId = mainField;
        this.latestFiles = latestFiles;
        this.latestFilesIndexes = latestFilesIndexes;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.dateReleased = dateReleased;
        this.allowModDistribution = allowModDistribution;
        this.gamePopularityRank = gamePopularityRank;
        this.isAvailable = isAvailable;
        this.thumbsUpCount = thumbsUpCount;
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

    public ModLinks getLinks() {
        return links;
    }

    public String getSummary() {
        return summary;
    }

    public int getStatus() {
        return status;
    }

    public long getDownloadCount() {
        return downloadCount;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public int getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public int getClassId() {
        return classId;
    }

    public ArrayList<ModAuthor> getAuthors() {
        return authors;
    }

    public ModAsset getLogo() {
        return logo;
    }

    public ArrayList<ModAsset> getScreenshots() {
        return screenshots;
    }

    public int getMainFileId() {
        return mainFileId;
    }

    public ArrayList<File> getLatestFiles() {
        return latestFiles;
    }

    public ArrayList<FileIndex> getLatestFilesIndexes() {
        return latestFilesIndexes;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public boolean isAllowModDistribution() {
        return allowModDistribution;
    }

    public int getGamePopularityRank() {
        return gamePopularityRank;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getThumbsUpCount() {
        return thumbsUpCount;
    }
}
