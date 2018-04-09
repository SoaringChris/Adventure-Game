public class room9
{
	static boolean puzzlesolved = false;
	static boolean magenta = false;
	static boolean yellow = false;
	static boolean cyan = false;
	static boolean usinglight = false;
	public static boolean lighterandgas = false;
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("examine light")||TextGUI.game.getText().equals("examine glass"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nthe glass seems sturdy enough, and the light is quite bright. perhaps the glass will change the color of the white light? you are smart enough to know that putting all 3 peices of glass in front of the light in any order will just make it black. you arent completely daft. what do you do?");
		}
		else if(TextGUI.game.getText().equals("use glass") || TextGUI.game.getText().equals("use light"))
			{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou are now using the colored glass and light");
			usinglight = true;
			}
		else if(usinglight == true)
		{
		if(TextGUI.game.getText().equals("put cyan in front of light") || TextGUI.game.getText().equals("use cyan") || TextGUI.game.getText().equals("cyan"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou put the cyan in front of the light, ");
			cyan = true;
			if(magenta == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light turns dark blue and you hear rumbling behind the door, maybe it will open now?");
				puzzlesolved = true;
			}
			else if(yellow == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light becomes green, this is definately not what the tile color is");
			}
			else
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light become cyan in color");
			}
		}
		else if(TextGUI.game.getText().equals("put yellow in front of light") || TextGUI.game.getText().equals("use yellow") || TextGUI.game.getText().equals("yellow"))
		{
			yellow = true;
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou put the yellow in front of the light,");
			if(magenta == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light becomes red in color, this is definately not what you were looking for");
			}
			else if(cyan == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light becomes green in color, this is not what you were looking for, was it?");
			}
			else if(magenta == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light becomes red in color, this is definately not what you were looking for");
			}
			else
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light becomes yellow in color");
			}
		}
		else if(TextGUI.game.getText().equals("put magenta in front of light") || TextGUI.game.getText().equals("use magenta") || TextGUI.game.getText().equals("magenta"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou put the magenta in front of the light,");
			magenta = true;
			if(yellow == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light becomes red in color, this ist what you were looking for");
			}
			else if(cyan == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nthe light becomes a dark blue, exactly like the tile below the crystal, you hear a rumbling behinf the door, maybe it will open?");
				
			}
			else
			{
				magenta = true;
			}
			
		}
		else if(TextGUI.game.getText().equals(" put back cyan") || TextGUI.game.getText().equals("take cyan") && cyan == true)
			{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou take away the cyan piece of glass");
			cyan = false;
			}
		else if(TextGUI.game.getText().equals(" put back cyan") || TextGUI.game.getText().equals("take cyan") && cyan == false)
			{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou are not currently using cyan");
			}
		else if(TextGUI.game.getText().equals(" put back magenta") || TextGUI.game.getText().equals("take magenta") && magenta == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou take away the magenta piece of glass");
			magenta = false;
		}
		else if(TextGUI.game.getText().equals(" put back magenta") || TextGUI.game.getText().equals("take magenta") && magenta == false)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou are not currently using magenta");
		}
		else if(TextGUI.game.getText().equals("put back yellow") || TextGUI.game.getText().equals("take yellow") && yellow == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou take away the yellow piece of glass");
			yellow = false;
		}
		else if(TextGUI.game.getText().equals("put back yellow") || TextGUI.game.getText().equals("take yellow") && yellow == false)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou are not currently using yellow");
		}
		}
		else if(TextGUI.game.getText().equals("go east")|| TextGUI.game.getText().equals("open door") || TextGUI.game.getText().equals("east") && puzzlesolved == true)
			{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou go into the next room, as you walk forward, you see a wall of rock going higher than you can possible see, not letting you pass. there is a table with 3 potions, one red, one white, and one blue. there is also a water pool with a plaque above it that says \" pool of freedom \" what do you do?");
			TextGUI.roomNum = 10;
			}
		else if(TextGUI.game.getText().equals("go north") || TextGUI.game.getText().equals("burn vines") || TextGUI.game.getText().equals("destroy vines") && lighterandgas == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\n you burn down the vines and you go through the north door DESCRIPTION OF ROOM 13");
				TextGUI.roomNum = 13;
			}
		else
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou may have to begin using the glass to do that.");
		}
	}
}
