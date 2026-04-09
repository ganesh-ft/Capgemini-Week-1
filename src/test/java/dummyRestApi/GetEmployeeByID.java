package dummyRestApi;

import io.restassured.RestAssured;

public class GetEmployeeByID {

	public static void main(String[] args) {
		RestAssured.given()
		
		.when()
			.get("https://dummy.restapiexample.com/api/v1/employees/1")
	
		.then()
			.statusCode(200)
				.log().all();

	}

}
