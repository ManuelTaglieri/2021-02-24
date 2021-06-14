package it.polito.tdp.PremierLeague.model;

public class Evento implements Comparable<Evento>{
	
	private int tempo;
	
	public Evento(int tempo) {
		super();
		this.tempo = tempo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Override
	public int compareTo(Evento o) {
		return this.tempo - o.tempo;
	}
	
	
	

}
