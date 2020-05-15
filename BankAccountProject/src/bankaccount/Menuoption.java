package bankaccount;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Menuoption extends AccountDetails{

	static Scanner menuinput=new Scanner(System.in);
	HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
	int cid;
	int pw;
	public void login() {
		int x=1;
		do{
			try {
		
		
		hp.put(1234, 5678);
		hp.put(0000, 1111);
		System.out.println("Welcome to our Bank");

		System.out.println("Enter the Custormer Id");
		cid=menuinput.nextInt();
		System.out.println("Enter the Password");
		pw=menuinput.nextInt();
		}
		catch(Exception e) {
			System.out.println("Enter Integer Only");
			x=2;
		}
		
		for (Entry<Integer,Integer> mydata : hp.entrySet()) {

			if(mydata.getKey()==cid && mydata.getValue()==pw)
			{
				accounttype();
			}
			}
			System.out.println("Wrong CID and password please Try Again");


		}while (x==1);


	}

	//Main Menu
	public  void accounttype() {
		System.out.println("Welcome to our Online Bank");
		System.out.println("***************************");
		System.out.println("");
		System.out.println("Select the option you want to access");
		System.out.println("Type 1: -Checking Account");
		System.out.println("Type 2: -Saving Account");
		System.out.println("Type 3: -Exit");
		System.out.println();
		int menuselection=menuinput.nextInt();
		switch(menuselection) {
		case 1:
			checkingaccount();
			break;
		case 2:
			savingsaccount();
			break;
		case 3:
			System.out.println("Thank you for using out ATM Have a Good Day!");
			break;
		default:
			System.out.println("Invalid selection");
			accounttype();
		}
	}

	//Checking Account

	public void checkingaccount() {
		System.out.println(" Welcome to Checking Account");
		System.out.println("Please Select the option you want to access");
		System.out.println("Type 1: -Checking Deposit");
		System.out.println("Type 2: -Checking withdraw");
		System.out.println("Type 3: -view balance");
		System.out.println("Type 4: -Exit");
		int checkselection=menuinput.nextInt();
		switch(checkselection) {
		case 1:
			getcheckingdepositinput();
			checkingaccount();
			break;
		case 2:
			getcheckingwithdrawinput();

			checkingaccount();
			break;
		case 3:
			System.out.println(getbalance());
			checkingaccount();
			break;
		case 4:
			System.out.println("Thank you for using our ATM");
			break;
		default:
			System.out.println("Invalid Selection");
			checkingaccount();
		}
	}

	//Savings Account

	public  void savingsaccount() {
		System.out.println(" Welcome to Savings Account");
		System.out.println("Please Select the option you want to access");
		System.out.println("Type 1: -Savings Deposit");
		System.out.println("Type 2: -Savings withdraw");
		System.out.println("Type 3: -view balance");
		System.out.println("Type 4: -Exit");
		int saveselection=menuinput.nextInt();
		switch(saveselection) {
		case 1:
			getsavingdepositinput();
			System.out.println("**********");
			savingsaccount();
			break;
		case 2:
			getsavingwithdrawinput();
			System.out.println("********");
			savingsaccount();
			break;
		case 3:
			System.out.println(viewbalance());
			System.out.println("********");
			savingsaccount();
			break;
		case 4:
			System.out.println("Thank you for Using our ATM");
			break;
		default:
			System.out.println("Invalid Selection");
			System.out.println("********");
			savingsaccount();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
