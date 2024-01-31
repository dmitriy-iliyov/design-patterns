package org.example;

public class EstablishedState extends ConnectionState {

    public EstablishedState(TCP tcp) {
        super(tcp);
    }

    @Override
    public String listening() {
        return "Connection is already in ESTABLISHED state.";
    }

    @Override
    public String established() {
        return "Connection is already in ESTABLISHED state.";
    }

    @Override
    public String closed() {
        tcp.setState(new ClosedState(tcp));
        return "Connection closed.";
    }
}
