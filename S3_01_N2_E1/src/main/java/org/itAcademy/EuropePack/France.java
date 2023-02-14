package org.itAcademy.EuropePack;

import org.itAcademy.InterfacePck.AddressInfo;
import org.itAcademy.InterfacePck.Country;

public class France extends AddressInfo implements Country {
    //region CONSTRUCTOR
    public France() {

    }

    public France(String countryNameIn, int interCodeIn) {
        this.country = countryNameIn;
        this.interCode = interCodeIn;

    }


    //endregion CONSTRUCTOR

}



