package com.design.patterns.behavioral.state;

public class ClosedState extends ConnectionState {

    public ClosedState(TCP tcp) {
        super(tcp);
    }

    @Override
    public String listening() {
        tcp.setState(new ListeningState(tcp));
        return "Connection opened.";
    }

    @Override
    public String established() {
        return "Cannot establish connection in CLOSED state.";
    }

    @Override
    public String closed() {
        return "Connection is already in CLOSED state.";
    }
}
