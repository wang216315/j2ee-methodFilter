package org.will.service.action;


import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{
	
	private String username;
	private String password;

	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	@Override
	public String execute() throws Exception
	{
		if(this.username.equals("wangyue") && this.password.equals("123"))
		{
			return SUCCESS;
		}
		this.addFieldError("error", "µÇÂ¼´íÎó");
		return ERROR;
	}

}
