package com.example.demo;
//implementing the game logic
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.Random; //used to randomly select the computer choice

@Service //Marks this class as a spring service layer
public class GameService {
    @Autowired //used for dependency injection, spring automatically injects required beans
    private PlayerRepository playerRepo;

    @Autowired
    private GameHistoryRepository historyRepo;

    public String playGame(String playerName, String choice) {
    	//creating a string array and storing the values Rock Paper and Scissors
        String[] choices = {"Rock", "Paper", "Scissors"};
        //generates a random number 0,1 or 2 and select a random choice from choices[] array
        String computerChoice = choices[new Random().nextInt(3)]; 
        String result;

        if (choice.equalsIgnoreCase(computerChoice)) {
            result = "Draw";
        } else if ((choice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (choice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                   (choice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            result = "Win";
        } else {
            result = "Lose";
        }

        // Saving the game history
        GameHistory game = new GameHistory(playerName, choice, computerChoice, result, new Timestamp(System.currentTimeMillis()));
        historyRepo.save(game);

        // Updating player status
        Optional<Player> existingPlayer = playerRepo.findByName(playerName);
        Player player = existingPlayer.orElse(new Player(playerName, 0, 0));
        player.setTotalGames(player.getTotalGames() + 1);
        if (result.equals("Win")) {
            player.setWins(player.getWins() + 1);
        }
        playerRepo.save(player);

        return "You choice: " + choice + ", Computer choice: " + computerChoice + ". Result: " + result;
    }
}
