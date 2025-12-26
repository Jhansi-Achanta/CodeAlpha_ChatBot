import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("🤖 ChatBot: Hello! I am your assistant.");
        System.out.println("🤖 ChatBot: You can ask me basic questions.");
        System.out.println("🤖 ChatBot: Type 'exit' to end the chat.");

        while (true) {
            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase().trim();

            if (userInput.equals("exit")) {
                System.out.println("🤖 ChatBot: Goodbye! Have a nice day 😊");
                break;
            }
            else if (userInput.contains("who created java")) {
                System.out.println("🤖 ChatBot: Java was created by James Gosling.");
            }
            else if (userInput.contains("your name")) {
                System.out.println("🤖 ChatBot: I am a simple Java ChatBot.");
            }
            else if (userInput.contains("how are you")) {
                System.out.println("🤖 ChatBot: I'm doing great! Thanks for asking.");
            }
            else if (userInput.contains("what can you do")) {
                System.out.println("🤖 ChatBot: I can answer basic questions and chat with you.");
            }
            else if (userInput.contains("internship")) {
                System.out.println("🤖 ChatBot: Internships help you gain real-world experience.");
            }
            else if (userInput.contains("oop")) {
                System.out.println("🤖 ChatBot: OOP stands for Object-Oriented Programming.");
            }
            else if (userInput.contains("project")) {
                System.out.println("🤖 ChatBot: Projects help improve practical coding skills.");
            }
            else if (userInput.contains("java")) {
                System.out.println("🤖 ChatBot: Java is a powerful object-oriented programming language.");
            }
            else if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("🤖 ChatBot: Hello! How can I help you?");
            }
            else if (userInput.contains("thank you") || userInput.contains("thanks")) {
                System.out.println("🤖 ChatBot: You're welcome! 😊");
            }
            else if (userInput.contains("bye")) {
                System.out.println("🤖 ChatBot: Bye! See you soon 👋");
                break;
            }
            else {
                System.out.println("🤖 ChatBot: Sorry, I didn't understand that.");
            }
        }

        sc.close();
    }
}
