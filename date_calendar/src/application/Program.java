package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// DATE
		
		Date d1 = new Date();
		Date d2 = new Date(System.currentTimeMillis());
		Date d3 = new Date(0); // EXIBE A DATA ANTES DO INICIO DO ARMAZENAMENTO DE DATA/TEMPO
		Date d4 = new Date(1000L * 60L * 60L * 5L); // PARA IMPRIMIR A DATA AS 5h DA MANHA
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("----------------------------------");
		System.out.println("y1 = " + y1);
		System.out.println("y1 = " + sdf1.format(y1));
		System.out.println("y2 = " + y2);
		System.out.println("y2 = " + sdf2.format(y2));
		System.out.println("y3 = " + y3);
		System.out.println("y3 = " + sdf2.format(y3));
		System.out.println("----------------------------------");
		System.out.println("d1 = " + sdf3.format(d1));
		System.out.println("d2 = " + sdf3.format(d2));
		System.out.println("d3 = " + sdf3.format(d3));
		System.out.println("d4 = " + sdf3.format(d4));
		System.out.println("y1 = " + sdf3.format(y1));
		System.out.println("y2 = " + sdf3.format(y2));
		System.out.println("y3 = " + sdf3.format(y3));
		System.out.println("----------------------------------");
		
		// CALENDAR
		// >>> SOMANDO UMA UNIDADE DE TEMPO (MINUTOS, HORAS, DIAS, SEMANAS, MESES, ANOS, ECT) A UMA DATA
		// SERAO UTILIZADOS NO EXEMPLO sdf2, y3
		
		System.out.println(sdf2.format(y3));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(y3); // CALENDARIO COM A DATA DE y3 INSTANCIADA DENTRO DELE
		cal.add(Calendar.HOUR_OF_DAY, 4);
		y3 = cal.getTime();
		System.out.println(sdf2.format(y3));
		
		// >>> OBTENDO UMA UNIDADE DE TEMPO (MINUTOS, HORAS, DIAS, SEMANAS, MESES, ANOS, ECT) DE UMA DATA
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("MINUTES = " + minutes);
		System.out.println("MONTHS = " + month);
		

	}

}
