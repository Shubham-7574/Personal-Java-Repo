package Test;

public class MissingNoArrays {
	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 5, 6 }; // Example array
		int missingNumber = findMissingNumber(array);
		System.out.println("The missing number is: " + missingNumber);
	}

	private static int findMissingNumber(int[] array) {
		int n = array.length + 1; // Since one number is missing from the array
		int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers

		int arraySum = 0;
		for (int number : array) {
			arraySum += number; // Sum of numbers present in the array
		}

		return totalSum - arraySum; // The missing number
	}

}
