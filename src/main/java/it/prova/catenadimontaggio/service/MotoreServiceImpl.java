package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service

public class MotoreServiceImpl implements MotoreService {
	
	public void montaMotore() {
		System.out.println("motore: montato");

	}
}
