package lvzhn.blog.webApp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lvzhn.blog.entity.User;
import lvzhn.blog.enums.Success;
import lvzhn.blog.enums.UserType;
import lvzhn.blog.generalData.DynamicObject;
import lvzhn.blog.service.ServiceFactory;
import lvzhn.blog.webContext.WebResponse;

/**
 * <p>
 * User: zhouneng_lv
 * <p>
 * Date: 13-12-22
 * <p>
 * Version: 1.0
 */
// @EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id) {
		User user = new User();
		user.setId(id);
		user.setName("zhouneng");
		return user;
	}

	@RequestMapping("/userName/{userName}")
	public WebResponse userLogin(@PathVariable("userName") String userName) {
		WebResponse webResponse = new WebResponse();
		if (userName != null && !userName.isEmpty()) {
			User user = new User();

			user.setName(userName);
			DynamicObject data = ServiceFactory.getUserService().getUserInfo(user);
			if (data != null) {
				webResponse.setData(data);
				webResponse.setSuccess(Success.success);
				webResponse.setUserType(UserType.visitor);
			}
		}
		return webResponse;
	}

	// public static void main(String[] args) {
	// SpringApplication.run(UserController.class);
	// }

}