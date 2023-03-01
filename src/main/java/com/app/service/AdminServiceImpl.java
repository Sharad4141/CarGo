package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.app.pojos.Admin;
import com.app.repository.AdminRepository;

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminrepo;

	@Override
	public Admin addNewAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminrepo.save(admin);
	}
	

	

}
