# Projeto de uma APi Rest de listagem de jogos

## Tecnologia utilizadas

* Java 17
* Spring Boot
* Spring Data Jpa
* Spring Web
* Maven
* Ecplise
* Lombok
* Validation
* Postman
* Postgresql
* Docker
* Git
* GitHub

## Descrisção

Projeto desenvolvido durante o INTENSIVÃO JAVA SPRING da DevSuperior, onde foi criado um API Rest de listagem de jogos com Spring Boot. O projeto criar um jogo, lista (agrupamento de jogos, por exemplo: Jogos de plataforma) e um pertecimento entre jogo e list, ou seja, gerar uma integração entre jogo e lista, adicionando um posicionamento dos jogos na lista.

## Modelo de domínio

<img src="ds_game-model.png"/>

## Endpoints

#### Lista todos os jogos

* Verbo HTTP: GET
* Url: http://localhost:8080/games

#### Obtem um jogo pelo seu id

* Verbo HTTP: GET
* Url: http://localhost:8080/games/1

#### Lista os grupos de jogos

* Verbo HTTP: GET
* Url: http://localhost:8080/listas

#### Retorna jogos de uma lista 

* Verbo HTTP: GET
* Url: http://localhost:8080/listas/2/games

#### Move um jogo da lista

* Verbo HTTP: POST
* http://localhost:8080/listas/2/replacement
* Body da requisição:
```
	{
		"sourceIndex": 4,
		"destinationIndex": 1
	}
```
