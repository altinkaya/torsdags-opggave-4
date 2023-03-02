import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
    
 	}


    private static void makeAGuess(){
		// Create a Scanner object 

        Scanner guess = new Scanner(System.in); 

    	// Read user input

        String input;

    	
        //use hasNextDouble to check if input is numeric, 
           
            if(guess.hasNextDouble()){  
                input = guess.nextLine();
                System.out.println("your gues is " + input); 
               
             double valueGuess = Double.parseDouble(input);

                  if(valueGuess < rnd_number ) {
            System.out.println("guess again the value is lower");
            makeAGuess();
        }
else if (valueGuess > rnd_number ) {
            System.out.println("guess again the value is higher");
            makeAGuess();
        }

        else {
            System.out.println("your guess is correct the value was"+rnd_number);
        }
                            

            }  
            else{  
               guess.nextLine();
                System.out.println("the vaule is not a number please input a number: ");  
                makeAGuess();
            }  



        // if so...



        //   Compare it with the random number
        

        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   

}
