package org.example;

public class CircleAdapter extends Circle{
    private Point center;
    public CircleAdapter(int radius, Point center) {
        super(radius);
        this.center = center;
        setPhi();
        setRo();
    }

    private void setPhi() {
        this.phi = Math.atan((double) center.getY() /center.getX());
    }

    private void setRo() {
        this.ro = Math.sqrt(center.getX()*center.getX()+center.getY()*center.getY());
    }

}
