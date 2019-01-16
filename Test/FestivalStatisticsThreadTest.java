import org.junit.Before;
import org.junit.Test;
import ro.siit.teo.FestivalGate;
import ro.siit.teo.FestivalStatisticsThread;

public class FestivalStatisticsThreadTest {

    FestivalGate gate;

    @Before
    public void setup() {
        gate = new FestivalGate();
    }

    @Test
    public void testWhenTicketListIsEmptyFestivalStatisticsThreadTestRuns() {
        FestivalStatisticsThread festivalStatistics = new FestivalStatisticsThread(gate);
        Thread festivalStatisticsThread = new Thread(festivalStatistics);
        festivalStatisticsThread.start();
    }
}
