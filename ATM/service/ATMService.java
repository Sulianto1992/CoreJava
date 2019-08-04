package service; //Name of the package

import java.util.ArrayList;
import pojo.User;

public interface ATMService //Name of the interface
{
	void displayMainMenu();
	void registerUser(ArrayList<User> refUserList);
	void loginService(ArrayList<User> refUserList);
	void forgetPassword(ArrayList<User> refUserList);
	void logout();
} //end ATMService
