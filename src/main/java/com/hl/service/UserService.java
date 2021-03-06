package com.hl.service;

import java.util.List;
import java.util.Map;

import com.hl.domain.Company;
import com.hl.domain.Group;
import com.hl.domain.Permission;
import com.hl.domain.SimpleResponse;
import com.hl.domain.User;

public interface UserService {

	User loginByNamePwd(String user_name, String user_password);

	List<User> getManagerUsers(Integer user_id);

	List<Permission> updateUsersPermission(Integer user_id,List<Permission>permission_list);

	List<Group> getManagerGroups(Integer user_id);

	List<Permission> updateGroupPermission(List<Permission> list, Integer group_id);

	Map<String, Object> addGroupUser(Integer user_id, Integer group_id);

	SimpleResponse removeGroupUser(Integer user_id,Integer group_id);

	List<User> getGroupUser(Integer group_id,Integer company_id);
	public List<Permission> getAllPermission(Integer user_id);

	Company getCompany(Integer user_id);

}
