package org.generation.italy.rifugioanimali.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Sede {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificativo;

	@Column(nullable = false, length = 20)
	private String indirizzo;

	@Column(nullable = false, length = 20)
	private String direttore;

	@Column(nullable = false, length = 20)
	private String nomeRifugio;

	@OneToMany
	List<Animaletto> elencoAnimaletti;

	public Sede() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sede(String indirizzo, String direttore, String nomeRifugio) {
		super();
		this.indirizzo = indirizzo;
		this.direttore = direttore;
		this.nomeRifugio = nomeRifugio;
	}

	public int getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(int identificativo) {
		this.identificativo = identificativo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getDirettore() {
		return direttore;
	}

	public void setDirettore(String direttore) {
		this.direttore = direttore;
	}

	public String getNomeRifugio() {
		return nomeRifugio;
	}

	public void setNomeRifugio(String nomeRifugio) {
		this.nomeRifugio = nomeRifugio;
	}

	@Override
	public String toString() {
		return "identificativo: " + identificativo + ", indirizzo: " + indirizzo + ", direttore: " + direttore
				+ ", nomeRifugio: " + nomeRifugio;
	}

}
