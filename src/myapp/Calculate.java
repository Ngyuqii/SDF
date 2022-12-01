package myapp;
import java.io.Console;

public class Calculate {
   public static void main(String[] args) {
    Console cons = System.console();
    int sum = 0;

    while (true) {
        String input = cons.readLine("Enter a number.");
        input = input.trim();
    
        if (input.equals("stop")) {
        break;
    }

    sum += Integer.parseInt(input); //string to integer conversion
}

    System.out.printf("The total value is %d", sum);
   } 
}