import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    public static final int GIGASECOND = 1_000_000_000;
    private final LocalDateTime localDateTime;

    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        localDateTime = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return localDateTime;
    }
}
