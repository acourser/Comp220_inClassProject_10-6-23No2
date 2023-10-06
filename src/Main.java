import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name, Aiden:");

        Scanner scnr = new Scanner(System.in);
        String name = scnr.next();

        System.out.println("Hello " + name);

    }
}