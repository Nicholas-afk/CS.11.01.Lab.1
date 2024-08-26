import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int pagesToRead = 100 - age;

        System.out.println(age + "-year olds should read at least " + pagesToRead + " pages before giving up on a book.");

        scanner.close();
    }
}
