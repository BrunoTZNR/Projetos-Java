package Secao11Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoGlobalToLocal {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-06-05");
		LocalDateTime d05 = LocalDateTime.parse("2023-06-05T16:33:04");
		Instant d06 = Instant.parse("2023-06-05T01:33:04Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		System.out.println("d05 segundo = " + d05.getSecond());
	}

}
