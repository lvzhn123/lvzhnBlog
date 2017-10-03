package lvzhn.blog.webApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;

import lvzhn.blog.webContext.Context;

public class BaseController {

	protected Context context;

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.context = new Context();
		this.context.setRequest(request);
		this.context.setResponse(response);
	}

}