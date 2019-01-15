package ro.siit.teo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum TicketType {
    FULL, FULL_VIP, FREE_PASS, ONE_DAY, ONE_DAY_VIP;

    private static final List<TicketType> VALUES = Arrays.asList(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TicketType randomTicketType() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
