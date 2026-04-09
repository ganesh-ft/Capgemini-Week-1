package ninjaHRM;

import io.restassured.RestAssured;

public class SignUp {
	public static void main(String[] args) {
			
		// PRE CONDITION
		RestAssured.given()
		.contentType("application/json")
        .body("{\r\n"
        		+ "  \"address\": \"test\",\r\n"
        		+ "  \"contact\": \"92855285537\",\r\n"
        		+ "  \"email\": \"note@gmail.com\",\r\n"
        		+ "  \"gender\": \"male\",\r\n"
        		+ "  \"name\": \"note\",\r\n"
        		+ "  \"password\": \"note\",\r\n"
        		+ "  \"role\": \"CEO\",\r\n"
        		+ "  \"username\": \"note\"\r\n"
        		+ "}")
        
		// HTTP METHOD
			.when()
				.post("49.249.28.218:8091/signup")
			
		// RESPONSE
			.then()
				.log().all();
			}
	}
