package com.dsgames.projeto.repository.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsgames.projeto.dto.GameListDTO;
import com.dsgames.projeto.entities.GameList;
import com.dsgames.projeto.projection.GameMinProjection;
import com.dsgames.projeto.repository.GameListRepository;
import com.dsgames.projeto.repository.GameRepository;
import com.dsgames.projeto.repository.service.GameListService;

@Service
public class GameListServiceImpl implements GameListService{
	
	@Autowired
	private GameListRepository listRepository;
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	@Override
	public List<GameListDTO> getAll() {
		List<GameList> res = listRepository.findAll();
		List<GameListDTO> lista = res.stream().map(r -> new GameListDTO(r)).toList();
		return lista;
	}
	
	@Transactional
	@Override
	public void move(Long id, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(id);
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for(int i = min; i <= max; i++) {
			listRepository.updateBelongingPosition(id, list.get(i).getId(), i);
		}
	}

}
