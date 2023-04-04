package ca.brennanleblanc.SWE4403Lab9.E02;

public class TextBox extends UIControl {
    private String content;

    public TextBox(DialogBox observer) {
        super(observer);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        if (this.content == "") {
            return;
        }
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        observer.update(this);
    }
}
