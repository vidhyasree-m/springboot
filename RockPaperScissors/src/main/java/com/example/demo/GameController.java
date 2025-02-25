package com.example.demo;
//For API 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping("/play")
    public String play(@RequestParam String playerName, @RequestParam String choice) {
        return gameService.playGame(playerName, choice);
    }
}

