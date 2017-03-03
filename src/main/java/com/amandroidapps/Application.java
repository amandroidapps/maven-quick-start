package com.amandroidapps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anup on 3/3/2017.
 */
public class Application {
    public static void main(String args[]){
        System.out.println("In Application main");
        Application app = new Application();
        app.doSomething();
        app.greet();
    }

    private void doSomething(){
        System.out.println("In do something");
    }

    private void greet(){
        List<String> greetings = new ArrayList<String>();
        greetings.add("Hello");
        greetings.add("Bye");
        for(String greeting:greetings){
            System.out.println(greeting);
        }
    }
}
