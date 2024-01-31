package org.example;

public class ListeningState extends ConnectionState{

    public ListeningState(TCP tcp) {
        super(tcp);
    }

    @Override
    public String listening() {
        return "Connection is already in LISTENING state.";
    }

    @Override
    public String established() {
        tcp.setState(new EstablishedState(tcp));
        return "Connection established.";
    }

    @Override
    public String closed() {
        tcp.setState(new ClosedState(tcp));
        return "Connection closed.";
    }
}
