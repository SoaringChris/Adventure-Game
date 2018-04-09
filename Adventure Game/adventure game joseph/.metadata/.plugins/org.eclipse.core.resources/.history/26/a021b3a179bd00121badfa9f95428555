public class room11
{
	static boolean solved = false;
	static boolean up1 = false;
	static boolean up2 = false;
	static boolean down1 = false;
	static boolean down2 = false;
	static boolean left1 = false;
	static boolean left2 = false;
	static boolean right1 = false;
	static boolean right2 = false;
	static boolean buttonA = false;
	static boolean buttonB = false;
	
	public static void main (String[] args)
	{
		//Maze of little twisting passages Based off of the original "Adventure" game for DOS
		if(solved == false)
		{
			if(TextGUI.game.getText().equals("go north")||TextGUI.area.getText().equals("go west")||TextGUI.area.getText().equals("go south")||TextGUI.area.getText().equals("go east"))
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou are completeley disorinted, you dont know which way is which, you only know to go forward, left, right, backwards, up, or down");
			else if(TextGUI.game.getText().equals("look around"))
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou feel dizzy and disoriented, you are still in a maze of little twisting passages, which way will you go");
			else if(up1 == false)
			{
				if(TextGUI.game.getText().equals("go up"))
				{
					up1 = true;
				}
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou feel dizzy and disoriented, you are still in a maze of little twisting passages, which way will you go");
			}
			else if(up2 == false)
			{
				if(TextGUI.game.getText().equals("go up"))
				{
					up1 = true;
				}
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou feel dizzy and disoriented, you are still in a maze of little twisting passages, which way will you go");
			}
			else if(down1 == false)
			{
				if(TextGUI.game.getText().equals("go down"))
				{
					down1 = true;
				}
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou feel dizzy and disoriented, you are still in a maze of little twisting passages, which way will you go");

			}
			else if(down2 == false)
			{
				if(TextGUI.game.getText().equals("go down"))
				{
					down2 = true;
				}
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou feel dizzy and disoriented, you are still in a maze of little twisting passages, which way will you go");

			}
			else if(left1 == false)
			{
				if(TextGUI.game.getText().equals("go left"))
				{
					left1 = true;
				}
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou feel dizzy and disoriented, you are still in a maze of little twisting passages, which way will you go");

			}
			else if(right1 == false)
			{
				if(TextGUI.game.getText().equals("go right"))
				{
					right1 = true;
				}
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou feel dizzy and disoriented, you are still in a maze of little twisting passages, which way will you go");

			}
			else if(left2 == false)
			{
				if(TextGUI.game.getText().equals("go left"))
				{
					left2 = true;
				}
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou feel dizzy and disoriented, you are still in a maze of little twisting passages, which way will you go");

			}
			else if(right2 == false)
			{
				if(TextGUI.game.getText().equals("go right"))
				{
					right2 = true;
				}
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou emerge from a maze into a room with two buttons on the left and right walls, and a sole lever in the center or the room");
			}
			else if(right2 == true && solved == false)
			{
				if(buttonB == false)
				{
					if(TextGUI.game.getText().equals("push left button"))
					{
						buttonB = true;
						TextGUI.area.setText(TextGUI.area.getText() + "\nYou push the button.");
					}
					else if(TextGUI.game.getText().equals("push right button"))
						TextGUI.area.setText(TextGUI.area.getText() + "\nYou push the button.");
					else if(TextGUI.game.getText().equals("pull lever"))
						TextGUI.area.setText(TextGUI.area.getText() + "\nYou pull the lever.");
				}
				else if(buttonA == false)
				{
					if(TextGUI.game.getText().equals("push right button"))
					{
						buttonA = true;
						TextGUI.area.setText(TextGUI.area.getText() + "\nYou push the button.");
					}
						else if(TextGUI.game.getText().equals("push left button"))
						{
							buttonB = false;
							TextGUI.area.setText(TextGUI.area.getText() + "\nYou push the button.");
						}
					
						else if(TextGUI.game.getText().equals("pull lever"))
					{
						buttonB = false;
						TextGUI.area.setText(TextGUI.area.getText() + "\nYou pull the lever.");
					}
				}
				else if(buttonB == true)
				{
					if(TextGUI.game.getText().equals("pull lever"))
					{
						TextGUI.area.setText(TextGUI.area.getText() + "\nYou pull the lever.\nNext thing you know the walls around you fall, and a compas pattern is etched into the floor, you have renewed bearings. To the east you see another door, and you see the way you came to west. In the center of the room you see a shiny item");
						solved = true;
					}
					else if(TextGUI.game.getText().equals("push right button")||TextGUI.game.getText().equals("push left button"))
					{
						TextGUI.area.setText(TextGUI.area.getText() + "\nYou push the button.");
						buttonA = false;
						buttonB = false;
					}
				}
			}
			else if(solved == true)
			{
				if(TextGUI.game.getText().equals("examin shiny thing")&& room5.haskey2 == false)
						TextGUI.area.setText(TextGUI.area.getText() + "\nIt's a key!");
				else if(TextGUI.game.getText().equals("take key")&& room5.haskey2 == false)
				{
					room5.haskey2 = true;
					TextGUI.area.setText(TextGUI.area.getText() + "\nYou Pick up the key");
				}
				else if(TextGUI.game.getText().equals("go east"))
				{
					TextGUI.roomNum = 12;
					TextGUI.area.setText(TextGUI.area.getText() + "\nYou go to the next room");
				}
				else if(TextGUI.game.getText().equals("go west"))
				{
					TextGUI.roomNum = 10;
					TextGUI.area.setText(TextGUI.area.getText() + "\nYou go to the west room");
				}
				else if(TextGUI.game.getText().equals("look around"))
					TextGUI.area.setText(TextGUI.area.getText() + "\nYou're in a gigantic room with a large compas etched into the floor");
			}
		}
	}
		
}
	
