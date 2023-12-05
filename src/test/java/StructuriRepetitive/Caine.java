package StructuriRepetitive;

import org.testng.annotations.Test;

public class Caine {

    //Structuri repetitive= for , while, for each

    @Test
    public void metodaTest(){
  //      afisareNumereFor();
//        afisareNumereWhile();
//        afisareNume();
//        sumaNumereMetoda();
        afisareNrDivizibil();
    }

    //Afisam primele 10 numere folosind-une de for (for e cu un nr finit de pasi)
    public void afisareNumereFor (){
        for (Integer index=0;index<10; index++){   //de la cat pornest, pana unde mergi, din cat in cat index++ = creste cu 1
            System.out.println(index);   //pe cine chemi? pe index
        }

    }

    public void afisareNumereWhile(){
        Integer index=0;
        while (index<10){
            System.out.println(index);
            index++;
        }
    }

    //afisam numele nostru de 5 ori
    public void afisareNume(){
        for (Integer index=0; index <5; index++){
            System.out.println("Roxana");
        }
    }

    //calculam suma primelor 10 numere
    public void sumaNumereMetoda(){
        Integer index=0;
        Integer sumaNumere = index;

        while (index<=10){
            sumaNumere=sumaNumere+index;
            index++;

        }
        System.out.println("Suma numerelor este " + sumaNumere);
    }

    //afisam primele 3 numere divizibile cu 5

    public void afisareNrDivizibil(){
        Integer a=0; // mai construim o valiabila care cand gaseste un nr div cu 5, incrementeaza valoarea lui a
        for(Integer index = 0; index <21; index++){
            if (index%5==0 && a<3){
                a++;
                System.out.println(index);
            }
//            if (a==3){
//                break;
//        }
        }
    }

}
