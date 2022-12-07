package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Cart {

    public static void main(String[] args) {

         //Initialising shopping cart list
        List<String> shoppingCart = new LinkedList<String>();
        System.out.println("Welcome to your shopping cart.");

        Console cons = System.console();
        Boolean stop = false;
        
        while(!stop) {

            //Get user input (add, remove, list, exit)
            String userInput = cons.readLine("Please enter your command >").trim();
            userInput = userInput.replaceAll(",","");
            String[] inputArray = userInput.split(" ");
            String userAction = inputArray[0].toLowerCase();
            
            //Execute command based on detected userAction
            switch (userAction) {

                case "exit":
                System.out.println("Thank you for shopping.");
                stop = true;
                break;

                case "add":
                for (int i = 1; i < inputArray.length; i++) {
                    if (shoppingCart.contains(inputArray[i])) {
                        System.out.printf("You already have %s in your cart.\n", inputArray[1]);
                    }
                    else {
                        System.out.println(inputArray[i] + " was added to cart.");
                        shoppingCart.add(inputArray[i]);
                    }
                }
                break;

                case "delete":
                for (int i = 1; i < inputArray.length; i++) {
                    int r = Integer.parseInt(inputArray[i]);
                    if (r > shoppingCart.size()) {
                        System.out.println("Incorrect item.");
                    }
                    else {
                        System.out.println(shoppingCart.get(r-1) + " removed from cart.");
                        shoppingCart.remove(r-1);
                    }
                }
                break;

                case "list":
                if (shoppingCart.size() == 0) {
                    System.out.println("Your cart is empty.");
                }
                else {
                    for (int i=0; i < shoppingCart.size(); i++) {
                    System.out.printf("%d. %s\n", i+1, shoppingCart.get(i));
                    }
                }
                break;

                default:
                System.out.println("Invalid command.");
                break;

             }

        }
     
    }

}