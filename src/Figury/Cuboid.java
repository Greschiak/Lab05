package Figury;

public class Cuboid {
    private double a;
    private double b;
    private double c;
    private String name;

    public Cuboid(double a,double b,double c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double pole(double a, double b,double c) {
        return 2*(a*b+a*c+b*c);
    }

    public double objetosc(double a,double b,double c) {
        return 2*a+2*b;
    }

    public void wypisz() {
        System.out.format("Figura Prostopadlościan o nazwie: %s, bok a %.2f, bok b %.2f, pole: %.2f, objętość: %.2f\n", getName(), getA(),getB(), pole(a,b,c), objetosc(a,b,c));
    }
}
