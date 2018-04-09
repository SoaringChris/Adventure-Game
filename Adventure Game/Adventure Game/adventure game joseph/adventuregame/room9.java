public class room9
{
	static boolean puzzlesolved = false;
	static boolean magenta = false;
	static boolean yellow = false;
	static boolean cyan = false;
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("examine light")||TextGUI.game.getText().equals("examine glass"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "the glass seems sturdy enough, and the light is quite bright. perhaps the glass will change the color of the white light?");
		}
		else if(TextGUI.game.getText().equals("put magenta glass in front of light")||TextGUI.game.getText().equals("use magenta glass")|| TextGUI.game.getText().equals("magenta"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "the light becomes a magenta color, nothing much else happens.");
			magenta = true;
		}
		else if(TextGUI.game.getText().equals("put cyan glass in front of light")||TextGUI.game.getText().equals("use cyan glass")||TextGUI.game.getText().equals("cyan")&& magenta == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "you put the cyan in front of the already magenta colored light. the light becomes a dark blue, exactly matching the color under the crystal. there is a deep rumbling behin the door, maybe it  will open now?");
			puzzlesolved = true;
		}
		else if(TextGUI.game.getText().equals("put cyan glass in front of light")||TextGUI.game.getText().equals("use cyan glass")||TextGUI.game.getText().equals("cyan"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "the light becomes a cyan color, this color, although it is slightly blue, does not match the tile under the crystal and the door is still locked");
			cyan = true;
		}
		else if(TextGUI.game.getText().equals("put yellow glass in front of light")||TextGUI.game.getText().equals("use yellow glass")||TextGUI.game.getText().equals("yellow")&& magenta == false && cyan == false)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "the light becomes yellow in hue, nothing much else happens");
			yellow = true;
		}
		else if(TextGUI.game.getText().equals("put yellow glass in front of light")||TextGUI.game.getText().equals("use yellow glass")||TextGUI.game.getText().equals("yellow")&& magenta == true && cyan == false)
		{
			
		}
	}
}