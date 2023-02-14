package org.itAcademy.AmericaPck;

import org.itAcademy.InterfacePck.AddressInfo;
import org.itAcademy.InterfacePck.Country;

public class Canada extends AddressInfo implements Country {
    //region CONSTRUCTOR
    public Canada() {

    }

    public Canada(String countryNameIn, int interCodeIn) {
        this.country = countryNameIn;
        this.interCode = interCodeIn;

    }

    //endregion CONSTRUCTOR

}
