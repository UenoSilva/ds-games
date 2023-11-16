package com.dsgames.projeto.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_belonging")
public class Belongin {

	@EmbeddedId
	private BelonginPK id = new BelonginPK();

	private Integer position;

	public Belongin(Game game, GameList list, Integer position) {
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}
}
