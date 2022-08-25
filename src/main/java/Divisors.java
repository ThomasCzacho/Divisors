import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number :  ");
        int num = console.nextInt(); //number to be checked

        System.out.print("Divisors of " + num+" "+ "="+" " );

        for (int i = 1; i < num; i++) { //when variable i(iterations) is less than the number entered, the loop stops
            if (num % i != 0) {         //this is used to get the divisors for larger numbers, while preventing
                                        //an infinite loop
                continue;
            }
            System.out.print(i + " , ");
        }
    }
}
