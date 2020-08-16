package com.heroumcaslu.sendmessage;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Test {
	
	public static final String ACCOUNT_SID = "AC2bd122dc825ef27745ed636f6ff35229";
	
	public static final String AUTH_TOKEN = "8af9878fb5bf4087e969fe9b81db4d18";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String body = "Olá, essa mensagem foi enviada com o twilio!";
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message.creator(new PhoneNumber("+5581987708685"),
				new PhoneNumber("+12402198052"), 
				body)
				.create();

	}

}
