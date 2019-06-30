package com.revature.request;

import javax.servlet.http.HttpServletRequest;

import com.revature.controller.CustomerController;

public class RequestHelper {

	public static Object process(HttpServletRequest request) {
		switch(request.getRequestURI()) {
		case "/FrontController/getAll.do":
			return CustomerController.getAllCustomers(request);
		case "/FrontController/register.do" :
			return CustomerController.register(request);
		default:
			//We should return a 404 view here
			return "login.html";
		}
	}
	
}
