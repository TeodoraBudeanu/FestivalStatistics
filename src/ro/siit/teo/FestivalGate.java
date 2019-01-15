package ro.siit.teo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static ro.siit.teo.TicketType.*;



public class FestivalGate {

    public List<TicketType> ticketsList = new ArrayList<>();
    public int prevSize = -1;

    public void add(TicketType ticket){
        ticketsList.add(ticket);
    }

    public void printStats(){
        System.out.println();

        System.out.println("----------------- STATISTICS ---------------");
        System.out.println(ticketsList.size() + " people entered.");
        System.out.println(Collections.frequency(ticketsList, FULL_VIP) + " people have full VIP passes.");
        System.out.println(Collections.frequency(ticketsList, FULL) + " people have full tickets.");
        System.out.println(Collections.frequency(ticketsList, FREE_PASS) + " people have free passes.");
        System.out.println(Collections.frequency(ticketsList, ONE_DAY) + " people have one-day passes.");
        System.out.println(Collections.frequency(ticketsList, ONE_DAY_VIP) + " people have one-day VIP passes.");
    }

}
