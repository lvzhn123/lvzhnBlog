package lvzhn.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {
	
	private static IUserService userService;

	public static IUserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(IUserService userService) {
		System.out.println("对象注入");
		this.userService = userService;
	}

}
