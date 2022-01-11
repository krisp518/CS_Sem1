import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int guess = 0;
	int secret = rand.nextInt(1001);
	System.out.println("gimme numero");
	while (guess != secret)
	{
		
	guess = sc.nextInt();
		if(guess<secret){
			System.out.println("guess higher bro and try again");
		}
		else if(guess>secret){
			System.out.println("guess lower lmao. try again.");
		}
			else if(guess==secret){
					System.out.println("wow good job thats like 1/1000 chance or something idk i failed math. dont forget to smash like and subscribe and curb stomp the notification bell because this is peak game design");
				}
		}
	}
	}

