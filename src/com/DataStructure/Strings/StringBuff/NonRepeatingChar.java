import java.util.HashMap;

public class NonRepeatingChar {

    public static void main(String[] args) {

        // Example string
        String str = "swiss";   // Output: w

        // 1️⃣ Using HashMap (Time Complexity: O(n), Space Complexity: O(n))
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Find first non-repeating character
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeating character (HashMap): " + c);
                break;
            }
        }

        // 2️⃣ Using indexOf() and lastIndexOf() (Time Complexity: O(n^2))
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println("First non-repeating character (Brute Force): " + str.charAt(i));
                break;
            }
        }
    }
}
