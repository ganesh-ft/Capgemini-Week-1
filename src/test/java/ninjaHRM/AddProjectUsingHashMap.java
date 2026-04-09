package ninjaHRM;

import java.util.HashMap;

import io.restassured.RestAssured;

public class AddProjectUsingHashMap {
	public static void main(String[] args) {
		
		HashMap<String, Object> json_body = new HashMap<String, Object>();
		json_body.put("createdBy", "MoitheGreat");
		json_body.put("projectName", "test321");
		json_body.put("status", "Completed");
		json_body.put("teamSize", 0);
		
		// PRE CONDITION
		RestAssured.given()
		.contentType("application/json")
        .body(json_body)
        
		// HTTP METHOD
			.when()
				.post("http://49.249.28.218:8091/addProject")
			
		// RESPONSE
			.then()
				.log().all();
		}
}
