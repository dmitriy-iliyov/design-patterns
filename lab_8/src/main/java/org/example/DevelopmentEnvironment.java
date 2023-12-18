package org.example;

public class DevelopmentEnvironment {
    private AbstractFactory factory;
    private Validator validator;
    private Compiler compiler;
    private Debugger debugger;

    public DevelopmentEnvironment(AbstractFactory factory) {
        this.factory = factory;
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
