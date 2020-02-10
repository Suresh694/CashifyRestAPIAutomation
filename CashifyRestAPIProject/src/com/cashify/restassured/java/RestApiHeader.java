package com.cashify.restassured.java;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiHeader {
	
	public void getHeader() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/Hyderabad");
		
		String contentType=response.header("Content-Type");
		System.out.println("Content-Type value is: "+contentType);
		
		String serverType=response.header("Server");
		System.out.println("Server value is: "+serverType);
		
		String acceptLanguage=response.header("Content-Encoding");
		System.out.println("Content-Encoding value is: "+acceptLanguage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestApiHeader obj=new RestApiHeader();
		obj.getHeader();
	}

}
