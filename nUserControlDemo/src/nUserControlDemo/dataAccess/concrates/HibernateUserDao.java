package nUserControlDemo.dataAccess.concrates;

import java.util.ArrayList;
import java.util.List;

import nUserControlDemo.dataAccess.abstracts.UserDao;
import nUserControlDemo.entities.concrates.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void UserSave(User user) {
		//Veritabani kodlari gelir.
		System.out.println("Kullanici basarili bir �ekilde veri tabanina kaydedildi");
		
	}


	@Override
	public List<User> getUsers(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getEmails(User user) {
		// veritabanindan user sonucu d�nm�� gibi bir i�lem yapildi.Normalde burasi b�yle kullanilmaz.
		List<String>eMails=new ArrayList<>();
		eMails.add("deneme@gmail.com");
		eMails.add("deneme2@gmail.com");
		return eMails;
	}

}
