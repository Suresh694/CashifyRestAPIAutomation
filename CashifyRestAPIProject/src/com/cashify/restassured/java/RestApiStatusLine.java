package com.cashify.restassured.java;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiStatusLine {
	
	public void getStatusLine() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/Hyderabad");
		String statusLine=response.getStatusLine();
		String protocolversion=statusLine.substring(0, 9);
		System.out.println("StatusLine of the Request is: "+statusLine);
		System.out.println("Protocol Version of the StatusLine is : "+protocolversion);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestApiStatusLine obj=new RestApiStatusLine();
		obj.getStatusLine();
	}

}
