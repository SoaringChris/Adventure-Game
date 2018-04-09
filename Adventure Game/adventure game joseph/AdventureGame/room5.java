public class room5
{
	static boolean puzzlesolved = false;
	static boolean bluetile = false;
	static boolean greentile = false;
	static boolean redtile = false;
	static boolean usingtiles = false;
	public static boolean haskey1 = false;
	public static boolean haskey2 = false;
	public static boolean haskey3 = false;
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("examine tiles") || (TextGUI.game.getText().equals("look at tiles")))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\n you find that you can depress the tiles, all of the tiles come back up after you depress them except for the black one ");
			
		}
		else if(TextGUI.game.getText().equals("go north") && haskey1 == true && haskey2 == true && haskey3 == true)
		{
			
		}
		else if(usingtiles == false && puzzlesolved == false && (TextGUI.game.getText().equals("use tiles")||TextGUI.game.getText().equals("examine tiles")))
		{
		usingtiles = true;
		}
		//If they are using the tiles the game will respond depending on which tiles they depressed, and in what order
		else if(usingtiles== true)
		{
			if(TextGUI.game.getText().equals("leave tiles") || TextGUI.game.getText().equals("leave")||TextGUI.game.getText().equals("back up")||TextGUI.game.getText().equals("back"))
			{
				TextGUI.area.setText(TextGUI.area.getText()+ "\nYou step away from the tiles.");
				usingtiles = false;
			}
			else if(bluetile == false)
			{
				if(TextGUI.game.getText().equals("step on blue tile") || (TextGUI.game.getText().equals("depress blue tile")))
				{
					bluetile = true;
					TextGUI.area.setText(TextGUI.area.getText() + "\nYou push down the tile and hear it lock into place.");
				}
				else if(TextGUI.game.getText().equals("depress green tile")||TextGUI.game.getText().equals("depress red tile"))
					TextGUI.area.setText(TextGUI.area.getText() + "\nThe tile goes back to an upright position, perhaps this was the wrong tile to push? the black tile stays down");
			}
		
			else if( redtile == false)
			{
				if(TextGUI.game.getText().equals("step on red tile") || TextGUI.game.getText().equals("depress red tile"))
				{
					redtile = true;
					TextGUI.area.setText(TextGUI.area.getText() + "\nYou push down the tile and hear it lock into place.");
				}
				else if(TextGUI.game.getText().equals("depress blue tile")||TextGUI.game.getText().equals("depress green tile"))
				{
					TextGUI.area.setText(TextGUI.area.getText() + "\nThe tiles go back to an upright position, perhaps this was the wrong tile to push?. the black tile stays down");
					bluetile = false;
				}
			}
		
			else if(greentile == false)
			{
				if(TextGUI.game.getText().equals("step on green tile") || TextGUI.game.getText().equals("depress green tile"))
				{
					greentile = true;
					TextGUI.area.setText(TextGUI.area.getText() + "\nYou push down the tile and hear it lock it to place, you hear a noise at the door, perhaps it will now open for you.");
					puzzlesolved = true;
					
				}
			}
			else if(TextGUI.game.getText().equals("depress tile"))
					TextGUI.area.setText(TextGUI.area.getText() + "\nWhich tile do you want to depress?");
			
			else
				TextGUI.area.setText(TextGUI.area.getText()+ "\nYou can't do that now, try stepping back first.");
		}
		
		else if(TextGUI.game.getText().equals("go east")||TextGUI.game.getText().equals("open east door"))
		{
			if(puzzlesolved == true)
			{
				TextGUI.roomNum = 6;
				TextGUI.area.setText(TextGUI.area.getText() + "\nThe Door swings open with ease.\nthere are no other doors besides the one you came in to. the cobbling on the wall across from you however seems a little off, what do you do?");
			}
			else
				TextGUI.area.setText(TextGUI.area.getText() + "\nNo matter how hard you try the door won't budge, figures");
		}
	}
}