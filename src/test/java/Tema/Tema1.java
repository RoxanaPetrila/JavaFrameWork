package Tema;

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Tema1 {
    String salutare;
    Integer varsta;
    String  nume;
    String prenume;

    @Test
    public void metodaTest(){
        afisareConsola("Buna ziua", 30, "Anton", "Petru");
        incercareaDoi("QA", 1.5, "DA");
        getrezultat();
        afisareSuma(1.3, 3.4, 5.6);

    }
    public void afisareConsola(String salutare, Integer varsta,String nume, String prenume){
        String salutaLumea=salutare;
        Integer varstaMea=varsta;
        String numelemeu=nume;
        String prenumeleMeu=prenume;


        System.out.println(salutare);
        System.out.println("Varsta mea este " + varsta);
        System.out.println("Numele mesu este "+ nume);
        System.out.println("Prenumele meu este " + prenume);

    }
    public void incercareaDoi(String Job, Double AniLaJob, String Multumit){
        String loculMeuDeMunca=Job;
        Double VechimeMunca = AniLaJob;
        String MultumitDeConditii =Multumit;
        System.out.println("Job-ul meu acutal este "+ Job);
        System.out.println("Lucrez aici de " + AniLaJob );
        System.out.println("Esti multumit de conditii "+ Multumit);
    }
    public void getrezultat(){
        Integer rezultat =(2+(3*4)-3)/3;
        System.out.println("Rezultatul corect este "+ rezultat);
    }
    public void afisareSuma(Double numar1, Double numar2, Double numar3){
        Double Suma = numar1 + numar2+ numar3;
        System.out.println(Suma);
    }
    public void getProdusNumere(Integer n1, Integer n2){
        Integer produs = n1 * n2;
        System.out.println("Produsul numerelor intregi este " + produs);
    }

}
