public class Main {
    public static void main(String[] args) {
       Oppgave b1 = new Oppgave();
       b1.vis();
       b1.setTittel("Java Programming");
       b1.setForfatter("Noah Rabben Olsen");
       b1.setUAar(2012);
       b1.setPris(230);
       b1.vis();
       System.out.println();

       Oppgave b2 = new Oppgave("Python Programming", "Jane Doe", 2020, 300);
b2.vis();
       String t = b1.getTittel();
       System.out.println(t);
 

       //hva koster begge bøkene til sammen?
       double sum = b1.getPris() + b2.getPris();
       System.out.println(sum);

    }

}