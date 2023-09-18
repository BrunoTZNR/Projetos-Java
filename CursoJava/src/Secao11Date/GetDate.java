package Secao11Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetDate {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		//PEGA A DATA LOCAL Y/m/d
		LocalDate d01 = LocalDate.now();
		//PEGA A DATA E HORA LOCAL Y/m/dTH:m:i
		LocalDateTime d02 = LocalDateTime.now();
		//PEGA A DATA E HORA DO GMT0(MERIDIANO DE GREENWISH) Y/m/dTH:m:iZ
		Instant d03 = Instant.now();
		
		//TRANSFORMA UMA STRING EM UMA LOCALDATE
		LocalDate d04 = LocalDate.parse("2023-06-05");
		//TRANSFORMA UMA STRING EM UMA LOCALDATETIME
		LocalDateTime d05 = LocalDateTime.parse("2023-06-05T16:33:04");
		//TRANSFORMA UMA STRING EM UMA DATETIME DO GMT0(MERIDIANO DE GREENWISH) Y/m/dTH:m:iZ
		Instant d06 = Instant.parse("2023-06-05T16:33:04Z");
		
		//REAJUSTA O FUSO HORARIO - OU + EX: GMT-03:00
		Instant d07 = Instant.parse("2023-06-05T16:33:04-03:00");
	
		//TRANSFORMA UMA STRING EM UMA LOCALDATE APARTIR DE UM FORMATO
		LocalDate d08 = LocalDate.parse("05/06/2023", fmt01);
		//TRANSFORMA UMA STRING EM UMA LOCALDATETIME APARTIR DE UM FORMATO
		LocalDateTime d09 = LocalDateTime.parse("05/06/2023 16:10:01", fmt02);
		
		//TRANSFORMA UMA STRING EM UMA LOCALDATE APARTIR DE PARAMETROS PARA UMA FUNÇÃO
		LocalDate d10 = LocalDate.of(2023, 06, 05);
		//TRANSFORMA UMA STRING EM UMA LOCALDATETIME APARTIR DE PARAMETROS PARA UMA FUNÇÃO
		LocalDateTime d11 = LocalDateTime.of(2023, 06, 05, 16, 10);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
