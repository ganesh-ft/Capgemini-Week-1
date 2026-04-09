package ninjaHRM;

import io.restassured.RestAssured;

public class DeleteProjectByID {

	public static void main(String[] args) {

		// PRE CONDITION
		RestAssured.given()
        
		// HTTP METHOD
			.when()
				.delete("http://49.249.28.218:8091/project/NH_PROJ_2936")
			
		// RESPONSE
			.then()
				.log().all();
	}
}
