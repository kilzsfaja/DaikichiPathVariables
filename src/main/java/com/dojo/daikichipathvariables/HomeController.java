package com.dojo.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}

	@RequestMapping("/travel/{destination}")
	public String showDestination(@PathVariable("destination") String destination) {
		return "Congrats! You will soon travel to " + destination + "!";
	}
	
	@RequestMapping("/lotto/{diceRoll}")
	public String showDiceRoll(@PathVariable("diceRoll") int diceRoll) {
		if (diceRoll % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		} else {
		return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";
		}
	}	
}
