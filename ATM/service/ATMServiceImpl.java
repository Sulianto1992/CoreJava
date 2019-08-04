package service; //Name of the package

import java.util.ArrayList;
import java.util.Scanner;

import dao.ATMDAO;
import dao.ATMDAOImpl;
import pojo.User;

public class ATMServiceImpl implements ATMService //Name of the class
{
	//Variable Declaration
	ATMDAO refATMDAO;
	User refUser;
	String firstPassword, secondPassword, colour;
	String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	String charOnly = "^[a-zA-Z]*$";
	
	@Override
	public void registerUser(ArrayList<User> refUserList)
	{
		
		//Prompt for user details
		System.out.print("Enter email address : ");
		Scanner sc = new Scanner(System.in);
		String emailAddress = sc.nextLine();
		
		//Prompt the user for email address if the value is incorrect
		while (!(emailAddress.matches(regex)))
		{
			//Prompt for user details
			System.out.print("Incorrect email address. Please enter the correct value.\n");
			System.out.print("Enter email address : ");
			emailAddress = sc.nextLine();
		} //end while
		
		//Create object of User class
		refUser = new User();
		
		//Set value to setter method of User class
		refUser.setEmailAddress(emailAddress);
		 
		refATMDAO = new ATMDAOImpl();
		while ((refATMDAO.registerValidate(refUserList, refUser)) == true)
		{
			System.out.println("Email already exists!");
			System.out.println("Please enter another valid address: ");
			System.out.print("Enter email address : ");
			emailAddress = sc.nextLine();
		} //end while
		
		//Prompt user for his or her password
		System.out.print("\nEnter Password: ");
		firstPassword = sc.nextLine();
		
		//Prompt user to enter his or her password again
		System.out.print("\nRe-type Password: ");
		secondPassword = sc.nextLine();		
		
		//Execute this statement until both passwords matches
		while (!(firstPassword.equals(secondPassword)))
		{
			System.out.println("Password doesn't match!!\n");
			System.out.println("Please enter the password again");
			
			//Prompt user for his or her password
			System.out.print("\nEnter Password: ");
			firstPassword = sc.nextLine();
			
			//Prompt user to enter his or her password again
			System.out.print("\nRe-type Password: ");
			secondPassword = sc.nextLine();
			System.out.println();
			
		} //end while
		
		//Prompt user for his or her favourite colour
		System.out.print("\nWhat is your favourite colour ? ");
		colour = sc.nextLine();
		
		//Prompt the user for email address if the value is incorrect
		while (!(colour.matches(charOnly)))
		{
			//Prompt for user details
			System.out.print("Invalid value. Please enter the correct value.\n");
			System.out.print("What is your favourite colour ?");
			colour = sc.nextLine();
		} //end while
		
	}   

	@Override
	public void loginService(ArrayList<User> refUserList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forgetPassword(ArrayList<User> refUserList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() 
	{
		System.out.println("Logout Successfully!!!");
	} //end logout method
	
	public void displayMainMenu()
	{
		//Main page menu
		System.out.println("User Home Page :");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Forget Password");
		System.out.println("4. Logout (exit)\n");
	}
	
} //end ATMServiceImpl
