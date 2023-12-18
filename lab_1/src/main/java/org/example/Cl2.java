package org.example;

public class Cl2 implements If2{

    @Override
    public void meth2() {
        System.out.println(getClass() + ", method name is: meth2");
    }

    @Override
    public void meth3() {
        System.out.println(getClass() + ", method name is: meth3");
    }
}
