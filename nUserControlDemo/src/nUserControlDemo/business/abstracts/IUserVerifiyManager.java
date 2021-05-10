package nUserControlDemo.business.abstracts;

import nUserControlDemo.entities.concrates.User;

public interface IUserVerifiyManager  {
 void sendVerifyEmail(User user);
 boolean clickVerifyEmail();
}
