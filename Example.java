import java.util.Scanner;
import java.util.Random;

class Example {
	
	public static void main(String[] args) {
		for (String str : args) {
			System.out.println(str);
			
		}

		int n = Integer.parseInt(args[0]);
		double a = Double.parseDouble(args[1]);
		System.out.println(a / 2.0);

		// Scanner scanner = new Scanner(System.in);

		// System.out.println("Type two numbers: ");
		// int x = scanner.nextInt();
		// double b = scanner.nextDouble();
		// System.out.println("You typed " + x);
		// System.out.println("You typed " + b);

		Random random = new Random();

		for (int i=0; i<10; i++) {
			int r = random.nextInt(10) + 1;
			System.out.println(r);
		}

	}

}