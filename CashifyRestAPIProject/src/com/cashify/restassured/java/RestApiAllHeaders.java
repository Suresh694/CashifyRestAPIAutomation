package com.cashify.restassured.java;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiAllHeaders {
	
	public void getallHeaders() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/Hyderabad");
		
		Headers allHeaders=response.getHeaders();
		for (Header header : allHeaders) {
			System.out.println("Keys:"+header.getName()+" Values: "+header.getValue());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestApiAllHeaders obj=new RestApiAllHeaders();
		obj.getallHeaders();

	}

}
