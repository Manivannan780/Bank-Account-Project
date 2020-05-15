package bankaccount;

import java.util.Scanner;

public class AccountDetails {


	double checkingbalance=0;
	double savingbalance=0;
	Scanner input=new Scanner(System.in);

	//deposit checking amount
	public void getcheckingdepositinput() {
		System.out.println("Enter the Deposit Amount");
		double amount=input.nextInt();
		System.out.println("The Deposit Amount is :"+amount);
		if((checkingbalance+amount)>=0){
			checkbalance(amount);
			System.out.println("New Checking Account balance is :"+checkingbalance+"/n");
		}
		else{
			System.out.println("The Balance Cannot be Negative");
		}

	}

	//with draw checking amount
	public void getcheckingwithdrawinput() {
		System.out.println("Enter the amount you want to with draw");
		double amount=input.nextInt();

		System.out.println("The withdraw Amount is :"+amount);
		if((checkingbalance-amount)>=0) {
			checkwithdraw(amount);
			System.out.println("New  Checking Account New balance is :"+checkingbalance+ "/n");
		}
		else{
			System.out.println("The Balance Cannot be Negative");
		}
	}

	//With draw functionality
	public double checkwithdraw(double amount) {
		checkingbalance=(checkingbalance-amount);
		return checkingbalance;

	}

	//Deposit functionality

	public double checkbalance(double amount) {
		checkingbalance=checkingbalance+amount;
		return checkingbalance;
	}

	//Current balance

	public double getbalance() {
		return checkingbalance;
	}

	
	//deposit Savings amount
	public void getsavingdepositinput() {
		System.out.println("Enter the Deposit Amount");
		double amount=input.nextInt();
		System.out.println("The Deposit Amount is :"+amount);
		if((savingbalance+amount)>=0){
			savebalance(amount);
			System.out.println("New Saving Account balance is :"+savingbalance);
		}
		else{
			System.out.println("The Balance Cannot be Negative");
		}

	}

	//with draw Savings amount
	public void getsavingwithdrawinput() {
		System.out.println("Enter the amount you want to with draw");
		double amount=input.nextInt();

		System.out.println("The withdraw Amount is :"+amount);
		if((savingbalance-amount)>=0) {
			savewithdraw(amount);
			System.out.println("New  Saving Account New balance is :"+savingbalance);
		}
		else{
			System.out.println("The Balance Cannot be Negative");
		}
	}

	//With draw functionality
	public double savewithdraw(double amount) {
		savingbalance=(savingbalance-amount);
		return savingbalance;

	}

	//Deposit functionality

	public double savebalance(double amount) {
		savingbalance=savingbalance+amount;
		return savingbalance;
	}

	//Current balance

	public double viewbalance() {
		return savingbalance;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}

}
