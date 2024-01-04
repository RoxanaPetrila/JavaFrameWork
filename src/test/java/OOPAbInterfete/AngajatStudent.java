package OOPAbInterfete;

public class AngajatStudent extends Persoana implements IntAngajat, StundentInt{
    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Studentul angajat munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Studentul angajat primeste salariu");
    }

    @Override
    public void areConcediu() {
        System.out.println("Studentul angajat are concediu");
    }

    @Override
    public void mergeLaFacultate() {
        System.out.println("Studentul angajat merge la facultate ");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul angajat sustine examene");

    }

    @Override
    public void mergeInVacanta() {
        System.out.println("Studentul angajat merge in vacanta");
    }

    @Override
    public void mergeInRestante() {
        System.out.println("Studentul angajat sustine restante");
    }
}
