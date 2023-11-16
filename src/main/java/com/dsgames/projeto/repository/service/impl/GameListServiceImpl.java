package com.dsgames.projeto.repository.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsgames.projeto.dto.GameListDTO;
import com.dsgames.projeto.entities.GameList;
import com.dsgames.projeto.repository.GameListRepository;
import com.dsgames.projeto.repository.service.GameListService;

@Service
public class GameListServiceImpl implements GameListService{
	
	@Autowired
	private GameListRepository listRepository;

	@Override
	public List<GameListDTO> getAll() {
		List<GameList> res = listRepository.findAll();
		List<GameListDTO> lista = res.stream().map(r -> new GameListDTO(r)).toList();
		return lista;
	}

}
