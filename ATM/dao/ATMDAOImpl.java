package dao; //Name of the package

import java.util.ArrayList;
import pojo.User;

public class ATMDAOImpl implements ATMDAO //Name of the class
{
	
	//Determine whether the email address exists in ArrayList
	@Override
	public boolean registerValidate(ArrayList<User> refUserList, User ref)
	{
		for (User refUser : refUserList) 
		{
			if (refUser.getEmailAddress().equals(ref.getEmailAddress()))
			{
				return true;
			}		
		}
		return false;
	}

	@Override
	public boolean loginValidate(ArrayList<User> refUserList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean forgetPasswordValidate(ArrayList<User> refUserList) {
		// TODO Auto-generated method stub
		return false;
	}
} //end ATMDAOImpl
