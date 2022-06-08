package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {

	public void avviaMontaggio();
	
	public void costruisciAutomible();
	
	public SlotCatenaDiMontaggio caricaCatena(int id);

	public void aggiungiAutomobileACatena(Automobile autoInput, SlotCatenaDiMontaggio catenaInput);

}
