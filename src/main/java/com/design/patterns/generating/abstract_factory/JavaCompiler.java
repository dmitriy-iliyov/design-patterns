package org.example;

public class JavaCompiler implements Compiler{
    @Override
    public void compile() {
        System.out.println("Compiling on java...");
    }
}
