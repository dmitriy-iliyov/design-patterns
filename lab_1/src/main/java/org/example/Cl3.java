package org.example;

public class Cl3 implements If3{
    public Cl3(Cl1 cl1) {
        System.out.println(cl1);
    }

    @Override
    public void meth3() {
        System.out.println(getClass() + ", method name is: meth3");
    }
}
