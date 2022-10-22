import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
                " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu " +
                "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
                " qui officia deserunt mollit anim id est laborum.";
        Map<Character, Integer> wordCounter = new HashMap<>();

        for (int j = 0; j < text.length(); j++) {
            char c = text.charAt(j);
            if (wordCounter.containsKey(c)) {
                int x = wordCounter.get(c);
                wordCounter.remove(c); // было значние 1
                x++;
                wordCounter.put(c, x); // надо сделать значение 2
            } else {
                wordCounter.put(c, 1);
            }
        }

        int max = -1;
        char maxChar = '.';
        for (Map.Entry <Character, Integer> kv : wordCounter.entrySet()) {
            int value = kv.getValue();
            if (Character.isLetter(kv.getKey())) {
                if (value > max) {
                    max = value;
                    maxChar = kv.getKey();
                }
            } else if (value == max) {
                continue;
            } else {
                continue;
            }
        }

        int min = max;
        char minChar = '.';

        for (Map.Entry <Character, Integer> kv : wordCounter.entrySet()) {
            int value = kv.getValue();
            if (Character.isLetter(kv.getKey())) {
                if (value < min) {
                    min = value;
                    minChar = kv.getKey();
                }
            } else if (value == min) {
                continue;
            } else {
                continue;
            }
        }

        System.out.println(wordCounter);
        System.out.println("Чаще всего встречается буква " + maxChar + " " + max + " разa.");
        System.out.println("Чаще всего встречается буква " + minChar + " " + min + " раз.");
    }
}
