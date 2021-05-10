package nUserControlDemo.business.abstracts;

import nUserControlDemo.entities.concrates.User;

public interface IUserControlManager {
boolean checkNameSurname(User user);
boolean checkPassWord(User user);
boolean checkEmailFormat(User user);
boolean checkEmailFirst(User user);
boolean checkNullParameter(User user);
}
