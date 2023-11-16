package com.dsgames.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsgames.projeto.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
