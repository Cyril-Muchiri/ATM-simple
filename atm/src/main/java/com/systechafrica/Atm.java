package com.systechafrica;

import java.util.Scanner;

public class Atm extends Thread {

   static Scanner scanner = new Scanner(System.in);

    static int originalBalance = 10001000;

static void logIn(int customerNumber,String pass){
    int count = 3;

    
if (customerNumber == 10 && pass.equals("Admin123")) {
    displayMenu();
}else{

count --;
if(count !=0){
System.out.println("INVALID CREDENTIALS!!");
System.out.println(count+" attempts remaining!!");

}else{
    System.out.println("OOps!! you are out of attempts try again in 10 minutes!!!");
}

}



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


System.out.println("Enter customer number : ");
int customerInput = scanner.nextInt();

scanner.nextLine();

System.out.println("Enter customer password : ");
String suppliedPass = scanner.nextLine();

logIn(customerInput, suppliedPass);

        }else{
        System.out.println("You didnt press 'y' to continue");
        }
    }
}
