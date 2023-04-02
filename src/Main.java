import Figury.*;
import Zadanie2.Building;
import Zadanie3.Species;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public  static void main(String[] args) {



        int NumerZadania;
         do{
            System.out.print("\n--------------------------------------------------------------------------\n");
            System.out.print("Wybierz numer zadania\n");
            System.out.print("1. Zadanie 1\n");
            System.out.print("2. Zadanie 2\n");
            System.out.print("3. Zadanie 3\n");
            System.out.print("0. Wyjdz z programu \n");
             NumerZadania = WprowadzanieInt();
            switch (NumerZadania) {
                case 1:
                    run1();
                    break;
                case 2:
                    run2();
                    break;
                case 3:
                    run3();
                    break;
                case 0:
                    Close();
                    break;
                default:
                    System.out.println("Nieprawidłowy numer zadania.");
                    break;

            }
        }while(true);
    }



    public static void  run1(){
        Circle circle = new Circle(3,"Koło 1");
        Cone cone = new Cone(4,8,7,"Stożek 1");
        Cube cube = new Cube(3,"Sześcian 1");
        Cuboid cuboid = new Cuboid(3,4,5,"Prostopadłościan 1");
        Rectangle rectangle = new Rectangle(3,3,"Prostoka 1");
        Sphere sphere = new Sphere(3,"Kula 1");
        Square square = new Square(3,"Kwadrat 1");



        Menu1();
        int wybor;
        do{
            wybor = WprowadzanieInt();
            switch (wybor){
                case 1:
                    EditCircle(circle);
                    break;
                case 2:
                    EditCone(cone);
                    break;
                case 3:
                    EditCube(cube);
                    break;
                case 4:
                    EditCuboid(cuboid);
                    break;
                case 5:
                    EditRectangle(rectangle);
                    break;
                case 6:
                    EditSphere(sphere);
                    break;
                case 7:
                    EditSquare(square);
                    break;
                default:
                    System.out.println("Nieprawidłowy numer zadania");
            }
            Menu1();
        }while (wybor != 0);


    }
    public static void run2(){
        Building[] Tablica = new Building[7];

        Tablica[0] = new Building(1899,12,"Stary budynek");
        Tablica[1] = new Building(2010,22,"Nowy Budynek");
        Tablica[2] = new Building(2006,37,"Wysoki budynek");
        Tablica[3] = new Building(1331,2,"Bardzo stary budynek");
        Tablica[4] = new Building(2021,20,"Bardzo nowy budynek");
        Tablica[5] = new Building(1991,3,"Niski budynek");
        Tablica[6] = new Building(1997,1,"Bardzo niski budynek");

        for (int i = 0; i < Tablica.length; i++) {
            Tablica[i].Wypisz();
        }
        Menu2(Tablica);
        int wybor;
        do{
            wybor = WprowadzanieInt();
            if(wybor>=1 && wybor <8)
                Editbuilding(Tablica[wybor-1]);
            else
                System.out.println("Zły przedział");

            Menu2(Tablica);
        }while (wybor != 0);


    }
    public static void run3(){

        ArrayList<Species> speciesList = new ArrayList<Species>();
        speciesList.add(new Species("Pies","domowy",
                58, 2,
                "udomowiony gatunek ssaka drapieżnego z rodziny psowatych (Canidae)."));
        speciesList.add(new Species("Mysz","domowa",
                40,1,"gatunek małego ssaka należącego do rodziny myszowatych."));
        speciesList.add(new Species("Kot","domowy",
                38,1,"udomowiony gatunek ssaka z rzędu drapieżnych z rodziny kotowatych."));


        Menu3();
        int wybor;
        do{
            wybor = WprowadzanieInt();
            switch (wybor){
                case 1:
                    for (Species element: speciesList) {
                        element.WypiszFullName();

                    }
                    break;
                case 2:
                    for (Species element: speciesList) {
                        element.WypiszHaplo();
                    }
                    break;
                case 3:
                    for (Species element: speciesList) {
                        element.WypiszPelne();
                    }
                    break;
                case 4:
                    Klonowanie(speciesList);

                    break;
                default:
                    System.out.println("Nieprawidłowy numer zadania");

            }


            Menu3();
        }while (wybor != 0);

    }

    public static String WprowadzanieString(){
        Scanner wprowadzanie = new Scanner(System.in);
        String napis = wprowadzanie.next();
        return napis;
    }
    public static int WprowadzanieInt(){
        Scanner wprowadzanie = new Scanner(System.in);
        int liczba = wprowadzanie.nextInt();
        return liczba;
    }
    public static float WprowadzanieFloat(){
        Scanner wprowadzanie = new Scanner(System.in);
        float liczba = wprowadzanie.nextFloat();
        return liczba;
    }
    public static void EditCircle(Circle circle){
        System.out.print("Wprowadź r: ");
        float r = WprowadzanieFloat();
        circle.setR(r);
        System.out.print("Wprowadź nazwę: ");
        String nazwa = WprowadzanieString();
        circle.setName(nazwa);
        circle.wypisz();

    }
    public static void EditCone(Cone cone){
        System.out.print("Wprowadź r: ");
        float r = WprowadzanieFloat();
        cone.setR(r);
        System.out.print("Wprowadź l: ");
        float l = WprowadzanieFloat();
        cone.setL(l);
        System.out.print("Wprowadź h: ");
        float h = WprowadzanieFloat();
        cone.setH(h);
        System.out.print("Wprowadź nazwę: ");
        String nazwa = WprowadzanieString();
        cone.setName(nazwa);
        cone.wypisz();

    }
    public static void EditCube(Cube cube){
        System.out.print("Wprowadź a: ");
        float a = WprowadzanieFloat();
        cube.setA(a);
        System.out.print("Wprowadź nazwę: ");
        String nazwa = WprowadzanieString();
        cube.setName(nazwa);
        cube.wypisz();

    }
    public static void EditCuboid(Cuboid cuboid){
        System.out.print("Wprowadź a: ");
        float a = WprowadzanieFloat();
        cuboid.setA(a);
        System.out.print("Wprowadź b: ");
        float b = WprowadzanieFloat();
        cuboid.setB(b);
        System.out.print("Wprowadź c: ");
        float c = WprowadzanieFloat();
        cuboid.setC(c);
        System.out.print("Wprowadź nazwę: ");
        String nazwa = WprowadzanieString();
        cuboid.setName(nazwa);
        cuboid.wypisz();
    }
    public static void EditRectangle(Rectangle rectangle){
        System.out.print("Wprowadź a: ");
        float a = WprowadzanieFloat();
        rectangle.setA(a);
        System.out.print("Wprowadź b: ");
        float b = WprowadzanieFloat();
        rectangle.setB(b);
        System.out.print("Wprowadź nazwę: ");
        String nazwa = WprowadzanieString();
        rectangle.setName(nazwa);
        rectangle.wypisz();
    }
    public static void EditSphere(Sphere sphere){
        System.out.print("Wprowadź r: ");
        float r = WprowadzanieFloat();
        sphere.setR(r);
        System.out.print("Wprowadź nazwę: ");
        String nazwa = WprowadzanieString();
       sphere.setName(nazwa);
        sphere.wypisz();
    }
    public static void EditSquare(Square square){
        System.out.print("Wprowadź a: ");
        float a = WprowadzanieFloat();
        square.setA(a);
        System.out.print("Wprowadź nazwę: ");
        String nazwa = WprowadzanieString();
        square.setName(nazwa);
       square.wypisz();
    }
    public static void Editbuilding(Building buildingX){
        System.out.print("Wprowadź nazwę: ");
        String nazwa = WprowadzanieString();
        buildingX.setName(nazwa);
        System.out.print("Wprowadź rok budowy: ");
        int Rok = WprowadzanieInt();
        buildingX.setYearOfContruction(Rok);
        System.out.print("Wprowadź liczbę pięter: ");
        int Pietra = WprowadzanieInt();
        buildingX.setNumberOfFloors(Pietra);
        buildingX.Wypisz();


    }
    public static void Klonowanie( ArrayList<Species> speciesList){
        int index = 1;
        for (Species element: speciesList) {
            System.out.print((index++)+". ");
            element.WypiszPelne();
        }
        System.out.println("Który sklonować?");
        int wybor = WprowadzanieInt();
        if(wybor >=1 && wybor <= speciesList.stream().count()){
            speciesList.add(speciesList.get(wybor-1).klonuj());
        }

    }




    public static void Menu1() {
        System.out.println("Wybierz jaką firgurę chcesz obliczyć");
        System.out.println("1. Koło");
        System.out.println("2. Stożek");
        System.out.println("3. Sześcian");
        System.out.println("4. Prostopadłościan");
        System.out.println("5. Prostokąt");
        System.out.println("6. Kula");
        System.out.println("7. Kwadrat");
        System.out.println("0. Powrót do wyboru zadań");
    }
    public static void Menu2(Building[] tab){
        System.out.println("---------------------------------------------");
        System.out.println("Wybierz, który budynek chcesz modifikować");
        for (int i = 0; i < tab.length; i++) {
            System.out.println((i+1)+". "+tab[i].getName());

        }
        System.out.println("0. Powrót do wyboru zadań");
    }
    public static void Menu3(){
        System.out.println("---------------------------------------------");
        System.out.println("1. Wyświetlenie pełnej nazwy");
        System.out.println("2. Wyświetlenie haploidalnej liczby chromosmów n");
        System.out.println("3. Wyświetlanie wszytckich danych");
        System.out.println("4. Klonowanie");
        System.out.println("0. Powrót do wyboru zadań");
    }


    public static void Close() {
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc t || T");
        String znak = WprowadzanieString();
        String st1="t";
        String st2="T";
        if (znak.equals(st1) || znak.equals(st2) ) System.exit(0);
    }
}
