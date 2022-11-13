package be.raft.curse.api.entity.category;

public class Category {
    int id;
    int gameId;
    String name;
    String slug;
    String url;
    String iconUrl;
    String dateModified;
    boolean isClass;
    int classId;
    int parentCategoryId;
    int displayIndex;

    public Category(int id, int gameId, String name, String slug, String url, String iconUrl, String dateModified, boolean isClass, int classId, int parentCategoryId, int displayIndex) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
        this.slug = slug;
        this.url = url;
        this.iconUrl = iconUrl;
        this.dateModified = dateModified;
        this.isClass = isClass;
        this.classId = classId;
        this.parentCategoryId = parentCategoryId;
        this.displayIndex = displayIndex;
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

    public String getUrl() {
        return url;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getDateModified() {
        return dateModified;
    }

    public boolean isClass() {
        return isClass;
    }

    public int getClassId() {
        return classId;
    }

    public int getParentCategoryId() {
        return parentCategoryId;
    }

    public int getDisplayIndex() {
        return displayIndex;
    }
}
