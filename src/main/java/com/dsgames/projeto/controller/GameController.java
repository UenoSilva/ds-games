package com.dsgames.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
