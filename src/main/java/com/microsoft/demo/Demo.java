package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("covered");
            return;
        }

        System.out.println("not covered");
    }
}
