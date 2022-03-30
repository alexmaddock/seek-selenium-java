package api;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import io.github.cdimascio.dotenv.Dotenv;

public class API {

    Dotenv dotenv = Dotenv.load();
    String username = dotenv.get("USERNAME");
    private String password = dotenv.get("PASSWORD");
    private String baseURL = "https://www.seek.com.au/";   

    public static void auth() {
        Dotenv dotenv = Dotenv.load();
        String username = dotenv.get("USERNAME");
        String password = dotenv.get("PASSWORD");
        
        // this.username = username;
        System.out.println(username);

    }

    public static void header() {

    }

    public static void get() {

    }
    
    public static void post() {
        

    }

    public static void put() {

    }

    public static void delete() {

    }

}