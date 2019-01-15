package ro.siit.teo;

public class Runner {
    public static void main(String[] args) throws InterruptedException {


        FestivalGate gate = new FestivalGate();

        FestivalStatisticsThread festivalStatistics = new FestivalStatisticsThread(gate);
        Thread festivalStatisticsThread = new Thread(festivalStatistics);
        festivalStatisticsThread.start();

        for (int i = 0; i < 200; i++) {
            FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(TicketType.randomTicketType(), gate);
            Thread festivalAttendeeThread = new Thread(festivalAttendee);
            festivalAttendeeThread.start();
            festivalAttendeeThread.join();
        }
    }
}
