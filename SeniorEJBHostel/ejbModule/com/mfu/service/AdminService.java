package com.mfu.service;

import java.util.List;

import com.mfu.entity.Admin;

public interface AdminService {
	public void insert(Admin admin);

	public Admin findAdminId(long adminId);

	public void update(Admin admin);

	public void delete(long adminId);

	public List<Admin> getAllAdmin();

	public List<Admin> findAdminUsername(String adminUsername);

	public Admin findAdminUsernameAndAdminPassword(String adminUsername, String adminPassword);
}
