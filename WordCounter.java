import java.io.*;
import java.util.Scanner;

class WordCounter {

    // Function to count words in a text
    public static int countWords(String text) {
        // Split the text into words
        String[] words = text.split("\\s+");

        // Count the number of words
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Word Count Program-------------------");
        System.out.println("1. Enter 'T' to enter text.");
        System.out.println("2. Enter 'F' to provide a file.");

        // Prompt the user for input
        System.out.print("Enter your choice: ");
        String option = sc.nextLine();

        if (option.equalsIgnoreCase("T")) {
            // Read text input from the user
            System.out.print("Enter the text: ");
            String text = sc.nextLine();

            // Count the words in the text
            int wordCount = countWords(text);
            System.out.println("Total words: " + wordCount);
        } else if (option.equalsIgnoreCase("F")) {
            // Read file input from the user
            System.out.print("Enter the file path: ");
            String filePath = sc.nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                StringBuilder sb = new StringBuilder();
                String line;

                // Read the file line by line
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                    sb.append(" ");
                }

                // Count the words in the file
                int wordCount = countWords(sb.toString());
                System.out.println("Total words: " + wordCount);
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
        sc.close();
    }
}
