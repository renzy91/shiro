package sun.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.dao.UserDAO;
import sun.entity.User;

public class UserDAOTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-basic.xml");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		User users = userDAO.queryUser("lisi");
		System.out.println(users);
		System.out.println(users.getRoles());
	}
}
