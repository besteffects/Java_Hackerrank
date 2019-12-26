/*
You are given a 6*6 2D array. An hourglass in an array is a portion shaped like this:
abc
 d
efg

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
111000
010000
111000
000000
000000
000000
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
111
 1
111 and so on

There will be exactly 6 lines, each containing 6 integers separated by spaces. Each integer will be between -9 and 9 inclusive.

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
In this problem you have to print the largest sum among all the hourglasses in the array.
 */

import java.util.Scanner;

public class TwoDArray {

    private static void calculateSum2DArr(int[][] inputArr) {
        int[] sum = new int[16];
        int hourglass = 0;
        for (int i = 0; i < 4; i++) {
//print the row of space-separated values
            for (int j = 0; j < 4; j++) {
                sum[hourglass] = (inputArr[i][j] + inputArr[i][j + 1] + inputArr[i][j + 2] + inputArr[i + 1][j + 1] +
                        inputArr[i + 2][j] + inputArr[i + 2][j + 1] + inputArr[i + 2][j + 2]);
                hourglass++; //calculate the number of hourglasses
            }
        }
        //to print inner array use
//        for (int j = 0; j < sum.length; j++) {
//            System.out.print(sum[j] + " ");
        int max = sum[0]; //set and initialize the default max number of hourglasses
        for (int counter = 0; counter < sum.length; counter++) {
            if (sum[counter] > max) {
                max = sum[counter];
            }
        }
        System.out.println(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        calculateSum2DArr(arr);
    }
}

