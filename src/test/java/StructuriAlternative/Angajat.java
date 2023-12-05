package StructuriAlternative;

import org.testng.annotations.Test;

public class Angajat {

    @Test
    public void metoda_test(){
        zileleSaptamanii(3);

    }

    //reprezentam zilele saptamanii
    public void zileleSaptamanii(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este duminica" );
                break;
            case 2:
                System.out.println("Astazi este Luni");
                break;
            case 3:
                System.out.println("Astazi este Marti");
                break;
            case 4:
                System.out.println("AStazi este Miercuri");
                break;

        }
    }
}
