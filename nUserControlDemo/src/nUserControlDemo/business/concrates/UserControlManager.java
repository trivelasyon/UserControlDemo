package nUserControlDemo.business.concrates;

import nUserControlDemo.business.abstracts.IUserControlManager;
import nUserControlDemo.dataAccess.abstracts.UserDao;
import nUserControlDemo.entities.concrates.User;
import java.util.regex.Pattern;

public class UserControlManager implements IUserControlManager{

	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	private UserDao userDao;
	
	public UserControlManager(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public boolean checkNameSurname(User user) {
		if(user.getName().length()>2 && user.getSurName().length()>2)
			
		{
			
		return true;
		
		}
		
		else 
		{
			
		return false;
		
		}
	}

	@Override
	public boolean checkPassWord(User user) {
	  if (user.getPassword().length()>6) {
		return true;
	}
	  else {
		return false;
	  }
	}

	@Override
	public boolean checkEmailFormat(User user) {
		Pattern pattern=Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		return pattern.matcher(user.geteMail()).find();
	}

	@Override
	public boolean checkEmailFirst(User user) {
	if	(this.userDao.getEmails(user).contains(user.geteMail())){
		return false;
	}
	else
	{
		return true;
	}

	}

	@Override
	public boolean checkNullParameter(User user) {
		
		return true;
	}

}
