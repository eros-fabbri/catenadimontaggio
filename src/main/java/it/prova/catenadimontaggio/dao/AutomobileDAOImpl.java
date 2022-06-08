package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;

@Component
public class AutomobileDAOImpl implements AutomobileDAO {

	@Override
	public Automobile getAutomobile(int id) {
		return (Automobile) DBMock.SLOT_LIST.stream()
				.flatMap(slot -> slot.getAutomobili().stream().filter(a -> a.getId() == id));
	}

}
