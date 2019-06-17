package day41;
import java.util.*;

import java.util.Arrays;

public class HouseTester {
	public static void main(String[] args) {
		
		House house1 = new House();
		house1.type = "Townhouse";
		house1.bedrooms = 3 ;
		house1.address = "12 main st. Sterling/VA, 11111";
		house1.year = 1986 ;
		
		
		House house2 = new House();
		house2.type = "Bungalow";
		house2.bedrooms = 2 ;
		house2.address = "123 Bluff rd. Sterling/VA, 11111";
		house2.year = 2010 ;
		
		House house3 = new House();
		house3.type = "Condominium";
		house3.bedrooms = 2 ;
		house3.address = "1111 Bbb st. Sterling/VA, 12345";
		house3.year = 1975 ;
		
		House whiteHouse = new House();
		whiteHouse.type = "Mansion";
		whiteHouse.bedrooms = 132 ;
		whiteHouse.address = "1600 penny st. Washington/DC, 20000";
		whiteHouse.year = 1800 ;
		
		House EsqersHouse = new House();
		EsqersHouse.type = "Townhouse";
		EsqersHouse.address = "some shit :))) ";
		EsqersHouse.bedrooms = 3 ;
		EsqersHouse.year = 1980 ;
		
		
		System.out.println("House1 type: "+house1.type);
		System.out.println("House2 type: "+house2.type);
		System.out.println("House3 type: "+house3.type);
		System.out.println("White House type: "+whiteHouse.type);
		
		
		int[] nums = new int[4];
		nums[0] = 3; nums[1] = 4;

		String[] names = new String[5];
		names[1] = "cahit"; names[2] = "jack";

		// in these codes, the data type is class name. so after creating our classes, we can 
		// create arrays from them as well. 

		House[] houses = new House[5];
		houses[0] = house1 ;
		houses[1] = house2 ;
		houses[2] = house3 ;
		houses[3] = whiteHouse ;
		houses[4] = EsqersHouse ;
		
		System.out.println(houses[0].address);
		
		System.out.println("---- each address with loop ------");
		
		for( House each: houses ) {
			System.out.println(each.type+": "+ each.address);
		}
		System.out.println(" ------- regular for loop ------");
		
		for (int i = 0; i < houses.length; i++) {
			System.out.println(houses[i].address);
		}
		
		System.out.println("======== ARRAYLIST OF HOUSE OBJECTS ========== ");
		
	ArrayList<Integer> numList = new ArrayList<>();
	
	ArrayList<House> housesList = new ArrayList<>();
	
	housesList.add(house1);
	housesList.add(house2);
	housesList.add(house3);
	housesList.add(whiteHouse);
	housesList.add(EsqersHouse);
	
	System.out.println(housesList);
	
	// WE ARE ABLE TO ADD HOUSES AT ONCE IN BELOW CODE 
	// BECAUSE WE HAVE CREATED houses Array IN ABOVE CODES. 
	
	ArrayList<House> housesList2 = new ArrayList<>(Arrays.asList(houses));
	
	List<House> housesList3 = Arrays.asList(houses); // this type of List is NOT DYNAMIC. fixed size ArrayList. 
	
	System.out.println("----------");
	/*
	 * Print year of each house object in arraylist 
	 * if year is between 2006 and 2016
	 */
	
	for (House h:housesList ) {
		
		if(h.year >= 2006 && h.year <=2016) {
			System.out.println(h.year + " | "+h.address);
		}
		
	}
	
	System.out.println("--- with regular for loop ------");
	
	for (int i = 0; i < housesList.size(); i++) { // here size() because it is arraylist 
		House tempHouse = housesList.get(i);
		
		if(tempHouse.year >= 2006 && tempHouse.year <= 2016 ) {
			System.out.println(tempHouse.year + " | " + tempHouse.address);
		}
		
	}
	
	
		
		
		
		
		
	}

	
	
	
}







