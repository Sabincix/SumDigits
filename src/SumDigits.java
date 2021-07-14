import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        System.out.println("We are going to sum digits of the number you enter");

        Scanner scanner = new Scanner(System.in);


//        enter in integer to sum digits
        System.out.println("Please enter an integer:");
        int intToSum = scanner.nextInt();



//       Task: transform 25 as sum of the numbers 2 + 5 =7
        // 25 = X
        // 25 == 2*10 + 5
        // result == ROUND_DOWN(X / 10) + X %  ROUND_DOWN(X / 10) * 10
        // result == ROUND (25 / 10 ) + 25 % ROUND_DOWN ( 25/10 ) * 10
        // result = ROUND_DOWN( 2.5) + 25 % (2 * 10)
        // result = 2 REMAINDER ( 25 / 20 )
        // result = 2 + 5

        int result = (int) (Math.floor(intToSum / 10) + (int)((intToSum % (Math.floor(intToSum/10) * 10))));

        System.out.println("Result is: " + result);


//        solution using string ??

        

    }
}


