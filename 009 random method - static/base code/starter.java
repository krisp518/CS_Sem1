import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		 
		int rand_num1 = rand.nextInt(10); // 0-9 because it gives us 10 numbers from 0. 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		System.out.println(rand_num1);
		int rand_num2 = rand.nextInt(100)+1; // 1-100. it adds 1 to 0 and 100
		System.out.println(rand_num2);
		double rand_num3 = rand.nextDouble()+2.5; //no numbers in parentheses in double because it is 0-1 i think. this is 2.5-3.5 not including 3.5. 
		System.out.println(rand_num3);
		double rand_num4 = rand.nextInt(575)+14+rand.nextDouble();
		System.out.println(rand_num4);
		
	}
}
