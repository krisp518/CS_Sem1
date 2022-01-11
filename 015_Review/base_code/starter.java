import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		System.out.println("what yo name be - Porffesor Oak");
		String youname = sc.nextLine();
		System.out.println("What class do you want to be, Adventurer? You can choose between a Wizard, Warrior, or a Rogue. Choose wisely!");
		String role = sc.nextLine();
		if(role.equals("Wizard"))
		{
			System.out.println("You are a Wizard!");
					int KimJongUn = 25;
		System.out.println("Now that you have a class, choose what stats you want to spend points on! You have 25 points to spend and you may only spend 10 points max for each stat");
		System.out.println("Strength - Buff and able to carry larger items");
		int Stronk = sc.nextInt();
		if(Stronk>10)
		{
			System.out.println("Your built normal body can't handle strength over 10! Start over!");
			return; //Mr. Poole gave me permission to use this yay
		}
		System.out.println("You have " + (KimJongUn - Stronk) +" stat points left");
		System.out.println("Dexterity - Agile and moves quick");
		int Dex = sc.nextInt();
		if(Dex>10)
		{
			System.out.println("You're much too fat to have a dexterity over 10! Go back and start over!");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex) +" stat points left");
		System.out.println("Intelligence - Better at magic spells!");
		int gura = sc.nextInt();
		if(gura>10)
		{
			System.out.println("You're way too dumb to have an intelligence stat over 10! Your brain is smaller than an electron!");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura) +" stat points left");
		System.out.println("Constitution - How much health");
		int murica = sc.nextInt();
		if(murica>10)
		{
			System.out.println("I'm afraid your mother has high blood pressure which is genetic so you have it as well. I regret saying this but it isn't possible to have a constitution stat over 10 without the Elder Dragon's heart.");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica) +" stat points left");
		System.out.println("Charisma - How personable ");
		int pog = sc.nextInt();
		if(pog>10)
		{
			System.out.println("I'm afraid you look much too ugly and stupid to have a charisma stat over 10. Start over.");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica - pog) +" stat points left");
		System.out.println("Congratulations! You are " + (youname) +", and you are a " + (role) +"!");
		System.out.println("Your stats are: Strength - " +(Stronk) +", Dexterity - " +(Dex) +", Intelligence - " + (gura) +", Constitution - " + (murica) +", Charisma - " + (pog));
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica - pog) +" remaining stat points!");
		}
		else if(role.equals("Warrior"))
		{
			System.out.println("You are a Warrior!");
					int KimJongUn = 25;
		System.out.println("Now that you have a class, choose what stats you want to spend points on! You have 25 points to spend and you may only spend 10 points max for each stat");
		System.out.println("Strength - Buff and able to carry larger items");
		int Stronk = sc.nextInt();
		if(Stronk>10)
		{
			System.out.println("Your built normal body can't handle strength over 10! Start over!");
			return; //Mr. Poole gave me permission to use this yay
		}
		System.out.println("You have " + (KimJongUn - Stronk) +" stat points left");
		System.out.println("Dexterity - Agile and moves quick");
		int Dex = sc.nextInt();
		if(Dex>10)
		{
			System.out.println("You're much too fat to have a dexterity over 10! Go back and start over!");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex) +" stat points left");
		System.out.println("Intelligence - Better at magic spells!");
		int gura = sc.nextInt();
		if(gura>10)
		{
			System.out.println("You're way too dumb to have an intelligence stat over 10! Your brain is smaller than an electron!");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura) +" stat points left");
		System.out.println("Constitution - How much health");
		int murica = sc.nextInt();
		if(murica>10)
		{
			System.out.println("I'm afraid your mother has high blood pressure which is genetic so you have it as well. I regret saying this but it isn't possible to have a constitution stat over 10 without the Elder Dragon's heart.");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica) +" stat points left");
		System.out.println("Charisma - How personable ");
		int pog = sc.nextInt();
		if(pog>10)
		{
			System.out.println("I'm afraid you look much too ugly and stupid to have a charisma stat over 10. Start over.");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica - pog) +" stat points left");
		System.out.println("Congratulations! You are " + (youname) +", and you are a " + (role) +"!");
		System.out.println("Your stats are: Strength - " +(Stronk) +", Dexterity - " +(Dex) +", Intelligence - " + (gura) +", Constitution - " + (murica) +", Charisma - " + (pog));
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica - pog) +" remaining stat points!");
		}
		else if(role.equals("Rogue"))
		{
			System.out.println("You are a Rogue!");
					int KimJongUn = 25;
		System.out.println("Now that you have a class, choose what stats you want to spend points on! You have 25 points to spend and you may only spend 10 points max for each stat");
		System.out.println("Strength - Buff and able to carry larger items");
		int Stronk = sc.nextInt();
		if(Stronk>10)
		{
			System.out.println("Your built normal body can't handle strength over 10! Start over!");
			return; //Mr. Poole gave me permission to use this yay
		}
		System.out.println("You have " + (KimJongUn - Stronk) +" stat points left");
		System.out.println("Dexterity - Agile and moves quick");
		int Dex = sc.nextInt();
		if(Dex>10)
		{
			System.out.println("You're much too fat to have a dexterity over 10! Go back and start over!");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex) +" stat points left");
		System.out.println("Intelligence - Better at magic spells!");
		int gura = sc.nextInt();
		if(gura>10)
		{
			System.out.println("You're way too dumb to have an intelligence stat over 10! Your brain is smaller than an electron!");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura) +" stat points left");
		System.out.println("Constitution - How much health");
		int murica = sc.nextInt();
		if(murica>10)
		{
			System.out.println("I'm afraid your mother has high blood pressure which is genetic so you have it as well. I regret saying this but it isn't possible to have a constitution stat over 10 without the Elder Dragon's heart.");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica) +" stat points left");
		System.out.println("Charisma - How personable ");
		int pog = sc.nextInt();
		if(pog>10)
		{
			System.out.println("I'm afraid you look much too ugly and stupid to have a charisma stat over 10. Start over.");
			return;
		}
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica - pog) +" stat points left");
		System.out.println("Congratulations! You are " + (youname) +", and you are a " + (role) +"!");
		System.out.println("Your stats are: Strength - " +(Stronk) +", Dexterity - " +(Dex) +", Intelligence - " + (gura) +", Constitution - " + (murica) +", Charisma - " + (pog));
		System.out.println("You have " + (KimJongUn - Stronk - Dex - gura - murica - pog) +" remaining stat points!");
		}
		else
		{
			System.out.println("You did a wong uwu twy agin owo (or prepare to die (づ｡◕‿‿◕｡)づ)");
		}
	}
}
