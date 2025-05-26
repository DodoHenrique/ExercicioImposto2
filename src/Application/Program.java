package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer" + i + "data");
			System.out.print("Individual or company (i/c)");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Anual income: ");
			Double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.println("Health Expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				Individual x = new Individual(name, anualIncome, healthExpenditures);
				list.add(x);
			} else {
				System.out.println("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				Company x = new Company(name, anualIncome, numberOfEmployees);
				list.add(x);
			}
		}

		System.out.println();
		System.out.println("TAXES PAID");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}

		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		System.out.println("Total Taxes: $ " + String.format("%.2f", sum));
		sc.close();
	}
}
