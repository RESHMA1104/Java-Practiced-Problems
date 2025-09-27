import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlamesGame {

    // Map flames character to relationship
    private static String mapFlame(char c) {
        switch (c) {
            case 'F': return "Friends";
            case 'L': return "Love";
            case 'A': return "Affection";
            case 'M': return "Marriage";
            case 'E': return "Enemies";
            case 'S': return "Siblings";
            default:  return "Unknown";
        }
    }

    // Remove spaces and convert to lowercase, keep only letters
    private static String normalize(String s) {
        return s.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    // Count remaining letters after cancelling common characters
    private static int remainingLetterCount(String name1, String name2) {
        StringBuilder sb1 = new StringBuilder(name1);
        StringBuilder sb2 = new StringBuilder(name2);

        // For each char in sb1 try to find and remove from sb2
        for (int i = 0; i < sb1.length(); i++) {
            char ch = sb1.charAt(i);
            int idx = -1;
            for (int j = 0; j < sb2.length(); j++) {
                if (sb2.charAt(j) == ch) {
                    idx = j;
                    break;
                }
            }
            if (idx != -1) {
                // common char found -> remove from both
                sb1.setCharAt(i, '*');  // mark for removal
                sb2.deleteCharAt(idx);
            }
        }

        // Count non-marked characters in sb1 plus remaining in sb2
        int count = 0;
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != '*') count++;
        }
        count += sb2.length();
        return count;
    }

    // Run the FLAMES elimination using circular removal
    private static char runFlames(int count) {
        List<Character> flames = new ArrayList<>();
        flames.add('F');
        flames.add('L');
        flames.add('A');
        flames.add('M');
        flames.add('E');
        flames.add('S');

        int idx = 0; // start index

        while (flames.size() > 1) {
            // The position to remove: (idx + count - 1) % size
            int removeIndex = (idx + count - 1) % flames.size();
            flames.remove(removeIndex);
            // next start is the same position (since elements shift left)
            idx = removeIndex % flames.size(); // safe even if removeIndex == size (but it won't be)
        }

        return flames.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("FLAMES Game");
        System.out.print("Enter name 1: ");
        String raw1 = sc.nextLine();
        System.out.print("Enter name 2: ");
        String raw2 = sc.nextLine();

        String name1 = normalize(raw1);
        String name2 = normalize(raw2);

        if (name1.isEmpty() || name2.isEmpty()) {
            System.out.println("Please enter valid names containing letters.");
            sc.close();
            return;
        }

        int remaining = remainingLetterCount(name1, name2);

        if (remaining == 0) {
            System.out.println("All letters cancelled — special bond! (Consider it 'Siblings' or 'Friends')");
            sc.close();
            return;
        }

        char resultChar = runFlames(remaining);
        String result = mapFlame(resultChar);

        System.out.println();
        System.out.println("Result for \"" + raw1 + "\" and \"" + raw2 + "\": " + result);
        sc.close();
    }
}