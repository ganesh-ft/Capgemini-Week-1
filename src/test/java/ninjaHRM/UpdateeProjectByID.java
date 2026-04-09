package ninjaHRM;

import io.restassured.RestAssured;

public class UpdateeProjectByID {
	public static void main(String[] args) {
		
		// PRE CONDITION
		RestAssured.given()
			.contentType("application/json")
			.body("{\r\n"
					+ "  \"createdBy\": \"MoitheGrate\",\r\n"
					+ "  \"projectName\": \"testing321\",\r\n"
					+ "  \"status\": \"Ongoing\",\r\n"
					+ "  \"teamSize\": 0\r\n"
					+ "}")
        
		// HTTP METHOD
			.when()
				.put("http://49.249.28.218:8091/project/NH_PROJ_2922")
			
		// RESPONSE
			.then()
				.log().all();
		}	
}
