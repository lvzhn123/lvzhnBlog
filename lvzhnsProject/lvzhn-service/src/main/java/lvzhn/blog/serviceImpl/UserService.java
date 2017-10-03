package lvzhn.blog.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lvzhn.blog.entity.User;
import lvzhn.blog.generalData.DynamicObject;
import lvzhn.blog.service.IUserService;

@Service("userService")
public class UserService implements IUserService {
	@SuppressWarnings("unchecked")
	@Override
	public DynamicObject getUserInfo(User user) {
		List<DynamicObject> list = new ArrayList<DynamicObject>();
		DynamicObject dynamicObject2 = new DynamicObject();
		dynamicObject2.put("userName", user.getName() + 1);
		dynamicObject2.put("number", 2);
		DynamicObject dynamicObject3 = new DynamicObject();
		dynamicObject3.put("userName", user.getName() + 2);
		dynamicObject3.put("number", 3);
		list.add(dynamicObject2);
		list.add(dynamicObject3);
		DynamicObject dynamicObject = new DynamicObject();
		dynamicObject.put("userName", user.getName());
		dynamicObject.put("number", 1);
		dynamicObject.put("childUser", list);
		return dynamicObject;
	}
}
