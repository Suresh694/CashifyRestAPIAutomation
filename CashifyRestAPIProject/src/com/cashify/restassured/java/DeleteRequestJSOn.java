package com.cashify.restassured.java;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequestJSOn {
	int empid=20;
	public void deleteJSON() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		Response response=request.delete("/delete/"+empid);
		String responseBody=response.asString();
		int statusCode=response.getStatusCode();
		
		System.out.println(responseBody);
		System.out.println(statusCode);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteRequestJSOn obj=new DeleteRequestJSOn();
		obj.deleteJSON();
	}

}
