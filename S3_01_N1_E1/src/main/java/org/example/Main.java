package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        boolean exit = false, resul = false;
        int number = 0;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        System.out.println("\r");
        do {
            printUndoMenu();
            System.out.println("Afegeix un nº.");
            number = getNumber();
            if (number < 0) {
                switch (number) {
                    case -1:        // Undo
                        undo();
                        break;
                    case -2:        // Redo
                        redo();
                        break;
                    case -3:        // Clear
                        clearHistory();
                        break;
                    case -4:        // History
                        history();
                        break;
                }
            } else {
                addNumberToUndo(number);
            }

            System.out.println("\r");

        } while (!exit);

        //endregion ACTIONS


        // OUT
        System.out.println("END OF PROGRAM");

    }

    public static void addNumberToUndo(int numberIn) {
        //region DEFINITION VARIABLES
        UndoClass undoClass;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        undoClass = UndoClass.getInstance();
        undoClass.addNum(numberIn);

        //endregion ACTIONS

    }

    public static void clearHistory() {
        //region DEFINITION VARIABLES
        UndoClass undoClass;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        undoClass = UndoClass.getInstance();
        undoClass.clear();

        //endregion ACTIONS


        // OUT
        System.out.println("Historial eliminat.");

    }

    public static int getNumber() {
        //region DEFINITION VARIABLES
        boolean exit = false;
        int value = 0;
        Scanner inputKey;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        inputKey = new Scanner(System.in);

        do {
            try {
                value = Integer.parseInt(inputKey.nextLine());
                if (value < 0) {
                    System.out.println("Ha de ser un nº superior a 0");
                } else {
                    exit = true;
                }
            } catch (Exception e) {
                if (e.getMessage().contains("\"u\"")) {
                    value = -1;
                    exit = true;
                } else if (e.getMessage().contains("\"r\"")) {
                    value = -2;
                    exit = true;
                } else if (e.getMessage().contains("\"c\"")) {
                    value = -3;
                    exit = true;
                } else if (e.getMessage().contains("\"h\"")) {
                    value = -4;
                    exit = true;
                } else {
                    System.out.println(String.format("'%s' no és un número.", value));
                }
            }

        } while (!exit);
        //endregion ACTIONS

        // OUT
        return value;

    }

    public static void history() {
        //region DEFINITION VARIABLES
        String text;
        UndoClass undoClass;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        undoClass = UndoClass.getInstance();
        text = undoClass.history();

        //endregion ACTIONS


        // OUT
        System.out.println(text);

    }

    public static void printUndoMenu() {
        //region DEFINITION VARIABLES
        String text;
        UndoClass undoClass;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        undoClass = UndoClass.getInstance();
        text = undoClass.getUndoMenu();

        //endregion ACTIONS


        // OUT
        System.out.println(text);

    }

    public static void redo() {
        //region DEFINITION VARIABLES
        String text;
        UndoClass undoClass;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        undoClass = UndoClass.getInstance();
        text = undoClass.redo();

        //endregion ACTIONS


        // OUT
        System.out.println("Valor de redo: " + text);

    }

    public static void undo() {
        //region DEFINITION VARIABLES
        String text;
        UndoClass undoClass;

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        undoClass = UndoClass.getInstance();
        text = undoClass.undo();

        //endregion ACTIONS


        // OUT
        System.out.println("Valor d'undo: " + text);

    }

}