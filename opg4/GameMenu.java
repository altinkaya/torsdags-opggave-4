import java.util.ArrayList;


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

}
