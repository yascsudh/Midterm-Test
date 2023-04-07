package CYB595;
import java.util.Scanner;
public class Lab1InClass {
public static void main (String [] args) { 
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Number Here: ");
	String userinput =scan.next();
	try {
	
	oddeven (Integer.parseInt(userinput));
} catch (NumberFormatException e) {
	System.out.println ("This is not an Integer. Please input again");
	userinput =scan.next();
	oddeven (Integer.parseInt(userinput));}
}
public static void oddeven (int x) {
	if(x % 2== 0)
	System.out.println("This Number is Even");
	else 
		System.out.println("This Number is Odd");
}

}
