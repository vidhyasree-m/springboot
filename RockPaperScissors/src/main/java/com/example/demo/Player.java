package com.example.demo;
//Players who play the game
//A computer opponent that randomly picks Rock, Paper or Scissors
//A database to store player status and game history , i used MySQL
//A Spring Boot REST API that processes game logic and stores data
import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	private int totalGames; //How many games played
	private int wins;//How many won
	
	public Player() {
		
	}

	public Player(String name, int totalGames, int wins) {
		this.name = name;
		this.totalGames = totalGames;
		this.wins = wins;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalGames() {
		return totalGames;
	}

	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}
	
	

}
