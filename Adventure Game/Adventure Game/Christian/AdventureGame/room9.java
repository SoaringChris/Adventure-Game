public class room9
{
	public static void main (String[] args)
	{
		TextGUI.area.setText(TextGUI.area.getText() + "\n there is a key lying on a mysterious looking altar, do you take it? (this might be important to your quest, but who knows?)");
		if(TextGUI.game.getText().equals("yes"))
		{
		TextGUI.hasKey1 = true;
			
		}
	}
}