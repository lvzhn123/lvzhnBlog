package lvzhn.blog.webContext;

import lvzhn.blog.enums.Success;
import lvzhn.blog.enums.UserType;
import lvzhn.blog.generalData.DynamicObject;

public class WebResponse {
	private Success success;

	private DynamicObject data;
	private UserType userType;

	public Success getSuccess() {
		return success;
	}

	public void setSuccess(Success success) {
		this.success = success;
	}

	public DynamicObject getData() {
		return data;
	}

	public void setData(DynamicObject data) {
		this.data = data;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		userType = userType;
	}

}
