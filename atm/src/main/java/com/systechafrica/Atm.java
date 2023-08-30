package com.systechafrica;

import java.util.Scanner;

public class Atm extends Thread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, press Y to continue");

        String cont = scanner.next();

        while (cont.equals("y")) {
            System.out.println("*********MUCHIRI SACCO ATM**********\n");

            System.out.println();

        }
    }
}
