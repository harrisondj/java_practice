import java.util.Scanner;
import java.util.Random;

class Guess {
	
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(1000) +1;
		System.out.println(number);

		Scanner scanner = new Scanner(System.in);

		for (int i=0; i<7; i++) {
			System.out.println("Your guess: ");
			int guess = scanner.nextInt();
			if (guess > number) {
				System.out.println("Too high");
			} else if (guess < number) {
				System.out.println("Too low	");
			} else if (guess == number) {
				System.out.println("Correct");
				break;
			}
		}

	}

}