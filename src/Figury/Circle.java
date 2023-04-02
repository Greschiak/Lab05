package Figury;

public class Circle {
    private double r;
    private String name;

    public Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double pole(double r){ return Math.PI*Math.pow(r,2);}
    public double obwod(double r){ return 2*Math.PI*r;}
    public void wypisz(){
        System.out.format("Figura koło o nazwie: %s, promień %.2f, pole: %.2f, obwod: %.2f \n",getName(),getR(),pole(r),obwod(r));

    }
}
