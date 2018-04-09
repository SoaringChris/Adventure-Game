public class room14
{
	static boolean thriller = false;
	static boolean moonwalk = false;
	static boolean funkychicken = false;
	static boolean gangnamstyle = false;
	static boolean hammertime = false;
	static boolean singleladies = false;
	static boolean sprinkler = false;
	static boolean cooking = false;
	static boolean macarena = false;
	public static void main (String[] args)
	{
		TextGUI.area.setText(TextGUI.area.getText() + "you look at the first image next to the door. it shows a man sideways, with his arms up and his hands looking like claws. it also shows a mirror image of him with arrows in between the 2, showing that you would turn during the dance, what kind of dance do you do?");
		if(TextGUI.area.getText().equals("thriller")||TextGUI.area.getText().equals("do the thriller"))
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou begin to do the thriller, trying your best to imitate michael jackson but lets face it, you suck at dancing. you get a god guffaw from the voice and the first image lights up to show that you danced the right dance move\nthe next picture shows a man with a fedora on, looking down, his hands by his sides, and one foot arched and the other flat on the floor. there are a few more images after this one, showing the feet switching between arched and flat, looking very smooth and controlled. \nwhat dance do you do?");
			thriller = true;
		}
		else if(TextGUI.area.getText().equals("moonwalk") || TextGUI.area.getText().equals("do the moonwalk") && thriller == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou begin to do the moonwalk, you trip a couple of times, but you manage it, and the voice sounds pleased. the moonwalk picture lights up. the next picture shows a man with his hands in his armpits, his arms up looking like wings. he looks almost like a chicken. what dance do you do?");
			moonwalk = true;
		}
		else if(TextGUI.area.getText().equals("funky chicken") || TextGUI.area.getText().equals("do the funky chicken") && thriller == true && moonwalk == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou dance the funky chicken, you look like an idiot, but it gets the job done, and the tile lights up. the next tile displays a man with his arms crossed in front of hi with his legs bowed out, one on the ground, and one in the air. the next couple of pictures on the tile show them alternating and one of the arms is raised for some of them. what dance do you do?");
			funkychicken = true;
		}
		else if(TextGUI.area.getText().equals("gangnam style") || TextGUI.area.getText().equals("do gangnam style") && thriller == true && moonwalk == true && funkychicken == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou dance gangnam style, trying to channel yor inner PSY, and you succeed in doing so, gangnam styling like a true south korean. the voice seems impressed and the tile lights up. 4 down and 5 to go. the next tile depicts a man with insane pants, the split happening much lower than you would expect. he is also wearing a vest-type shirt with the middle open with what looks like a chain in between. his legs are bowed out and the series of picturesdepicts him almost skittering across the picture liek a crab, but the legs moving much faster than you would think. what dance do you do?");
			gangnamstyle = true;
		}
		else if(TextGUI.area.getText().equals("hammertime") || TextGUI.area.getText().equals("do hammertime") || TextGUI.area.getText().equals("mc hammer") && thriller == true && moonwalk == true && funkychicken == true && gangnamstyle == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou dance like MC hammer used to, going across the room with 90's like efficiency, the voice is pleased, reminiscing of a time when people like nicki minaj wouldnt get considered \"talented\" the tile lights up in response to your dancing. the next tile shows four women, one of them in the foreground with the other 3 copying her movements. the one in the front seems to have some sort of metallic glove on. woman has her hand up next to her face, and in the next picutre it has turned 180 degrees. in the next photo the 4 women are in a line, sideways from you view, and their arms are pumpint a a 45 degree angle from their bodies towards the floor. what dance do you do?");
			hammertime = true;
		}
		else if(TextGUI.area.getText().equals("single ladies") || TextGUI.area.getText().equals("dance single ladies") || TextGUI.area.getText().equals("beyonce") && thriller == true && moonwalk == true && funkychicken == true && gangnamstyle == true && hammertime == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou dance like beyonce, and the voice says \" you keep dancing like that and i might put a ring on it \" despite being really creeped out, you look at the next tile. it depicts a man with one hand behind his head and the other straight out, each subsequent picture moves the arm more and more acrossthe picture, starting on t elft and ending on the right, then the arm snaps back to the left, just to repeat the process. it looks like he could water a garden. what dance do you?");
			singleladies = true;
		}
		else if(TextGUI.area.getText().equals("sprinkler") || TextGUI.area.getText().equals("do the sprinkler") && thriller == true && moonwalk == true && funkychicken == true && gangnamstyle == true && hammertime == true && singleladies == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou rock it like an automated gardening tool, and in response the tile lights up. the next tile shows a man who looks like he is cooking in a pot or something. you are no sure how this is some sort of dance, but apparently it is, what dance do you do?");
			sprinkler = true;
		}
		else if(TextGUI.area.getText().equals("cooking") || TextGUI.area.getText().equals("do the cooking dance") && thriller == true && moonwalk == true && funkychicken == true && gangnamstyle == true && hammertime == true && singleladies == true && sprinkler == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou \"cook\" like your life depended on it. the tile lights up in response, and you still wonder how the heck that became a dance. the last tile shows a man with both arms out, hands down. the next picture shows the left hand facng up. the next picture has the right hadn facing up. the next one shows the right hand on his left shoulder, and the next has hi left hand on his right shoulder. this goe son from shoulders to head to hips, and then the man is shown to bygyrating his hips and then jumping. what dance do you do?");
			cooking = true;
		}
		else if(TextGUI.area.getText().equals("macarena") || TextGUI.area.getText().equals("do the macarena") && thriller == true && moonwalk == true && funkychicken == true && gangnamstyle == true && hammertime == true && singleladies == true && sprinkler == true && cooking == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\n you do the macarena flawlessly, and the voice seems quite impressed with your knowledge of dance, and the final tile lights up, and the door opens, which way do you go?");
		}
		else if(TextGUI.area.getText().equals("go north") && thriller == true && moonwalk == true && funkychicken == true && gangnamstyle == true && hammertime == true && singleladies == true && sprinkler == true && cooking == true && macarena == true)
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nyou go into the next room. it is pretty empty, and there is a door to the east of you. you go towards the door, and it seems to have an indentation in it. you see nothing in the room to put in the indentation, on top of the door there is an inscription \"in this room is the final challenge, the demon molag baal. you will probably die, but you must defeat him \" what do you do?");
			TextGUI.roomNum = 15;
		}
		else
		{
			TextGUI.area.setText(TextGUI.area.getText() + "\nthat was probably the wrong dance");
		}
		


	}
}