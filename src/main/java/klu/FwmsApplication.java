package klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FwmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FwmsApplication.class, args);
	}
}
