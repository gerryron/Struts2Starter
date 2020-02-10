package com.yhoboo.struts.register.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yhoboo.struts.register.model.Person;

public class Register extends ActionSupport{
	
	private static final long serialVersionUID= 1L;
	private Person personBean;
	
	public Person getPersonBean() {
		return personBean;
	}
	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void validate() {
		if(personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", "Firstname is required.");
		}
		
		if(personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", "Email is required.");
		}
		
		if(personBean.getAge() < 18) {
			addFieldError("personBean.age", "Age is required and must be 18 or older");
		}
	}

	public String execute() throws Exception{
		// call Service class to store personBean's state in database
		
		return SUCCESS;
	}
	
}