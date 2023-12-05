package OOPConcepte;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test

    public void testMethod(){

        List<String> dotariAudiA5 = new ArrayList<>();
        dotariAudiA5.add("jante");
        dotariAudiA5.add("trapa");
        dotariAudiA5.add("faruri");

        List<String> dotariAudiA7 = new ArrayList<>();
        dotariAudiA7.add("jante");
        dotariAudiA7.add("trapa");
        dotariAudiA7.add("spoiler");
        dotariAudiA7.add("oglinzi electrice");

        List<String> dotariBMWX5Interior = new ArrayList<>();
        dotariBMWX5Interior.add("incalzire scaune");
        dotariBMWX5Interior.add("clima bizonica");
        dotariBMWX5Interior.add("GPS");

        List<String> dotariBMWX5Exterior = new ArrayList<>();
        dotariBMWX5Exterior.add("jante");
        dotariBMWX5Exterior.add("trapa");
        dotariBMWX5Exterior.add("spoiler");
        dotariBMWX5Exterior.add("oglinzi electrice");

        List<String> dotariBMWX7Exterior = new ArrayList<>();
        dotariBMWX7Exterior.add("jante");
        dotariBMWX7Exterior.add("trapa");
        dotariBMWX7Exterior.add("spoiler");
        dotariBMWX7Exterior.add("oglinzi electrice");


        List<String> dotariBMWX7Interior = new ArrayList<>();
        dotariBMWX7Interior.add("Tetiera cu masaj");
        dotariBMWX7Interior.add("clima bizonica");
        dotariBMWX7Interior.add("display parbriz");

//        FabricaAudi audiA5 = new FabricaAudi( "A5", "sedan", "negru", 20, dotariAudiA5);
//
//        audiA5.prezentareAuid();
//
        FabricaAudi audiA7 = new FabricaAudi("A7", "SUV", "rosu", 40, dotariAudiA7);
        audiA7.prezentareAuid();

        audiA7.setModel("A8");
        audiA7.prezentareAuid();
        audiA7.angajariFirma();



//        FabricaBMW BMWX5 = new FabricaBMW("X5", "SUV", "alb", 30, dotariBMWX5Exterior, dotariBMWX5Interior);
//        BMWX5.prezentareBMW();
//
//
        FabricaBMW BMWX7 = new FabricaBMW("X7", "sedan", "rosu", 50, dotariBMWX7Exterior, dotariBMWX7Interior);
        BMWX7.prezentareBMW();
        BMWX7.angajariFirma();










    }
}
