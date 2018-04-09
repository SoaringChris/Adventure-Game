public class room8
{
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("examine room"))
		{
			TextGUI.area.setText("you find a crooked tile on the floor, you see that it is not as dusty as the others and seems to have been moved more often, what do you do?");
			if(TextGUI.game.getText().equals("move tile"))
					{
						TextGUI.area.setText("you move the tile, there is a key hidden in the recess\n you put the key in your backpack");
						room5.haskey3 = true;
					}
		}
		if(TextGUI.game.getText().equals("go west"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "you go back into the room with no roof and the sarcastic riddlemaster");
			TextGUI.roomNum = 7;

	}
}
}