import java.util.Scanner;

public class UsingArithmetic {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for seconds: ");
        int secondsTotal = scanner.nextInt();

        int seconds = secondsTotal % 60;
        int minutesTotal = secondsTotal / 60;
        int minutes = minutesTotal % 60;
//        int hours =  / 60;

//        System.out.print(hours + ":" + minutes + ":" + seconds);
        System.out.print("\n");
    }
}
