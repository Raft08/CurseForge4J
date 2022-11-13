package be.raft.curse.api.entity.enums;

public enum ModsSearchSortField {
    FEATURED(1), POPULARITY(2), LASTUPDATED(3), NAME(4), AUTHOR(5), TOTALDOWNLOAD(6), CATEGORY(7);

    private int value;

    ModsSearchSortField(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
