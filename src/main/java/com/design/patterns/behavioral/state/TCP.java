package org.example;

public class TCP {

    public ConnectionState connectionState;

    public TCP(){
        connectionState = new ListeningState(this);
    }

    public void setState(ConnectionState connectionState){
        this.connectionState = connectionState;
    }

    public String openConnection(){
        return connectionState.listening();
    }
    public String establishedConnection(){
        return connectionState.established();
    }
    public String closeConnection(){
        return connectionState.closed();
    }
}
