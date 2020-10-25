package com.java.automation.lab.fall.khamnava.core22.domain.classes;

import java.util.Arrays;

public class Activity {
    private VisualBoard everyAction;
    private Action[] listOfActions;

    public Activity(VisualBoard everyAction, Action[] listOfActions) {
        this.everyAction = everyAction;
        this.listOfActions = listOfActions;
    }

    public VisualBoard getEveryAction() { return this.everyAction; }

    public void setEveryAction(VisualBoard everyAction) { this.everyAction = everyAction; }

    public Action[] getListOfActions() { return this.listOfActions; }

    public void setListOfActions(Action[] listOfActions) { this.listOfActions = listOfActions; }

    @Override
    public String toString() {
        return "Sprint {\n\teveryAction: " + everyAction.toString() +
                "\n\tlistOfActions: " + Arrays.toString(listOfActions) +
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
                Arrays.equals(getListOfActions(), ((Activity) that).getListOfActions());
    }

    public int hashCode(){
        return getEveryAction().hashCode() + getListOfActions().hashCode();
    }
}
