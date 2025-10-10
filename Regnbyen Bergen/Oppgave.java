public class Oppgave {

    public Oppgave() {
        tittel = "Ukjent";
        forfatter = "NN";
    }
public Oppgave(String tittel, String forfatter, int uAar, double pris)  {
    this.tittel = tittel;
    this.forfatter = forfatter;
    this.uAar = uAar;
    this.pris = pris;
}

    private String tittel;
    private String forfatter;
    private int uAar;
    private double pris;

    public String getTittel() {
        return tittel;

    }
    public String getForfatter() {
        return forfatter;
    }
    public int getUAar() {
        return uAar;
    }
    public double getPris() {
        return pris;
    }
    public void setTittel(String ny) {
        tittel = ny;
    }
    public void setForfatter(String ny) {
        forfatter = ny;
    }
    public void setUAar(int ny) {
        uAar = ny;
    }
    public void setPris(double ny) {
        pris = ny;
    }
    //OBJEKTMETODE!!!! OMG!!!
    public void vis(){
        System.out.println("Tittel: " + tittel);
        System.out.println("Forfatter: " + forfatter);
        System.out.println("UAar: " + uAar);
        System.out.println("Pris: " + pris);
    }
}