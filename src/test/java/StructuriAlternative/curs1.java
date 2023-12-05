package StructuriAlternative;

import org.testng.annotations.Test;

public class curs1 {

    //structurile pot fi de 2 feluri: alternative si repetitive
    //structuri alternative: if... then...else, swith...case

    @Test
    public void testMethod() {
//        verificnumarMaiMare(9);
//        verificnumarMaiMare(10);
//        verificnumarMaiMare(-6);
//        verificnumarMaiMare(5);
//        verificnumarMaiMare(4);
//        verificnumarMaiMare(6);
//        verificNrPar(1);
//        verificNrPar(2);
//         verificNrPar(-10);
//        verificNrPar(0);
//        verificNrPar(-3);
//        verificNrPar(60000);
        verificamMajor(17);
        verificamMajor(18);
        verificamMajor(19);
    }

       //verificam daca un numar este mai mare decat 5
       public void verificnumarMaiMare(Integer nr){
           if (nr>5) {
               System.out.println("Numarul " +  nr + " este mai mare decat 5");
           }
           else {
               System.out.println(("Numarul " + nr + " este mai mic decat 5"));
           }
        }
        public void verificNrPar(Integer nr){
            if (nr>0){
                if(nr%2==0){
                    System.out.println(("Numarul " +  nr + "este par si pozitiv"));
                }
             else{
                    System.out.println("Numarul" +  nr + " este impar si pozitiv");
                }
        }
            else if (nr<0){
                if(nr%2==0){
                    System.out.println("Numarul " +  nr + "este par si negativ");
                }
            }
            else{
                System.out.println("Numarul este 0" );
            }
    }

    //verificam daca o persoana este majora
    public void verificamMajor(Integer varsta){
        if (varsta>=18){
            System.out.println("Persoana este majora");
        }
        else {
            System.out.println("Persoana nu este majora");
        }
    }
}
