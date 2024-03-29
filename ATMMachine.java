package ATMMachine;

import java.util.Scanner;

class ATM{
	float Balance;
	int PIN = 5674;
	public void checkPin() {
		System.out.println("Enter your pin:");
		Scanner sc = new Scanner(System.in);
		int enteredPin = sc.nextInt();
		if (enteredPin==PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid pin");
			menu();
		}
	}
	public void menu() {
		System.out.println(" Enter your choice: ");
		System.out.println("1. Check A/c balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");
		
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		if (opt==1) {
			checkBalance();
		}
		else if(opt==2) {
			withDrawMoney();
		}
		else if(opt==3) {
			depositMoney();
		}
		else if (opt==4) {
			return;
		}
		else {
			System.out.println("enter a valid choice");
		}
		
	}
	public void checkBalance(){
		System.out.println("Balance : " + Balance);
		menu();
	}
	public void withDrawMoney() {
		System.out.println("Enter amount to Withdraw:");
		Scanner sc= new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance - amount;
			System.out.println("Money Withdrawl Successful");
		}
		menu();
	}
	public void depositMoney() {
		System.out.println("Enter the amount :");
		Scanner sc= new Scanner(System.in);
		float amount=sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money deposited successfully");
		menu();
	}
}


public class ATMMachine { //Main class

	public static void main(String[] args) { //Main method
		
		ATM obj = new ATM();
		obj.checkPin();
	}
}
