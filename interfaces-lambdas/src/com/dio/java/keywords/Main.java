package com.dio.java.keywords;

import com.dio.java.keywords.keyword.Client;

public class Main {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.setName("Mateus");
		System.out.println(client.getName());
	}

}
