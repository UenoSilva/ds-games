package com.dsgames.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsgames.projeto.dto.GameListDTO;
import com.dsgames.projeto.dto.GameMinDTO;
import com.dsgames.projeto.repository.service.impl.GameListServiceImpl;
import com.dsgames.projeto.repository.service.impl.GameServiceImpl;

@RestController
@RequestMapping("/listas")
public class GameListController {

	@Autowired
	private GameListServiceImpl gameListServiceImpl;
	
	@Autowired
	private GameServiceImpl gameServiceImpl;

	@GetMapping
	public List<GameListDTO> getAll() {
		return gameListServiceImpl.getAll();
	}
	
	@GetMapping("/{id}/games")
	public List<GameMinDTO> getAllListas(@PathVariable Long id){
		return gameServiceImpl.getAllListas(id);
	}

}
