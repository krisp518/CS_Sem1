import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		System.out.println("What class do you want to be, Adventurer? You can choose between a Wizard, Warrior, or a Rogue. Choose wisely!");
		String role = sc.nextLine();
		if(role.equals("Wizard"))
		{
			System.out.println("You are Jizard, the Wizard!");
		}
		else if(role.equals("Warrior"))
		{
			System.out.print("You are Wario, the Warrior!");
		}
		else if(role.equals("Rogue"))
		{
			System.out.print("You are Ragu, the Rogue!");
		}
		else
		{
			System.out.println("You did a wong uwu twy agin owo (or prepare to die (づ｡◕‿‿◕｡)づ)");
		}
	}
}
