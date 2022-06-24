import java.util.*;

public class Main 
{ //Start

  
	
public static void main(String[] args) 
{
Sleep("Let's see how much you love Write two names after 5 seconds and wait for the result\r\n"
		+ "*Note* The result is random only for entertainment and does not mean that it is a real result" , "Write two names please ! :)" ,5000);

try (Scanner Object = new Scanner(System.in)) 
{
	String name1,name2;
	//First name
	System.out.println();
	System.out.println();
	System.out.println("Write First name please :");
	name1 = Object.nextLine();
	
	//Second Name
	System.out.println("Write Second name please :");
	name2 = Object.nextLine();
	
	Sleep("Please wait a few seconds for the result to come out..!","The percentage of love for these names ("+name1+"/"+name2+") = ❤️"+Love()+"%", 5000);
}
System.out.println("Written by Sanhak ($anhak#1398)");
}




public static void Sleep(String before, String After , int i)
{
	
	System.out.println(before);

	try {		
	Thread.sleep(i);	
	} catch (InterruptedException e) 	
	{			
	System.out.println("Interrupted");		
    }
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(After);
	
}

public static String Love() 
{
	String Result = "";
	int length = 2;
	char[] chars = "1234567890".toCharArray();
	Random Rand12 = new Random();
	for (int i = 0 ; i < length ;++i) 
	{
		Result = Result + chars[Rand12.nextInt(chars.length)];
	}
	return Result;
	
}



} //End