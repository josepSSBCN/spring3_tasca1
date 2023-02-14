package org.itAcademy.AfricaPck;

import org.itAcademy.Enums.AfricaCountriesEnum;
import org.itAcademy.Enums.AmericaCountryEnum;
import org.itAcademy.Enums.EuropeCountrysEnum;
import org.itAcademy.InterfacePck.Country;
import org.itAcademy.WorldAbstractFactory;

public class AfricaFactory implements WorldAbstractFactory {

    //region METHODS: OVERRIDE
    @Override
    public Country getAfricaCountry(AfricaCountriesEnum countryName) {

        return switch (countryName){
            case EGYPT -> new Egypt("Egypt", 20);
            case MOROCCO -> new Morocco("Morocco", 212);
            default -> null;
        };
    }

    @Override
    public Object getAmericaCountry(AmericaCountryEnum countryName) {
        return null;
    }

    @Override
    public Object getEuropeCountry(EuropeCountrysEnum countryName) {
        return null;
    }

    //endregion METHODS: OVERRIDE

}



