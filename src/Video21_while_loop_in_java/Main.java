package Video21_while_loop_in_java;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        // while loop in Java


        // while loop = repeat some code forever
        //              while some condition remains true

//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        while (name.isEmpty()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Hello " + name);
//
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You quit the game");


    }
}