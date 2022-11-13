package be.raft.curse.api.entity.misc;

public class Pagination {
    int index;
    int pageSize;
    int resultCount;
    int totalCount;

    public Pagination(int index, int pageSize, int resultCount, int totalCount) {
        this.index = index;
        this.pageSize = pageSize;
        this.resultCount = resultCount;
        this.totalCount = totalCount;
    }

    public int getIndex() {
        return index;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getResultCount() {
        return resultCount;
    }

    public int getTotalCount() {
        return totalCount;
    }
}
