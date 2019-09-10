package com.company.creationalPatterns.Singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        Government government = Government.getInstance();
        government.showMessage();
    }
}
