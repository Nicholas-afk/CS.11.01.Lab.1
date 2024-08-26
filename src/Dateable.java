import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else {
            int minAgeToDate = 7 + (age / 2);
            System.out.println(age + "-year olds should date somebody who is at least " + minAgeToDate + " years old.");
        }
        scanner.close();
    }
}
