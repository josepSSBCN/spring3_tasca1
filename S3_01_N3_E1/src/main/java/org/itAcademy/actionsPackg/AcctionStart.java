package org.itAcademy.actionsPackg;

import org.itAcademy.interfacePckg.ActionVehicle;
import org.itAcademy.interfacePckg.Vehicle;

public class AcctionStart implements ActionVehicle {
    @Override
    public void execute(Vehicle vehicleIn) {
        System.out.println(String.format("El vehicle '%s' del tipus '%s' està arrancant.",
                vehicleIn.getName(), vehicleIn.getVehicleType()));
    }

}
