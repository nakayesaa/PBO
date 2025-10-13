package week7;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class InputReader {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public HashSet<String> userInput(){
        System.out.print(">");
        String input = scanner.nextLine().trim().toLowerCase();

        String[] chunks = input.split("\\s+");
        return new HashSet<>(Arrays.asList(chunks));
    }   

    public void close(){
        scanner.close();
    }
}