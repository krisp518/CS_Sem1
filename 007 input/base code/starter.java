import java.util.Scanner;

class starter {
	public static void main(String args[]) 
	{
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
	    System.out.println("How Old are you?");
	    int Age = sc.nextInt();
	    System.out.println("What is your birthday month?");
	    int Month = sc.nextInt();
	    System.out.println("What day is your birthday?");
	    int Day = sc.nextInt();
	    System.out.println("What year were you born?");
	    int Year = sc.nextInt();
	    System.out.println("How much is a buck fifty?");
	    double Money = sc.nextDouble();
	    System.out.println("Your name is "+name+ " and you were born on "+Month+ "/"+Day+ "/" +Year);
	    System.out.print("You have "+Money+ " dollars.");
	
	
	}
}
