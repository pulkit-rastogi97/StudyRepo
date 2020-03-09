package com.psl.cityMap.pl;

import com.psl.cityMap.bean.CityStateMap;

public class MapMain {
	
	public static void main(String[] args) {
		
		CityStateMap<String,String> cityState = new CityStateMap<>();
			
		cityState.put("Pune", "MH");
		cityState.put("Gurgaon", "Haryana");
		cityState.put("Pune", "HR");
		cityState.put("Hello", "Haryana");
		
		System.out.println(cityState);
		
		System.out.println(cityState.keySet());
		
		System.out.println(cityState.values());
		
		System.out.println(cityState.getAllCitiesForState(cityState, "Haryana"));
		
		cityState.deleteAllCitiesForState(cityState.getAllCitiesForState(cityState, "Haryana"));
		System.out.println(cityState);
	}
}
