package petStore;

import io.restassured.RestAssured;

public class AddNewPet {
	
	public static void main(String[] args) {
			
			// PRE CONDITION
			RestAssured.given()
			.contentType("application/json")
            .body("{\"id\": 0,\r\n"
            		+ "  \"category\": {\r\n"
            		+ "    \"id\": 0,\r\n"
            		+ "    \"name\": \"string\"\r\n"
            		+ "  },\r\n"
            		+ "  \"name\": \"doggie\",\r\n"
            		+ "  \"photoUrls\": [\r\n"
            		+ "    \"string\"\r\n"
            		+ "  ],\r\n"
            		+ "  \"tags\": [\r\n"
            		+ "    {\r\n"
            		+ "      \"id\": 0,\r\n"
            		+ "      \"name\": \"string\"\r\n"
            		+ "    }\r\n"
            		+ "  ],\r\n"
            		+ "  \"status\": \"available\"}")
			// HTTP METHOD
				.when()
					.post("https://petstore.swagger.io/v2/pet")
				
			// RESPONSE
				.then()
					.statusCode(200)
						.log().all();
			}
}
