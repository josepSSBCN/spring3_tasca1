package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndoClass {

    //region ATTRIBUTES
    private int index;
    private Map<Integer, Integer> list;
    private static UndoClass instance;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    private UndoClass() {
        index = -1;
        list = new HashMap<>();
    }

    public static UndoClass getInstance() {
        if (instance == null) {
            instance = new UndoClass();
        }
        return instance;
    }

    //endregion CONSTRUCTOR


    //region METHODS

    public void addNum(int valueIn) {
        if (list.size() > index) {
            for (int i = list.size(); i >= 0; i--) {
                if (list.containsKey(i) && (i > index)) {
                    list.remove(i);
                }
            }
        }
        index++;
        list.put(index, valueIn);
    }

    public void clear() {
        list.clear();
        index = -1;
    }

    public String getUndoMenu() {
        return "UNDO MENÚ: u=>Undo; r=>Redo; c=>Clear; h=>History;";
    }

    public String history() {
        String text = "HISTORIAL UNDO => ";

        if (list.size() == 0) {
            text = "HISTORIAL UNDO => ----";
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) {
                    text = text + ", ";
                }
                if (i == index) {
                    text = String.format("%s->%s<-", text, list.get(i));
                } else {
                    text = String.format("%s%s", text, list.get(i));
                }
            }
        }

        return text; // list.values().toString();

    }

    public String redo() {
        String resul;
        if (index < (list.size()) - 1) {
            index++;
            resul = list.get(index).toString();
        } else {
            resul = "Final del Redo.";
        }
        return resul;
    }

    public String undo() {
        String resul;
        if (index > 0) {
            index--;
            resul = list.get(index).toString();
        } else {
            resul = "Final del Undo.";
        }
        return resul;
    }

    //endregion METHODS

}
