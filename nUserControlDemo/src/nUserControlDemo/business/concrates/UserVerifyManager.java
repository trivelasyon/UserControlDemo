package nUserControlDemo.business.concrates;

import nUserControlDemo.business.abstracts.IUserVerifiyManager;
import nUserControlDemo.entities.concrates.User;

public class UserVerifyManager implements IUserVerifiyManager {

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println(user.getName()+" "+user.getSurName()+" Kullanici icin dogrulama kodu gönderildi");
		
	}

	@Override
	public boolean clickVerifyEmail() {
		// TODO Auto-generated method stub
		return true;
	}

}
