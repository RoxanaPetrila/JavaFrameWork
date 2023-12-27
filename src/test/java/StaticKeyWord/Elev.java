package StaticKeyWord;

public class Elev {
    //Static - primeste o valoarea si nu o schimba in anumite circumstante
    //un keyword care are ca scop sa pastreze valoarea unei informatii pentru toate instantele unei clase
    //Static se poate aplica la varbiabile si metode!!

    private String numeElev;
    private String prenumeElev;
    private static String scoalaElev = "Liceul Liviu Rebreanu";
    private static Integer nrElevi = 0;

    public Elev(String numeElev, String prenumeElev) {
        this.numeElev = numeElev;
        this.prenumeElev = prenumeElev;
        nrElevi ++;
    }
    public void prezentareElev(){
        System.out.println("Numele elevului este " + numeElev);
        System.out.println("Prenumele elevului este " + prenumeElev);
        System.out.println("Scoala elevului este " + scoalaElev);
        System.out.println("Nr. elevi inscrisi la scoala sunt " + nrElevi);
    }


}


