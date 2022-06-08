package it.prova.catenadimontaggio.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import java.text.ParseException;

public class DBMock {
	public static final List<SlotCatenaDiMontaggio> SLOT_CATENA_MONTAGGIO = new ArrayList<SlotCatenaDiMontaggio>();

	static {
		try {

			Automobile automobile1 = new Automobile("modello1", "asdflj",
					new SimpleDateFormat("dd/mm/yyyy").parse("20/05/2022"));
			Automobile automobile2 = new Automobile("modello2", "sdfvgh",
					new SimpleDateFormat("dd/mm/yyyy").parse("21/05/2022"));
			SlotCatenaDiMontaggio slotCatenaDiMontaggio1 = new SlotCatenaDiMontaggio("AutoMobili", "italia",
					new ArrayList<Automobile>());

			slotCatenaDiMontaggio1.getAutomobili().add(automobile1);
			slotCatenaDiMontaggio1.getAutomobili().add(automobile2);

			Automobile automobile3 = new Automobile("modello4", "asdflj",
					new SimpleDateFormat("dd/mm/yyyy").parse("22/05/2022"));
			Automobile automobile4 = new Automobile("modello3", "sdfvgh",
					new SimpleDateFormat("dd/mm/yyyy").parse("23/05/2022"));
			SlotCatenaDiMontaggio slotCatenaDiMontaggio2 = new SlotCatenaDiMontaggio("AutoMobili", "italia",
					new ArrayList<Automobile>());

			slotCatenaDiMontaggio2.getAutomobili().add(automobile3);
			slotCatenaDiMontaggio2.getAutomobili().add(automobile4);

			Automobile automobile5 = new Automobile("modello5", "asdflj",
					new SimpleDateFormat("dd/mm/yyyy").parse("23/05/2022"));
			Automobile automobile6 = new Automobile("modello6", "sdfvgh",
					new SimpleDateFormat("dd/mm/yyyy").parse("24/05/2022"));
			SlotCatenaDiMontaggio slotCatenaDiMontaggio3 = new SlotCatenaDiMontaggio("AutoMobili", "italia",
					new ArrayList<Automobile>());

			slotCatenaDiMontaggio3.getAutomobili().add(automobile5);
			slotCatenaDiMontaggio3.getAutomobili().add(automobile6);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
