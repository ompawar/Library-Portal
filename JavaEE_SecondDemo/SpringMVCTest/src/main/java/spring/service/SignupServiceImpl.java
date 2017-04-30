package spring.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.dao.SignupDAO;
import spring.model.Users;


@Service
public class SignupServiceImpl implements SignupService {
	
	private SignupDAO signupDAO;

	public void setSignupDAO(SignupDAO signupDAO) {
		this.signupDAO = signupDAO;
	}

	@Override
	@Transactional
	public void addUser(Users u) {
		this.signupDAO.addUser(u);
	}
}
