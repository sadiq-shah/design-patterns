package com.company.creationalPatterns.Singleton;

public class Government {
    private static Government government;

    private Government() {
        return;
    }

    public static Government getInstance() {
        if(government == null) {
            return new Government();
        }
        else {
            return government;
        }
    }

    public void showMessage() {
        System.out.println("Government is a singleton class");
    }

}
