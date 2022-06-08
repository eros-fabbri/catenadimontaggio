package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;

@Component
public class SlotCatenaDiMontaggioDAOImpl implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggioDAO getSlot(int id) {
		return (SlotCatenaDiMontaggioDAO) DBMock.SLOT_LIST.stream().filter(s -> s.getId() == id).findAny().orElse(null);
	}

	@Override
	public void addAutomobileACatena(int idCatena, Automobile automobile) {

		DBMock.SLOT_LIST.stream().forEach(slot -> {
			if (slot.getId() == idCatena) {
				slot.getAutomobili().add(automobile);
			}
		});

	}

}
