package it.polito.tdp.PremierLeague.model;

import it.polito.tdp.PremierLeague.db.PremierLeagueDAO;

public class GiocatoreMigliore {
	
	Player p;
	double delta;
	Team squadra;
	PremierLeagueDAO dao;
	
	public GiocatoreMigliore(Player p, double de) {
		super();
		this.p = p;
		this.delta = de;
		this.dao = new PremierLeagueDAO();
		this.squadra = this.dao.getTeamOfPlayer(p.getPlayerID());
	}
	public Team getSquadra() {
		return squadra;
	}
	public void setSquadra(Team squadra) {
		this.squadra = squadra;
	}
	public Player getP() {
		return p;
	}
	public void setP(Player p) {
		this.p = p;
	}
	public double getDelta() {
		return delta;
	}
	public void setDelta(double delta) {
		this.delta = delta;
	}
	@Override
	public String toString() {
		return "GiocatoreMigliore [p=" + p + ", delta=" + delta + "]";
	}
	

}
