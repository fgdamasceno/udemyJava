package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProductExercicioFixacao;
import entities.ProductExercicioFixacao;
import entities.UsedProductExercicioFixacao;

public class ProgramExercicioFixacao {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<ProductExercicioFixacao> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char choice = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.print("");
			
			if (choice == 'i') {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				products.add(new ImportedProductExercicioFixacao(name, price, fee));
			}
			else if (choice == 'c') {
				products.add(new ProductExercicioFixacao(name, price));				
			}
			else if (choice == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				// LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); // IMPLEMENTACAO DO INSTRUTOR
				Date date = sdf.parse(sc.next()); // THIS IS IMPLEMENTED BY SimpleDateFormat AT LINE 21 		
				products.add(new UsedProductExercicioFixacao(name, price, date));
			}
			else {
				System.out.println("INVALID OPTION!");
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (ProductExercicioFixacao product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
