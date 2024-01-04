package OOPAbInterfete;

public class Angajat extends Persoana implements IntAngajat {

    //daca copilul mosteneste parintele, copilul trebuie sa mosteneasca contructorul din parinte -> adica super
    //stai cu mouse-ul pe linia rosie dupa ce faci "mostenirea cu exends"
    public Angajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    //cum fortez orice obiect din clasa asta sa aibe acelasi comportament ca in clasa de baza
    //cum  implementam interfata in aceasta clasa: cu implements "nume interfata"

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul a primit salariu");
    }

    @Override
    public void areConcediu() {
        System.out.println("Angajatul a luat concediu");
    }


}
