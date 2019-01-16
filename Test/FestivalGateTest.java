import org.junit.Before;
import org.junit.Test;
import ro.siit.teo.FestivalGate;
import ro.siit.teo.TicketType;

import static org.junit.Assert.assertEquals;

public class FestivalGateTest {
    FestivalGate gate;

    @Before
    public void setup(){
        gate = new FestivalGate();
    }

    @Test
    public void testWhenTicketsAreAddedToTheListSizeIncreases(){
        gate.add(TicketType.randomTicketType());
        assertEquals(1, gate.ticketsList.size());
    }




}
