public class room10
{
	static boolean redpotion = false;
	static boolean bluepotion = false; 
	static boolean whitepotion = false;
	static boolean stonewall = false;
	static boolean firewall = false;
	static boolean gaswall = false;
	static boolean potionaffected = false;
	public static void main (String[] args)
	{
		if(TextGUI.game.getText().equals("drink white potion"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou drink the white potion, you feel like you could break through anything");
			whitepotion = true;
			potionaffected = true;
		}
		else if(TextGUI.game.getText().equals("drink blue potion") && potionaffected == false)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou drink the blue potion, feel a green shield form around you, you find this odd that you drank a blue potion but it turned out to be a green shield");
			bluepotion = false;
		}
		else if(TextGUI.game.getText().equals("drink red potion") && potionaffected == false)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou drink the red potion and you feel a burning in your stomach that soon subsides");
			redpotion = true;
		}
		else if(TextGUI.game.getText().equals("drink red potion") && potionaffected == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou attempt to pick up the potion, but it burns in your hands and you cannot pick it up, maybe its because you are still under the influence of another potion?");
		}
		else if(TextGUI.game.getText().equals("break down stone wall") || TextGUI.game.getText().equals("break down wall") && whitepotion == true )
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nbecause of your new innate strength, you break down the stone wall and reveal a wall of fire behind it. even though you are so strong the flames are too hot for you to pass");
			stonewall = true;
		}
		else if(TextGUI.game.getText().equals("jump in pool") || TextGUI.game.getText().equals("jump in pool of freedom"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou jump into the pool of freedom, and you feel the effects of the potion fade away.");
			redpotion = false;
			bluepotion = false;
			whitepotion = false;
			potionaffected = false;
		}
		else if(TextGUI.game.getText().equals("drink white potion") || TextGUI.game.getText().equals("white potion") && potionaffected == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou attempt to pick up the potion, but it is so heavy you cannot pick it up, perhaps you need to cleanse yourself?");
		}
		else if(TextGUI.game.getText().equals("pick up blue potion") || TextGUI.game.getText().equals("drink blue potion") && potionaffected == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nas you touch the potion to pick it up, you double over in pain from your abdomen, the feeling fades away as quick as it came but you wont be picking up the potion any time soon, perhaps you need to cleanse yourself first?");
		}
		else if(TextGUI.game.getText().equals("go through fire wall") || TextGUI.game.getText().equals("pass through fire wall") && redpotion == true && stonewall == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou go through the fire wall with ease, it even feels nice basking in the flames. as you pass through the fire wall, it dissapears, showing the stone wall and the door behind you, while revealing a wall of green gass in front of you");
			firewall = true;
		}
		else if(TextGUI.game.getText().equals("go through gas wall") || TextGUI.game.getText().equals("pass through gas wall") && bluepotion == true && firewall == true && stonewall == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou pass through the green gas with ease, the green shield protecting you from the harmful chemicals. you find there is an identical pool called the pool of freedom on this side of the walls as well, and you bathe in it to cleanse yourself of the potion. there is a door to the east of you, leading to the next room.");
			gaswall = true;
			potionaffected = false;
			bluepotion = false;
		}
		else if(TextGUI.game.getText().equals("go east") || TextGUI.game.getText().equals("east") && stonewall == true && firewall == true && gaswall == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou go through the door to the next room, you immediately feel dizzy and disoriented, you lose all sense of direction and only know how to move up, down, left, right, forwards, and backwards");
		}
		else if(TextGUI.game.getText().equals("go through gas wall") || TextGUI.game.getText().equals("pass through gas wall") && bluepotion == false && firewall == true && stonewall == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nas you try to go through the gas wall, you begin choke and cough and cannot continue on or else you think you may die. perhaps one of the potions can help you?");
		}
		else
		{
			TextGUI.area.setText(TextGUI.area.getText() + "i dont understand " + TextGUI.game.getText());
		}
	}
}