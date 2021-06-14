package it.polito.tdp.PremierLeague.model;

import java.util.Map;
import java.util.PriorityQueue;

public class Simulazione {
	
	private PriorityQueue<Evento> queue;
	
	private Match m;
	private int giocatoriA;
	private int giocatoriB;
	private int golA;
	private int golB;
	private int tempo;
	private Team a;
	private Team b;
	private GiocatoreMigliore g;
	
	public void init(int n, Match m, Map<Integer, Team> squadre, GiocatoreMigliore best) {

		this.m = m;
		this.giocatoriA=11;
		this.giocatoriB=11;
		this.golA=0;
		this.golB=0;
		this.a = squadre.get(this.m.getTeamHomeID());
		this.b = squadre.get(this.m.getTeamAwayID());
		this.g = best;
		
		this.queue = new PriorityQueue<>();
		this.tempo=0;
		
		for (int i = 0; i<n; i++) {
			this.queue.add(new Evento(tempo));
			this.tempo++;
		}
	
	}

	public void run() {
		
		while (this.queue.poll() != null) {
			double caso = Math.random();
			if (caso<0.5) {
				if (giocatoriA>giocatoriB) {
					this.golA++;
				} else if (giocatoriB>giocatoriA) {
					this.golB++;
				} else {
					if (g.getSquadra().equals(a)) {
						this.golA++;
					} else {
						this.golB++;
					}
				}
			} else if (caso<0.8) {
				double casoE = Math.random();
				if (casoE<0.6) {
					if (g.getSquadra().equals(a)) {
						this.giocatoriA--;
					} else {
						this.giocatoriB--;
					}
				} else {
					if (g.getSquadra().equals(a)) {
						this.giocatoriB--;
					} else {
						this.giocatoriA--;
					}
				}
			} else {
				double casoI = Math.random();
				if (casoI<0.5) {
					this.queue.add(new Evento(tempo));
					this.tempo++;
					this.queue.add(new Evento(tempo));
					this.tempo++;
					this.queue.add(new Evento(tempo));
					this.tempo++;
				} else {
					this.queue.add(new Evento(tempo));
					this.tempo++;
					this.queue.add(new Evento(tempo));
					this.tempo++;
				}
			}
		}
		
	}

	public int getGiocatoriA() {
		return giocatoriA;
	}

	public int getGiocatoriB() {
		return giocatoriB;
	}

	public int getGolA() {
		return golA;
	}

	public int getGolB() {
		return golB;
	}

	public Team getA() {
		return a;
	}

	public Team getB() {
		return b;
	}

}
