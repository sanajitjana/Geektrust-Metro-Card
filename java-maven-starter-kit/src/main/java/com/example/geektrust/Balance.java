package com.example.geektrust;

import java.util.Objects;

public class Balance {

	private String cardNumber;
	private Integer balance;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Balance(String cardNumber, Integer balance) {
		super();
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	public Balance() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(balance, cardNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balance other = (Balance) obj;
		return Objects.equals(balance, other.balance) && Objects.equals(cardNumber, other.cardNumber);
	}

}
