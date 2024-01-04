package OOPAbClass;

public abstract class Persoana {
    //trebuie sa o transformam intr-o clasa abstracta => abstract adaugat intre public si class
    //O clasa abstracta poate sau nu  sa contina metode abstracte
    //o clasa abastracta se mostenteste (interfata se implementeaza)
    //O clasa abstracta poate implementa o interfata
    //O clasa abstracta poate avea un constructor, insa nu putem face un obiect
    //putem avea metode/variabile cu diferite tipuri de access control (public, private, protected)
    //Metodele abstracte trebuie sa contina cuvantul abstract + trebuie sa fie specificat tipul e access control
    //Poate sau nu sa contina metode abstracte

    public abstract void munceste();

    public abstract void primesteSalariu();

    public abstract void areConcediu();
    public abstract void mergeLaFacultate();
    public abstract void sustineExamene();
    public abstract void mergeInVacanta();
    public abstract void mergeInRestante();

    public void verificaVarsta(Integer varsta) {
        if (varsta >= 18) {
            System.out.println("Persoana este majora");
        }

        else{
            System.out.println("Persoana este minora");
        }

    }
}
