package com.design.patterns.generating.abstract_factory;

public class CppCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("Compiling on c++...");
    }
}
