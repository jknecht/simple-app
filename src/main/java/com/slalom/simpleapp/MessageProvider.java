package com.slalom.simpleapp;

import com.slalom.simplelib.HelloWorldProvider;

public class MessageProvider {

	public String getMessage() {
		HelloWorldProvider provider = new HelloWorldProvider();
		return provider.sayHelloWorld();
	}
}
