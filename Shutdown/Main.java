import java.io.IOException;

public class Main { //Start 


	/*
	private static final String OS;

	
	//anyway OS : Operating System
	public static void ShutDownWithCustomSecondsWithCheckerOnOS() throws IOException {}	
	
	*/
	
	
	
	public static void ShutDownWindowsWithCustomSeconds(int sec) throws IOException {
		Runtime r = Runtime.getRuntime();
		System.out.println("[Important] Your OS will be shutdown after "+sec);
		r.exec("shutdown -r -t " + sec); 
		
	}
	
	
	
	public static void main(String OS[]) throws IOException {
		//ShutDownWindowsWithCustomSeconds(3);
	}	
	
	






} //End
