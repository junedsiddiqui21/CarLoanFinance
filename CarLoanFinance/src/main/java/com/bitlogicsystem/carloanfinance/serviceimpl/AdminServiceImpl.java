package com.bitlogicsystem.carloanfinance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlogicsystem.carloanfinance.model.Admin;
import com.bitlogicsystem.carloanfinance.repository.AdminRepository;
import com.bitlogicsystem.carloanfinance.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository ar;

	@Override
	public Admin savedata(Admin a) {
		
		return ar.save(a);
	}

	@Override
	public List<Admin> getdata() {
		
		return ar.findAll();
	}

	@Override
	public Admin putdata(Admin a) {
		
		return ar.save(a);
	}

	@Override
	public void deletedata(int id) {
		ar.deleteById(id);
		
	}

	
	

}
