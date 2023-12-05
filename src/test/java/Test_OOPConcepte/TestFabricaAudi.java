package Test_OOPConcepte;

import java.util.List;

public class TestFabricaAudi extends TestFabricaMasina{

    public Integer pret;
    public List<String> dotariExterioare; // trebuie facut cu lista - pentru ca valorile sunt date de client dinafara
    //daca foloseam un hashmap - de stilul cheie-valoare , clientul trebuia sa spuna dotarea exterioara  dar si pretul cu care o vrea
    //cum clientul spune dotarea - si firma da pretul, folosim lista de valori pentru dotari


    public TestFabricaAudi(String model, String sasiu, String culoare, Integer motorizare,
                           Integer pret, List <String> dotariExterioare) {
        super("Audi", model, sasiu, culoare, motorizare);//sunt adusi parametrii din parinte -  super = daca ctrl+ click -> duce catre parinte
        this.pret = pret;
        this.dotariExterioare = dotariExterioare;
    }//proprietatile pentru copil se adauga manual, pentru ca el sa stie ca le adaugi la constructia de baza

    //vrem sa afisam componentele pentru Audi
    //ne putem folosi de actiunea de prezentare din parinte si mai adaugam

    public void prezentareAudi(){

        prezentareMasina(); //ea vine din parinte
        System.out.println("Pretul masinii este "+ pret);
        System.out.println("Dotarile exterioare sunt "+ dotariExterioare); // astfel le adaugam pe cele in plus care vin doar din copil


    }

}
