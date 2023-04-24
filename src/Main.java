import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/numbers.txt");

        try {

            int[] numbersFromFile = SumArray.readNumbersFromFile(file);
            System.out.println(Arrays.toString(numbersFromFile));

            int sum =  SumArray.sumNumbersOfArray(numbersFromFile);
            System.out.println(sum);

        } catch (FileNotFoundException error) {
            System.out.println("Invalid to read file. " + error.getMessage());
        } catch (InvalidNumberException error) {
            System.out.println("Invalid number. " + error.getMessage());
        }
    }
}