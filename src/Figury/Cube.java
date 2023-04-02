package Figury;

public class Cube {
    private double a;
    private String name;

    public Cube(double a, String name) {
        this.a = a;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double pole(double a) {
        return 6*Math.pow(a,2);
    }

    public double objetosc(double a) {
        return Math.pow(a,3);
    }

    public void wypisz() {
        System.out.format("Figura sześcian o nazwie: %s, bok a %.2f, pole: %.2f, obwod: %.2f\n", getName(), getA(), pole(a), objetosc(a));
    }
}
