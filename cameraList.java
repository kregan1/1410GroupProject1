package docComments;

import java.util.ArrayList;
import java.util.Scanner;

public class cameraList {
	ArrayList<Cameras> cameraArray = new ArrayList<Cameras>();	//create arraylist of type cameras
	
	//create 4 instances of cameras to hardcode into ArrayList
	Cameras myCamera1 = new Cameras("Canon", 18, 4);
	Cameras myCamera2 = new Cameras("Nikon", 12, 2);
	Cameras myCamera3 = new Cameras("Sony", 20, 3);
	Cameras myCamera4 = new Cameras("Fuji", 22, 4);
	
	//put cameras into arraylist
	cameraArray.add(myCamera1);
	cameraArray.add(myCamera2);
	cameraArray.add(myCamera3);
	cameraArray.add(myCamera4);
	
	//create instance of scanner
	Scanner input = new Scanner(System.in);
	System.out.printf("1. Show all cameras%n 2. Add a camera%n 3. Find a camera%n 4. Delete a camera%n"
			+ "5. Number of cameras%n 6. Exit%n Enter your selection: ");
	String userDecision = input.nextLine();		//user input 
	
	
	while(!userDecision.equalsIgnoreCase("6")) {	//loop while user does not input 6
		System.out.printf("1. Show all cameras%n 2. Add a camera%n 3. Find a camera%n 4. Delete a camera%n"
				+ "5. Number of cameras%n 6. Exit%n Enter your selection: ");		
	}
}
