package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
//used for storing game results
public interface GameHistoryRepository extends JpaRepository<GameHistory, Integer> {}
