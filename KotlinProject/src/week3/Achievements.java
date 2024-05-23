package week2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Achievements {

    public static void main(String[] args) {
        ask();
    }

    public static void ask() {
        Map<String, String> dictionary = new TreeMap<>();

        // Adding key-value pairs to the dictionary
        dictionary.put("Boole", "Boolean Logic");
        dictionary.put("De Morgan", "De Morgan's Law");
        dictionary.put("Shannon", "Theorize Logic");
        dictionary.put("Atanasoff", "Theorize Digital Comp");
        dictionary.put("Mauchly", "UNIVAC");
        dictionary.put("Von Neumann", "Computer Architecture");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter an name: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("q")) { break; }
            System.out.println(dictionary.getOrDefault(userInput, "Name not found"));
        }
        scanner.close();
    }
}
