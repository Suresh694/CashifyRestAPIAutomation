package com.cashify.restassured.java;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.path.json.mapping.JsonPathObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestApiPostJSON {
	
	public void jsonPost() {
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RequestSpecification httpRequest=RestAssured.given();
		JSONObject requestparams=new JSONObject();
		requestparams.put("FirstName", "Suesh");
		requestparams.put("LastName", "as");
		requestparams.put("UserName", "sdda7@gmail.com");
		requestparams.put("Password", "pd");
		requestparams.put("Email", "sd@fd.com");
		
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestparams.toJSONString());
		Response response=httpRequest.post("/register");
		String body=response.getBody().asString();
		System.out.println(body);
		int statuscode=response.getStatusCode();
		System.out.println("Status Code is:"+statuscode);
		String successCode=response.jsonPath().get("SuccessCode");
		System.out.println(successCode);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestApiPostJSON obj=new RestApiPostJSON();
		obj.jsonPost();
	}

}
