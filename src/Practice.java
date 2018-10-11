import java.util.Scanner;
public class Practice 
{

	public static void main(String[] args) 
	{
		//print a statement
		System.out.println("I know how to print to the screen");
			
		//create an integer, double, and string variable and initialize them
		int num; //declared (created) a variable that will store integers and is called num
		num = 20; //assigned a value -> first one is called the initialization
		double decimal = 3.1415962; //declared and initialized in one line
		String str = "This is a String with a capital S";
		
		//Print the contents of the variables
		System.out.println(num);
		System.out.println("\n" + decimal);
		System.out.println(str);
		
		//multiply int by 2 store in int
		//multiply the int by the double and store it in the double
		//then concatinate string with " concatination"
		num *= 2; //same as num = num * 2
		decimal = num * decimal;
		str += " concatination"; //str = str + " concatination"
		
		//print num: 40
		System.out.println("num: " + num);
		System.out.println("decimal: " + decimal);
		System.out.println("str: " + str);
		
		Scanner jawn = new Scanner(System.in);
		//your favorite sport is _____ and mine is football
		System.out.print("Please enter your favorite sport:  ");
		String favsport = jawn.nextLine();
		System.out.println("\n\nYour favorite sport is: " + favsport + " and mine is football");
		
	}

}
