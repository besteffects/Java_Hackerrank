/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature.
Try to solve this problem using Arraylist.
You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to
tell the number located in y-th position of x-th line.
Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that
line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of
queries. Each query will consist of two integers x and y.

Each number will fit in signed integer.
Total number of integers in n lines will not cross Math.pow(10,5).

Output Format
In each line, output the number located in y-th position of x-th line. If there is no such position, just print "ERROR!"
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>(n);
        for (int j = 0; j < n; j++) {
            int d = in.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>(d);
            for (int i = 0; i < d; i++) {
                int x = in.nextInt();
                al.add(x);
            }
            a.add(al);
        }
        int k = in.nextInt();
        while (k > 0) {
            int o = in.nextInt();
            int p = in.nextInt();
            int g = o - 1;
            int h = p - 1;
            if (g < a.size() && h < a.get(g).size()) {
                System.out.println(a.get(g).get(h));
            } else {
                System.out.println("ERROR!");
            }
            k--;
        }

    }
}
