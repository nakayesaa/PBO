package week7;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the MyITS Technical Support System.");
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");

        InputReader reader = new InputReader();
        ResponseReader responder = new ResponseReader();

        while(true) {
            HashSet<String> words = reader.userInput();

            if(words.contains("bye")) {
                System.out.println("Nice talking to you. Bye...");
                break;
            }

            String response = responder.generateResponse(words);
            System.out.println(response);
        }

        reader.close();
    }
}