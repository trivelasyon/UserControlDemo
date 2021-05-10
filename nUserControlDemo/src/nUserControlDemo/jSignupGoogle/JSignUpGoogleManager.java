package nUserControlDemo.jSignupGoogle;

public class JSignUpGoogleManager {
public void SingUpGoogle(String name,String surName,String eMail,String Password) {
	if(eMail.contains("@gmail.com")) {
		System.out.println("Uye kaydi Google ile yapildi");
	}
	else {
		System.out.println("Uye kaydi google ile Basarisiz");
	}
}
}
