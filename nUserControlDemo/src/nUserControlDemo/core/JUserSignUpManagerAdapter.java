package nUserControlDemo.core;

import nUserControlDemo.entities.concrates.User;
import nUserControlDemo.jSignupGoogle.JSignUpGoogleManager;

public class JUserSignUpManagerAdapter implements JUserSignUpService{

	@Override
	public void UserSignUp(User user) {
		JSignUpGoogleManager googleManager=new JSignUpGoogleManager();
		googleManager.SingUpGoogle(user.getName(), user.getSurName(), user.geteMail(),user.getPassword());
	}

}
