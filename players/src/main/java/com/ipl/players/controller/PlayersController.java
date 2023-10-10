package com.ipl.players.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.players.entity.Players;
import com.ipl.players.service.PlayersService;

import jakarta.mail.MessagingException;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/players")
public class PlayersController {
	@Autowired
	private PlayersService ps;
	@PostMapping("/saveplayers")
	public void savePlayersData(@RequestBody Players players) {
		List<Players> playersinfo=getPlayers();
		ps.savePlayersData(players,playersinfo);
	}
	@GetMapping("/getallplayers")
	public List<Players> getPlayers() {
		return ps.getAllPlayers();
		
	}
	@PutMapping("/updateplayer/{playerId}")
	public Players updatePlayer(@PathVariable int playerId,@RequestBody Players players) {
		return ps.updatePlayer(playerId,players);
	}
	@DeleteMapping("/deleteplayer/{playerId}")
	public void deletePlayer(@PathVariable int playerId) {
		ps.deletePlayer(playerId);
		
	}
	@GetMapping("/getplayerbyid/{playerId}")
	public Players getPlayerById(@PathVariable int playerId) {
		return ps.getPlayerById(playerId);
	}
	@GetMapping("/getplayersbyteamname/{teamName}")
	public List<Players> getPlayersByTeamName(@PathVariable String teamName) {
		return ps.getPlayersByTeamName(teamName);
	}
	@PutMapping("/assign/{tname}/{pname}")
	public void assign(@PathVariable String tname,@PathVariable String pname) throws MessagingException  {
		//Players players=new Players();
		List<Players> playersdata=getPlayers();
		ps.assign(tname,pname,playersdata);
	}
	@GetMapping("/getunsoldplayers")
	public List<Players> getAllUnsoldPlayers() {
		List<Players> playersinfo=getPlayers();
		return ps.getAllUnsoldPlayers(playersinfo);
	}
	@DeleteMapping("/deleteplayerfromadmin/{playerId}")
	public void deletePlayerFromAdmin(@PathVariable int playerId) {
		ps.deletePlayerFromAdmin(playerId);
		
	}

}
