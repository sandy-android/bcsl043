// Exercise 23: Write a program in java to read a statement from console, convert it in to 
// uppercase and again print on console.
import java.util.Scanner;

public class Exc23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String input = scanner.nextLine();
        String upperCaseInput = input.toUpperCase();
        System.out.println("Uppercase: " + upperCaseInput);
        scanner.close();
    }
}