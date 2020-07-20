/*
 * You are given a word. Now, using your favorite programming language, write a
 * code to test if the word that is given to you is a palindrome. [ Palindromes
 * are words that have similar characters from left and right both. Ex: noon,
 * radar, civic, etc.
 */
public class Palindrome {
    public static void main(String[] args) {
        String input = "aracecara";
        System.out.println(isPalindrome(input));
    }

    static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
