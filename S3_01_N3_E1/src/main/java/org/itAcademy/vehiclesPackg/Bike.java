package org.itAcademy.vehiclesPackg;

import org.itAcademy.interfacePckg.Vehicle;
import org.itAcademy.interfacePckg.VehicleInfo;

public class Bike extends VehicleInfo implements Vehicle {
    //region CONSTRUCTOR
    public Bike (String vehicleTypeIn, String nameIn){
        this.name = nameIn;
        this.vehicleType = vehicleTypeIn;
    }

    //endregion CONSTRUCTOR


    //region METHODS: OVERRIDE
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    //endregion METHODS: OVERRIDE

}
