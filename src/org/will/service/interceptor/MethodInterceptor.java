package org.will.service.interceptor;

import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodInterceptor extends MethodFilterInterceptor
{
	private String name;
	
	public void setName(String name)
	{
		this.name = name;
	}

	protected String doIntercept(ActionInvocation invocation) throws Exception 
	{
		System.out.println("perpare....."+ new Date());
		long start = System.currentTimeMillis();	
		System.out.println("processing..."+ new Date());
		String value = invocation.invoke();		
		System.out.println("finished..." + new Date());
		long end = System.currentTimeMillis();	
		System.out.println("process time:"+ (end-start)+"millonsecond");		
		return value;
	}


}
