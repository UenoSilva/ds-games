package com.dsgames.projeto.repository.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsgames.projeto.dto.GameDTO;
import com.dsgames.projeto.dto.GameMinDTO;
import com.dsgames.projeto.entities.Game;
import com.dsgames.projeto.repository.GameRepository;
import com.dsgames.projeto.repository.service.GameService;

@Service
public class GameServiceImpl implements GameService{
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	@Override
	public List<GameMinDTO> getAll() {
		List<Game> res = gameRepository.findAll();
		List<GameMinDTO> games = res.stream().map(r -> new GameMinDTO(r)).toList();
		return games;
	}

	@Transactional(readOnly = true)
	@Override
	public GameDTO get(Long id) {
		Game res = gameRepository.findById(id).get();
		return new GameDTO(res);
	}

}
