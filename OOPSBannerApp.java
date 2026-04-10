import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        String word = "OOPS";

        printBanner(word, patterns);
    }

    public static void printBanner(String word, Map<Character, String[]> patterns) {

        for (int i = 0; i < 7; i++) {
            for (char ch : word.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }
            System.out.println();
        }
    }
}
