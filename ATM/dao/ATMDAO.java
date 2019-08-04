package dao; //Name of the package

import java.util.ArrayList;
import pojo.UserDetails;

public interface ATMDAO //Name of the interface
{
	UserDetails checkEmailAddress(String emailAddress);
	void addUser(UserDetails refUser);
	boolean isUserDataValid(String refUserID, String refPassword);
	UserDetails getUser(String emailAddress);
	//boolean loginValidate(ArrayList<User> refUserList, User ref);
	//boolean forgetPasswordValidate(ArrayList<User> refUserList);
	

} //end ATMDAO
