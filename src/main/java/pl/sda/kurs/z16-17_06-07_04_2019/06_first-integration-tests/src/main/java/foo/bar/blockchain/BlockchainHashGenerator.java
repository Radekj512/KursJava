package foo.bar.blockchain;

import foo.bar.blockchain.external.GlobalIndexExternalService;

import java.util.UUID;

public class BlockchainHashGenerator {

    private GlobalIndexExternalService indexService;

    public BlockchainHashGenerator(GlobalIndexExternalService indexService) {
        this.indexService = indexService;
    }

    public BlockchainHash generate() {
        return new BlockchainHash(UUID.randomUUID().toString(), indexService.calculateGlobalIndex());
    }
}
