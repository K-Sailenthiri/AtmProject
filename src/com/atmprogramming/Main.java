package com.atmprogramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AtmOperations operation = new AtmOperation();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Number : ");
        int atmNumber = input.nextInt();
        System.out.print("Enter Pin : ");
        int pin = input.nextInt();
        if ((atmnumber==atmNumber) && (atmpin==pin)){
            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
                System.out.println("Enter choice : ");
                int choice = input.nextInt();
                if (choice==1){
                    operation.viewBalance();
                }
                else if (choice==2) {
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount = input.nextDouble();
                    operation.withdrawAmount(withdrawAmount);

                }
                else if (choice==3) {
                    System.out.println("Enter Amount to Deposit : ");
                    double depositAmount = input.nextDouble();
                    operation.depositAmount(depositAmount);

                }
                else if (choice==4) {
                    operation.viewMiniStatement();

                }
                else if (choice==5) {
                    System.out.println("Collect your ATM card\nThank you for using ATM mechine!!!");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter correct choice");
                }

            }

        }
        else {
            System.out.println("Incorrect Atm number or pin");
            System.exit(0);
        }

    }
}