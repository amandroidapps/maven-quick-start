package com.amandroidapps;

/**
 * Created by Anup on 3/3/2017.
 */
public class Application {
    public static void main(String args[]){
        System.out.println("In Application main");
        Application app = new Application();
        app.doSomething();
    }

    private void doSomething(){
        System.out.println("In do something");
    }
}
