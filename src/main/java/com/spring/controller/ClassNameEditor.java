package com.spring.controller;

import java.beans.PropertyEditorSupport;

public class ClassNameEditor extends PropertyEditorSupport {
	
	public void setAsText(String city)
	{
		if(null != city && city.length()>5)
		{
			city= city.substring(0, 5);
			setValue(city);
			
		}
		
	}

}
