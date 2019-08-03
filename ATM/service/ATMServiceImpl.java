package service; //Name of the package

import java.util.ArrayList;

import dao.ATMDAO;
import dao.ATMDAOImpl;
import pojo.User;

public class ATMServiceImpl implements ATMService //Name of the class
{
	ATMDAO refATMDAO;
	
	@Override
	public void registerUser(ArrayList<User> refUserList)
	{
		refATMDAO = new ATMDAOImpl();
		if(refATMDAO.registerValidate(refUserList) == true)
		{
			
		}
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
	
} //end ATMServiceImpl
