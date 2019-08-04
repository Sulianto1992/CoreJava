package pojo; //Name of the package

public class AccountInfo //Name of the class
{
	//Member declaration
	private double balance;
	
	//Display zero dollars for new account users
	public AccountInfo()
	{
		balance = 0;
	} //end AccountInfo method
	
	//Return the current balance
	public double getBalance()
	{
		return balance;
	}
	
	//Setter method for deposit amount
	public void depositAmount(double amount)
	{
		balance = balance + amount;
	} //end setDepositAmount method
	
	
	//Getter method for checking the account balance
	public double getAccountBalance()
	{
		return balance;
	} //end getAccountBalance method
	
	//Update the current balance
	public boolean withdrawAmount(double amount)
	{
		if (isEnoughWithdraw(amount))
		{
			balance = balance - amount;
			return true;
		}
		else
		{
			return false;
		} //end if
	} //end withdrawAmount

	//Determine whether it is enough amount to withdraw
	public boolean isEnoughWithdraw(double amount) 
	{
		if (balance > amount)
		{
			return true;
		}
		else
		{
			return false;
		} //end if
		
	} //end isEnoughWithdraw
	
} //end AccountInfo
