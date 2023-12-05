package Tema;

import org.testng.annotations.Test;

public class TemaForArrayList {


    @Test
    public void metodaTest(){
        afisamRezultat(3,2,7);
        afisamdeMulteOri();
        numereDivizibile3();
        numereDivizibile5();
        primeleNumerePare();
        sumaNumerelor10();
    }

    public void afisamRezultat(Integer nr1, Integer nr2, Integer nr3){

        Integer sumaPrimeleNumere = nr1 + nr2;
        if( sumaPrimeleNumere > nr3){
            System.out.println("Suma numerelor: "+ sumaPrimeleNumere + "este mai mare decat "+ nr3);
        }
        else{
            System.out.println("Suma numerelor: "+ sumaPrimeleNumere + " nu este mai mare decat "+ nr3);
        }

    }
    public void afisamdeMulteOri(){
        Integer index;
        for(index=0; index<5;index++){
            System.out.println("DA");
        }
    }
    public void numereDivizibile3(){
        Integer x=0;
        for (Integer index=1;index<100; index++){
            if(index%3==0 && x<5){
                x++;
                System.out.println(index);
            }
        }
    }
    public void numereDivizibile5(){
        Integer b=0;
        for(Integer index=1; index<100; index++){
            if(index%5==0 && b<5){
                b++;
                System.out.println(index);
            }
        }
    }
    public void primeleNumerePare(){
        Integer c=0;
        for(Integer index=1; index<100; index++){
            if(index%2==0 && c<4){
                c++;
                System.out.println(index);

            }
        }
    }
    public void sumaNumerelor10(){
        Integer index=0;
        Integer sumaNumere=index;
        while (index<=10){
            sumaNumere=sumaNumere+index;
            index++;
        }
        System.out.println("Suma numerelor este egala cu "+ sumaNumere);

    }
////    public void sumaNumerelorReint() {
////        Integer d
////        for (Integer index = 0; index < 10; index++) {
//
//
//
//        }
//    }
}
