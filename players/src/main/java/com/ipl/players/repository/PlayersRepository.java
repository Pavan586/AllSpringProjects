package com.ipl.players.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipl.players.entity.Players;

public interface PlayersRepository extends JpaRepository<Players,Integer> {
	@Query("select p from Players p where p.tid=?1")
	public List<Players> getPlayersByTeamId(int tid);

}
