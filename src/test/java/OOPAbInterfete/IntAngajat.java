package OOPAbInterfete;

public interface IntAngajat {

    //Abstractizare = conceptul in baza caruia definim comportamentul unei clase
    //acest concept se poate face prin interfete sau clase abstracte
    //Putem reconoaste o interfata prin cuvantul "Interface"
    //O interfata contine doar metode abstracte (metode care nu au body) (... nu au acolade)
    //O interfata se implementeaza
    //Clasa care implementeaza o interfata, trebuie sa implementeze toate metodele abstracte
    //O clasa poate implementa 'n' interfete
    //O clasa abstracta poate implementa una sau mai multe interfete
    //O interfata nu poate extinde o clasa/clasa abstracta
    //O interfata poate extinde o alta interfata
    //Toate metodele dintr-o interfata sunt publice
    //Interfata nu poate avea un constructor => nu putem face un obiect
    //Interfata nu se intanteza, nu se face constructor, nu avem obiect

    //Exemplu: fisa postului unui angajat

    void munceste();
    void primesteSalariu();
    void areConcediu();

}
