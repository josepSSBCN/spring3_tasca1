package org.itAcademy;

import org.itAcademy.AfricaPck.Egypt;
import org.itAcademy.AmericaPck.Canada;
import org.itAcademy.Enums.AfricaCountriesEnum;
import org.itAcademy.Enums.AmericaCountryEnum;
import org.itAcademy.Enums.EuropeCountrysEnum;
import org.itAcademy.Enums.WorldEnum;
import org.itAcademy.EuropePack.France;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        WorldAbstractFactory africaFactory;
        WorldAbstractFactory americaFactory;
        WorldAbstractFactory europeFactory;
        Egypt egypt;
        Canada canada;
        France france;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        // Init Factories
        africaFactory = FactoryGenerator.getFactory(WorldEnum.AFRICA);
        americaFactory = FactoryGenerator.getFactory(WorldEnum.AMERICA);
        europeFactory = FactoryGenerator.getFactory(WorldEnum.EUROPE);

        // Init Countries
        egypt = (Egypt) africaFactory.getAfricaCountry(AfricaCountriesEnum.EGYPT);
        canada = (Canada) americaFactory.getAmericaCountry(AmericaCountryEnum.CANADA);
        france = (France) europeFactory.getEuropeCountry(EuropeCountrysEnum.FRANCE);

        // Create address info
        egypt.SetInfo("Aswan", "Street cairo 1", 234, 2, 1, "97-1234-1234");
        canada.SetInfo("Ontario", "Street ontario 2", 12, 1,3, "819-555-555");
        france.SetInfo("Marsella", "Street marsella 3", 82, 10, 8, "4 41 78 96 12");

        //endregion ACTIONS


        // OUT
        System.out.println(egypt.ToStringDirection());
        System.out.println(egypt.ToStringTelephone());
        System.out.println(canada.ToStringDirection());
        System.out.println(canada.ToStringTelephone());
        System.out.println(france.ToStringDirection());
        System.out.println(france.ToStringTelephone());

    }
}
