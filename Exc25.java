
// Exercise 25: Write a java program to copy a file into another file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exc25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source file name: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Enter the destination file name: ");
        String destinationFile = scanner.nextLine();

        try {
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destinationFile);

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}
