public class room4
{
	public static void main (String[] args)
	{
			if(TextGUI.game.getText().equals("pick up mural piece") || (TextGUI.game.getText().equals("get mural piece")))
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou pick up the mural piece and put it in your backpack");
				TextGUI.hasKey1 = true;
			}
			
			else if(TextGUI.game.getText().equals("go west"))
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou go back into the room with the riddle");
				TextGUI.roomNum = 3;
			}
	}
}