import java.util.Scanner;

public class CelciusConverter {
	


//c*(9/5) +32 = F
	public static void main(String[] args) {
		double cInput = -1.0;//celcius input
		double fOutput = -1.0;//farenheit output 
		Scanner tempInput = new Scanner(System.in);
		//prompt user
		System.out.println("Please input a temperture in celcius");
		//get input
		cInput = tempInput.nextDouble();
		//convert
		fOutput = cInput*(9/5)+32;
		//spit out converted temp
		System.out.println("your temperture in farenheit is " + fOutput);
		
		
		
		
	}



}
