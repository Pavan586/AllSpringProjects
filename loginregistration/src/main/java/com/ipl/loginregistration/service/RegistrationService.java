package com.ipl.loginregistration.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.ipl.loginregistration.entity.AdminLogin;
import com.ipl.loginregistration.entity.AdminRegistration;
import com.ipl.loginregistration.entity.Login;
import com.ipl.loginregistration.entity.LoginMessage;
import com.ipl.loginregistration.entity.Registration;




public interface RegistrationService {
	void saveRegisterUser(Registration registration);
	LoginMessage loginUser(Login login);
	LoginMessage loginAdmin(AdminLogin adminLogin);
	void saveAdminData(AdminRegistration areg);


}
