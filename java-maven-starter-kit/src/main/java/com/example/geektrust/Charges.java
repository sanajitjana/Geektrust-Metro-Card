package com.example.geektrust;

import java.util.HashMap;
import java.util.Map;

public class Charges {

	private Map<String, Integer> travelCharges = new HashMap<>();

	public Charges() {

		travelCharges.put("ADULT", 200);
		travelCharges.put("SENIOR_CITIZEN", 100);
		travelCharges.put("KID", 50);
	}

	public Integer getCharges(String passengerType) {
		return travelCharges.getOrDefault(passengerType, 0);
	}

}
