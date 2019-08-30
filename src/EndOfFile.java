import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
The challenge here is to read lines of input until you reach EOF, then number and print
all lines of content.

Input format
Read some unknown n lines of input from stdin(System.in) until you reach EOF;
each line of input contains a non-empty String

Output Format
For each line, print the line number, followed by a single space,
and then the line content received as input.
 */
public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        for(int n=1; sc.hasNext();n++){
            System.out.println(n + " " + sc.nextLine());
        }

    }
}

