package Test_OOPConcepte;

public class TestFabricaMasina {

    public String marca;
    public String model;
    public String sasiu;
    public String culoare;
    public Integer motorizare;

    public TestFabricaMasina(String marca, String model, String sasiu, String culoare, Integer motorizare) {
        this.marca = marca;
        this.model = model;
        this.sasiu = sasiu;
        this.culoare = culoare;
        this.motorizare = motorizare;
    }

    //this-urile pointeaza catre variabilele globale (de sus) daca au acelasi nume

    public void prezentareMasina(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Sasiul masinii este " + sasiu);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Motorizarea masinii este "+ motorizare);

    }
}
