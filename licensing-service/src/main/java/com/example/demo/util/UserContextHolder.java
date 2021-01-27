package com.example.demo.util;

public class UserContextHolder {

	private static final ThreadLocal<UserContext> userContext= new ThreadLocal<UserContext>();
	
	public static final UserContext getContext() {
		
		UserContext context =userContext.get();
		if(context==null) {
			context =createEmptyContext();
			userContext.set(context);
		}
		return userContext.get()        ;
	}

	private static UserContext createEmptyContext() {
		return new UserContext();
	}
	
	

}
