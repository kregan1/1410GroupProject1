package docComments;

import java.util.ArrayList;
import java.util.Scanner;

public class cameraList {
	public static void main(String[] args)
	{
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
		String userDecision;
		System.out.println("1. Show all cameras");
		System.out.println("2. Add a camera");
		System.out.println("3. Find a camera");
		System.out.println("4. Show all cameras");
		System.out.println("5. Delete a camera");
		System.out.println("6. Exit");
		System.out.println("Enter your selection: ");
		
		do {
		Scanner input = new Scanner(System.in);
		userDecision = input.nextLine();		//user input
		
		//add switch statement here
		
		
		}while(!userDecision.equals("6")); 		
		
	
	}
}
