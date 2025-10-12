package com.design.patterns.generating.abstract_factory;

public class CppToolsFactory implements AbstractFactory {

    @Override
    public Validator createValidator() {
        return new CppValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new CppCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new CppDebugger();
    }
}
