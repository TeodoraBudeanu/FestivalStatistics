package ro.siit.teo;

public class FestivalStatisticsThread implements Runnable {

    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        while (gate.ticketsList.size()>gate.prevSize) {
            gate.prevSize = gate.ticketsList.size();
            gate.printStats();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
