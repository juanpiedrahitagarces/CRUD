package co.com.theplay.apiprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class ApiPruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPruebaApplication.class, args);


	}
}


