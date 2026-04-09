package ninjaHRM;

import io.restassured.RestAssured;

public class Login {

	public static void main(String[] args) {
		
		// PRE CONDITION
		RestAssured.given()
		.contentType("application/json")
        .body("{{\r\n"
        		+ "  \"password\": \"rmgy@9999\",\r\n"
        		+ "  \"username\": \"rmgyantra\"\r\n"
        		+ "}")
		// HTTP METHOD
			.when()
				.post("http://49.249.28.218:8091/login")
			
		// RESPONSE
			.then()
				.statusCode(200)
					.log().all();
		}

}
