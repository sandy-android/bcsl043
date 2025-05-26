// Exercise 24: Write a program in java, which takes the name of a file from user, 
// read the contents of the file and display it on the console.

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exc24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename to read: ");
        String filename = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(filename);
            int character;
            System.out.println("\nFile contents:\n");
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}