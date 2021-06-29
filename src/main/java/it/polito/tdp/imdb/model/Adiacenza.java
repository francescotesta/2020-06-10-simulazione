package it.polito.tdp.imdb.model;

public class Adiacenza {
	
	Actor id1;
	Actor id2;
	int peso;
	/**
	 * @return the id1
	 */
	public Actor getId1() {
		return id1;
	}
	/**
	 * @param id1 the id1 to set
	 */
	public void setId1(Actor id1) {
		this.id1 = id1;
	}
	/**
	 * @return the id2
	 */
	public Actor getId2() {
		return id2;
	}
	/**
	 * @param id2 the id2 to set
	 */
	public void setId2(Actor id2) {
		this.id2 = id2;
	}
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Adiacenza(Actor id1, Actor id2, int peso) {
		this.id1 = id1;
		this.id2 = id2;
		this.peso = peso;
	}
	
	
	

}
