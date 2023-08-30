package com.systechafrica;

import java.util.Scanner;

public class Atm extends Thread {

    static Scanner scanner = new Scanner(System.in);

    static int originalBalance = 10001000;
    static int newBalance ;

    static int customerInput;
    static String suppliedPass;

    static int count = 3;

    static void startPrompts(int counter) throws InterruptedException  {
        if (counter > 0) {
            System.out.println("Enter customer number : ");
            customerInput = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter customer password : ");
            suppliedPass = scanner.nextLine();

            logIn(customerInput, suppliedPass);

        } else {
            System.out.println("OOps!! Can't continue Maximum attempts reached");
           
        }

    }

    static void logIn(int customerNumber, String pass) throws InterruptedException  {

        if (customerNumber == 10 && pass.equals("Admin123")) {

         System.out.println("LOGIN SUCCESSFULL !!");
            displayMenu();
        } else {
            count--;
            // if(count !=0){
                System.out.println("");
            System.out.println("INVALID CREDENTIALS!!");
            System.out.println(count + " attempts remaining!!");
            System.out.println("TRY AGAIN!!\n");

            startPrompts(count);

            // }else{
            // System.out.println("OOps!! you are out of attempts try again in 10
            // minutes!!!");
            // }

        }

        // return count;
    }

    static void displayMenu() throws InterruptedException {
        // System.out.println("you are in the menu");

        System.out.println("\n***********************");

        System.out.println("ATM SIMULATOR");

        System.out.println("**********************");

        System.out.println("ATM SERVICES");

        System.out.println("___________________________\n");

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer cash");
        System.out.println("5. Quit");

        System.out.println("___________________________");

        int menuChoice =scanner.nextInt();
        switch (menuChoice) {
            case 1:
                checkBalance();
                break;
        case 2:
        deposit();
        break;
         case 3:
        withdraw();
        break;
         case 4:
        transferCash();
        break;
         case 5:
        quit();
        break;
            default:
            System.out.println("invalid menu item,reverting back to menu");
            Thread.sleep(2000);
            displayMenu();
                break;
        }



    }

    static void withdraw() {
    }

    static void checkBalance() {
         System.out.println("\n***********************");

        System.out.println("ATM SIMULATOR");

        System.out.println("**********************");

        System.out.println("ATM SERVICES");

        System.out.println("___________________________\n");

        System.out.println("--------check balance--------");

        System.out.println("Current balance : "+originalBalance);




    }

    static void deposit() {
    }

    static void transferCash() {
    }
    static void quit(){

    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to ATM SIMULATOR, press any key to continue");

        String cont = scanner.nextLine();

        if (!cont.isEmpty()) {

            // logIn(customerInput, suppliedPass);
            startPrompts(count);

        } else {
            System.out.println("You didnt press any button to continue");
        }
    }
}
