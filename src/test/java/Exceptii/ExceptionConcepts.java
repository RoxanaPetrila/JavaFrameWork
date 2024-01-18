package Exceptii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcepts{
    //Exceptie= eroare care apare in momentul cand programul ruleaza
    //Exceptiile trebuie tratate deoarece pot sa contina informatii din interior care pot sa fie exploatate
    //Poate sa apara o exceptie cand vrem sa citim un fisier
    //Citim datele dintr-un tabel din DB care nu exista
    //Exceptiile sunt de 2 tipuri:
    //a) checked
    //b) unchecked
    //CHECKED: exceptii care se trateaza in timpul compilarii
    //- acest tip de exceptii mostenesc clasa Exception
    //UNCHECKED: exceptii care nu se trateaza in timpul compilarii (dupa compilare)
    //acest tip de exceptii mostenesc clasa Runtime Exception
    //exista 2 keyword foarte importante pentru a trata exceptiile: THROW si THROWS
    //Orice tip de exceptie se trateaza folosind structura try.. catch..finally

    //CHECKED:
    public void checkedExample(String path){

        //vrei sa incarci un fisier pe care speri sa il gasesti la o anumita adresa
        //din fiseier vrei sa scoti continutul -> un obiect de tipul FileInputStram
        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("Am gasit fisierul.");
        }
        catch(FileNotFoundException exception){
            System.out.println("A intrat pe clauza catch.");
        }
        finally{
            System.out.println("A mai incercat odata sa gaseasca fisierul.");
        }
    }

    public void uncheckedExampleV1(){
        System.out.println("Acest cod o sa produca o exceptie.");
        Integer calcul = 7/0;
        System.out.println(calcul);
    }

    public void uncheckedExampleV2(){
        String [] colegi = new String [2]; // el vede dimensiunea cum o vedem noi, incepe de la 1, nu de la 0
        //multime care permite 3 elemente
        colegi[0]="Alin";
        colegi[1]="Alin";
        colegi[2]= "Alin";
        System.out.println("Acest cod o sa produca o exceptie");
        for (Integer index =0; index<colegi.length; index++){
            System.out.println(colegi[index]);
        }

    }
    // THROW: keyword folosit sa arunce o exceptie specifica:
    //se regaseste in interiorul unei metode


    public void verificaVarsta(Integer varsta){
        if(varsta <18){
            throw new RuntimeException("Nu primesti tigari pentru ca esti minor.");
                    }
        else{
            System.out.println("Primesti pentru ca esti major");
        }
    }
    //THROWS: este un keyword folosit in semnatura metodei ca sa arate faptul ca o metoda poate sa atunce o exceptie
    // poate sa fie urmat de o multime de exceptii delimitate cu vigula

    public void throwsExample(String path) throws FileNotFoundException {
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("Am gasit fisierul.");
    }


}
