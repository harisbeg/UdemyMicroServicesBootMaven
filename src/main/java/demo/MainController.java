package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.Player;
import demo.domain.Team;

@RestController
public class MainController {
	
	private Team team;
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charlie Brown", "pitcher"));
		players.add(new Player("Snoopy", "shortstop"));
		
		team = new Team("California", "Peanuts", players);
	}
	
	@RequestMapping("/hi")
	public Team hiThere() {
		return team;
	}

}
