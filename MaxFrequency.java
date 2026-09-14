import java.util.*;

public class MaxFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxFreq = freq.get(maxChar);

        // Find character with maximum frequency
        for (char ch : str.toCharArray()) {

            if (freq.get(ch) > maxFreq) {
                maxFreq = freq.get(ch);
                maxChar = ch;
            }
        }

        System.out.println("Character with maximum frequency: " + maxChar);
        System.out.println("Frequency: " + maxFreq);

        sc.close();
    }
}
