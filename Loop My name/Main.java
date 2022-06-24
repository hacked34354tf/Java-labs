import java.util.*;

public class Main { //start

	public static void main(String args[]) { 
		Scanner on = new Scanner(System.in);
		int cin; 
		String name;
		
		System.out.println("Enter Your name here please !");
		name = on.nextLine();		
		
		System.out.println("How many times do you want to print your name ?");		
		cin = on.nextInt();		
		
		
		for (int i = 0 ; i < cin;i++) {
			System.out.println(name);
		}
	}
	
	
} //End
	