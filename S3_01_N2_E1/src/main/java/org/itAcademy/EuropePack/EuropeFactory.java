package org.itAcademy.EuropePack;

import org.itAcademy.Enums.AfricaCountriesEnum;
import org.itAcademy.Enums.AmericaCountryEnum;
import org.itAcademy.Enums.EuropeCountrysEnum;
import org.itAcademy.WorldAbstractFactory;

public class EuropeFactory implements WorldAbstractFactory {

    @Override
    public Object getEuropeCountry(EuropeCountrysEnum countryName) {
        return switch (countryName){
            case GERMANY -> new Germany("Germany", 49);
            case FRANCE -> new France("France", 33);
            case SPAIN -> new Spain("Spain", 34);
            default -> null;
        };
    }

    @Override
    public Object getAfricaCountry(AfricaCountriesEnum countryName) {
        return null;
    }

    @Override
    public Object getAmericaCountry(AmericaCountryEnum countryName) {
        return null;
    }

}







