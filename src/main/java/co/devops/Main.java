package co.devops;

public class Main {
	public static void main(String[] args) {
		System.out.printf("The number 42 is in the range: %s" , checkRange(42) + "\n");
	}

	public static String checkRange(int number) {
		if (number < 0 || number > 100) {
			throw new IllegalArgumentException("Number must be between 0 and 100");
		}
		return switch (number){
			case 0 -> "Zero";
			case 1, 2, 3, 4, 5 -> "Low";
			case 6, 7, 8, 9, 10 -> "Medium";
			default -> "High";
		};
	}
}