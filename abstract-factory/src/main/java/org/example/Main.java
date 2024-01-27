package org.example;

public class Main {
    public static void main(String[] args) {
        JavaToolsFactory javaToolsFactory = new JavaToolsFactory();
        DevelopmentEnvironment javaDevelopmentEnvironment = new DevelopmentEnvironment(javaToolsFactory);
        javaDevelopmentEnvironment.doSomething();
        CppToolsFactory cppToolsFactory = new CppToolsFactory();
        DevelopmentEnvironment cppDevelopmentEnvironment = new DevelopmentEnvironment(cppToolsFactory);
        cppDevelopmentEnvironment.doSomething();
    }
}