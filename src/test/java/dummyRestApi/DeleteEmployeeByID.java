package dummyRestApi;

import io.restassured.RestAssured;

public class DeleteEmployeeByID {

	public static void main(String[] args) {
		RestAssured.given()
		
		.when()
			.delete("https://dummy.restapiexample.com/api/v1/delete/2")
	
		.then()
			.log().all();

	}

}
