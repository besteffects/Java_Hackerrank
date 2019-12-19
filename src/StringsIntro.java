import java.util.Scanner;
/*
Given two strings of lowercase English letters, A and D, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
 */

public class StringsIntro {

    public static void main(String[] args) {
        int length;
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        length = A.length() + B.length();
        System.out.println(length);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String result = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(result);
    }
}



