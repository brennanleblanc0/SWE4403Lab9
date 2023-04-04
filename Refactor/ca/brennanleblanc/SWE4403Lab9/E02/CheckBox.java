package ca.brennanleblanc.SWE4403Lab9.E02;

public class CheckBox extends UIControl {
    private boolean isChecked;

    public CheckBox(DialogBox observer) {
        super(observer);
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        observer.update(this);
    }
}
