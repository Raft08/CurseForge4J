package be.raft.curse.api.entity.enums;

public enum ModLoaderType {
    ANY(0), FORGE(1), CAULDRON(2), LITELOADER(3), FABRIC(4), QUILT(5);

    private int value;

    ModLoaderType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
