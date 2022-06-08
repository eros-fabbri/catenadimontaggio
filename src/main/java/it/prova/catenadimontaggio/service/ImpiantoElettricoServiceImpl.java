package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service

public class ImpiantoElettricoServiceImpl implements ImpiantoElettricoService {
	
	public void montaImpiantoElettrico() {
		System.out.println("impianto elettrico: montato");
	}

}
