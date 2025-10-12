package com.design.patterns.generating.abstract_factory;

public interface AbstractFactory {
    Validator createValidator();
    Compiler createCompiler();
    Debugger createDebugger();
}
