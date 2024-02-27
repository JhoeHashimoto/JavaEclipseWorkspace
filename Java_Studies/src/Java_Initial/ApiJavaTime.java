package Java_Initial;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Instant;

//import java.time.*;


public class ApiJavaTime {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Utilização da classe java.time.LocalDate
		
		
		//Classe LocalDate nomevariavel = classe.metodoagora();
		//now é hoje
		LocalDate localdate = LocalDate.now();

		System.out.println(localdate);
		
		System.out.println("Dia da semana (nome): "+ localdate.getDayOfWeek().name());
		
		System.out.println("Mês " + localdate.getMonthValue());
		
		System.out.println("Ano " + localdate.getYear());
		
		
		//Subtraindo um dia
		LocalDate localdateontem = localdate.minusDays(1);
		System.out.println(localdateontem);
		
		//////////////////////////////////////////
		
		//DESCOBRINDO A HORA EM TOKYO
		
		System.out.println("*************************************");
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		ZonedDateTime agoraTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		
		System.out.println(agoraTokyo);
		
		//IMPRIMINDO E SABENDO TODAS AS ZONAS
			for (String s : ZoneId.getAvailableZoneIds()) {
				System.out.println(s);
		}
		
		
		Instant inicio = Instant.now();
		//PARE POR 6segundos e depois execute
		Thread.sleep(6000);
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(inicio, fim);
		
		System.out.println("Duração em nanosegundos: " + duracao.toNanos());
		System.out.println("Duração em milisegundos: "+ duracao.toMillis());
		System.out.println("Duração em segundos: "+ duracao.toSeconds());
		System.out.println("Duração em minutos: "+ duracao.toMinutes());
		System.out.println("Duração em horas: "+ duracao.toHours());
		System.out.println("Duração em dias: "+ duracao.toDays());
		
		
	}

}
