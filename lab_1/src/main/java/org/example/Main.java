package org.example;

public class Main {
    public static void main(String[] args) {
        Cl1 cl1 = new Cl1();
        cl1.meth1();
        cl1.meth3();
        Cl2 cl2 = new Cl2();
        cl2.meth2();
        cl2.meth3();
        Cl3 cl3 = new Cl3(cl1);
        cl3.meth3();
        I3 i3 = new I3(cl2,"name1");
        System.out.println(i3.getName());
        I2 i2 = new I2(cl3);
        I4 i4 = new I4(cl2, "name2");
        System.out.println(i4.getName());

    }
}