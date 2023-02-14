package org.itAcademy.EuropePack;

import org.itAcademy.InterfacePck.AddressInfo;
import org.itAcademy.InterfacePck.Country;

public class Germany extends AddressInfo implements Country {
    //region CONSTRUCTOR
    public Germany() {

    }

    public Germany(String countryNameIn, int interCodeIn) {
        this.country = countryNameIn;
        this.interCode = interCodeIn;

    }

    //endregion CONSTRUCTOR

}
