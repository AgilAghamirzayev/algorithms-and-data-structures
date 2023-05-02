package tree.second;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleStringApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of strings you will input: ");
        int count = scanner.nextInt();
        String[] strings = new String[count];

        for (int i = 0; i < count; i++) {
            strings[i] = scanner.next();
        }

        System.out.println("Array of string you entered:");
        System.out.println(Arrays.toString(strings));

        sortArrayOfStrings(strings);
        System.out.println("Array of string sorted:");
        System.out.println(Arrays.toString(strings));

        writeInFile(strings);
    }


    public static void sortArrayOfStrings(String[] string) {

        String temp;

        for (int j = 0; j < string.length; j++) {
            for (int i = j + 1; i < string.length; i++) {
                if (string[i].compareTo(string[j]) < 0) {
                    temp = string[j];
                    string[j] = string[i];
                    string[i] = temp;
                }
            }
        }

    }

    public static void writeInFile(String[] strings) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("strings.txt"));) {
            writer.write(Arrays.toString(strings));
            System.out.println("Successfully wrote in file!");
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }
}