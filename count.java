
import java.util.HashMap;
import java.util.Scanner;

public class characteroccurance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        System.out.println("" + word + "");

        for (char c : charCount.keySet()) {
            System.out.println("'" + c + "' : " + charCount.get(c));
        }
    }
}
