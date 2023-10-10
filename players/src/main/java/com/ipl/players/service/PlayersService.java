package com.ipl.players.service;

import java.util.ArrayList;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ipl.players.EmailSenderService;
import com.ipl.players.dto.Teams;
import com.ipl.players.entity.Players;
import com.ipl.players.exception.PlayerAlreadyExistsException;
import com.ipl.players.repository.PlayersRepository;

import jakarta.mail.MessagingException;

@Service
public class PlayersService {
	@Autowired
	private EmailSenderService senderService;
	@Autowired
	private PlayersRepository pr;
	@Autowired
	private RestTemplate restTemplate;
	
	public void savePlayersData(Players players,List<Players> playersinfo) {
		// TODO Auto-generated method stub
		int status=0;
		for(int i=0;i<playersinfo.size();i++) {
			if(playersinfo.get(i).getPname().equalsIgnoreCase(players.getPname())) {
				status=1;
				break;	
			}
		}
		if(status==0) {
		pr.save(players);
		} else {
			throw new PlayerAlreadyExistsException("Player Already Exists");
		}
		//pr.save(players);
	}

	public List<Players> getAllPlayers() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	public Players updatePlayer(int playerId, Players players) {
		// TODO Auto-generated method stub
		Players ex=pr.findById(playerId).get();
		ex.setPname(players.getPname());
		ex.setPemail(players.getPemail());
		ex.setPcategory(players.getPcategory());
		ex.setPcountry(players.getPcountry());
		ex.setPage(players.getPage());
		ex.setPbudget(players.getPbudget());
		pr.save(ex);
		return ex;
	}

	public void deletePlayer(int playerId) {
		// TODO Auto-generated method stub
		Players p=pr.getById(playerId);
		p.setTid(0);
		pr.save(p);
		
	}

	public Players getPlayerById(int playerId) {
		// TODO Auto-generated method stub
		Players p1= pr.findById(playerId).get();
		return p1;
	}

	public List<Players> getPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		Teams team=restTemplate.getForObject("http://localhost:8081/teams/getteamdatabyteamname/"+teamName,Teams.class);
		int teamId=team.getTid();
		return pr.getPlayersByTeamId(teamId);
		
	}

	public void assign(String tname, String pname, List<Players> playersdata) throws MessagingException {
		// TODO Auto-generated method stub
		int i,teamId;
		teamId=restTemplate.getForObject("http://localhost:8081/teams/getteamidbyteamname/"+tname,Integer.class);

		//Teams teams=tsimpl.getTeamById(id);
		for(i=0;i<playersdata.size();i++) {
			if(playersdata.get(i).getPname().equalsIgnoreCase(pname)) {
				Players p=pr.getById(playersdata.get(i).getPid());
				p.setTid(teamId);
				pr.save(p);
				senderService.sendSimpleEmail(playersdata.get(i).getPemail(),
						"Assigned confirmation",
						"Congratulations "+pname+",Your have been assigned to "+tname+ " team successfully");

				break;
	}
		}
	}

	public List<Players> getAllUnsoldPlayers(List<Players> playersdata) {
		// TODO Auto-generated method stub
		List<Players> playersinfo=new ArrayList<Players>();
		for(int i=0;i<playersdata.size();i++) {
			if(playersdata.get(i).getTid()==0) {
				playersinfo.add(playersdata.get(i));
				
			}
		}
		return playersinfo;
	}

	public void deletePlayerFromAdmin(int playerId) {
		// TODO Auto-generated method stub
		Players p=pr.getById(playerId);
		p.setTid(0);
		pr.deleteById(playerId);
		
	}
}
