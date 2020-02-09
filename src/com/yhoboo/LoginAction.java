package com.yhoboo;

public class LoginAction {
	
	private String userId;
	private String pass;
	private String loginStatus;
	
	public LoginAction() {
		userId = "";
		pass = "";
		loginStatus = "";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	public String execute() {
		if(userId.equals("admin") && pass.equals("admin"))
			loginStatus = "success";
		else
			loginStatus = "failed";
	
		return (loginStatus);
	}

}
