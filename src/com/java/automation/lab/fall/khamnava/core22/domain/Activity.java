package com.java.automation.lab.fall.khamnava.core22.domain;

import java.util.Arrays;
import java.util.List;

public class Activity {
    private VisualBoard everyAction;
    private List<Action> listOfActions;

    public Activity(VisualBoard everyAction, List<Action> listOfActions) {
        this.everyAction = everyAction;
        this.listOfActions = listOfActions;
    }

    public VisualBoard getEveryAction() { return this.everyAction; }

    public void setEveryAction(VisualBoard everyAction) { this.everyAction = everyAction; }

    public List<Action> getListOfActions() { return this.listOfActions; }

    public void setListOfActions(List<Action> listOfActions) { this.listOfActions = listOfActions; }

    @Override
    public String toString() {
        String res = "[ ";
        for(Action ac : listOfActions) {
            res += (ac.toString() + ",\n");
        }
        res += "]";
        return "Sprint {\n\teveryAction: " + everyAction.toString() +
                "\n\tlistOfActions: " + res +
                "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return getEveryAction().equals(((Activity) that).getEveryAction()) &&
                getListOfActions().equals(((Activity) that).getListOfActions());
    }

    public int hashCode(){
        return getEveryAction().hashCode() + getListOfActions().hashCode();
    }
}
