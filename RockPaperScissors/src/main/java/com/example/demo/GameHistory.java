package com.example.demo;
//to store the player game history
//Timestamp - when the game was played
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "game_history")
public class GameHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String playerName;
    private String choice;
    private String computerChoice;
    private String result;
    private Timestamp gameDate;

    public GameHistory() {}

    public GameHistory(String playerName, String choice, String computerChoice, String result, Timestamp gameDate) {
        this.playerName = playerName;
        this.choice = choice;
        this.computerChoice = computerChoice;
        this.result = result;
        this.gameDate = gameDate;
    }

    // Getters and Setters
    public int getId() { 
    	return id; 
    }
    public String getPlayerName() { 
    	return playerName; 
    }
    public void setPlayerName(String playerName) { 
    	this.playerName = playerName; 
    }
    public String getChoice() { 
    	return choice; 
    }
    public void setChoice(String choice) { 
    	this.choice = choice; 
    }
    public String getComputerChoice() { 
    	return computerChoice; 
    }
    public void setComputerChoice(String computerChoice) { 
    	this.computerChoice = computerChoice; 
    }
    public String getResult() { 
    	return result; 
    }
    public void setResult(String result) { 
    	this.result = result; 
    }
    public Timestamp getGameDate() { 
    	return gameDate; 
    }
    public void setGameDate(Timestamp gameDate) { 
    	this.gameDate = gameDate; 
    }
}
