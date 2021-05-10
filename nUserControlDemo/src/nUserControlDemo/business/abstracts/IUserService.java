package nUserControlDemo.business.abstracts;

import nUserControlDemo.entities.concrates.User;

public interface IUserService {
	void signUp(User user);
    void signIn(User user);
}
