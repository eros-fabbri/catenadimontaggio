package it.prova.catenadimontaggio.dao;

import it.prova.catenadimontaggio.model.Automobile;

public interface SlotCatenaDiMontaggioDAO {
	public SlotCatenaDiMontaggioDAO getSlot(int id);
	public void addAutomobileACatena(int idCatena, Automobile automobile);
	
}
