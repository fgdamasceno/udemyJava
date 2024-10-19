package application;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		/*
		 * DOCUMENTAÇÃO:
		 * DateTimeFormatter
		 * https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 * 
		 * REGRAS PARA CONVERSÃO DE DATA-HORA PARA TEXTO E TEXTO PARA DATA-HORA
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
		Instant d06 = Instant.parse("2024-08-13T15:17:11Z"); // INSTANCIA O OBJETO COM DATA-HORA GLOBAL CUSTOMIZADA "GMT
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
		
		
		// ---> DURATION <---

		// ---> OUTROS <---

		/*
		 * TODAS AS HORAS ACIMAS ESTÃO SENDO INSTANCIADAS COMO OBJETOS QUANDO VAMOS
		 * IMPRIMÍ-LAS COM System.out, O OBJETO CHAMA SEU MÉTODO toString(); DESTA
		 * FORMA, PODERIAMOS IGUALMENTE UTILIZAR A FORMA ABAIXO PARA EXIBÍ-LOS: EXEMPLO
		 * -> System.out.println("d01 = " + d01.toString()); E TERIAMAS O MESMO
		 * RESULTADO ESTE toString() FORMATA O TEXTO EXIBIDO NO FORMATO "ISO 8601" POR
		 * PADRÃO
		 * 
		 * NA FORMATAÇÃO UTILIZANDO DateTimeFormatter, A DATA PASSADA COMO ARGUMENTO
		 * SERÁ CONVERTIDA PARA O PADRAO ISO 8601
		 */

	}

}
