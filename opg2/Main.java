import java.util.Scanner;
class Main{
	

	public static void main(String [] args){

	Scanner name = new Scanner(System.in); 
    System.out.println("Please type your name");

    String userName = name.nextLine();  // ser input fra bruger
	
	Scanner age = new Scanner(System.in); 
    System.out.println("hi "+userName+" Please type your age");
    
    int userAge = age.nextInt();

    int retire=67 - userAge;

    System.out.println("your name is: " + userName + " and you have " +retire+ " years back to retirement" );  // udskriver den data der er sat ind

	}
}