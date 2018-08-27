import java.util.Scanner;

public class DegToCel {
	//c*(9/5) +32 = F
	//c=f-32*(5/9)
		public static void main(String[] args) {
			double fInput = -1.0;
			double oOutput = -1.0; 
			Scanner tempInput = new Scanner(System.in);
			//prompt user
			System.out.println("Please input a temperture in farenheit");
			//get input
			fInput = tempInput.nextDouble();
			//convert
			oOutput = (fInput-32.0) * (5.0/9.0);
			
			//spit out converted temp
			
			System.out.println("your temperture in celcius is " + oOutput);
			
			
			
			
		}


}
