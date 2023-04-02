package Figury;

public class Square {
    private double a;
    private String name;

    public Square(double a, String name) {
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
        return Math.pow(a,2);
    }

    public double obwod(double a) {
        return 4*a;
    }

    public void wypisz() {
        System.out.format("Figura kwadrat o nazwie: %s, bok a %.2f, pole: %.2f, obwód: %.2f\n", getName(), getA(), pole(a), obwod(a));
    }
}
