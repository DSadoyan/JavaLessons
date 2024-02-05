package Lesson16;

import java.io.Serializable;

public class User implements Serializable {
    public String login;
    public transient String password;
    public String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return login + " " + password + " " + email;
    }
}
