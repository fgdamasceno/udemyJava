package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		/*
		 * DOCUMENTAÇÃO:
		 * DateTimeFormatter
		 * https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 * 
		 * REGRAS PARA CONVERSÃO DE DATA-HORA PARA TEXTO E TEXTO PARA DATA-HORA
		 * 
		 * OBS.: 
		 * IMPORTANTE => EM JAVA, DATA-HORA SÃO OBJETOS IMUTAVEIS. 
		 * UMA VEZ INSTANCIADOS, NAO PODEM SER ALTERADOS.
		 * PARA OBTER UMA HORA EDITADA, PEGA-SE UM OBJETO DATA-HORA, REALIZA-SE O CALCULO E O RESULTADO
		 * É SALVO EM OUTRO OBJETO 
		 */
		

		// ===> INSTANCIACAO <===

		// ---> DATA-HORA LOCAL <---
		LocalDate d01 = LocalDate.now(); // CAPTURA A DATA LOCAL DO SISTEMA OPERACIONAL
		LocalDateTime d02 = LocalDateTime.now(); // CAPTURA A DATA-HORA LOCAL DO SISTEMA OPERACIONAL

		LocalDate d04 = LocalDate.parse("2024-08-13"); // INSTANCIA O OBJETO COM DATA LOCAL CUSTOMIZADA
		LocalDateTime d05 = LocalDateTime.parse("2024-08-13T15:17:11"); // INSTANCIA O OBJETO COM DATA-HORA LOCAL
																		// CUSTOMIZADA
		// VER DOCUMENTAÇÃO DateTimeFormatter
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // CRIA UM PADRÃO CUSTOMIZADO
		LocalDate d08 = LocalDate.parse("19/10/2024", fmt1); // ESPECIFICANDO UM FORMATO DE DATA LOCAL
																// DESEJADO/CUSTOMIZADO
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("19/10/2024 03:19", fmt2);
		// OU
		// LocalDateTime d09 = LocalDateTime.parse("19/10/2024 03:19",
		// DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d10 = LocalDate.of(2024, 10, 19); // INSTANCIA DATA LOCAL PASSANDO ANO, MES E DIA COMO ARGUMENTOS
		LocalDateTime d11 = LocalDateTime.of(2024, 10, 19, 14, 47); // INSTANCIA DATA-HORA LOCAL PASSANDO ANO, MES, DIA,
																	// HORA E MINUTOS COMO ARGUMENTOS
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);

		
		// ---> DATA-HORA GLOBAL <---
		Instant d03 = Instant.now(); // CAPTURA A DATA-HORA GLOBAL "GMT 0" (GREENWICH MERIDIONAL TIME)
		Instant d06 = Instant.parse("2024-08-13T01:17:11Z"); // INSTANCIA O OBJETO COM DATA-HORA GLOBAL CUSTOMIZADA "GMT
																// 0"
		Instant d07 = Instant.parse("2024-08-13T15:17:11-03:00"); // INSTANCIA O OBJETO COM DATA-HORA GLOBAL CUSTOMIZADA
																	// PARA "GMT-3)
		System.out.println("d03 = " + d03);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);

		
		// ---> DATA-HORA PARA TEXTO
		// ---> * DATA LOCAL
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("DATA PARA TEXTO = " + d04.format(fmt3)); // CONVERTEM DO PADRÃO ISO 8601 
		System.out.println("DATA PARA TEXTO = " + fmt3.format(d04)); // PARA O PADRÃO CUSTOMIZADO
		System.out.println("DATA PARA TEXTO = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("DATA-HORA PARA TEXTO = " + d05.format(fmt4)); // CONVERTEM DO PADRÃO ISO 8601 
		System.out.println("DATA-HORA PARA TEXTO = " + fmt4.format(d05)); // PARA O PADRÃO CUSTOMIZADO
		System.out.println("DATA-HORA PARA TEXTO = " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		// OBSERVE TAMBEM A SAÍDA DAS DUAS LINHAS ABAIXO COM DIFERENTES FORMATAÇOES
		System.out.println("DATA-HORA PARA TEXTO = " + d05.format(fmt3)); // FORMATO LocalDate SOMENTE DATA
		System.out.println("DATA-HORA PARA TEXTO = " + d05.format(fmt4)); // FORMATO LocalDateTime COM DATA-HORA
		
		// ---> * DATA GLOBAL
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("DATA-HORA GLOBAL PARA TEXTO = " + fmt5.format(d03)); // DATA-HORA CHAMADA PELO PROGRAMA
		System.out.println("DATA-HORA GLOBAL PARA TEXTO = " + fmt5.format(d06)); // DATA-HORA FORNECIDA PELO USUARIO
		
		// ---> * UTILIZANDO OUTRO PADRAO DA DOCUMENTAÇÃO
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME; // DATE-TIME COM ZONE ID FORMATO ISO
		System.out.println("DATA-HORA PARA TEXTO = " + d05.format(fmt6));
		
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("DATA-HORA GLOBAL PARA TEXTO = " + fmt7.format(d03));
		
		
		// ---> CONVERTER DATA-HORA GLOBAL PARA LOCAL
		// ZoneId.getAvailableZoneIds();
		LocalDate conversao1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("CONVERSAO DATA-HORA GLOBAL PARA LOCAL = " + conversao1);
		
		LocalDate conversao2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("CONVERSAO DATA-HORA GLOBAL PARA LOCAL = " + conversao2);
		
		LocalDateTime conversao3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("CONVERSAO DATA-HORA GLOBAL PARA LOCAL = " + conversao3);
		
		LocalDateTime conversao4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("CONVERSAO DATA-HORA GLOBAL PARA LOCAL = " + conversao4);
		
		
		// ---> OBTENDO DADOS DATA-HORA LOCAL
		// LocalDate
		System.out.println("DIA = " + d01.getDayOfMonth());
		System.out.println("MES = " + d01.getMonthValue());
		System.out.println("ANO = " + d01.getYear());
		// LocalDateTime
		System.out.println("HORA:MINUTO = " + d02.getHour() + ":" + d02.getMinute());
		
		
		// ---> CALCULOS COM DATA E HORA
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		System.out.println("SEMANA ATUAL = " + d01 + ", SEMANA ANTERIOR = " + pastWeekLocalDate);
		
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		System.out.println("SEMANA ATUAL = " + d01 + ", PROXIMA SEMANA = " + nextWeekLocalDate);
		
		LocalDateTime pastYearLocalDateTime = d02.minusYears(1);
		System.out.println("ANO ATUAL = " + d02 + ", ANO ANTERIOR = " + pastYearLocalDateTime);
		
		LocalDateTime nextYearLocalDateTime = d02.plusYears(1);
		System.out.println("ANO ATUAL = " + d02 + ", ANO ANTERIOR = " + nextYearLocalDateTime);
		 
		Instant pastDaysInstant = d03.minus(6, ChronoUnit.DAYS); // NAO SUPORT .MONTHS
		System.out.println("DIA ATUAL = " + d03 + ", DIAS ANTERIORES = " + pastDaysInstant);
		
		Instant nextDaysInstant = d03.plus(6, ChronoUnit.DAYS); // NAO SUPORT .MONTHS
		System.out.println("DIA ATUAL = " + d03 + ", PROXIMOS DIAS = " + nextDaysInstant);
		
		/*
		 * UTILIZAM-SE OS MESMOS MÉTODOS PARA LocalDate, LocalDateTime e Instant
		 */
		
		
		// ---> DURATION <---
		// LocalDate
		// Duration d1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0)); // ESTE E O DE BAIXO EXIBEM O MESMO RESULTADO
		Duration d1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		System.out.println("DURAÇÃO = " + d1.toDays() + " DIAS");;		
		
		// LocalDateTime
		Duration d2 = Duration.between(pastYearLocalDateTime, d02);
		System.out.println("DURAÇÃO = " + d2.toDays() + " DIAS");
		
		// Instant
		Duration d3 = Duration.between(pastDaysInstant, d03);
		System.out.println("DURAÇÃO = " + d3.toDays() + " DIAS");
		/*
		 * OBS.: OS ARGUMENTO EM .between(a1, a2) PODEM SER LANCADOS INVERTIDOS
		 * PORÉM, DEPENDENDO DA ORDER MAIOR VALOR x MENOR VALOR, O RESULTADO
		 * PODE RETORNAR COM VALOR NEGATIVO
		 */

		// ---> OUTROS <---

		/*
		 * TODAS AS HORAS ACIMAS ESTÃO SENDO INSTANCIADAS COMO OBJETOS QUANDO VAMOS
		 * IMPRIMÍ-LAS COM System.out, O OBJETO CHAMA SEU MÉTODO toString(); DESTA
		 * FORMA, PODERIAMOS IGUALMENTE UTILIZAR A FORMA ABAIXO PARA EXIBÍ-LOS: EXEMPLO
		 * -> System.out.println("d01 = " + d01.toString()); E TERIAMOS O MESMO
		 * RESULTADO. ESTE toString() FORMATA O TEXTO EXIBIDO-O NO FORMATO "ISO 8601" POR
		 * PADRÃO
		 * 
		 * NA FORMATAÇÃO UTILIZANDO DateTimeFormatter, A DATA PASSADA COMO ARGUMENTO
		 * SERÁ CONVERTIDA PARA O PADRAO ISO 8601
		 */

	}

}
