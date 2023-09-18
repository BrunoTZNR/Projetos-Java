package Secao11Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class SetDate {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2023-06-05");
		LocalDateTime d05 = LocalDateTime.parse("2023-06-05T16:33:04");
		Instant d06 = Instant.parse("2023-06-05T16:33:04Z");
		
		//PATERN DE DATAS
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//TRASNFORMA A DATA DE ACORDO COM O FUSO HORÁRIO APARTIR DO FUSO DO SISTEMA
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		
		System.out.println("d06 = " + fmt3.format(d06));
	}

}
