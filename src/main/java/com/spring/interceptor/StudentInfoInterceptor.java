package com.spring.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class StudentInfoInterceptor extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception
	{
		Calendar cal= Calendar.getInstance();
		int day_num= cal.get(cal.DAY_OF_WEEK);
		if(day_num==2)
		{
			response.getWriter().write("Thursday is a Holiday for company. please try again on another working day");
			return false;
		}
		else{
			return true;
		}
		
	}

}
