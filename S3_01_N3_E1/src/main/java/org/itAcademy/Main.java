package org.itAcademy;

import org.itAcademy.actionsPackg.AcctionStart;
import org.itAcademy.actionsPackg.ActionBraking;
import org.itAcademy.actionsPackg.ActionSpeedUp;
import org.itAcademy.vehiclesPackg.Bike;
import org.itAcademy.vehiclesPackg.Car;
import org.itAcademy.vehiclesPackg.Plane;
import org.itAcademy.vehiclesPackg.Ship;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        ActionsManager actionsManager = new ActionsManager();

        Bike bike1 = new Bike("BIKE", "Pinarello Espada");
        Car car1 = new Car("CAR", "Kitt");
        Plane plane1 = new Plane("PLANE", "Enola Gay");
        Ship ship1 = new Ship("SHIP", "Titanic");

        AcctionStart acctionStart = new AcctionStart();
        ActionSpeedUp actionSpeedUp = new ActionSpeedUp();
        ActionBraking actionBraking = new ActionBraking();

        SuperAction superAction = new SuperAction();

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        System.out.println("ACTIONS");
        actionsManager.execute(actionBraking, car1);
        actionsManager.execute(actionSpeedUp, bike1);
        actionsManager.execute(acctionStart, plane1);

        System.out.println("\nSUPER ACTIONS");
        superAction.addAction(new AcctionStart());
        superAction.addAction(new ActionSpeedUp());
        superAction.addAction(new ActionBraking());
        actionsManager.execute(superAction, ship1);

        //endregion ACTIONS

    }
}