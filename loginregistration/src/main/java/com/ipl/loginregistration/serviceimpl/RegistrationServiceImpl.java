package com.ipl.loginregistration.serviceimpl;


import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ipl.loginregistration.entity.AdminLogin;
import com.ipl.loginregistration.entity.AdminRegistration;
import com.ipl.loginregistration.entity.Login;
import com.ipl.loginregistration.entity.LoginMessage;
import com.ipl.loginregistration.entity.Registration;
import com.ipl.loginregistration.repository.AdminRepository;
import com.ipl.loginregistration.repository.RegistrationRepository;
import com.ipl.loginregistration.service.RegistrationService;


@Component
public class RegistrationServiceImpl implements RegistrationService{
	@Autowired
	RegistrationRepository regrepo;
	@Autowired
	AdminRepository arepo;

	@Override
	public void saveRegisterUser(Registration registration) {
		// TODO Auto-generated method stub
		regrepo.save(registration);
		
	}

	@Override
	public LoginMessage loginUser(Login login) {
		// TODO Auto-generated method stub
		String msg="";
		Registration reg=regrepo.findByEmail(login.getLoginEmail());
		if(reg!=null) {
			String pass1=login.getLoginPassword();
			String pass2=reg.getUserPassword();
			Boolean isPasswordRight=pass1.equals(pass2);
			if(isPasswordRight) {
				Optional<Registration> register=Optional.of(regrepo.findByEmailAndpassword(login.getLoginEmail(), login.getLoginPassword()));
				if(register.isPresent()) {
					return new LoginMessage("Login Success",true);
				} else {
					return new LoginMessage("Login Failed",false);
				}
				
			}else {
				return new LoginMessage("Password not Match",false);
			}
		} else {
			return new LoginMessage("Email not exists",false);
		}
	}

	@Override
	public LoginMessage loginAdmin(AdminLogin adminLogin) {
		// TODO Auto-generated method stub
		AdminRegistration areg=arepo.findByEmail(adminLogin.getAdminEmail());
		if(areg!=null) {
			String pass1=adminLogin.getAdminPassword();
			String pass2=areg.getApassword();
			Boolean isPasswordRight=pass1.equals(pass2);
			if(isPasswordRight) {
				Optional<AdminRegistration> register=Optional.of(arepo.findByEmailAndpassword(adminLogin.getAdminEmail(), adminLogin.getAdminPassword()));
				if(register.isPresent()) {
					return new LoginMessage("Login success",true);
				} else {
					return new LoginMessage("Login Failed",false);
				}
				
			}else {
				return new LoginMessage("Password not Match",false);
			}
		} else {
			return new LoginMessage("Email not exists",false);
		}
		
		/*if(adminLogin.getAdminEmail().equals("admin@gmail.com") && adminLogin.getAdminPassword().equals("admin123")) {
			return new LoginMessage("Login success",true);
		} else {
			return new LoginMessage("Login Failed",false);
		}*/
		
	}

	@Override
	public void saveAdminData(AdminRegistration areg) {
		// TODO Auto-generated method stub
		arepo.save(areg);
		
	}
}
