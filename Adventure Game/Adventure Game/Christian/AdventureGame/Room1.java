//This breaks strings up word for word
public class Room1 {
	public static boolean bookshelfSolved = false;
	public static boolean muralfixed = false;
	public static void main (String[] args)
{
	if(TextGUI.hasKey1 == true)
	{
		if(TextGUI.game.getText().equals("put mural peice in hole") || (TextGUI.game.getText().equals("fix mural")))
				{
					TextGUI.area.setText(TextGUI.area.getText() + "\nyou hear rumbling behind the door and it opens by itself, where do you go?");
					muralfixed = true;
				}
		if(muralfixed == true && TextGUI.game.getText().equals("go north"))
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\n there are 4 tiles that are colored black, green, red, and blue. there is an inscription on the wall that reads 'who would beat someone up on christmas?'\n there is also a door the north with what looks like 3 keyholes, it seems you will have to find all 3 of the keys before you can open it \n what do you do?");
				TextGUI.roomNum=5;
			}
	}
		else if(TextGUI.game.getText().equals("go north"))
		{
				TextGUI.area.setText(TextGUI.area.getText() + "\nNo matter how hard you try, the door won't budge.");
		}
		
		else if(TextGUI.game.getText().equals("go east"))
		{
			if(bookshelfSolved == true)
			{
				TextGUI.area.setText(TextGUI.area.getText()+ "\nThe door opens with ease.\n this room looks no different for the last room, but instead of the bookcase, there are three levers next to a singular metal door across the room from you.");
				TextGUI.roomNum=2;
				
			}
			else
				TextGUI.area.setText(TextGUI.area.getText()+ "\nThe door appears to be locked; you bash and bang but it won't open, judgeing by the insevirity of the burns it's probably also fireproof.");
		}
		
			else if(TextGUI.game.getText().equals("pick up book")||TextGUI.game.getText().equals("lift book")||TextGUI.game.getText().equals("pull book"))
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou hear what sounds like cogs operateing behind the walls, then suddently you hear a lound clunk behind the east door, perhaps you should investigate.");
				bookshelfSolved = true;
			}
		}
	
}
