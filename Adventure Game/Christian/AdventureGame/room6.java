public class room6
{
	static boolean cobblefound = false;
	static boolean wallbroken = false;
	static boolean keyfound = false;
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("examine room") || (TextGUI.game.getText().equals("examine wall")))
				{
					TextGUI.area.setText(TextGUI.area.getText() + "\n one of these cobblestones seems loose. what do you do?");
					cobblefound = true;
				}
		else if(TextGUI.game.getText().equals("pull out cobblestone") || TextGUI.game.getText().equals("pull cobblestone") || TextGUI.game.getText().equals("pull cobble") && cobblefound == true)
					{
						TextGUI.area.setText(TextGUI.area.getText() + "\nyou pull out the cobblestone and the wall collapses, leaving an opening in the wall, what do you do?");
						wallbroken = true;
					}
		else if(TextGUI.game.getText().equals("climb through hole") || TextGUI.game.getText().equals("go east") || TextGUI.game.getText().equals("go north") && wallbroken == true)
						{
							TextGUI.area.setText(TextGUI.area.getText() + "\nyou find a key in the rubble of the wall, do you pick it up?");
							keyfound = true;
							room5.haskey1 = true;
						}
		else if(TextGUI.game.getText().equals("yes") && keyfound == true)
					{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou pick up the key and put it in your backpack. you advance to the next room");
				room5.haskey1 = true;
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou enter a room whose walls are completely uniform, but there is no ceiling as far as you can see. from aboce a voice that comes down says 'you must prove your intelligence if you wish to pass. solve this riddle: \nif 1=5, 2=25, 3=325, and 4=5325, then 5=? \n tell me when you are ready to answer ");
				TextGUI.roomNum = 7;
					}
		else if(TextGUI.game.getText().equals("go west"))
				{
			TextGUI.area.setText(TextGUI.area.getText() + "\n you go back into the room with the tiles");
			TextGUI.roomNum = 5;
				}
		}
}