package myapp;

public class Todo {
    
    public static void main(String[] args) {
        
        String[] tasks = new String[3];

        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";

        System.out.println(tasks); //not useful for array
        System.out.println(tasks[0]);
        System.out.println(tasks[1]);
        System.out.println(tasks[2]);
        System.out.printf("There are %d in this array.\n" , tasks.length);

        // Use a while loop to print all the elements in an array
        int index = 0;
        while (index < tasks.length) {
            
            System.out.printf("%d: %s\n", index, tasks[index]);
            index++;

        }

    }

}