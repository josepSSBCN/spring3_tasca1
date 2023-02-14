package org.itAcademy.AfricaPck;

import org.itAcademy.InterfacePck.AddressInfo;
import org.itAcademy.InterfacePck.Country;


public class Morocco extends AddressInfo implements Country {

    //region CONSTRUCTOR
    public Morocco() {

    }

    public Morocco(String countryNameIn, int interCodeIn) {
        this.country = countryNameIn;
        this.interCode = interCodeIn;

    }

    //endregion CONSTRUCTOR

}





