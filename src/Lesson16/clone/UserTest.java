package Lesson16.clone;

import Lesson16.clone.User;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("login","password");
        try {
            User u = (User) user.clone();
            System.out.println(u.login + " " + u.password);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
