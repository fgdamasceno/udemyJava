package problema_exemplo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import problema_exemplo.model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next()); // RECEBE DATA COMO STRING, QUE É POSTERIORMENTE CONVERTIDA PARA O FORMATO DATA
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date.");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next()); // RECEBE DATA COMO STRING, QUE É POSTERIORMENTE CONVERTIDA PARA O FORMATO DATA
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			// SOLUÇÃO MUITO RUIM
			/*
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates.");
			}
			else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date.");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);	
			}
			
			*/
			// FIM SOLUÇÃO MUITO RUIM
			// ESTA SOLUÇÃO DEVERIA ESTAR NA CLASSE 'RESERVATION', RESPONSAVEL PELA RESERVA, (delegação) NAO NO PROGRAMA PRINCIPAL
			
			// =========================================================================================
			
			// SOLUÇÃO RUIM
			
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);			
		}
		
		
		
		
		sc.close();
	}

}
