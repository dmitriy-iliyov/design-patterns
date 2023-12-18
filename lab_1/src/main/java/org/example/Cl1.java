package org.example;

public class Cl1 implements If1{
    @Override
    public void meth1() {
        System.out.println(getClass() + ", method name is: meth1");
    }

    @Override
    public void meth3() {
        System.out.println(getClass() + ", method name is: meth3");
    }
}
