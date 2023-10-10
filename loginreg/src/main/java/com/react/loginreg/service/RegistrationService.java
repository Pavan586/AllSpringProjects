package com.react.loginreg.service;
import com.react.loginreg.entity.AdminLogin;
import com.react.loginreg.entity.AdminRegistration;
import com.react.loginreg.entity.Login;
import com.react.loginreg.entity.LoginMessage;
import com.react.loginreg.entity.Registration;


public interface RegistrationService {
	void saveRegisterUser(Registration registration);
	LoginMessage loginUser(Login login);
	LoginMessage loginAdmin(AdminLogin adminLogin);
	void saveAdminData(AdminRegistration areg);


}
