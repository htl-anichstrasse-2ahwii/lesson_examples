package org.htl.lesson_examples.JUnit;

/**
 * @author albert 
 * Store currency and amount
 */
public class Money {
	private double amount;
	private String currency;

	public Money(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public static Money add(Money m1, Money m2) {
		if (m1.getCurrency().equals(m2.getCurrency())) {
			return new Money(m1.getAmount() + m2.getAmount(), m1.getCurrency());
		}
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Money) {
			Money m = (Money) obj;
			return m.getAmount() == amount && m.getCurrency().equals(currency);

		}
		return false;
	}

	@Override
	public String toString() {
		return amount + "(" + currency + ")";
	}

	public static void main(String[] args) {
		Money m1 = new Money(10, "EUR");
		Money m2 = new Money(10, "EUR");

		if (m1.equals(m2)) {
			System.out.println("gleich!");
		}
	}
}