package org.itAcademy.EuropePack;

import org.itAcademy.InterfacePck.AddressInfo;
import org.itAcademy.InterfacePck.Country;
public class Spain extends AddressInfo implements Country {
    //region CONSTRUCTOR
    public Spain() {

    }

    public Spain(String countryNameIn, int interCodeIn) {
        this.country = countryNameIn;
        this.interCode = interCodeIn;

    }

    //endregion CONSTRUCTOR




}
