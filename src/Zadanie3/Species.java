package Zadanie3;

public class Species {
    private String GenusName;
    private String SpeciesName;

    private int NumberOfChromosomes2n;
    private int BaseNumberOfXChromosomes;
    private String Description;

    public Species(String genusName, String speciesName, int numberOfChromosomes2n, int baseNumberOfXChromosomes, String description) {
        GenusName = genusName;
        SpeciesName = speciesName;
        NumberOfChromosomes2n = numberOfChromosomes2n;
        BaseNumberOfXChromosomes = baseNumberOfXChromosomes;
        Description = description;
    }

    public String getGenusName() {
        return GenusName;
    }

    public void setGenusName(String genusName) {
        GenusName = genusName;
    }

    public String getSpeciesName() {
        return SpeciesName;
    }

    public void setSpeciesName(String speciesName) {
        SpeciesName = speciesName;
    }

    public int getNumberOfChromosomes2n() {
        return NumberOfChromosomes2n;
    }

    public void setNumberOfChromosomes2n(int numberOfChromosomes2n) {
        NumberOfChromosomes2n = numberOfChromosomes2n;
    }

    public int getBaseNumberOfXChromosomes() {
        return BaseNumberOfXChromosomes;
    }

    public void setBaseNumberOfXChromosomes(int baseNumberOfXChromosomes) {
        BaseNumberOfXChromosomes = baseNumberOfXChromosomes;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String FullName(){
        return GenusName+" "+SpeciesName;
    }
    public int HaploidChromosomes(){
        return NumberOfChromosomes2n/2;
    }
    public Species klonuj(){
        return new Species(getGenusName(),getSpeciesName(),getNumberOfChromosomes2n(),getBaseNumberOfXChromosomes(),getDescription());
    }
    public void WypiszFullName(){
        System.out.println("Pełna nazwa: "+FullName());
    }
    public void WypiszHaplo(){
        System.out.println(getGenusName()+" haploidalna liczba chromosomów: "+ HaploidChromosomes());
    }

    public void WypiszPelne(){
        System.out.println("Nazwa rodzaju: "+getGenusName()+", Nazwa gatunku: "+getSpeciesName());
        System.out.println("Liczba chromosomów 2n: "+getNumberOfChromosomes2n()+", Podstawowa liczba chromosomów: "+getBaseNumberOfXChromosomes());
        System.out.println("Opis: "+getDescription());
        System.out.println("------------------------------------------------------------");

    }

}
