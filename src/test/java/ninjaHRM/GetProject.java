package ninjaHRM;

import io.restassured.RestAssured;

public class GetProject {
	public static void main(String[] args) {
		
		// PRE CONDITION
		RestAssured.given()
        
		// HTTP METHOD
			.when()
				.get("http://49.249.28.218:8091/projects")
			
		// RESPONSE
			.then()
				.log().all();
		}
}
