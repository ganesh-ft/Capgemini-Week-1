package petStore;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetDetailsByStatus {
	@Test
	public void getStatusTest() {
		
		// PRE CONDITION
		RestAssured.given()
			.queryParam("status", "available")
		
		// HTTP METHOD
			.when()
				.get("https://petstore.swagger.io/v2/pet/findByStatus")
			
		// RESPONSE
			.then()
				.statusCode(200)
					.log().all();
	}
}