package Lists;/*
For this problem, we have 2 types of queries you can perform on a List:
1 Insert y at index x:

Insert
x y

2. Delete the element at index x:

Delete
x

Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value
y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

Output Format

Print the updated list L as a single line of space-separated integers.

Sample Input:
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
0 1 78 12 23
 */

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTask {
    public static void main(String[] args) {

        // Create and fill Linked List of Integers
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //Initial number of elements
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            ll.add(value);
        }

        
    }
}
