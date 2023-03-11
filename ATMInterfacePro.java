import static java.lang.System.out;
import java.util.Scanner;

class ATM
{
	float balance;
	int PIN=123;

	public void checkPin()
	{
		Scanner scanner=new Scanner(System.in);
		out.println("Enter Your PIN");
		int userPIN=scanner.nextInt();
		if(userPIN==PIN)             // PIN=123
		{
			menu();	
		}
		else
		{
			out.println("Invalid PIN");
		}
	}

	public void menu()
	{
		System.out.println("Enter Your Choice");
		System.out.println("1. Transaction History");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Transfer Money");
		System.out.println("5. Account Balance");
		System.out.println("6. QUIT");

		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();

		if(choice==1)
		{
			transactionHistory();
		}
		else if(choice==2)
		{
			withdrawMoney();
		}
		else if(choice==3)
		{
			depositMoney();
		}
		else if(choice==4)
		{
			transferMoney();
		}
		else if(choice==5)
		{
			checkBalance();
		}
		else if(choice==6)
		{
			System.exit(0); 
			//break;
		}
		else
		{
			out.println("Invalid Choice");
		}
	}

	public void transactionHistory()
	{

	}

	public void withdrawMoney()
	{
		out.println("Enter Amount to Withdraw");
		Scanner scanner=new Scanner(System.in);
		Float amountWithdraw=scanner.nextFloat();

		if(amountWithdraw<balance)
		{
			balance=balance-amountWithdraw;
			out.println("Amount Withdraw Successfully!!");
			out.println("Current Balance: " + balance);
		}
		else
		{
			out.println("Insufficient Funds!!");
		}
		menu();
	}

	public void depositMoney()
	{
		out.println("Enter Amount to Deposit");
		Scanner scanner=new Scanner(System.in);
		Float amountDeposit=scanner.nextFloat();

		balance=balance+amountDeposit;
		out.println("Amount Deposited Successfully!!");
		out.println("Current Balance: " + balance);
		menu();
	}

	public void transferMoney()
	{
		Scanner scanner=new Scanner(System.in);
		out.println("Enter the Account Number to Transfer Money");
		Long accountToTransfer=scanner.nextLong();
		out.println("Enter the Amount to be transfered");
		Float amountTransfer=scanner.nextFloat();
		
		balance = balance-amountTransfer;
		out.println("Amount Successfully Transfered to Account No. " + accountToTransfer);
		menu();
	}

	public void checkBalance()
	{
		out.println("Balance: " + balance);
		menu();
	}
}

class ATMInterface{
	public static void main(String...args)
	{
		ATM obj=new ATM();
		obj.checkPin();
	}
}

