package com.kirykowicz;

public class Main {

    public static void main(String[] args) {

        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varFour is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();

        innerClass.timesTwo();

        scopeInstance.useInner();

    }
}
