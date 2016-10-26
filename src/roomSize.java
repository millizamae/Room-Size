import java.util.Scanner;

public class roomSize {

	public static void main(String[] args) {
		
		double length;
		double width;
		double height;
		String input = "y";
		
		/*move the greeting outside of the loop so that it doesn't 
		 prompt every time the user continutes 
		 */
		System.out.println("Welcome to Grand Circus' Room Detail Generator!"); 

		while (input.equalsIgnoreCase("y")) { // this will ignore the case of the letter the user enters 

			Scanner calc = new Scanner(System.in);
			System.out.println("Enter Length Here: ");
			length = calc.nextDouble();
			System.out.println("Enter Width Here: ");
			width = calc.nextDouble();
			System.out.println("Enter Height Here: ");
			height = calc.nextDouble();

			double area = (length * width);
			double perimiter = (length * 2) + (width * 2);
			double volume = length * width * height;
			
			System.out.println("Area: " + area);
			System.out.println("Perimiter: " + perimiter);
			System.out.println("Volume: " + volume);
			System.out.println("Continue? Y or N");
			input = calc.next();
		}

		System.out.println("Thank you!");
	}
}
