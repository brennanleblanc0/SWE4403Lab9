package ca.brennanleblanc.SWE4403Lab9.E02;

public class SignUpDialogBox implements DialogBox {
    private TextBox username;
    private TextBox password;
    private CheckBox terms;
    private Button signupButton;
    private boolean usernameFilled;
    private boolean passwordFilled;
    private boolean termsAccepted;

    public SignUpDialogBox() {
        usernameFilled = false;
        passwordFilled = false;
        termsAccepted = false;
    }

    public void setUsername(TextBox username) {
        this.username = username;
    }

    public void setPassword(TextBox password) {
        this.password = password;
    }

    public void setTerms(CheckBox terms) {
        this.terms = terms;
        this.terms.setChecked(false);
    }

    public void setSignupButton(Button signupButton) {
        this.signupButton = signupButton;
        this.signupButton.setEnabled(false);
    }

    @Override
    public void update(UIControl context) {
        if (context == username) {
            usernameFilled = true;
        } else if (context == password) {
            passwordFilled = true;
        } else if (context == terms) {
            termsAccepted = true;
        }

        if (usernameFilled && passwordFilled && termsAccepted && !signupButton.isEnabled()) {
            signupButton.setEnabled(true);
        }
    }

    public void enterUsername(String text) {
        username.setContent(text);
    }

    public void enterPassword(String text) {
        password.setContent(text);
    }

    public void acceptTerms() {
        terms.setChecked(true);
    }

    public void signup() {
        if (signupButton.isEnabled()) {
            System.out.println("Succesfully signed up");
        } else {
            System.out.println("ERROR: One or more fields are empty");
        }
    }
}
