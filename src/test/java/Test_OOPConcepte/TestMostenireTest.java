package Test_OOPConcepte;

import OOPConcepte.FabricaAudi;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMostenireTest {

    @Test
    public  void testMethod(){

        //vrei sa-ti faci un Audi, cunosti fabrica Audi
        //faci un obiect ce va fi specific fabrica Audi
        //obiectul se initializeaza cu new si numele clase din care face parte

        List<String> dotariAudiA5 = new ArrayList<>();
        dotariAudiA5.add("jante");
        dotariAudiA5.add("trapa");
        dotariAudiA5.add("faruri");


        FabricaAudi audiA5 = new FabricaAudi( "A5", "sedan", "negru", 20,
                 dotariAudiA5);

        audiA5.prezentareAuid();


    }
}
