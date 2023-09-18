package Secao11Date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcDate {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.now();
		LocalDateTime d05 = LocalDateTime.now();
		Instant d06 = Instant.now();
		
		LocalDate pastWeekLocalDate = d04.minusDays(14);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("d04 = " + d04);
		System.out.println("pastWeekLocalDate d04 = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate d04 = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("\nd05 = " + d05);
		System.out.println("pastWeekLocalDateTime d05 = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime d05 = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("\nd06 = " + d06);
		System.out.println("pastWeekInstant d06 = " + pastWeekInstant);
		System.out.println("nextWeekInstant d06 = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("\nt1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}

}
