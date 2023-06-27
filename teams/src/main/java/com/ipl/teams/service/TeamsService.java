package com.ipl.teams.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ipl.teams.dto.Players;
import com.ipl.teams.entity.Teams;
import com.ipl.teams.repository.TeamsRepository;
@Service
public class TeamsService {
	@Autowired
	TeamsRepository tr;
	@Autowired
	RestTemplate restTemplate;

	public void saveTeams(Teams teams) {
		// TODO Auto-generated method stub
		tr.save(teams);
		
	}

	public Teams getTeamById(int tid) {
		// TODO Auto-generated method stub
		return tr.findById(tid).get();
	}
	public Teams findTeamByName(String teamName) {
		// TODO Auto-generated method stub
		return tr.findByTname(teamName);
	}

	public Teams updateTeam(int teamId, Teams teams) {
		// TODO Auto-generated method stub
		Teams ex=tr.findById(teamId).get();
		ex.setTname(teams.getTname());
		ex.setTbudget(teams.getTbudget());
		tr.save(ex);
		return ex;
	}
	public void deleteTeam(int teamId) {
		// TODO Auto-generated method stub
		tr.deleteById(teamId);
	}

	public String getTeamNameByPlayerName(String pname) {
		// TODO Auto-generated method stub
		int i,status=0;
		List<Players> playersdata=restTemplate.getForObject("http://localhost:8082/players/getallplayers",List.class);
		for(i=0;i<playersdata.size();i++) {
			System.out.println(playersdata.get(i));
			if(playersdata.get(i).getPname().equalsIgnoreCase(pname)) {
				status=1;
				break;
			} else {
				status=0;
			}
			
		}
		if(status==1) {
			int teamId=playersdata.get(i).getTid();
			Teams team=getTeamById(teamId);
			return team.getTname();

		} else {
			throw new com.ipl.teams.exception.PlayerNotExistsException("Player not exists");
		}
	}

	public int getTeamIdByTeamName(String tname) {
		// TODO Auto-generated method stub
		return tr.getTeamIdByTeamName(tname);
	}

	public List<Teams> getAllTeams() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

}
