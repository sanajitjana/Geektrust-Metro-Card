package com.example.geektrust;

import java.util.Objects;

public class CheckIn {

	private String cardNumber;
	private String passengerType;
	private String startingPoint;

	public CheckIn() {
		// TODO Auto-generated constructor stub
	}

	public CheckIn(String cardNumber, String passengerType, String startingPoint) {
		super();
		this.cardNumber = cardNumber;
		this.passengerType = passengerType;
		this.startingPoint = startingPoint;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardNumber, passengerType, startingPoint);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckIn other = (CheckIn) obj;
		return Objects.equals(cardNumber, other.cardNumber) && Objects.equals(passengerType, other.passengerType)
				&& Objects.equals(startingPoint, other.startingPoint);
	}

}
