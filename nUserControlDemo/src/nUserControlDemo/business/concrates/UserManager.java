package nUserControlDemo.business.concrates;

import nUserControlDemo.business.abstracts.IUserService;
import nUserControlDemo.dataAccess.abstracts.UserDao;
import nUserControlDemo.entities.concrates.User;
import nUserControlDemo.business.abstracts.IUserControlManager;
import nUserControlDemo.business.abstracts.IUserVerifiyManager;

public class UserManager implements IUserService{

	private IUserControlManager userControlManager;
	private UserDao userDao;
	private IUserVerifiyManager userVerifyManager;
	
	public UserManager(IUserControlManager userControlManager,UserDao userDao,IUserVerifiyManager userVerifyManager) {
		this.userControlManager=userControlManager;
		this.userDao=userDao;
		this.userVerifyManager=userVerifyManager;
	}
	
	@Override
	public void signUp(User user) {
		if(userControlManager.checkEmailFirst(user)&&userControlManager.checkEmailFormat(user)&&userControlManager.checkNameSurname(user)&&userControlManager.checkPassWord(user)&&userControlManager.checkNullParameter(user))
		{
			this.userVerifyManager.sendVerifyEmail(user);
			this.userVerifyManager.clickVerifyEmail();
			this.userDao.UserSave(user);
		}
		else {
			System.out.println("Kayit iþlemi Baþarisiz");
		}
	}

	@Override
	public void signIn(User user) {
		if(userDao.getUsers(user)==null) {
			System.out.println("Giriþ yapildi");
		}
		else {
			System.out.println("Giriþ Baþarisiz");
		}
		
	}

}
