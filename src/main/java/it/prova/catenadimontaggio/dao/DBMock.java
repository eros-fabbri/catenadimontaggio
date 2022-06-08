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
			SlotCatenaDiMontaggio slotCatenaDiMontaggio1 = new SlotCatenaDiMontaggio(1, "Slot1", "italia", new ArrayList<Automobile>());
			Automobile automobile1 = new Automobile(1, "modello1", "telaio1",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			Automobile automobile2 = new Automobile(2, "modello2", "telaio2",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			slotCatenaDiMontaggio1.getAutomobili().add(automobile1);
			slotCatenaDiMontaggio1.getAutomobili().add(automobile2);

			SlotCatenaDiMontaggio slotCatenaDiMontaggio2 = new SlotCatenaDiMontaggio( 2, "slot2", "francia", new ArrayList<Automobile>());
			Automobile automobile3 = new Automobile(3, "modello3", "telaio3",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			Automobile automobile4 = new Automobile(4, "modello4", "telaio4",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			slotCatenaDiMontaggio2.getAutomobili().add(automobile1);
			slotCatenaDiMontaggio2.getAutomobili().add(automobile2);
			                     

			SlotCatenaDiMontaggio slotCatenaDiMontaggio3 = new SlotCatenaDiMontaggio(3, "slot3", "germania", new ArrayList<Automobile>());
			Automobile automobile5 = new Automobile(5, "modello5", "telaio5",
					new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022"));
			Automobile automobile6 = new Automobile(6, "modello6", "telaio6",
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
