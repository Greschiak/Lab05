package Figury;

public class Sphere {
    private double r;
    private String name;

    public Sphere (float r, String name) {
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

    public double pole(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    public double objetosc(double r){
        return (4*Math.PI*Math.pow(r,3)/3);
    }
    public void wypisz(){
        System.out.format("Figura kula o nazwie: %s, promień %.2f, pole: %.2f, obwód: %.2f\n",getName(),getR(),pole(r),objetosc(r));

    }
}
