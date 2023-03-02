import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{


private ArrayList<String> actions = new ArrayList<>();

GameMenu(ArrayList actions)
{

	this.actions=actions;
}



public void displayMenu ()
{

			for (String s: actions)
			{
			System.out.println(s);
		}
}

public String getAction(){

	System.out.println("Type a number to choose an action");

	for (String s: actions)
			{
			System.out.println(s);



}

		Scanner select = new Scanner(System.in);
		String choice = select.nextLine();
		return choice;




}



}
