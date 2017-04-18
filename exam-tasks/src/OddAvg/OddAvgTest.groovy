package OddAvg

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*;

class OddAvgTest {

    @Test
    public void test4numbers(){
        OddAvg oddAvg = new OddAvg();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4)
        assertEquals(4, oddAvg.oddsAverage(list));
    }

    @Test
    public void testWith0(){
        OddAvg oddAvg = new OddAvg();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(0);
        assertEquals(1, oddAvg.oddsAverage(list));
    }

    @Test
    public void testWithLoop() {
        OddAvg oddAvg = new OddAvg();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(5, oddAvg.oddsAverage(list));
    }
}
