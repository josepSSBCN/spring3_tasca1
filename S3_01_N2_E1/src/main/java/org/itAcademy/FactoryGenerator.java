package org.itAcademy;

import org.itAcademy.AfricaPck.AfricaFactory;
import org.itAcademy.AmericaPck.AmericaFactory;
import org.itAcademy.Enums.WorldEnum;
import org.itAcademy.EuropePack.EuropeFactory;

public class FactoryGenerator {
    public static WorldAbstractFactory getFactory(WorldEnum continentIn) {
        switch (continentIn) {
            case AFRICA -> {
                return new AfricaFactory();
            }
            case AMERICA -> {
                return new AmericaFactory();
            }
            case EUROPE -> {
                return new EuropeFactory();
            }
        }
        return null;
    }
}


