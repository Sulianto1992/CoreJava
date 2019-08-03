package service; //Name of the package

import java.util.ArrayList;

import dao.ATMDAO;
import pojo.User;

public class ATMServiceImpl implements ATMService //Name of the class
{
	ATMDAO refATMDAO;
	
	@Override
	public void registerUser(ArrayList<User> refUserList)
	{
		refATMDAO = new ATMServiceImpl();
		if(refATMDAO.registerValidate(refUserList) == true)
		{
			
		}
	}
	
} //end ATMServiceImpl
