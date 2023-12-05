package VariabilaMetoda;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Cursant {
    //Comentariu se scrie cu 2x slash-uri
    //Clasa= un sablon specific unui obiect care contine variabile si metode
    //Identificam o clasa dupa cuvantul "class"
    //O clasa trenbuie sa aibe intotdeauna un nume
    //COntinutul unei clase se regaseste intre acolade
    //Intr-un fisier Java putem avea mai multe clase  "este recomandat sa fie o singura clasa pe fisier"
    //Variabila = proprietate a unei clase (nume, prenume, varsta, adresa, etc. al unui cursant)
    //Variabilele sunt de 2 feluri : global si local
    //Variabila globala = este vizibila peste tot in clasa
    //Variabila locala = este vizibila doar in locul declarat
    //Variabila globala = public+ tip de data + nume variabila
    //Variabila poate sau nu  sa primeasca o valoare
    //Metoda = actiunea unei clase
    //Intr-o clasa putem avea mai multe metode
    //Metodele sunt de 2 feluri: void si return
    //Void = Metoda care executa si arata actiunea
    //Return = metoda care returneaza actiunea

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areStudii;

    @Test
    public void metodaTest(){
     afisareDate();
     calculMedie("semetru 1",9.25,6.5);
     calculMedie("semetru 2",8.00,7.5);
     calculPret(10);
     calculPret(20);
    }
    public void afisareDate(){
        nume="Gologan";
        prenume="Claudia";
        varsta=37;
        adresa="Strada de test, nr.35, Timisoara";
        inaltime=1.62;
        greutate=52.3f;
        sex='F';
        areStudii=true;

        System.out.println("Numele cursantului este "+nume+' '+prenume); // println se pune intotdeauna primul
        System.out.println("Varsta cursantului este " + varsta); // println se pune intotdeauna primul
        System.out.println("Adresa cursantului este "+adresa);
        System.out.println("Greutatea cursantului este " + greutate);
        System.out.println("Sexul cursantului este "+ sex);
        System.out.println("Are cursantul studii?"+ areStudii);
    }

    public void calculMedie(String tipnote, Double nota1, Double nota2){

        Double rezultat= (nota1+ nota2)/2;
        System.out.println("Media examentelor pe "  +tipnote + " este " +rezultat);
    }
    public void calculPret(Integer reducere){ //<--- (Integer discount) inseamna ca e un parametru, paramentru a carei valoare se scrie sus la clasa
        Integer pret=1000;
        System.out.println("Pretul initial este "+ pret);
        Integer diferenta = (pret*reducere)/100;
        Integer pretFinal = pret - diferenta;
        System.out.println("Pretul final este "+ pretFinal);
    }

}
