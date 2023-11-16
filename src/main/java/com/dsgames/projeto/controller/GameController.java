package com.dsgames.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsgames.projeto.dto.GameDTO;
import com.dsgames.projeto.dto.GameMinDTO;
import com.dsgames.projeto.repository.service.impl.GameServiceImpl;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameServiceImpl service;
	
	@GetMapping
	public List<GameMinDTO> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public GameDTO get(@PathVariable Long id) {
		return service.get(id);
	}

}
