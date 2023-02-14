package org.itAcademy.AfricaPck;

import org.itAcademy.InterfacePck.Country;
import org.itAcademy.InterfacePck.AddressInfo;

public class Egypt extends AddressInfo implements Country {
    //region CONSTRUCTOR
    public Egypt() {

    }

    public Egypt(String countryNameIn, int interCodeIn) {
        this.country = countryNameIn;
        this.interCode = interCodeIn;

    }

    //endregion CONSTRUCTOR

}




