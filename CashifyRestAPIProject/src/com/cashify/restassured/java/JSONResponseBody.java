package com.cashify.restassured.java;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JSONResponseBody {
	
	public void getJsonbody() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET,"/Hyderabad");
		JsonPath json=response.jsonPath();
		String city=json.get("City");
		System.out.println("City Received from Reponse is: "+city);
		System.out.println("Temperature from the Response is:"+json.get("Temperature"));
		System.out.println("Humidity from the Response is: "+json.get("Humidity"));
		System.out.println("Winspeed is:-"+json.get("WindSpeed"));
		
		
		System.out.println("status of the Response: "+response.getBody().asString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONResponseBody obj=new JSONResponseBody();
		obj.getJsonbody();
	}

}
