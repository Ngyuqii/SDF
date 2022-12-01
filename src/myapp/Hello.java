package myapp;
import java.io.Console;
public class Hello {

    public static void main (String[] args) {
        Console cons = System.console();

        String name = " ";
        
        while (name.trim().length() <= 0) {
        name = cons.readLine("What is your name? ");
        }

        if (name.equals("fred")) {
            System.out.println("Woohoo!");
        }
        else {
            System.out.printf("Hello %s, Nice to meet you.", name);
        }
    }
}