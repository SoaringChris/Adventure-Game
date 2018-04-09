
import java.util.Random;

public class Boss {
	
	//May or may not implement secret enchantments for backtrackers
	static boolean enchant1 = false;
	static boolean enchant2 = false;
	static boolean enchant3 = false;
	
	//Basic stats used to keep track of the main runners of the battle
	public static int playerCharge = 0;
	static int bossCharge = 0;
	public static int playerHealth = 30;
	public static int bossHealth = 30;
	static int bossChoice = 0;
	
	//So that if we selected guard it gets stored at the beginning of a script.
	static boolean playerIsGaurding = false;
	static boolean bossIsGaurding = false;
	
	//Theses are up here of ease of balancing
	static int chargeSucsessRate1 = 10;
	static int chargeSucsessRate2 = 3;
	

	public static void main(String[] args) {
		//This First Chunk is the boss' AI and how the game handel's it's decisions
		Random gen = new Random();
		bossChoice = gen.nextInt(5);
		int oops = gen.nextInt(3);
		if((bossChoice == 0||bossChoice == 3|| bossChoice == 4) && bossCharge == 0)
			if(oops != 0)
				bossChoice = 1;
		
		if((bossChoice == 0||bossChoice == 3|| bossChoice == 4) && (bossCharge == 1||bossCharge == 2||bossCharge == 3))
		{
			int oops2 = gen.nextInt(2);
			if(oops2 == 0)
				bossChoice = 1;
		}
		
		
		
		if(bossChoice == 0||bossChoice == 3|| bossChoice == 4)
		{
			if(bossCharge == 0)
				TextGUI.area.setText(TextGUI.area.getText()+ "\nThe monster swings at you in a hurry, but he put no strength behind it.");
			else
			{
				int bossDmg = gen.nextInt(3)+1;
				if(playerIsGaurding == true)
				TextGUI.area.setText(TextGUI.area.getText() + "\n You defend his attacks sucessfully negateing " + (bossDmg*bossCharge) + " damage");
				else
				{
				TextGUI.area.setText(TextGUI.area.getText()+"\nThe monster swings at you with his powerfull arms inflicting " + (bossDmg*bossCharge) + " damage!");
				playerHealth = playerHealth - (bossDmg*bossCharge);
				}
				bossCharge = 0;
			}
			playerIsGaurding = false;
		}
		
		else if(bossChoice == 1)
			{
			bossCharge++;
			int chargeSucsess = gen.nextInt(chargeSucsessRate1);
			TextGUI.area.setText(TextGUI.area.getText()+ "\n The monster tightens his focus on you and appears to be mustering up his strength");
			if(bossCharge > 3)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nHe seems to congured imense ammounts of power whitin himself, this could get dangerous");
				if(chargeSucsess < chargeSucsessRate2)
				{
					TextGUI.area.setText(TextGUI.area.getText() + "\nAs expected all the built up power was too much for him, he couldn't handel it, and as a result he has lost it all.");
					bossCharge = 0;
				}
				else
					TextGUI.area.setText(TextGUI.area.getText() + "\nHe managed to keep it togeather and keep up his power!");
			}
				playerIsGaurding = false;
		}
		
		else if(bossChoice == 2)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nThe monster has decidided now might be a good time to defend itself.");
			bossIsGaurding = true;
			playerIsGaurding = false;
		}
		
		
		//Player decision handling 
		
		if(TextGUI.game.getText().equals("attack"))
		{
			if(playerCharge == 0)
			{
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou hastefuly swing at the monster forgeting to build up any power beforehand. You take your best shot but it is not enough, you need to charge up your power next time.");
			}
			else
			{
				int playerDmg = gen.nextInt(3)+1;
				if(bossIsGaurding == true)
					TextGUI.area.setText(TextGUI.area.getText() + "\n You defend his attacks sucessfully negateing " + (playerDmg*playerCharge) + " damage");
				else
				{
				TextGUI.area.setText(TextGUI.area.getText() + "\nYou swing at the monster releasing all your built up strength and power into him dealing " + (playerDmg*playerCharge) + " damage!");
				bossHealth = bossHealth - (playerDmg*playerCharge);
				}
				playerCharge = 0;
			}
			bossIsGaurding = false;
		}
		
		else if(TextGUI.game.getText().equals("charge"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nYou focus on your target, as your father had trained you to many years ago. \nYou can feel energy building inside of you as you invision yourself defeating the beast.");
			playerCharge++;
			int chargeSucsess = gen.nextInt(chargeSucsessRate1);
			if(playerCharge > 3)
			{
				TextGUI.area.setText(TextGUI.area.getText()+"\nYou've worked yourself so hard, maybe too hard, it's becoming dificult for you to hold in this much power, but you might just be able to handel it.");
				if(chargeSucsess < chargeSucsessRate2)
				{
					TextGUI.area.setText(TextGUI.area.getText() + "\nAlas it was not meant to be, your focus was phased for but a mear second and like that it was gone, all of it, all the strenght you brought forth has dissapeared, youll have to regain it.");
					playerCharge = 0;
				}
				else
					TextGUI.area.setText(TextGUI.area.getText() + "\nYou mangage to keep it togeather, perhaps just a little more you wonder, but how much will be too much.");
				
			}
			bossIsGaurding = false;		
		}
		
		
		else if(TextGUI.game.getText().equals("defend"))
		{
			TextGUI.area.setText(TextGUI.area.getText()+"\nYou prepair for the worst and to defend agains the creature's blows.");
			playerIsGaurding = true;
			bossIsGaurding = false;
		}
		
		
		//Death
		if(playerHealth <= 0)
		{
		TextGUI.area.setText(TextGUI.area.getText() + "\nYou have been defeated, everything  you tried for, so be snuffed out like a flame here, you were so close, but yet so far.\nThe battle will automatically restart.");	
		bossHealth = 100;
		playerHealth = 100;
		playerCharge = 0;
		bossCharge = 0;
		playerIsGaurding = false;
		bossIsGaurding = false;
		}
		
		else if(bossHealth <= 0)
		{
			room16.main(null);
			//The game currently restarts when over may change
			//TextGUI.roomNum = 0;
			//commented above for beta testing
		}

	}

}
