package Q3;

import java.io.*;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Search <word> <file1> <file2> ...");
            return;
        }

        String searchWord = args[0];

        for (int i = 1; i < args.length; i++) {
            String fileName = args[i];
            File file = new File(fileName);

            try (Scanner scanner = new Scanner(file)) {
                int lineNumber = 0;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    lineNumber++;

                    if (line.contains(searchWord)) {
                        System.out.println(fileName + ": " + line);
                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println("Error: File " + fileName + " not found.");
            } catch (Exception e) {
                System.err.println("An error occurred while reading file " + fileName + ": " + e.getMessage());
            }
        }
    }
}

