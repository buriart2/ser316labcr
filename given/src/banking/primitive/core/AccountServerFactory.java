package banking.primitive.core;

/*
File: AccountServerFactory.java
Author:	Brandon Lebid-Jurtschyk
Date: 2/19/17

Description: Returns an Account Server Factory if get me is called otherwise it returns a ServerSolution if Lookup is called
*/
public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}
	
//	/**
//	  Method:getMe
//	  Inputs:N/A
//	  Returns:Singleton
//
//	  Description:If singleton is null it will initialize it with an object made of this class otherwise if it 
//	  is already a member then it will throw back singleton as it was
//	*/
	public static AccountServerFactory getMe() {
		return new AccountServerFactory();
	}

	/**
	  Method:lookup
	  Inputs:N/A
	  Returns:ServerSolution

	  Description:Returns a base initialized ServerSolution object
	*/
	public AccountServer lookup() {
		return new ServerSolution();
	}
}
