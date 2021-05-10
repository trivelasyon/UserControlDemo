package nUserControlDemo.dataAccess.abstracts;

import java.util.List;

import nUserControlDemo.entities.concrates.User;

public interface UserDao {
	
	void UserSave(User user);
	List<User>getUsers(User user);
	List<String>getEmails(User user);

}
