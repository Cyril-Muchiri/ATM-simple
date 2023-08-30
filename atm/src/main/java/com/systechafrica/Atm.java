package com.systechafrica;

import java.util.Scanner;

public class Atm {

    static Scanner scanner = new Scanner(System.in);

    static int originalBalance = 10001000;

    static int customerInput;
    static String suppliedPass;

    static int count = 3;

    static void startPrompts(int counter) {
        if (counter > 0) {
            System.out.println("Enter customer number : ");
            customerInput = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter customer password : ");
            suppliedPass = scanner.nextLine();

            logIn(customerInput, suppliedPass);

        } else {
            System.out.println("OOps!!");
        }

    }

    static int logIn(int customerNumber, String pass) {

        if (customerNumber == 10 && pass.equals("Admin123")) {
            displayMenu();
        } else {
            count--;
            // if(count !=0){
            System.out.println("INVALID CREDENTIALS!!");
            System.out.println(count + " attempts remaining!!");
            startPrompts(count);

            // }else{
            // System.out.println("OOps!! you are out of attempts try again in 10
            // minutes!!!");
            // }

        }

        return count;
    }

    static void displayMenu() {
        System.out.println("you are in the menu");

        // System.out.println("***********************\n");

        // System.out.println("ATM SIMULATOR");

        // System.out.println("**********************");

        // System.out.println("ATM SERVICES");

        // System.out.println("_________________________");

        // System.out.println("1. Check Balance");
        // System.out.println("2. Deposit");
        // System.out.println("3. Withdraw");
        // System.out.println("4. Transfer cash");
        // System.out.println("5. Quit");

        // System.out.println("___________________________");
    }

    static void withdraw() {
    }

    static void checkBalance() {
    }

    static void Deposit() {
    }

    static void transferCash() {
    }

    public static void main(String[] args) {

        System.out.println("Welcome to ATM SIMULATOR, press Y to continue");

        String cont = scanner.nextLine().toLowerCase();

        if (cont.matches("y")) {

            // logIn(customerInput, suppliedPass);
            startPrompts(count);

        } else {
            System.out.println("You didnt press 'y' to continue");
        }
    }
}
