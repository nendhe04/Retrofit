package id.putraprima.retrofit.api.models;

public class RegisterRequest {
    public String name, email, password, password_confirmation;

    public RegisterRequest(String name, String email, String password, String passwordcon) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.password_confirmation = passwordcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordcon() {
        return password_confirmation;
    }

    public void setPasswordcon(String passwordcon) {
        this.password_confirmation = passwordcon;
    }
}
