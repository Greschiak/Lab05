package Figury;
public class Cone {
    private double r;
    private double l;
    private double h;
    private String name;

    public Cone (double r,double l,double h, String name) {
        this.r = r;
        this.l = l;
        this.h = h;
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double pole(double r, double l){ return Math.PI*Math.pow(r,2) + Math.PI*r*l;}
    public double objetosc(double r,double h){ return (Math.PI*Math.pow(r,2)*h)/3;}
    public void wypisz(){
        System.out.format("Figura stożek o nazwie: %s, promień %.2f, tworzaca %.2f, wysokosc %.2f, pole: %.2f, objetosc: %.2f\n",getName(),getR(),getL(),getH(),pole(r,l),objetosc(r,h));

    }
}
