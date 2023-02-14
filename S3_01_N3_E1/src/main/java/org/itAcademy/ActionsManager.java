package org.itAcademy;

import org.itAcademy.interfacePckg.ActionVehicle;
import org.itAcademy.interfacePckg.Vehicle;

public class ActionsManager {
    public void execute(ActionVehicle actionIn, Vehicle vehicleIn){
        actionIn.execute(vehicleIn);
    }

}
