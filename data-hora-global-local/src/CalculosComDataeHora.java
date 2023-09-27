import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataeHora {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-09-09");
        LocalDateTime d05 = LocalDateTime.parse("2023-09-09T01:30:26");
        Instant d06 = Instant.parse("2023-09-09T01:30:26Z");
        LocalDate pastWeekLocalDate = d04.minusDays(7L);
        LocalDate nextWeekLocalDate = d04.plusDays(7L);
        System.out.println("pastWeekLocalDate = " + String.valueOf(pastWeekLocalDate));
        System.out.println("nextWeekLocalDate = " + String.valueOf(nextWeekLocalDate));
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7L);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7L);
        System.out.println("pastWeekLocalDateTime = " + String.valueOf(pastWeekLocalDateTime));
        System.out.println("nextWeekLocalDateTime = " + String.valueOf(nextWeekLocalDateTime));
        Instant pastWeekInstant = d06.minus(7L, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7L, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + String.valueOf(pastWeekInstant));
        System.out.println("nextWeekInstant = " + String.valueOf(nextWeekInstant));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println("T1 dias = " + t1.toDays());
        System.out.println("T2 dias = " + t2.toDays());
        System.out.println("T3 dias = " + t3.toDays());
        System.out.println("T4 dias = " + t4.toDays());
    }
}