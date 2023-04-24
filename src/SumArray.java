import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumArray {
    private SumArray() {  }

    public static int[] readNumbersFromFile(File file) throws FileNotFoundException, InvalidNumberException {
        int[] numbers = new int[10];
        int count = 0;

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext() && count < 10) {
            try {
                int number = Integer.parseInt(scanner.next());
                if (number < 0) {
                    throw new InvalidNumberException("Number " + number + " is negative.");
                }
                numbers[count++] = number;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid number format");
            }
        }
        scanner.close();

        return numbers;
    }

    public static int sumNumbersOfArray(int[] array) throws ArithmeticException {
        int sum = 0;

        for (int j : array) {
            sum += j;
        }
        if (sum == 0) {
            throw new ArithmeticException("Sum of array numbers is zero.");
        }

        return sum;
    }
}
