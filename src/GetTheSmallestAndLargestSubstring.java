import java.util.Scanner;

public class GetTheSmallestAndLargestSubstring {
    //string for testing welcometojava
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
//        s = "welcometojava";
//        char[] word = s.toCharArray();
//        for (int i = 0; i < word.length-k+1; i++) {
//            System.out.println(s.subSequence(0, 3));
//        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}