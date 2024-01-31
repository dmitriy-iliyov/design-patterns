package org.example;


public abstract class ConnectionState {
    protected TCP tcp;

    public ConnectionState(TCP tcp) {
        this.tcp = tcp;
    }

    public abstract String listening();
    public abstract String established();
    public abstract String closed();
}