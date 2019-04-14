package foo.bar.blockchain;

import foo.bar.blockchain.external.GlobalIndexExternalService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BlockchainHashGeneratorTest {

    BlockchainHashGenerator generator = new BlockchainHashGenerator(new GlobalIndexExternalService());

    @Test
    void testIndexIncreasingForEachExecutionNoMock() {
        BlockchainHash firstHash = generator.generate();
        BlockchainHash secondHash = generator.generate();

        Assertions.assertNotEquals(firstHash.equals(secondHash), "Hashes are equal but should be different");
    }

    GlobalIndexExternalService calcMock = mock(GlobalIndexExternalService.class);
    BlockchainHashGenerator generatorWithMock = new BlockchainHashGenerator(calcMock);


    @Test
    void testIndexIncreasingForEachExecutionWithMock() {
        when(calcMock.calculateGlobalIndex())
            .thenReturn(1l)
            .thenReturn(2l);


        BlockchainHash firstHash = generatorWithMock.generate();
        BlockchainHash secondHash = generatorWithMock.generate();

        Assertions.assertNotEquals(firstHash.equals(secondHash), "Hashes are equal but should be different");
    }
}
