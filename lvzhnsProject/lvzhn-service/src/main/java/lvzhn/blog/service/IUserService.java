package lvzhn.blog.service;

import org.springframework.stereotype.Service;

import lvzhn.blog.entity.User;
import lvzhn.blog.generalData.DynamicObject;

public interface IUserService {
	
	public DynamicObject getUserInfo(User user);
}
