package day41;

public class HouseTesterCaller {

	   
	
	public static void main(String[] args) {
		
		// Step 1: Create House object and assign data to fields/instance variables
		
		House yourHouse = new House();
		
		yourHouse.type = "Castle";
		yourHouse.address = "123 mnm st, Aus/TX, 67678";
		yourHouse.bedrooms = 10 ;
		yourHouse.year = 1989 ;
		
		//-----------------
		
        House myHouse = new House();
		
		myHouse.type = "Bungala";
		myHouse.address = "444 RRR st, Aus/TX, 66666";
		myHouse.bedrooms = 6 ;
		myHouse.year = 2000 ;

		
		// Step 2: pass your house object to printHouseInfo method
		
		printHouseInfo(yourHouse);
		printHouseInfo(myHouse);
		
		House returnHouse = buildAHouse("Bugalow", "65 Mirmir st, Austin/TX, 77777", 4, 2019);
		
		System.out.println(returnHouse.address);
		
	}
	
	
	
	
     public static void printHouseInfo(House houseObj) {
		
		
		System.out.println(" ===============  ");
		
		System.out.println("Type: "+houseObj.type);
		System.out.println("Address: "+houseObj.address);
		System.out.println("Bedrooms #: "+ houseObj.bedrooms);
		System.out.println("Year: "+houseObj.year);
		
		System.out.println(" ===============  ");
		
		
		
	}
     
     /*
 	 * Method: buildAHouse
 	 * Params: 2 Strings + 2 ints
 	 * Return type: House
 	 * 
 	 * In the method, using the values of parameters, 
 	 * build a new house object then return that. 
 	 */
     
     public static House buildAHouse(String type, String address, int rooms, int year) {
    	
    	 House newHouse = new House();
    	 
    	 newHouse.type = type ;
    	 newHouse.address = address ;
    	 newHouse.bedrooms = rooms ;
    	 newHouse.year = year ;
    	 
    	 
    	 
    	 
    	 return newHouse ;
     }
     
}
