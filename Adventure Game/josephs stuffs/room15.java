public class room15
{
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("put sigil in door") || TextGUI.game.getText().equals("use sigil"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "you put the sigil in the door and it opens, you advance into the next room, hopefully prepared for whatever demon is in store for this final room");
			TextGUI.roomNum = 16;
		}
	}
}