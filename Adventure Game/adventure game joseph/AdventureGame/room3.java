public class room3
{
	static boolean usingchisel = false;
	static boolean puzzlesolves = false;
	public static void main (String[] args)
	{
		if(usingchisel == false && puzzlesolves == false && (TextGUI.game.getText().equals("use chisel")))
			{		
		usingchisel = true;
		TextGUI.area.setText(TextGUI.area.getText() + "\nwhat would you like to chisel into the wall?");
			}
		else if(usingchisel == true)
		{
			
			if(TextGUI.game.getText().equals("man"))
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou hear a rumbling behind the door, perhaps it will open now");
				puzzlesolves = true;
			}
			else if(!TextGUI.game.equals("man") && (TextGUI.game.equals("stop") && (TextGUI.game.equals("stop using chisel") && (puzzlesolves = false))))
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nnothing happens, maybe you were wrong? the inscription fades away, if almost by magic");
			}	
			else if(TextGUI.game.getText().equals("stop") || TextGUI.game.getText().equals("stop using chisel"))
			{
				usingchisel = false;
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou are no longer using the chisel");
			}
	}
		else if(TextGUI.game.getText().equals("go east") && (puzzlesolves = false))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "the door will not budge, perhaps it has something to do with the riddle above it?");
			
		}
		else if(TextGUI.game.getText().equals("go east") && (puzzlesolves = true))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nthe door opens with ease/n there is a peice of mural sitting on an altar on the other end of the room \n what do you do?");
			TextGUI.roomNum = 4;
		}
		else if(TextGUI.game.getText().equals("go west"))
		{
			TextGUI.area.setText(TextGUI.area.getText() +"\n you go back to the room with the levers");
			TextGUI.roomNum = 2;
		}
	}

}