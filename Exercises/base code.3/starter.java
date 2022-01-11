import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme number");
		int num1 = sc.nextInt();
		System.out.println("gimme second number");
		int num2 = sc.nextInt();
		if(num1 % 2 == 0){
			System.out.println("ur number do be even");
		}
		if(num2 % 2 == 0){
			System.out.println("ur second number do be even");
		}
		if(num1 % 2 != 0){
			System.out.println("ur number do be odd");
		}
		if(num2 % 2 != 0){
			System.out.println("ur second number do be odd");
		}
		if(num1 % 3 == 0){
			System.out.println("ur number do be divisible by 3");
		}
		else if(num1 % 3 != 0){
			System.out.println("ur number do not be divisible by 3");
		}
		if(num1 % 4 != 0){
			System.out.println("ur number do not be divisible by 4");
		}
		else if(num1 % 4 == 0){
			System.out.println("ur number do be divisible by 4");
		}
		if(num1 % 5 != 0){
			System.out.println("ur number do not be divisible by 5");
		}
		else if(num1 % 5 == 0){
			System.out.println("ur number do be divisible by 5");
		}
		if(num2 % 3 == 0){
			System.out.println("ur second number do be divisible by 3");
		}
		else if(num2 % 3 != 0){
			System.out.println("ur second number do not be divisible by 3");
		}
		if(num2 % 4 != 0){
			System.out.println("ur second number do not be divisible by 4");
		}
		else if(num2 % 4 == 0){
			System.out.println("ur second number do be divisible by 4");
		}
		if(num2 % 5 != 0){
			System.out.println("ur second number do not be divisible by 5");
		}
		else if(num2 % 5 == 0){
			System.out.println("ur second number do be divisible by 5");
		}
	}
}
