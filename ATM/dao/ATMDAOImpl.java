package dao; //Name of the package

import java.util.ArrayList;

import pojo.User;

public class ATMDAOImpl implements ATMDAO //Name of the class
{
	
	@Override
	public boolean registerValidate(ArrayList<User> refUserList)
	{
		
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
