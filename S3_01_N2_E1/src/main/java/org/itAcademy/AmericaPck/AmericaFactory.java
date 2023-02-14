package org.itAcademy.AmericaPck;

import org.itAcademy.Enums.AfricaCountriesEnum;
import org.itAcademy.Enums.AmericaCountryEnum;
import org.itAcademy.Enums.EuropeCountrysEnum;
import org.itAcademy.WorldAbstractFactory;

import java.text.DecimalFormat;

public class AmericaFactory implements WorldAbstractFactory {

    @Override
    public Object getAmericaCountry(AmericaCountryEnum countryName) {
        return switch (countryName){
            case EEUU -> new EEUU("EEUU", 1);
            case CANADA ->  new Canada("Canada", 1);
            default -> null;
        };
    }

    @Override
    public Object getAfricaCountry(AfricaCountriesEnum countryName) {
        return null;
    }

    @Override
    public Object getEuropeCountry(EuropeCountrysEnum countryName) {
        return null;
    }
}
