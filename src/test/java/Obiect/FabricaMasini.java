package Obiect;

import org.openqa.selenium.devtools.v85.network.model.InterceptionId;

public class FabricaMasini {

    // Constructor = Are ca rol sa initializeze atributele unei clase
    // Un constructor este public si are acelasi nume cu clasa
    //Un constructor poate s afie de 2 feluri : cu parametrii si fara parametrii
    //Un constructor fara parametrii se mai numeste si default
    // Daca nu am definit noi un constructor - avem unul default
    //Intr-o clasa putem avea n constructori diferentiati prin numar sau tip de parametrii

    // Obiect = instanta unei clase
    //un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective

    // Dintr-o clasa putem initializa 'n' obiecte
    //In momentul in care initializam un obiect, apelam constructorul din clasa
    //Initializarea se  face cu 'new'


    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;


    public FabricaMasini(String marca, String model, String combustibil,
                         String transmisie, Integer an, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }


    public FabricaMasini(String marca, String model, String combustibil, String transmisie,
                         Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareProdus(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Tipul combustibilului este " + combustibil);
        System.out.println("Tipul transmisiei este " + transmisie);
        System.out.println("Anul fabricatiei este " + an );
        System.out.println("Motorizarea este " + motorizare);
        if(pret != null){
        System.out.println("Pretul produsului este " + pret);}

    }

    public void calculImpozit(){
        if (an >= 2020 && combustibil.equals("Electric")){
            System.out.println("Clientul trebuie sa plateasca 5 lei");}
        else {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masinii");
        }
    }
}
 // de fiecare data cand vrei sa adaugi o caracteristica noua unui noi produs, fata de cele deja existente, creezi un nou constructor
// de fiecare data cand vrei sa scoti o caracteristica, la fel, se face un nou constructor