package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class UdemyMicroServicesBootMavenApplication extends SpringBootServletInitializer {

	/**
	 * Used when running as a JAR
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(UdemyMicroServicesBootMavenApplication.class, args);
	}

	/**
	 * Used when running as a WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(UdemyMicroServicesBootMavenApplication.class);
	}
}
