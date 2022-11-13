package be.raft.curse.api.entity.response;

public class StringResponse {
    String data;

    public StringResponse(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
