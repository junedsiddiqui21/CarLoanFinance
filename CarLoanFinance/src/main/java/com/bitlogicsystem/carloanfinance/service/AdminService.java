package com.bitlogicsystem.carloanfinance.service;

import java.util.List;

import com.bitlogicsystem.carloanfinance.model.Admin;

public interface AdminService {

public	Admin savedata(Admin a);

public List<Admin> getdata();

public Admin putdata(Admin a);

public void deletedata(int id);






}
