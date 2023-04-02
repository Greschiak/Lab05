package Zadanie2;

import java.time.LocalDate;

public class Building {
    private int YearOfContruction;
    private int NumberOfFloors;
    private String Name;
    public Building(int YearOfContruction, int NumberOfFloors, String Name){
        this.YearOfContruction = YearOfContruction;
        this.NumberOfFloors = NumberOfFloors;
        this.Name = Name;
    }

    public int getYearOfContruction() {
        return YearOfContruction;
    }

    public void setYearOfContruction(int yearOfContruction) {
        YearOfContruction = yearOfContruction;
    }

    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int HowOld() {
        int CurrentYear = LocalDate.now().getYear();
        return CurrentYear - YearOfContruction;
    }
    public void Wypisz() {
        System.out.println("Nazwa budynku: " + getName()+ ", Rok budowy: "+ getYearOfContruction() + ", Liczba pięter: "+getNumberOfFloors()+", Wiek budynku: "+ HowOld()+" lat");

    }



}
