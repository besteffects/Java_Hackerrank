import java.util.Scanner; /*
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the
anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise,
print "Not Anagrams" instead.

Input Format
The first line contains a string denoting .
The second line contains a string denoting .

Output Format
Print "Anagrams" if a and b are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0
anagram
margana

Sample Output 0
Anagrams

Sample Input 2
Hello
hello

Sample Output 2
Anagrams */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        return false; //should be fixed
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
