package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Pisica {
    @Test
    public void metodaTest() {
//        numecursantiArray();
//        numeCursantiLista();
//        obiecteHashmap();
        //tariOrase();
        reteteGatit("Tiramisu");
    }

    //afisam numele cursantiolor

    public void numecursantiArray() {
        String[] numeCursanti = new String[4]; // o multiume de stringuri in care poti introduce 3 elemente
        numeCursanti[0] = "Adrian";
        numeCursanti[1] = "Anca";
        numeCursanti[2] = "Andreea";
        numeCursanti[3] = "Claudia";

        for (Integer index = 0; index < numeCursanti.length; index++) { // .length dupa metoda indiferent cati cursanti mai vin, sunt inclusi
            System.out.println(numeCursanti[index]);
        }

    }

    public void numeCursantiLista() {
        List<String> numeCursantiLista = new ArrayList<>(); // listei nu trebuie sa ii dai dimensiuni, la array trebuie dat dimensiuni
        numeCursantiLista.add("Cosmin");
        numeCursantiLista.add("Diana");
        numeCursantiLista.add("Letitia");
        numeCursantiLista.add("Oana");

        for (Integer index = 0; index < numeCursantiLista.size(); index++) {
            System.out.println(numeCursantiLista.get(index));
        }
    }

    //hashmap = key-value . o multime mai complexa - key = valoare
    public void obiecteHashmap() {
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("Electronic", "Telefon"); // prima data se pune categoria (key), apoi valoarea
        obiecte.put("Aliment", "Supa");
        obiecte.put("Masina", "Ford");
        //pentru fiecare keye din lista de key// )
        for (String key : obiecte.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + obiecte.get(key));

        }

    }

    // repezentam niste tari cu orase

    public void tariOrase(){
        HashMap<String,List<String>>testData= new HashMap<>();

        List<String>oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Timisoara");
        oraseRomania.add("Cluj");

        List<String>oraseItalia =  new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Florenta");
        oraseItalia.add("Venetia");

        List<String>oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Sevillia");


        testData.put("Romania",oraseRomania);
        testData.put("Italia", oraseItalia);
        testData.put("Spania", oraseSpania);

        for (String key : testData.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt urmatoarele: " );

            List<String>oraseleCurente = testData.get(key);
            for (Integer index = 0; index < oraseleCurente.size(); index++) {
                System.out.println(oraseleCurente.get(index));
            }

        }

    }



    //definim retete de gatit

    public void reteteGatit(String reteta){
        HashMap<String, List<String>>carteBucate = new LinkedHashMap<>();

        List<String>ciorbaRadauteana = new ArrayList<>();
        ciorbaRadauteana.add("Morcovi - 2 bucati");
        ciorbaRadauteana.add("Ceapa - 3 bucati");
        ciorbaRadauteana.add("Telina - 1/2 bucati");
        ciorbaRadauteana.add("Smantana");
        ciorbaRadauteana.add("Galbenus ou");
        ciorbaRadauteana.add("Apa - 4l");
        ciorbaRadauteana.add("Carne de pui - 500g");
        ciorbaRadauteana.add("Sare si piper - dupa gust");

        List<String> tiramisu = new ArrayList<>();
        tiramisu.add("Piscoturi - 400 g");
        tiramisu.add("Mascarpone - 500 g");
        tiramisu.add("Cafea - 50 ml");
        tiramisu.add("Amaretto - 20 ml");
        tiramisu.add("Oua - 3 buc");
        tiramisu.add("Zahar - 3 linguri");

        carteBucate.put("Ciorba radauteana ", ciorbaRadauteana);
        carteBucate.put("Tiramisu", tiramisu);

        for (String key : carteBucate.keySet()) {
            if (key.equals(reteta)) {

                System.out.println("Reteta este pentru " + key);
                System.out.println("Ingredientele pentru reteta sunt urmatoarele: " + carteBucate.get(key));
            }
        }
    }


}

