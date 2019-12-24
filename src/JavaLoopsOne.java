import java.util.Scanner;

public class JavaLoopsOne {
//Given an integer, N, print its first 10 multiples

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int result=0;
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1; i<=10;i++){
            result=N*i;
            System.out.println(N + " x " + i + " = " + result);
            // alternative  System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
        scanner.close();


    }
}