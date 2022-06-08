package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service

public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService {
	
	@Autowired
	private TelaioService telaioService;
	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private MotoreService motoreService;
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	@Autowired
	private SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;


	@Override
	public SlotCatenaDiMontaggio caricaCatena(int id) {
		
		return (SlotCatenaDiMontaggio) slotCatenaDiMontaggioDAO.getSlot(id);
	}

	@Override
	public void aggiungiAutomobileACatena(Automobile autoInput, SlotCatenaDiMontaggio catenaInput) {
		slotCatenaDiMontaggioDAO.addAutomobileACatena(catenaInput.getId(), autoInput);
	}
	@Override
	public void costruisciAutomible() {
		telaioService.montaTelaio();
		carrozzeriaService.montaCarrozzeria();
		motoreService.montaMotore();
		impiantoElettricoService.montaImpiantoElettrico();
		provaSuStradaService.provaAutomobile();
	}

	@Override
	public void avviaMontaggio() {
	}

}
