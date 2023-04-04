package ca.brennanleblanc.SWE4403Lab9.E02;

public class Demo {
    public static void main(String[] args) {
        SignUpDialogBox box = new SignUpDialogBox();

        TextBox username = new TextBox(box);
        TextBox password = new TextBox(box);
        CheckBox terms = new CheckBox(box);
        Button signupButton = new Button(box);

        box.setUsername(username);
        box.setPassword(password);
        box.setTerms(terms);
        box.setSignupButton(signupButton);

        box.signup();

        box.enterUsername("Brennan");
        box.enterPassword("");
        box.acceptTerms();

        box.signup();

        box.enterPassword("SuperSecurePassword");

        box.signup();
    }
}
