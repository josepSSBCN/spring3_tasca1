package org.itAcademy;

import org.itAcademy.Enums.AfricaCountriesEnum;
import org.itAcademy.Enums.AmericaCountryEnum;
import org.itAcademy.Enums.EuropeCountrysEnum;

public interface WorldAbstractFactory<T> {
    T getAfricaCountry(AfricaCountriesEnum countryName);
    T getAmericaCountry(AmericaCountryEnum countryName);
    T getEuropeCountry(EuropeCountrysEnum countryName);

}




