package Entities;

public abstract class TaxPayer {
	private String name;
	private double anualIncome;

	public TaxPayer() {

	}

	public TaxPayer(String nome, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract double tax();

}

	
