import java.util.Scanner;
public class Output {
	
	
		public static void main( String[] args ) 
		{ Scanner sc = new Scanner(System.in);

	    String firstName;
	    int age;
	    String height;
	    double gpa;

	    System.out.print( "What is your first name? " );
	    firstName = sc.next();
	    

	    System.out.print( "How old are you? " );
	    age = sc.nextInt();

	    System.out.print( "How tall are you? " );
	    height = sc.next();

	    System.out.print( "What is your GPA? " );
	    gpa = sc.nextDouble();
	    
	    System.out.println( "Your first name is " + firstName);
	    
	    System.out.println( "Your age is " + age);
	    
	    System.out.println( "Your height is " + height);
	    
	    System.out.println( "Your GPA is " + gpa);
	    
	    /*Input/Output Debugging Assignment*/
	    
	    Scanner keyboard = new Scanner(System.in);

	    double num1, num2, num3;

	    System.out.print( "First integer? " );
	    num1 = keyboard.nextDouble();

	    System.out.print( "Second integer? " );
	    num2 = keyboard.nextDouble();

	    System.out.print( "Third integer? " );
	    num3 = keyboard.nextDouble();
	  
		 System.out.println( "The total is : " + (num1 + num2 + num3));

		}


}
