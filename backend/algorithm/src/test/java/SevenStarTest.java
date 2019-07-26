import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class SevenStarTest {

    @org.junit.Test
    public void getPrizeTest1() {
        List<List<Integer>> bet = Arrays.asList(
                Arrays.asList(8, 1),
                Arrays.asList(9, 1, 8, 0),
                Arrays.asList(0, 2, 3),
                Arrays.asList(1, 2, 0),
                Arrays.asList(8, 0),
                Arrays.asList(4, 8),
                Arrays.asList(6, 2, 5)
        );
        List<Integer> prize = Arrays.asList(1, 1, 3, 7, 8, 4, 2);
        Integer prizeLevel = SevenStar.getPrizeLevel(bet, prize);
        Assert.assertEquals(5L, (long)prizeLevel);
    }

    @org.junit.Test
    public void getPrizeTest2() {
        List<List<Integer>> bet = Arrays.asList(
                Arrays.asList(8, 1),
                Arrays.asList(9, 1, 8, 0),
                Arrays.asList(0, 2, 3),
                Arrays.asList(1, 2, 0),
                Arrays.asList(8, 0),
                Arrays.asList(4, 8),
                Arrays.asList(6, 2, 5)
        );
        List<Integer> prize = Arrays.asList(8, 1, 3, 1, 8, 4, 2);
        Integer prizeLevel = SevenStar.getPrizeLevel(bet, prize);
        Assert.assertEquals(1L, (long)prizeLevel);
    }

    @org.junit.Test
    public void getPrizeTest3() {
        List<List<Integer>> bet = Arrays.asList(
                Arrays.asList(8, 1),
                Arrays.asList(9, 1, 8, 0),
                Arrays.asList(0, 2, 3),
                Arrays.asList(1, 2, 0),
                Arrays.asList(8, 0),
                Arrays.asList(4, 8),
                Arrays.asList(6, 2, 5)
        );
        List<Integer> prize = Arrays.asList(2, 4, 4, 7, 4, 7, 1);
        Integer prizeLevel = SevenStar.getPrizeLevel(bet, prize);
        Assert.assertEquals(8L, (long)prizeLevel);
    }

    @org.junit.Test
    public void getPrizeTest4() {
        List<List<Integer>> bet = Arrays.asList(
                Arrays.asList(8, 1),
                Arrays.asList(9, 1, 8, 0),
                Arrays.asList(0, 2, 3),
                Arrays.asList(1, 2, 0),
                Arrays.asList(8, 0),
                Arrays.asList(4, 8),
                Arrays.asList(6, 2, 5)
        );
        List<Integer> prize = Arrays.asList(7, 1, 2, 7, 8, 4, 2);
        Integer prizeLevel = SevenStar.getPrizeLevel(bet, prize);
        Assert.assertEquals(5L, (long)prizeLevel);
    }
}
