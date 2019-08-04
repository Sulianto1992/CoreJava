package pojo; //Name of the package

public class AccountInfo //Name of the class
{
	//Member declaration
	private double balance;
	private double withdrawAmount;
	
	//Display zero dollars for new account users
	public AccountInfo()
	{
		balance = 0;
	} //end AccountInfo method
	
	//Setter method for deposit amount
	public void setDepositAmount(double amount)
	{
		balance = balance + amount;
	} //end setDepositAmount method
	
	
	//Getter method for checking the account balance
	public double getAccountBalance()
	{
		return balance;
	} //end getAccountBalance method
	
	
	//Setter method for withdraw amount
	public void setWithdrawAmount(double wthamt)
	{
		this.withdrawAmount = wthamt;
	}
	
} //end AccountInfo
