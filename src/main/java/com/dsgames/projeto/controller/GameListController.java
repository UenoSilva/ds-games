package com.dsgames.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsgames.projeto.dto.GameListDTO;
import com.dsgames.projeto.repository.service.impl.GameListServiceImpl;

@RestController
@RequestMapping("/listas")
public class GameListController {

	@Autowired
	private GameListServiceImpl serviceImpl;

	@GetMapping
	public List<GameListDTO> getAll() {
		return serviceImpl.getAll();
	}

}
