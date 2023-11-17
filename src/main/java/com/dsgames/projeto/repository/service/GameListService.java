package com.dsgames.projeto.repository.service;

import java.util.List;

import com.dsgames.projeto.dto.GameListDTO;

public interface GameListService {

	List<GameListDTO> getAll();

	void move(Long id, int sourceIndex, int destinationIndex);

}
