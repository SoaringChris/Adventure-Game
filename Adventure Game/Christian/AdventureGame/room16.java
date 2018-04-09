public class room16
{
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals(""))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nCongratulaions! you have defeated the evil demon that lived in these caverns. you have emerged with bountiful wealth and have restored peace to the land. thank you for playing.\nCREDITS\nCODE\nChristian Goodridge\nJoseph Coleman\nENGINE\nChristian Goodridge\nSTORY\nJoseph Coleman\nART\nChristian Goodridge\nDebug\nChristian Goodridge\nJoseph Coleman\nSPECIAL THANKS TO THE PEOPLE WHO HELPED TEST\nihimagician\nTheKillNaviPres\nIcecrystal");
			TextGUI.area.setText(TextGUI.area.getText() + "\nwould you like to play again?");
		}
		else if(TextGUI.game.getText().equals("yes"))
		{
			TextGUI.roomNum = 0;
			TextGUI.area.setText(TextGUI.area.getText() + "\nWelcome to the Dungeon of death, destruction, and donuts(not really), you have been sent by your doubtful father, to defeat the demon king in the deep caves of Na'Gul\n I am Galio the gaurdian of this cave, please tell me your name.");
		}
		else if(TextGUI.game.getText().equals("no"))
		{
			System.exit(0);
		}
	}
}