package it.polito.tdp.PremierLeague.model;

public class GiocatoreMigliore {
	
	Player p;
	double delta;
	public GiocatoreMigliore(Player p, double de) {
		super();
		this.p = p;
		this.delta = de;
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
