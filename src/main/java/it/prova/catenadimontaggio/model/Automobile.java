package it.prova.catenadimontaggio.model;

import java.util.Date;

public class Automobile {
	int id;
	private String modello;
	private String telaio;
	private Date dataProduzione;

	public Automobile() {

	}

	public Automobile(String modello, String telaio, Date dataProduzione) {
		super();
		this.modello = modello;
		this.telaio = telaio;
		this.dataProduzione = dataProduzione;
	}

	public Automobile(int id, String modello, String telaio, Date dataProduzione) {
		super();
		this.id = id;
		this.modello = modello;
		this.telaio = telaio;
		this.dataProduzione = dataProduzione;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTelaio() {
		return telaio;
	}

	public void setTelaio(String telaio) {
		this.telaio = telaio;
	}

	public Date getDataProduzione() {
		return dataProduzione;
	}

	public void setDataProduzione(Date dataProduzione) {
		this.dataProduzione = dataProduzione;
	}

	public int getId() {
		return id;
	}

}
