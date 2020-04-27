import java.util.ArrayList;
import java.util.Scanner;

public class FunWithArrayLists {
    public static void main(String[] args) {
        /*
        1. Write a Java program to create a new array list to hold colors.
        2. Add at least 3 colors (string) to the array list and print out all its values.
        3. Using the array list created above, print out the value at index 1.
        4. Using the array list above, prompt the user for one new color, and add that color to the array list.
        5. Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
           Each time the user enters a color, add that to the array list. Print out the list at the end.
         */

        // (1) Initializing an array list
        ArrayList <String> colors = new ArrayList<String>();

        // (2) Adding colors to the array list
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("orange");
        for(String i: colors){
            System.out.println(i);
        }

        // (3) Printing index[1]
        System.out.print("Color at index[1]: ");
        System.out.println(colors.get(1));

        // (4) Prompt user to add new color
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a color to be added to the list: ");
        String user_color = scn.nextLine();
        colors.add(user_color);
//        System.out.println(colors);

        // (5) Use loop to continuously prompt user for new colors to add into the ArrayList
        // until they enter 'Q' or 'q'.
        System.out.println("Please enter more colors to be added to the list or enter 'q' to quit: ");
        user_color = scn.nextLine();
        while (!user_color.equalsIgnoreCase("q")){
            colors.add(user_color);
            System.out.println("Please enter more colors to be added to the list or enter 'q' to quit: ");
            user_color = scn.nextLine();
        }
        // Print out ArrayList
        System.out.println(colors);
    }
}
