package co.com.bancolombia.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunnyColorBlocksTest {

    private final FunnyColorBlocks funnyColorBlocks = new FunnyColorBlocks();

    @Test
    void unblockMe() {
        String[] towers = new String[]{"aab", "cab", "baa", "baa"};
        int count = funnyColorBlocks.unblockMe(towers);
        assertEquals(3, count);
    }

    @Test
    void unblockMe2() {
        String[] towers = new String[]{"zzz", "zbz", "zbz", "dgf"};
        int count = funnyColorBlocks.unblockMe(towers);
        assertEquals(2, count);
    }
}
