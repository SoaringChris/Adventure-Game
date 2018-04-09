public class room12
{
	static boolean completed = false;
	static boolean match11 = false;
	static boolean match12 = false;
	static boolean match21 = false;
	static boolean match22 = false;
	static boolean match31 = false;
	static boolean match32 = false;
	static boolean match41 = false;
	static boolean match42 = false;
	static boolean tileflipped = false;
	static boolean usingchest = false;
	static int lastFlip = 0;
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("examine chest"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou examine the chest it seems there are flipable tiles with images on the back of them. once you flip 2 tiles over that have different pictures on them, they immediately flip back over. they are arranged in 2 rows of four each(hint, to use these tiles, say row X Xth from the left)");
			usingchest = true;
		}
	if(usingchest == true)
	{
		if(TextGUI.game.getText().equals("row 1 first from the left")|| TextGUI.game.getText().equals("row 1 1st from the left"))
		{
			if(tileflipped == true && match12 == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile and it reveals the image of a tiger, unfortunately this did not match the image you had previously flipped, and they both flip back down.");
				tileflipped = false;
				unflip(lastFlip);
			}
			else if(tileflipped == true && match12 == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou reveal another image of a tiger, because the images are the same, they stay flipped.");
				tileflipped = false;
				match11 = true;
			}
			else if(tileflipped == false)
			{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile to reveal the image of a tiger");
			match11 = true;
			tileflipped = true;
			lastFlip = 11;
			}
		}
		else if(TextGUI.game.getText().equals("row 2 second from the left")|| TextGUI.game.getText().equals("row 2 2nd from the left"))
		{
			if(tileflipped == true && match22 == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile and it reveals the image of a turtle, unfortunately this did not match the image you had previously flipped, and they both flip back down.");
				tileflipped = false;
				unflip(lastFlip);
			}	
			else if(tileflipped == true && match22 == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou reveal another image of a turtle, because the images are the same, they stay flipped.");
				tileflipped = false;
				match21 = true;
			}
			else if(tileflipped == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile to reveal the image of a turtle");
				match21 = true;
				tileflipped = true;
				lastFlip = 21;
			}
		}
		else if(TextGUI.game.getText().equals("row 1 third from the left")|| TextGUI.game.getText().equals("row 1 3rd from the left"))
		{
			if(tileflipped == true && match32 == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile and it reveals the image of a hawk, unfortunately this did not match the image you had previously flipped, and they both flip back down.");
				tileflipped = false;
				unflip(lastFlip);
			}
			else if(tileflipped == true && match32 == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou reveal another image of a hawk, because the images are the same, they stay flipped.");
				tileflipped = false;
				match31 = true;
			}
			else if(tileflipped == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile to reveal the image of a hawk");
				match31 = true;
				tileflipped = true;
				lastFlip = 31;
			}
		}
		else if(TextGUI.game.getText().equals("row 2 fourth from the left")|| TextGUI.game.getText().equals("row 2 4th from the left"))
		{
			if(tileflipped == true && match42 == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile and it reveals the image of a dragon, unfortunately this did not match the image you had previously flipped, and they both flip back down.");
				tileflipped = false;
				unflip(lastFlip);
			}
			else if(tileflipped == true && match42 == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou reveal another image of a dragon, because the images are the same, they stay flipped.");
				tileflipped = false;
				match41 = true;
			}
			else if(tileflipped == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile to reveal the image of a dragon");
				match41 = true;
				tileflipped = true;
				lastFlip = 41;
			}
		}
		else if(TextGUI.game.getText().equals("row 1 second from the left")|| TextGUI.game.getText().equals("row 1 2nd from the left"))
		{
			if(tileflipped == true && match41 == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile and it reveals the image of a dragon, unfortunately this did not match the image you had previously flipped, and they both flip back down.");
				unflip(lastFlip);
			}
			else if(tileflipped == true && match41 == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou reveal another image of a dragon, because the images are the same, they stay flipped.");
				tileflipped = false;
				match42 = true;
			}
			else if(tileflipped == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile to reveal the image of a dragon");
				match42 = true;
				tileflipped = true;
				lastFlip = 42;
			}
		}
		else if(TextGUI.game.getText().equals("row 2 first from the left")|| TextGUI.game.getText().equals("row 2 1st from the left"))
		{
			if(tileflipped == true && match31 == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile and it reveals the image of a hawk, unfortunately this did not match the image you had previously flipped, and they both flip back down.");
				tileflipped = false;
				unflip(lastFlip);
			}
			else if(tileflipped == true && match31 == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou reveal another image of a hawk, because the images are the same, they stay flipped.");
				tileflipped = false;
				match32 = true;
			}
			else if(tileflipped == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile to reveal the image of a hawk");
				match32 = true;
				tileflipped = true;
				lastFlip = 32;
			}
		}
		else if(TextGUI.game.getText().equals("row 1 fourth from the left")|| TextGUI.game.getText().equals("row 1 4th from the left"))
		{
			if(tileflipped == true && match21 == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile and it reveals the image of a turtle, unfortunately this did not match the image you had previously flipped, and they both flip back down.");
				tileflipped = false;
				unflip(lastFlip);
			}
			else if(tileflipped == true && match21 == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou reveal another image of a turtle, because the images are the same, they stay flipped.");
				tileflipped = false;
				match22 = true;
			}
			else if(tileflipped == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile to reveal the image of a turtle");
				match22 = true;
				tileflipped = true;
				lastFlip = 22;
			}
		}
		else if(TextGUI.game.getText().equals("row 2 third from the left")|| TextGUI.game.getText().equals("row 2 3rd from the left"))
		{
			if(tileflipped == true && match11 == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile and it reveals the image of a tiger, unfortunately this did not match the image you had previously flipped, and they both flip back down.");
				tileflipped = false;
				unflip(lastFlip);
			}
			else if(tileflipped == true && match11 == true)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou reveal another image of a tiger, because the images are the same, they stay flipped.");
				match12 = true;
				tileflipped = false;
			}			
			
			else if(tileflipped == false)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou flip over the tile to reveal the image of a tiger");
				match12 = true;
				tileflipped = true;
				lastFlip = 12;
			}
		}
		else if(TextGUI.game.getText().equals("open chest") && match11 == true && match12 == true && match21 == true && match22 == true && match31 == true && match32 == true && match41 == true && match42 == true)
		{
				TextGUI.area.setText(TextGUI.area.getText() + "\nyou open the chest, inside there is a lighter and a can of gasoline. there is also a golden key in chest as well. you take the contents of the chest and put them in your backpack");
				room9.lighterandgas = true;
				TextGUI.hasgoldenkey = true;
		}
			
		if(TextGUI.game.getText().equals("go west"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\n you go back into the room with the maze, interestingly enough there is a passage straight towards the door back to the west, with no need to go through the maze again. which way do you go?");
		}
	}
	}
	
	public static void unflip(int flipped)
	{
		switch (flipped)
		{
		case 11:
			match11 = false;
		case 12:
			match12 = false;
		case 21:
			match21 = false;
		case 22:
			match21 = false;
		case 31:
			match31 = false;
		case 32:
			match32 = false;
		case 41:
			match21 = false;
		case 42:
			match22 = false;
		}
	}
}