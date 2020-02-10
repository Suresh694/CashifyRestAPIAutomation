package com.cashify.restassured.java;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestApiBody {
	
	public void getBody() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest= RestAssured.given();
		Response response=httpRequest.request(Method.GET,"Hyderabad");
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is "+responseBody);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestApiBody obj=new RestApiBody();
		obj.getBody();
	}

}
