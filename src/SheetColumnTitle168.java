import java.util.HashMap;
import java.util.Map;

public class SheetColumnTitle168 {
    public static String convertToTitle(int columnNumber) {

        Map<Integer, Character> alphabet = new HashMap<>();
        char letter = 'A';
        int numberInSheet = 1;
        StringBuilder result = new StringBuilder();
        while (letter <= 'Z') {
            alphabet.put(numberInSheet, letter);
            numberInSheet++;
            letter++;
        }
        while (true) {
            double columnChecker = columnNumber / 26.0;
            if (columnChecker <= 1) {
                result.append(alphabet.get(columnNumber));
                return result.reverse().toString();
            } else {
                int numberToAdd = columnNumber % 26;
                if (numberToAdd == 0) {
                    numberToAdd = 26;
                    columnNumber -= 1;
                }
                result.append(alphabet.get(numberToAdd));
                columnNumber /= 26;
            }
        }
    }

    public static void main(String[] args) {
        String s = SheetColumnTitle168.convertToTitle(52);
        System.out.println(s);
    }
}
