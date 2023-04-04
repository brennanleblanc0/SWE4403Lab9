package ca.brennanleblanc.SWE4403Lab9.E02;

public class Button extends UIControl {
    private boolean isEnabled;

    public Button(DialogBox observer) {
        super(observer);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        observer.update(this);
    }
}
