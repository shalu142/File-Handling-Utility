import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileOperation {

    private static String filePath = "sample.txt"; // Default file name
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("\n==== File Operations Menu ====");
                System.out.println("1. Create New File");
                System.out.println("2. Write to File");
                System.out.println("3. Read from File");
                System.out.println("4. Modify File (Replace Word)");
                System.out.println("5. Delete Entire File");
                System.out.println("6. Clear File Content");
                System.out.println("7. Exit");
                System.out.print("Enter your choice (1-7): ");

                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1 -> createFile();
                    case 2 -> writeOption();
                    case 3 -> readFromFile();
                    case 4 -> modifyOption();
                    case 5 -> deleteFile();
                    case 6 -> clearFileContent();
                    case 7 -> {
                        System.out.println("Exiting the program.");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please enter a number from 1 to 7.");
                }
            }
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number input.");
        }
    }

    // Option 1: Create a new file
    private static void createFile() throws IOException {
        System.out.print("Enter the new file name (e.g., notes.txt): ");
        filePath = scanner.nextLine().trim();
        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("File created: " + filePath);
        } else {
            System.out.println("File already exists.");
        }
    }

    // Option 2: Write content to file
    private static void writeOption() throws IOException {
        if (!fileExists()) return;
        System.out.println("Enter text to write to the file (type 'end' on a new line to finish):");
        StringBuilder content = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if ("end".equalsIgnoreCase(line.trim())) break;
            content.append(line).append("\n");
        }
        writeToFile(content.toString());
    }

    // Option 3: Read file content
    public static void readFromFile() throws IOException {
        if (!fileExists()) return;

        File file = new File(filePath);
        if (file.length() == 0) {
            System.out.println("File is empty.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nFile Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Option 4: Modify file content
    private static void modifyOption() throws IOException {
        if (!fileExists()) return;

        System.out.print("Enter the word to replace: ");
        String target = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacement = scanner.nextLine();

        modifyFile(target, replacement);
    }

    // Option 5: Delete file completely
    private static void deleteFile() throws IOException {
        if (!fileExists()) return;
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Option 6: Clear only the content of the file
    private static void clearFileContent() throws IOException {
        if (!fileExists()) return;
        new FileWriter(filePath, false).close(); // Overwrite with empty content
        System.out.println("File content cleared.");
    }

    // Utility: Check if file exists
    private static boolean fileExists() {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File does not exist. Use option 1 to create it first.");
            return false;
        }
        return true;
    }

    // Write content to file
    public static void writeToFile(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("File written successfully.");
        }
    }

    // Modify file by replacing text
    public static void modifyFile(String target, String replacement) throws IOException {
        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);

        List<String> modifiedLines = new ArrayList<>();
        for (String line : lines) {
            modifiedLines.add(line.replaceAll(target, replacement));
        }

        Files.write(path, modifiedLines);
        System.out.println("File modified successfully.");
    }
}
