package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import demo.dao.TeamDao;
import demo.domain.Player;
import demo.domain.Team;

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
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charlie Brown", "pitcher"));
		players.add(new Player("Snoopy", "shortstop"));
		
		Team team = new Team("California", "Peanuts", players);
		teamDao.save(team);
	}
	
	@Autowired TeamDao teamDao;

}
