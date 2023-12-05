package OOPConcepte;

import javax.swing.*;
import java.util.List;

public class FabricaAudi extends FabricaMasina {

    public Integer pretStandard;
    public Integer pretFinal;
    public List<String> dotariExterioare;


    public FabricaAudi( String model, String sasiu, String culoare,
                       Integer motorizare, List <String> dotariExterioare) {
        super("Audi", model, sasiu, culoare, motorizare);         //ca sa apelam constructorul parinte in clasa copil ->  vom folosi "super"

        this.dotariExterioare = dotariExterioare;
    }


    public void prezentareAuid(){

        prezentareMasina();
        definirePretModel();
        calculPretFinal();
        if(dotariExterioare == null){
            System.out.println("Pretul standard este  " +  pretStandard);
        }
        else {
            System.out.println("Pretul standard este: " + pretStandard);
            System.out.println("Pretul final este " + pretFinal);
        }
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);

    }
    public void definirePretModel(){
        switch (getModel()){
            case "A5":
                pretStandard = 40000;
                break;
            case "A7":
                pretStandard=80000;
                break;
            default:
                System.out.println("Nu mai avem pe stoc acest model");

        }
    }

    public void calculPretFinal(){
        Integer pretDotari = 0;
        for(Integer i=0; i<dotariExterioare.size(); i++){
            switch (dotariExterioare.get(i)){
                case "jante":
                    pretDotari= pretDotari + 500;
                    break;
                case "trapa":
                    pretDotari = pretDotari + 900;
                    break;
                case "faruri":
                    pretDotari= pretDotari + 1200;
                    break;
                case "spoiler":
                    pretDotari = pretDotari + 650;
                    break;
                case "oglinzi electrice":
                    pretDotari = pretDotari +2000;

            }

        }
        pretFinal = pretStandard + pretDotari;
    }


    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    //subprascriem metoda angajatri din parinte - propria implementare a fabricii cu acelasi nume

    public void angajariFirma(){
        System.out.println("Fabrica Audi are 4 locuri disponibile");

    }

    //polimorfism static

    public void afisareRezultate(){
        System.out.println("Fabrica a facut 15 masini");

    }




}


