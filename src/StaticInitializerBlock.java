import java.util.Scanner;

/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
Complete the given code so that it outputs the area of a parallelogram with breadth B and height H.
 You should read the variables from the standard input.
 iF B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 */
public class StaticInitializerBlock {

    // Write your code here
    private static Scanner input = new Scanner(System.in);
    private static boolean flag = true;
    private static int B = input.nextInt();
    private static int H = input.nextInt();

    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

