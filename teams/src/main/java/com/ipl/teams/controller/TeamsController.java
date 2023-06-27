package com.ipl.teams.controller;

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

import com.ipl.teams.dto.Players;
import com.ipl.teams.entity.Teams;
import com.ipl.teams.service.TeamsService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/teams")
public class TeamsController {
	@Autowired
	TeamsService ts;
	@PostMapping("/addteams")
	public void saveTeams(@RequestBody Teams teams) {
		ts.saveTeams(teams);
		
	}
	@GetMapping("/getteambyid/{tid}")
	public Teams getTeamById(@PathVariable int tid) {
		return ts.getTeamById(tid);
	}
	@GetMapping("/getteamdatabyteamname/{tname}")
	public Teams findTeamsByName(@PathVariable String tname) {
		return ts.findTeamByName(tname);
	}
	@PutMapping("/updateteam/{teamId}")
	public Teams updateTeam(@PathVariable int teamId,@RequestBody Teams teams) {
		return ts.updateTeam(teamId,teams);
	}
	@DeleteMapping("/deleteteam/{teamId}")
	public void deleteTeam(@PathVariable int teamId) {
		ts.deleteTeam(teamId);
		
	}
	@GetMapping("/getteamnamebyplayername/{pname}")
	public String getTeamnameByPlayerName(@PathVariable String pname) {
		return ts.getTeamNameByPlayerName(pname);
	}
	@GetMapping("/getteamidbyteamname/{tname}")
	public int getTeamIdByTeamName(@PathVariable String tname) {
		return ts.getTeamIdByTeamName(tname);
	}
	@GetMapping("/getallteams")
	public List<Teams> getAllTeams() {
		return ts.getAllTeams();
	}


}
