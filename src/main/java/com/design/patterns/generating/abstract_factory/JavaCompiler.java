package com.design.patterns.generating.abstract_factory;

public class JavaCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("Compiling on java...");
    }
}
