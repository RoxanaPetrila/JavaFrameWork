package AccessControl;

public class Persoana {

    //Access control java: public, private, protected
    //Se pot folosi la variabile sau metode
    //Public - ofera vizibilitate peste tot, oricui in intregul program
    //Parinte - copil este vizibil peste tot
    //Obiect - vizibil in acelasi pachet + in orice pachet

    //Private  - ofera vizibilitate peste tot in interiorul clasei
    //Parinte - copil = nu este vizibil chiar daca ne aflam in acelasi pachet sau nu
    //Obiect - nu este vizibil in niciun pachet

    //Protected - ofera vizibilitate peste tot in interiorul pachetului
    //Parinte - copil = ofera vizibilitate peste tot si oricui in intregul program
    //Obiect - vizibil daca este in acelasi pachet / nu e vizibil daca e inafara pachetului

    public void metodaPublica(){

    }

    private void metodaPrivata(){

    }

    protected void metodaProtected(){

    }
}
