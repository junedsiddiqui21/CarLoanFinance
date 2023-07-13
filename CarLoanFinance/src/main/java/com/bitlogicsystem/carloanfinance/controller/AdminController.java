package com.bitlogicsystem.carloanfinance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlogicsystem.carloanfinance.model.Admin;
import com.bitlogicsystem.carloanfinance.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService as;
	
	@PostMapping("/savedata")
	public Admin savedata(@RequestBody Admin a) {
		return as.savedata(a);
		
	}
	@GetMapping("/getdata")
	public List<Admin>  getdata() {
		return as.getdata();
		
	}
	@PutMapping("/putdata")
	public Admin putdata(@RequestBody Admin a) {
		return as.putdata(a);
	}
	
	@DeleteMapping("deletedata/{empid}")
	public void deletedata(@PathVariable("empid")int id ) {
	 as.deletedata(id);
		
	}
	

}
