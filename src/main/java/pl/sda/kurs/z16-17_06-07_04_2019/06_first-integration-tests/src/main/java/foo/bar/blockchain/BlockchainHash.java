package foo.bar.blockchain;

import java.util.Objects;

public class BlockchainHash {
    private String hash;
    private Long index;

    public BlockchainHash(String hash, Long index) {
        this.hash = hash;
        this.index = index;
    }

    public String getHash() {
        return hash;
    }

    public Long getIndex() {
        return index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockchainHash that = (BlockchainHash) o;
        return Objects.equals(hash, that.hash) &&
                Objects.equals(index, that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash, index);
    }
}
