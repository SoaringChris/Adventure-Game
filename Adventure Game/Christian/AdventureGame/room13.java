public class room13
{
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("open chest") && TextGUI.hasgoldenkey == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "you open the chest, inside there is a dark looking sigil and a golden sword, beautifully crafted and sharper than anything your village blacksmith could ever forge. \nyou put the contents of the chest in your backpack. there is a door to the east of you, which way do you go?");
			TextGUI.hasgoldensword = true;
			TextGUI.hassigil = true;
		}
		else if(TextGUI.game.getText().equals("go east"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "you go into the next room. there is a door framed with 9 different pictures appropriately labeled 1-9. interestingly they are all dance poses. as you move towards the door, you hear a voice from above. its the same voice that mocked you during the math puzzle! the voice begins to speak to you \n \" you have entertained be thus far, and have made good progress, but i grow bored and require a different type of entertainment. dance for me and the door will open. do the dances in order and you will be allowed to pass\" (just say the name of the dance in order to dance for the strange voice)");
		}
		
	}
}