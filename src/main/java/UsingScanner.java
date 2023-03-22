import java.awt.*;
import java.util.Scanner;
public class UsingScanner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String myName = scanner.nextLine();
//
//        System.out.print("Enter a value: ");
//        String myString = scanner.next();
//
//        System.out.println("Enter 3 numeric values: ");
//        int myInt = scanner.nextInt();
//        int myInt2 = scanner.nextInt();
//        int myInt3 = scanner.nextInt();
//        scanner.close();
//
//        System.out.println("myString is: " + myString);
//        System.out.println("myInt is: " + myInt);
//        System.out.println("myInt2 is: " + myInt2);
//        System.out.println("myInt3 is: " + myInt3);


        Car car = new Car();
        if (car instanceof Car) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
