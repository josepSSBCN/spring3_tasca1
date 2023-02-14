package org.itAcademy.actionsPackg;

import org.itAcademy.interfacePckg.ActionVehicle;
import org.itAcademy.interfacePckg.Vehicle;

public class ActionBraking implements ActionVehicle {
    @Override
    public void execute(Vehicle vehicleIn) {
        System.out.println(String.format("El vehicle '%s' del tipus '%s' està frenant.",vehicleIn.getName(), vehicleIn.getVehicleType()));
    }

}
