package org.itAcademy.AmericaPck;

import org.itAcademy.InterfacePck.AddressInfo;
import org.itAcademy.InterfacePck.Country;

public class EEUU extends AddressInfo implements Country {
    //region CONSTRUCTOR
    public EEUU() {

    }

    public EEUU(String countryNameIn, int interCodeIn) {
        this.country = countryNameIn;
        this.interCode = interCodeIn;

    }

    //endregion CONSTRUCTOR

}
