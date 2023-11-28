import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Privet, Usver!");
        try (Scanner scanner = new Scanner(System.in)) {
            //System.console().readLine();
            scanner.nextLine();
        }
    }
}