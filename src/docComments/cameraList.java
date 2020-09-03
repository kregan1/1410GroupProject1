package docComments;

import java.util.*;
import java.util.Scanner;

public class cameraList {
	public static void main(String[] args) {		
		
		//create arraylist of type cameras
		ArrayList<Camera> cameraArray = new ArrayList<Camera>();	
		
		//create 4 instances of cameras to hardcode into ArrayList
		Camera myCamera1 = new Camera("Canon", 18, 4);
		Camera myCamera2 = new Camera("Nikon", 12, 2);
		Camera myCamera3 = new Camera("Sony", 20, 3);
		Camera myCamera4 = new Camera("Fuji", 22, 4);
		
		//put cameras into arraylist
		cameraArray.add(myCamera1);
		cameraArray.add(myCamera2);
		cameraArray.add(myCamera3);
		cameraArray.add(myCamera4);
		
		String userDecision;
		int userDecisionInt;
		
		//do while loop
		do {
			
			//prompt user
			System.out.println("1. Show all cameras");
			System.out.println("2. Add a camera");
			System.out.println("3. Find a camera");
			System.out.println("4. Delete a camera");
			System.out.println("5. Number of cameras");
			System.out.println("6. Exit");
			System.out.print("Enter your selection: ");

			
			//create instance of scanner
			Scanner input = new Scanner(System.in);
			userDecision = input.nextLine();//user input
			System.out.println();
			
			//add conditional statements here
			
			userDecisionInt = Integer.parseInt(userDecision);
			
			switch (userDecisionInt) {
				case 1: 
					for (int i = 0; i < cameraArray.size(); i++) {
						System.out.println(cameraArray.get(i));
					}	
					break;
						
					
				case 2: 
					System.out.print("Make: ");
					String make = input.nextLine();
					System.out.print("Megapixels: ");
					String mPixels = input.nextLine();
					int mPixelsInt = Integer.parseInt(mPixels);
					System.out.print("Weight: ");
					String weight = input.nextLine();
					int weightInt = Integer.parseInt(weight);
					Camera myCamera5 = new Camera(make, mPixelsInt, weightInt);
					cameraArray.add(myCamera5);
					
					break;
					
				
				case 3: 
					System.out.print("ID: ");
					int idInput = input.nextInt();
					boolean noID = false;
					for(Camera camera : cameraArray) {
						if(camera.getId() == idInput) {
							System.out.println(camera);
						}else {
							noID = true;
						}
					}
					if(noID = true) {
						System.out.println("Invalid ID.");
					}
					
					break;
					
				
				case 4: 
					if(cameraArray.size() != 1) {
						System.out.print("ID to Remove: ");
						idInput = input.nextInt();
						noID = false;
						for(int i = 0; i <= cameraArray.size()-1; i++) {
							if(cameraArray.get(i).getId() == idInput) {
								cameraArray.remove(i);
								System.out.println(cameraArray.get(i) + " has been deleted");
							}else {
								noID = true;
							}
						}
						if(noID = true) {
							System.out.println("Invalid ID.");
						}
					}
					break;
					
				case 5: 
					System.out.println("Number of cameras: " + cameraArray.size());
					break;
			
				case 6: 
					System.out.println("Goodbye");
					break;
				
				default:
					System.out.println("Please enter a value 1-6.");
					break;
		}
			System.out.println();
		
		}while(userDecisionInt != 6); 			
	}
}
