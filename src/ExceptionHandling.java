import java.util.InputMismatchException;
import java.util.Scanner;

/*
You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32 bit signed integers or if
y is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException exc) {
            System.out.println(exc.getClass().getName());

        } catch (ArithmeticException exc) {
            System.out.println(exc);
        }
    }
}