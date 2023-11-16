package com.dsgames.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsgames.projeto.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
