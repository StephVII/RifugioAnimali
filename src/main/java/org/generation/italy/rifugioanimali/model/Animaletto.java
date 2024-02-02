package org.generation.italy.rifugioanimali.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Animaletto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length=20)
	private String specie;

	@Column(nullable = false, length=20)
	private String razza;

	@Column(nullable = false)
	private int eta;

	@Column(nullable = false)
	private boolean storicoVaccinato;

	@Column(nullable = false)
	private boolean chip;

	@Column(nullable = false)
	private boolean adottato;

	@ManyToOne(optional = false) //tanti animaletti possono stare in una singola sede
	private Sede sede;

	@ManyToOne //tanti animaletti possono essere adottati da un singolo utente
	private Utente utente;


	public Animaletto() {
		super();
	}

	public Animaletto(String specie, String razza, int eta, boolean storicoVaccinato, boolean chip, boolean adottato) {
		super();
		this.specie = specie;
		this.razza = razza;
		this.eta = eta;
		this.storicoVaccinato = storicoVaccinato;
		this.chip = chip;
		this.adottato = adottato;
	}

	public int getId() {
		return id;
	}

	public String getSpecie() {
		return specie;
	}

	public String getRazza() {
		return razza;
	}

	public int getEta() {
		return eta;
	}

	public boolean isStoricoVaccinato() {
		return storicoVaccinato;
	}

	public boolean isChip() {
		return chip;
	}

	public boolean isAdottato() {
		return adottato;
	}

	//setters

	public void setId(int id) {
		this.id = id;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public void setStoricoVaccinato(boolean storicoVaccinato) {
		this.storicoVaccinato = storicoVaccinato;
	}

	public void setChip(boolean chip) {
		this.chip = chip;
	}

	public void setAdottato(boolean adottato) {
		this.adottato = adottato;
	}

	//to string
	@Override
	public String toString() {
		return "id: " + id + ", specie: " + specie + ", razza: " + razza + ", eta: " + eta
				+ ", storicoVaccinato: " + storicoVaccinato + ", chip: " + chip + ", adottato: " + adottato;
	}



}
