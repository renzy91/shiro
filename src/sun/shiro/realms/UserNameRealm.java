package sun.shiro.realms;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import sun.dao.UserDAO;
import sun.entity.Permission;
import sun.entity.Role;
import sun.entity.User;
import sun.shiro.util.MyByteSource;

public class UserNameRealm extends AuthorizingRealm{
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	/**
	 *  ⁄»®
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		/*String username = (String) principalCollection.getPrimaryPrincipal();
		User user = userDAO.queryUser(username);
		List<Role> roles = user.getRoles();
		
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		for (Role role : roles) {
			simpleAuthorizationInfo.addRole(role.getName());
			List<Permission> permissions = role.getPermissions();
			for (Permission permission : permissions) {
				simpleAuthorizationInfo.addStringPermission(permission.getCode());
			}
		}
		return simpleAuthorizationInfo;*/
		return null;
	}
	
	/**
	 * »œ÷§
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String principal = (String) token.getPrincipal();
		User user = userDAO.queryUser(principal);
		if (user!=null) {
			return new SimpleAuthenticationInfo(user.getName(), user.getPassword(), 
													new MyByteSource(user.getSalt()), getName());
		}
		return null;
	}
}
