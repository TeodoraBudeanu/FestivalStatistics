import org.junit.Before;
import org.junit.Test;
import ro.siit.teo.FestivalAttendeeThread;
import ro.siit.teo.FestivalGate;
import ro.siit.teo.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalAttendeeThreadTest {

    FestivalGate gate;

    @Before
    public void setup() {
        gate = new FestivalGate();
    }

    @Test
    public void testWhenThreadStartsTicketListIsPopulated() throws InterruptedException {
        for(int i = 0; i < 20; i++){
            FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(TicketType.randomTicketType(), gate);
            Thread festivalAttendeeThread = new Thread(festivalAttendee);
            festivalAttendeeThread.start();
            festivalAttendeeThread.join();
        }
        assertEquals(20,gate.ticketsList.size());

    }
}
