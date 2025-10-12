package com.design.patterns.generating.builder;

public class Truck {

    private final String owner;
    private final String stsNumber;
    private final int year;
    private final String trailer;
    private final String driver;
    private final int loadCapacity;

    private Truck(Builder builder){
        this.owner = builder.owner;
        this.stsNumber = builder.stsNumber;
        this.year = builder.year;
        this.trailer = builder.trailer;
        this.driver = builder.driver;
        this.loadCapacity = builder.loadCapacity;
    }

    public static Builder builder(){
        return new Builder();
    }

    public String getOwner() {
        return owner;
    }

    public String getStsNumber() {
        return stsNumber;
    }

    public int getYear() {
        return year;
    }

    public String getTrailer() {
        return trailer;
    }

    public String getDriver() {
        return driver;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "owner='" + owner + '\'' +
                ", stsNumber='" + stsNumber + '\'' +
                ", year=" + year +
                ", trailer='" + trailer + '\'' +
                ", driver='" + driver + '\'' +
                ", loadCapacity=" + loadCapacity +
                '}';
    }

    public static class Builder {

        private String owner;
        private String stsNumber;
        private int year;
        private String trailer;
        private String driver;
        private int loadCapacity;

        public Builder owner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder stsNumber(String stsNumber){
            this.stsNumber = stsNumber;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder trailer(String trailer) {
            this.trailer = trailer;
            return this;
        }

        public Builder driver(String driver) {
            this.driver = driver;
            return this;
        }

        public Builder loadCapacity(int loadCapacity) {
            this.loadCapacity = loadCapacity;
            return this;
        }

        public Truck build(){
            return new Truck(this);
        }
    }
}
