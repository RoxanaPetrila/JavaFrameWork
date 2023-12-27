package StaticKeyWord;

import org.testng.annotations.Test;

public class StaticTest {

    @Test

    public void test_method(){
        //definim primul elev
        Elev elevUnu =  new Elev("Popescu", "Mihai");
        elevUnu.prezentareElev();

        Elev elevDoi =  new Elev("Popescu2", "Mihai2");
        elevDoi.prezentareElev();

        Elev elevTrei =  new Elev("Popescu3", "Mihai3");
        elevTrei.prezentareElev();
    }

}
