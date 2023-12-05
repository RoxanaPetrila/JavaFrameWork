package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    @Test
    public void metoda_test(){
        //getMarire();
        System.out.println("Valoarea salatului dupa marire este "+ getMarire(20));
        calculMedie(5.6,8.3,"semestrul 1");

    }

    //metoda care calculeaza salarul unei persoane dupa o marire
    public Integer getMarire(Integer procent){
        Integer salar=15000;
        Integer marire=(salar*procent)/100;
       // Integer salarFinal=salar+marire;
        return salar+marire;
    }

    public Double getMedie(Double nota1, Double nota2){
        return (nota1+nota2)/2;
    }
    public void calculMedie(Double nota1, Double nota2, String text){
        System.out.println("Media pe "+ text+ " este "+ getMedie(nota1,nota2));
    }

}
