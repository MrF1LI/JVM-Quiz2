import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 21, 5, -2};

        int result = SumArray.sumNumbersOfArray(numbers);
        System.out.println(result);

        File file = new File("src/numbers.txt");

        try {
            int[] numbersFromFile = SumArray.readNumbersFromFile(file);
            System.out.println(Arrays.toString(numbersFromFile));
        } catch (FileNotFoundException error) {
            System.out.println("Invalid to read file. " + error.getMessage());
        } catch (InvalidNumberException error) {
            System.out.println("Invalid number. " + error.getMessage());
        }
    }
}