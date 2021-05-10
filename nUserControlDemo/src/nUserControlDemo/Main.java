package nUserControlDemo;


import nUserControlDemo.business.abstracts.IUserService;
import nUserControlDemo.business.concrates.UserControlManager;
import nUserControlDemo.business.concrates.UserManager;
import nUserControlDemo.business.concrates.UserVerifyManager;
import nUserControlDemo.core.JUserSignUpManagerAdapter;
import nUserControlDemo.core.JUserSignUpService;
import nUserControlDemo.dataAccess.concrates.HibernateUserDao;
import nUserControlDemo.entities.concrates.User;

public class Main {
	public static void main(String[] args) {

	IUserService userService=new UserManager(new UserControlManager(new HibernateUserDao()) , new HibernateUserDao(), new UserVerifyManager());
	User user=new User(1,"Hakan","Özel","hakanozel@gmail.com.tr","1234567");
	JUserSignUpService jUserSignUpService=new JUserSignUpManagerAdapter();
	jUserSignUpService.UserSignUp(user);
	//userService.signUp(user);
	//userService.signIn(user);
	
	}
}
