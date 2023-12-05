package OOPConcepte;

import java.util.List;

public class FabricaBMW extends FabricaMasina {

    private Integer pretStandard;
    private Integer pretFinal;
    private List<String> dotariExterioare;
    private List<String> dotariInerioare;

    public FabricaBMW( String model, String sasiu, String culoare, Integer motorizare, List<String> dotariExterioare, List<String> dotariInerioare) {
        super("BMW", model, sasiu, culoare, motorizare);
            this.dotariExterioare = dotariExterioare;
             this.dotariInerioare = dotariInerioare;
    }
    public void prezentareBMW(){
        prezentareMasina();
        definirePretModel();
        pretFinal = pretStandard + calculPretDotariInterioare() + calculPretDotariExterioare();

        System.out.println("pretul standard este " + pretStandard);
        System.out.println("Pretul final este " + pretFinal );
    }
    public void definirePretModel(){
        switch(getModel()){
            case "X5":
                pretStandard = 80000;
                break;
            case "X7":
                pretStandard =90000;
                break;
            default:
                System.out.println("Nu mai avem acest model pe stoc.");
        }
    }

    public Integer calculPretDotariExterioare(){
        Integer pretDotariExterioare =0;
        for(Integer i=0; i<dotariExterioare.size(); i++){
            switch(dotariExterioare.get(i)){
                case "jante":
                    pretDotariExterioare=pretDotariExterioare+500;
                    break;
                case"trapa":
                    pretDotariExterioare=pretDotariExterioare+900;
                    break;
                case"faruri":
                    pretDotariExterioare=pretDotariExterioare+1200;
                    break;
                case "oglinzi electrice":
                    pretDotariExterioare=pretDotariExterioare+650;
                case "spoiler":
                    pretDotariExterioare=pretDotariExterioare+2000;
            }
        }
        return pretDotariExterioare;
    }
    public Integer calculPretDotariInterioare(){
        Integer pretDotariInterioare =0;
        for(Integer i=0; i<dotariInerioare.size(); i++){
            switch(dotariInerioare.get(i)){
                case "incalzire scaune":
                    pretDotariInterioare=pretDotariInterioare+500;
                    break;
                case"clima bizonica":
                    pretDotariInterioare=pretDotariInterioare+900;
                    break;
                case"GPS":
                    pretDotariInterioare=pretDotariInterioare+1200;
                    break;
                case "Tetiera cu masaj":
                    pretDotariInterioare=pretDotariInterioare+650;
                case "display parbriz":
                    pretDotariInterioare=pretDotariInterioare+2000;
            }
        }
        return pretDotariInterioare;
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

    public List<String> getDotariInerioare() {
        return dotariInerioare;
    }

    public void setPretStandard(Integer pretStandard) {
        this.pretStandard = pretStandard;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public void setDotariInerioare(List<String> dotariInerioare) {
        this.dotariInerioare = dotariInerioare;
    }

    public void angajariFirma(){
        System.out.println("Nu sunt posturi la fabrica BMW");
        super.angajariFirma();

    }
}
