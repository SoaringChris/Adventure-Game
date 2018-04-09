public class room6
{
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("examine room") || (TextGUI.game.getText().equals("examine wall")))
				{
					TextGUI.area.setText(TextGUI.area.getText() + "\none of these cobblestones seems loose. what do you do?");
					if(TextGUI.game.getText().equals("pull out cobblestone") || TextGUI.game.getText().equals("pull out the stone") || TextGUI.game.getText().equals("pull out the brick"))
					{
						TextGUI.area.setText(TextGUI.area.getText() + "you pull out the cobblestone and the wall collapses, leaving an opening in the wall, what do you do?");
						if(TextGUI.game.getText().equals("climb through hole") || TextGUI.game.getText().equals("go east") || TextGUI.game.getText().equals("go north"))
						{
							TextGUI.area.setText(TextGUI.area.getText() + "\nyou find a key in the rubble of the wall, do you pick it up?");
							if(TextGUI.game.getText().equals("yes"))
									{
								TextGUI.area.setText(TextGUI.area.getText() + "\nyou pick up the key and put it in your backpack. you advance to the next room");
									room5.haskey1 = true;
									TextGUI.area.setText(TextGUI.area.getText() + "\nyou enter a room whose walls are completely uniform, but there is no ceiling as far as you can see. from aboce a voice that comes down says 'you must prove your intelligence if you wish to pass. solve this riddle: \nif 1=5, 2=25, 3=325, and 4=5325, then 5=? \n tell me when you are ready to answer ");
									}
						}
					}
				}
	}
}