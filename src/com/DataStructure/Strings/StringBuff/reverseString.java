// 1 Reverse a String
public class ReverseString {

    public static void main(String[] args) {

        // 1️⃣ Reverse a complete string
        String str = "abc"; // Output: cba

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());


        // 2️⃣ Reverse each word in a sentence
        String sentence = "Java is good";

        String[] words = sentence.split(" ");

        for (String w : words) {
            for (int i = w.length() - 1; i >= 0; i--) {
                System.out.print(w.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
