package com.cashify.restassured.java;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiPutJSON {
	
	public void updateRecords() {
		String State="Maharastra";
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification request=RestAssured.given();
		
		JSONObject requestParams=new JSONObject();
		/*requestParams.put("City", "Mumbai");
		requestParams.put("age",20);
		requestParams.put("salary", 12000);*/
		requestParams.put("Humidity", "70 Percent");
		
		request.body(requestParams.toJSONString());
		Response response=request.put("/update/"+State);
		int statusCode=response.getStatusCode();
		String body=response.getBody().asString();
		System.out.println(body);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestApiPutJSON obj=new RestApiPutJSON();
		obj.updateRecords();
	}

}
