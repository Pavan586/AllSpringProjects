package com.ipl.teams.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ipl.teams.entity.Teams;

public interface TeamsRepository extends JpaRepository<Teams,Integer> {
	public Teams findByTname(String tname);
	@Query("select t from Teams t where t.tname=?1")
	public Teams findTeamByTeamName(String tname);
	@Query("select t.tid from Teams t where t.tname=?1")
	public int getTeamIdByTeamName(String tname);


}
