package controller; //Name of the package

import java.util.ArrayList;
import java.util.Scanner;
import pojo.User;
import service.ATMService;
import service.ATMServiceImpl;

public class MainController //Name of the class
{
	ATMService refATMService; //ATMService is an interface
	User refUser; //User is a POJO (Plain old Java object)
	
	String reply; //Determine whether the user wants to continue to use the application
	int choice; //Retrieve the user choice
	ArrayList<User> userList = new ArrayList<User>(); //Create an object of ArrayList
	
	//Invoke method to display menu for the user
	public void userMainController()
	{
		mainMenu();
	} //end userMainController

	//Display menu
	void mainMenu() 
	{
		//Display welcome message
		System.out.println("Welcome to the ATM Application\n");
		System.out.println("Please select one of the options shown below\n");
		
		do
		{
			//Main page menu
			System.out.println("User Home Page :");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Forget Password");
			System.out.println("4. Logout (exit)\n");
			
			//Prompt for user input
			System.out.print("Enter Your Choice : ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			System.out.println(); 
			
			//Create object of ATMServiceImpl class and refer to the interface
			refATMService = new ATMServiceImpl();
			
			//Create object of User class
			User refUser = new User();
			
			//Execute the statement based on the user choice
			switch (choice)
			{
				case 1:  refATMService.registerUser(userList);
					     break;
					     
				case 2:	 refATMService.loginService(userList);
					     break;
					     
				case 3:  refATMService.forgetPassword(userList);
				         break;
					
				case 4:  refATMService.logout();
				         break;
			} //end switch
			
		} while (choice != 4);
	
    } //end mainMenu
} //end MainController
