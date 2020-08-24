package com.heroumcaslu.sendmessage;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Test {
	
	public static final String ACCOUNT_SID = "";
	
	public static final String AUTH_TOKEN = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String body = "Olá, essa mensagem foi enviada com o twilio!";
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message.creator(new PhoneNumber("+55819..."),
				new PhoneNumber("+12402198052"), 
				body)
				.create();

	}

}
