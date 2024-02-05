package Lesson16.Generic;

import Lesson16.clone.User;

public class MyBox <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        MyBox<String> stringBox = new MyBox<>();
        stringBox.setT("Gor");
        System.out.println(stringBox.getT());

        MyBox<User> userBox = new MyBox<>();
        userBox.setT(new User("login","password"));
        System.out.println(userBox.getT());
    }
}
