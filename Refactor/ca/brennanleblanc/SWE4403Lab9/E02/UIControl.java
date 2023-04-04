package ca.brennanleblanc.SWE4403Lab9.E02;

public abstract class UIControl {
    protected DialogBox observer;

    public UIControl(DialogBox observer) {
        this.observer = observer;
    }

    public abstract void notifyObserver();
}
