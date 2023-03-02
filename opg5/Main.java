import java.util.ArrayList;
import java.util.Scanner;

class Main{

public static void main(String [] args){

		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu game1 = new GameMenu(actions);


		String s = game1.getAction();

		int a = Integer.parseInt(s);

		doAction(a);

		

}
public static void doAction(int action){

 
		      System.out.println("");

            switch (action) {
                case 1:  System.out.println("Start game");
                         break;
                case 2:  System.out.println("Resume game");
                         break;
                case 3:  System.out.println("Pause game");
                         break;
                case 4:  System.out.println("End game");
                         break;
               
            }
            
        }


}








