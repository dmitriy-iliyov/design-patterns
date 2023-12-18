package org.example;

public interface AbstractFactory {
    Validator createValidator();
    Compiler createCompiler();
    Debugger createDebugger();
}
