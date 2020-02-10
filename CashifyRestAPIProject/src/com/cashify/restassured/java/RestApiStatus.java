package com.cashify.restassured.java;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiStatus {
	
	public void getStatus() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.get("/Hyderabad");
		System.out.println("Response Status is : "+response.asString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestApiStatus obj=new RestApiStatus();
		obj.getStatus();
	}

}
