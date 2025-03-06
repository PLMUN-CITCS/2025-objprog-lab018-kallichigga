import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        int number = getIntegerInput();
        checkEvenOrOdd(number);

    }

    public static int getIntegerInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.close();
        return number;

    }

    public static void checkEvenOrOdd(int number) {
        if(number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        }
        else {
            System.out.println(number + " is an Odd number.");
        }


    }

}