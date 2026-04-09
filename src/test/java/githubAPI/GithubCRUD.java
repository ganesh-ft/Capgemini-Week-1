package githubAPI;


import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GithubCRUD {
	
	static String name;
	@Test(priority = 0)
	public void addproject() {
		
		
        
    	Response response = RestAssured.given()
    				.contentType("application/json")
    				.body("""
	    			{
	    			"name" : "repoREST",
	    			"description" : "des"
	    			}
	    			""")
    				.header("Authorization" , "")

        // HTTP METHOD
		        .when()
		            .post("https://api.github.com/user/repos");
		        
		
		        // RESPONSE
		    	name = response.jsonPath().getString("name");
		    	System.out.println("Project Name : " + name);
	}
	
	
	@Test(priority = 1)
	public void bgetProjectTest() {
		
		
		RestAssured.given().header("Authorization" , "")
        
		// HTTP METHOD
			.when()
				.get("https://api.github.com/repos//" + name)
			
		// RESPONSE
			.then()
				.log().all();
		
	}
	
	@Test(priority = 2)
	public void cupdateProject() {
		
		RestAssured.given()
		.contentType("application/json").header("Authorization" , "")
		.body("""
    			{
    			"name" : "repoREST",
    			"description" : "des1"
    			}
    			""")    
	// HTTP METHOD
		.when()
			.patch("https://api.github.com/repos//" + name)
		
	// RESPONSE
		.then()
			.log().all()
			.assertThat()
			  .statusCode(200)
			  .statusLine(Matchers.containsString("HTTP"))
			  .time(Matchers.lessThan(5000l));
//			  .body("createdBy", Matchers.equalTo("Manish")).and().body("projectName",Matchers.equalTo("Eterna"));
	}
	
	@Test(priority = 3)
	public void deleteproject() {

		// PRE CONDITION
		RestAssured.given().header("Authorization" , "")
        
		// HTTP METHOD
			.when()
				.delete("https://api.github.com/repos//" + name)
		
		// RESPONSE
			.then()
				.log().all();
	}
	
}