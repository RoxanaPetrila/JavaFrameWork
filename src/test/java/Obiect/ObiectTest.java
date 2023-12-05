package Obiect;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test

    public void testMethod (){
        //in aceasta clasa se va vedea rezultatul facut in clasa anterioara
        //un obiect se instanteaza cu cuvantul "new"
        FabricaMasini mercedesG63 = new FabricaMasini("Mercedes", "G63", "Kerosen",
                "Manuala", 2023, 4.8);

        mercedesG63.prezentareProdus();
        mercedesG63.calculImpozit();
        System.out.println("===========================");

        FabricaMasini DaweooMatiz= new FabricaMasini("Daewoo", "Matiz", "GPL",
                "Automata", 2003 , 0.8);

        DaweooMatiz.prezentareProdus();
        DaweooMatiz.calculImpozit();

        System.out.println("===========================");

        FabricaMasini audiR8 = new FabricaMasini("Audi", "R8", "Electric",
                "manuala", 2022, 3.2, 99000);

        audiR8.prezentareProdus();
        audiR8.calculImpozit();


    }


}
