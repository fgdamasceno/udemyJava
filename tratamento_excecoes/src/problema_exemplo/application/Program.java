package problema_exemplo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import problema_exemplo.model.entities.Reservation;
import problema_exemplo.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next()); // RECEBE DATA COMO STRING, QUE É POSTERIORMENTE CONVERTIDA PARA O FORMATO
													// DATA
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
	
			// SOLUCAO BOA
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
	
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next()); // RECEBE DATA COMO STRING, QUE É POSTERIORMENTE CONVERTIDA PARA O FORMATO DATA
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
	
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}

		/*
		 * if (!checkOut.after(checkIn)) { System.out.
		 * println("Error in reservation: Check-out date must be after check-in date.");
		 * } else { Reservation reservation = new Reservation(number, checkIn,
		 * checkOut); System.out.println("Reservation: " + reservation);
		 * 
		 * System.out.println();
		 * System.out.println("Enter data to update the reservation:");
		 * System.out.print("Check-in date (dd/MM/yyyy): "); checkIn =
		 * sdf.parse(sc.next()); // RECEBE DATA COMO STRING, QUE É POSTERIORMENTE
		 * CONVERTIDA PARA O FORMATO DATA
		 * System.out.print("Check-out date (dd/MM/yyyy): "); checkOut =
		 * sdf.parse(sc.next());
		 * 
		 * reservation.updateDates(checkIn, checkOut);
		 * System.out.println("Reservation: " + reservation);
		 * 
		 * 
		 * // SOLUCAO MUITO RUIM
		 * 
		 * Date now = new Date(); if (checkIn.before(now) || checkOut.before(now)) {
		 * System.out.
		 * println("Error in reservation: Reservation dates for update must be future dates."
		 * ); } else if (!checkOut.after(checkIn)) { System.out.
		 * println("Error in reservation: Check-out date must be after check-in date.");
		 * } else { reservation.updateDates(checkIn, checkOut);
		 * System.out.println("Reservation: " + reservation); }
		 * 
		 * // FIM SOLUCAO MUITO RUIM // ESTA SOLUCAO DEVERIA ESTAR NA CLASSE
		 * 'RESERVATION', RESPONSAVEL PELA RESERVA, (delegacao) NAO NO PROGRAMA
		 * PRINCIPAL
		 * 
		 * 
		 * //
		 * =============================================================================
		 * ============
		 * 
		 * 
		 * // PARTE DA SOLUCAO RUIM
		 * 
		 * String error = reservation.updateDates(checkIn, checkOut); if (error != null)
		 * { System.out.println("Error in reservation: " + error); } else {
		 * System.out.println("Reservation: " + reservation); } // FIM DA PARTE DA
		 * SOLUCAO RUIM
		 * 
		 * 
		 * }
		 */

		sc.close();
	}

}
