package dao; //Name of the package

import java.util.ArrayList;
import pojo.User;

public interface ATMDAO //Name of the interface
{
	boolean registerValidate(ArrayList<User> refUserList);
	boolean loginValidate(ArrayList<User> refUserList);
	boolean forgetPasswordValidate(ArrayList<User> refUserList);

} //end ATMDAO
