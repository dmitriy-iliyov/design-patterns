package com.design.patterns.generating.abstract_factory;

public class DevelopmentEnvironment {

    private Validator validator;
    private Compiler compiler;
    private Debugger debugger;

    public DevelopmentEnvironment(AbstractFactory factory) {
        this.compiler = factory.createCompiler();
        this.validator = factory.createValidator();
        this.debugger = factory.createDebugger();
    }

    public void doSomething(){
        compiler.compile();
        validator.validate();
        debugger.debug();
    }
}
