package com.design.patterns.generating.abstract_factory;

public class JavaToolsFactory implements AbstractFactory {
    @Override
    public Validator createValidator() {
        return new JavaValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new JavaDebugger();
    }
}
