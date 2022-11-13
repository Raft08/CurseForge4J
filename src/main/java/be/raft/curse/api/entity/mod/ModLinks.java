package be.raft.curse.api.entity.mod;

public class ModLinks {
    String websiteUrl;
    String wikiUrl;
    String issuesUrl;
    String sourceUrl;

    public ModLinks(String websiteUrl, String wikiUrl, String issuesUrl, String sourceUrl) {
        this.websiteUrl = websiteUrl;
        this.wikiUrl = wikiUrl;
        this.issuesUrl = issuesUrl;
        this.sourceUrl = sourceUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }
}
