import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("what name?");
		String name = sc.nextLine();
		System.out.println("how many time output?");
		int num = sc.nextInt();
		int x = 1;
		while(true)
		{
			System.out.println(name);
			if(x==num)
			{
				break;
			}
			x=x+1;
		}
	}
}	
