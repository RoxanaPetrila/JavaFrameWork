package OOPAbInterfete;

public class Persoana {

    private String nume;
    private String prenume;
    private Integer varsta;

    //vrem sa facem un obiect, deci ne trebuie constructor


    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    //fiind ca i-am facut private, imi trebuie getter si setter
    //getteri pt ca vreau sa le accesez valorile, setteri pentru ca vreeau sa le pot modifica


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    //facem o metoda in care "descriem" aceasta persoana
    public void infoPersoana(){
        System.out.println("Numele este "+ getNume());
        System.out.println("Prenumele este "  + getPrenume());
        System.out.println("Varsta este " + getVarsta());
    }


}
