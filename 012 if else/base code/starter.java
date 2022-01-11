import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("give me number from 1-1000 cringe man");
		int num = sc.nextInt();
		int rand_num1 = rand.nextInt(1+999);
		if(num==rand_num1)
		{
			System.out.println("good job kiddo you guessed good praise RNGesus");
		}
		else
		{
			System.out.println("bad job you dumb dumb pray harder to RNGesus \nActual number was "+rand_num1);
		}
		
	}
}
