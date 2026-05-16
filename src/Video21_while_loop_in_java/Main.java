package Video21_while_loop_in_java;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        // EXAMPLE 1

        // while loop in Java;


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

        // EXAMPLE 2

//        Scanner scanner = new Scanner(System.in);
//
//        String response = "";
//
//        while(!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quit: ");
//            response = scanner.next().toUpperCase();
//        }
//        System.out.println("You quit the game");
//
//        scanner.close();

        // EXAMPLE 3

//        Scanner scanner = new Scanner(System.in);
//
//        int age = 0;
//
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        while(age < 0){
//            System.out.println("Your age cant be negative number");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }
//
//        System.out.println("You are " + age + " years old");
//
//        scanner.close();

        // EXAMPLE 4

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {
            System.out.print("Enter a number between 1 to 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();


    }
}