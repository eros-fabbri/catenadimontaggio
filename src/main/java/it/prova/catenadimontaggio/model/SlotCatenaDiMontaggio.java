package it.prova.catenadimontaggio.model;

import java.util.List;

public class SlotCatenaDiMontaggio {
	private String brand;
	private String country;
	private List<Automobile> automobili;
	
	public SlotCatenaDiMontaggio() {
		
	}
	
	public SlotCatenaDiMontaggio(String brand, String country, List<Automobile> automobili) {
		super();
		this.brand = brand;
		this.country = country;
		this.automobili = automobili;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(List<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	
	
}
