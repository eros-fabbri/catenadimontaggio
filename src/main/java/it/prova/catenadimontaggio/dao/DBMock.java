package it.prova.catenadimontaggio.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DBMock {

	public static final List<SlotCatenaDiMontaggio> SLOT_LIST = new ArrayList<SlotCatenaDiMontaggio>();

	static {
		try {
			SlotCatenaDiMontaggio slotCatenaDiMontaggio1 = new SlotCatenaDiMontaggio( "Polvo", "Germany", new ArrayList<Automobile>());
			Automobile automobile1 = new Automobile("modello1", "telaio1",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			Automobile automobile2 = new Automobile("modello2", "telaio2",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			slotCatenaDiMontaggio1.getAutomobili().add(automobile1);
			slotCatenaDiMontaggio1.getAutomobili().add(automobile2);

			SlotCatenaDiMontaggio slotCatenaDiMontaggio2 = new SlotCatenaDiMontaggio( "Berrari", "Italy", new ArrayList<Automobile>());
			Automobile automobile3 = new Automobile("modello3", "telaio3",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			Automobile automobile4 = new Automobile("modello4", "telaio4",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			slotCatenaDiMontaggio2.getAutomobili().add(automobile1);
			slotCatenaDiMontaggio2.getAutomobili().add(automobile2);
			                     

			SlotCatenaDiMontaggio slotCatenaDiMontaggio3 = new SlotCatenaDiMontaggio( "PMW", "Germany", new ArrayList<Automobile>());
			Automobile automobile5 = new Automobile("modello5", "telaio5",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			Automobile automobile6 = new Automobile("modello6", "telaio6",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			                     
			slotCatenaDiMontaggio3.getAutomobili().add(automobile1);
			slotCatenaDiMontaggio3.getAutomobili().add(automobile2);
                                 
			SLOT_LIST.add(slotCatenaDiMontaggio1);
			SLOT_LIST.add(slotCatenaDiMontaggio2);
			SLOT_LIST.add(slotCatenaDiMontaggio3);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
