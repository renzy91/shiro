package sun.dao;

import java.security.acl.Permission;

import javax.management.relation.Role;

import sun.entity.User;

public interface UserDAO {
	User queryUser(String name);
	Role queryRolesByUserId(String id);
	Permission queryPermissionBYRoleId(String id);
 }
