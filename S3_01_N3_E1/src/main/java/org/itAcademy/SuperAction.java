package org.itAcademy;

import org.itAcademy.interfacePckg.ActionVehicle;
import org.itAcademy.interfacePckg.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class SuperAction implements ActionVehicle {
    //region ATTRIBUTES
    private List<ActionVehicle> actionVehicleList = new ArrayList<>();

    //endregion ATTRIBUTES


    //region METHODS
    public void addAction(ActionVehicle actionVehicle){
        actionVehicleList.add(actionVehicle);
    }

    @Override
    public void execute(Vehicle vehicleIn) {
        actionVehicleList.forEach((x)->x.execute((vehicleIn)));
    }

    //endregion METHODS

}
