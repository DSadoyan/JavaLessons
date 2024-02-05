package Lesson16.clone;

public class User implements Cloneable{
    public String login;
    public String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return login + " " + password;
    }
}
