package com.cashify.restassured.java;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiStatusCode {
	
	public void getStatusCode() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httprequest=RestAssured.given();
		Response responseStatus=httprequest.request(Method.GET,"Hyderabad");
		int statusCode=responseStatus.getStatusCode();
		System.out.println("Status Code is:---"+statusCode);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestApiStatusCode obj=new RestApiStatusCode();
		obj.getStatusCode();
	}

}
