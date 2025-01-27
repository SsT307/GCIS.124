import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdClass {

    public static void getAge() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        System.out.println((age));
        scan.close();
    }

    public static void main(String[] args) { 
        /* ----------------------- one way of catching errors ----------------------- */
        /*
        try { // trys to ask the user for their age and prints out their age, it looks for an int
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        System.out.println((age));
        scan.close();
        } catch (InputMismatchException e) { // incase the person gives a value that is not an int, the catch block will except it
            System.out.println("Enter a whole number. "+ e); // prints out the error name
        }
        */
        /* ----------------------------- another way... ----------------------------- */
        getAge();
    }
}