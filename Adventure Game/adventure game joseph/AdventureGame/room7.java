public class room7
{
	static int tries = 0;
	static boolean attempting = false;
	static boolean keydiscovered = false;
	static boolean solved = false;
	public static void main (String[] args)
	{
		
		if(attempting == false)
		{
			if(solved == false)
			{
				if(TextGUI.game.getText().equals("solve puzzle") || TextGUI.game.getText().equals("ready"))
						{
							attempting = true;
							TextGUI.area.setText(TextGUI.area.getText() + "\nWhat is your awnser?");
						}
			}
			else if(TextGUI.game.getText().equals("solve puzzle"))
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou've allready solved this puzzle");
		}
			
			
			
			if(attempting == true)
			{
				if(TextGUI.game.getText().equals("five") || TextGUI.game.getText().equals("5"))
				{
				attempting = false;
				solved = true;
				TextGUI.area.setText(TextGUI.area.getText() + "\nWell that seemed a tad redundent.");
				if(tries == 1)
					TextGUI.area.setText(TextGUI.area.getText() + " At least it was easy right.");
				else if(tries <= 5 && tries >=2)
					TextGUI.area.setText(TextGUI.area.getText() + " You really should have got that on your first try you know.");
				else if(tries <= 10 && tries >=6)
					TextGUI.area.setText(TextGUI.area.getText() + " Did it really take you that long to solve this?");
				else if(tries <=15 && tries >=11)
				TextGUI.area.setText(TextGUI.area.getText() + " Oh so your one of those \"special\" types");
				else if(tries>15)
					TextGUI.area.setText(TextGUI.area.getText() + " Honestly!? Did you really spend that long on this puzzle? It's basic logic man!");
				TextGUI.area.setText(TextGUI.area.getText() + "\nThe voice informs you that the east door is now unlocked.");
				}		
			}	
			else if(TextGUI.game.getText().equals("go east")||TextGUI.game.getText().equals("open east door"))
			{
				if(solved == true)
				{
				TextGUI.area.setText(TextGUI.area.getText() +"\nthere is a key on the floor after you open the door, do you pick it up");
					keydiscovered = true;
				}
			}
				
			else if(keydiscovered = true &&TextGUI.game.getText().equals("yes") || TextGUI.game.getText().equals("pick up key"))
			{
			TextGUI.area.setText(TextGUI.area.getText() +"\n you pick up the key and");
			room5.haskey2 = true;	
			TextGUI.area.setText(TextGUI.area.getText() +"\npass into the next room, there is nothing here, the walls are uniform and there are no doors except for the one you came in. \n this saddens you because it seems you will never find the third key and all of those solved puzzles were for naught. \n what do you do?");
			TextGUI.roomNum = 8;
			}
				

			else if(solved == false&&TextGUI.game.getText().equals("go east"))
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\n the door doesnt budge");
			}
			else if(TextGUI.game.getText().equals("go west")||TextGUI.game.getText().equals("open west door"))
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\n you go back into the empty room");
				TextGUI.roomNum = 6;
				
			}
	}
}