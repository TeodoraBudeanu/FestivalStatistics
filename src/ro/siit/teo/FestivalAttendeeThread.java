package ro.siit.teo;

public class FestivalAttendeeThread implements Runnable {

    private TicketType ticketType;
    private FestivalGate gate;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    @Override
    public void run() {
        gate.add(ticketType);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
