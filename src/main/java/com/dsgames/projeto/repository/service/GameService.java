package com.dsgames.projeto.repository.service;

import java.util.List;

import com.dsgames.projeto.dto.GameDTO;
import com.dsgames.projeto.dto.GameMinDTO;

public interface GameService {

	List<GameMinDTO> getAll();
	
	GameDTO get(Long id);
	
	List<GameMinDTO> getAllListas(Long id);
}
