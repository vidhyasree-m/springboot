package com.example.demo;
//Repositories help in fetching and storing data in the database
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

//used for fetching player details by name
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    Optional<Player> findByName(String name);
}

