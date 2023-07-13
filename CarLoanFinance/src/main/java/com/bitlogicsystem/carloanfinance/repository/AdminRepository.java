package com.bitlogicsystem.carloanfinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlogicsystem.carloanfinance.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
