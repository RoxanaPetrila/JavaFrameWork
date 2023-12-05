package OOPConcepte;

public class FabricaMasina {


    //OOP = programare orientata obiecte
    // 4 Principii =
    //1 . MOSTENIRE  2. INCAPSULARE 3. ABSTRACTIZARE  4. POLIMORFISM
    //1. MOSTENIREA - conceptul prin care clasa parinte este mostenita de clasa copil
    //In Java o clasa poate sa mosteneasca o singura calasa (clasa A mosteneste doar clasa B, nu poate clasa B si C)
    //Clasa copil trebuie sa apeleze constructorul (sablonul) din clasa parinte
    //copilul are vizibilitate asurpta metodelor / variabilelor din parinte daca sunt publice / protected


    //INCAPUSARE:
    //Access Control: public, private, protected, default
    //Public = ofera vizbililitate pentru oricine si oriunde in tot proiectul
    //Provate = ofera vizibilitate doar in interiorul clasei. Daca pui restrictii in parinte si le faci private - copii nu le pot vedea/ folosi

    //POLIMORFISM:
    //conceptul prin care o metoda poate suferi modificari la nivel de continut sau structura
    //este de  2 feluri - 1. dinamic(override) 2. static (overload)
    //Polimorfism Dinamic = intr-o ierarhie de clase extinse prin mostenire, o metoda poate implementari diferite
    //Polimorism Static = mai multe metode pot avea acelasi nume, cu conditai sa se diferentieze prin numar sau tip de parametrii
    //polimorfirmaul nu se poate aplica pe metodele cu return -- doar la cele cu void

    // polimofrism dinamic

    public void angajariFirma(){
        System.out.println("Fabrica nu mai face angajari");
    }




    private String marca;
    private String model;
    private String sasiu;
    private  String culoare;
    private Integer motorizare;

    //se face un constructor


    public FabricaMasina(String marca, String model, String sasiu, String culoare, Integer motorizare) {
        this.marca = marca;
        this.model = model;
        this.sasiu = sasiu;
        this.culoare = culoare;
        this.motorizare = motorizare;
    }

    public void prezentareMasina(){
        System.out.println("marca masinii este " + marca);
        System.out.println("modelul masinii este " + model);
        System.out.println("sasiul masinii este " + sasiu);
        System.out.println("culoarea masinii este " + culoare);
        System.out.println("motrul masinii este " + motorizare);



    }

    //ca sa accesam valoarea unei variabile cu private ne folosim de conceptul GET
    //ca sa modificam valoarea unei variabile cu private ne folosim de concepul SET


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(Integer motorizare) {
        this.motorizare = motorizare;
    }
}
