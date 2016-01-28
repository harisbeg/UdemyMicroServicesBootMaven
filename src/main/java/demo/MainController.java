package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.dao.TeamDao;
import demo.domain.Player;
import demo.domain.Team;

@RestController
public class MainController {
	
	@Autowired TeamDao teamDao;
	
	
	@RequestMapping("/teams/{name}")
	public Team hiThere(@PathVariable String name) {
		return teamDao.findByName(name);
	}

}
