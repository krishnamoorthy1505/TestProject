package com.number;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=100000,withdraw,deposit;
		Scanner keyIn=new Scanner(System.in);
		
		while(true) {
			System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");
            int choice=keyIn.nextInt();
            switch (choice) {
			case 1:
				System.out.println("Enter the money withdraw");
				withdraw=keyIn.nextInt();
				if(balance>=withdraw) {
					balance=balance-withdraw;
					System.out.println("Collect the Amount");
				}
				else {
					System.out.println("Insufficient balance");
				}
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Enter the money deposited");
				deposit=keyIn.nextInt();
				balance=balance+deposit;
				System.out.println("Amount has been successful deposited");
				System.out.println("");
				break;
			case 3:
				System.out.println("Balance Amount"+balance);
				System.out.println(" ");
				break;
			case 4:
				System.exit(0);
			
			}
		}
	}

}
