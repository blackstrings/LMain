package com.xai.land;

import com.xai.land.serviceClient.ServiceConMang;

public class Demo {

	public static void main(String [] args){
		
		ServiceConMang s = new ServiceConMang();
		
		pr("Logging in");
		
		if(s.getServiceA().login("user", "pass")){
			pr("login success");
		}else{
			pr("fail");
		}
		
	}
	
	public static void pr(String str){
		System.out.println(str);
	}
}
