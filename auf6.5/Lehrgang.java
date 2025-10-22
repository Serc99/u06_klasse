// u06_klasse
// auf6.5

public class Lehrgang
{
   public static void main(String[] args)
   {
      Teilnehmer teilnehmer1;
      Teilnehmer teilnehmer2;
      Teilnehmer teilnehmer3;
      Teilnehmer teilnehmer4;
      Teilnehmer teilnehmer5;

      teilnehmer1             = new Teilnehmer();
      teilnehmer2             = new Teilnehmer();
      teilnehmer3             = new Teilnehmer();
      teilnehmer4             = new Teilnehmer();
      teilnehmer5             = new Teilnehmer();

      teilnehmer1.name        = "Raden";
      teilnehmer1.vorname     = "Kai";
      teilnehmer1.alter       = 27;
      teilnehmer1.fachrichtung = "Anwendungsentwicklung";

      teilnehmer2.name        = "Salihovic";
      teilnehmer2.vorname     = "Mirza";
      teilnehmer2.alter       = 28;
      teilnehmer2.fachrichtung = "Systemintegration";

      teilnehmer3.name        = "Gezgin";
      teilnehmer3.vorname     = "Goekhan";
      teilnehmer3.alter       = 38;
      teilnehmer3.fachrichtung = "Systemintegration";

      teilnehmer4.name        = "Andres";
      teilnehmer4.vorname     = "Lara";
      teilnehmer4.alter       = 29;
      teilnehmer4.fachrichtung = "Anwendungsentwicklung";

      teilnehmer5.name        = "Tekin";
      teilnehmer5.vorname     = "Oender";
      teilnehmer5.alter       = 35;
      teilnehmer5.fachrichtung = "Systemintegration";

      System.out.println("Teilnehmer 1:");
      System.out.println();
      System.out.println("Name: " + teilnehmer1.name);
      System.out.println("Vorname: " + teilnehmer1.vorname);
      System.out.println("Alter: " + teilnehmer1.alter);
      System.out.println("Fachrichtung: " + teilnehmer1.fachrichtung);
      System.out.println();

      System.out.println("Teilnehmer 2:");
      System.out.println();
      System.out.println("Name: " + teilnehmer2.name);
      System.out.println("Vorname: " + teilnehmer2.vorname);
      System.out.println("Alter: " + teilnehmer2.alter);
      System.out.println("Fachrichtung: " + teilnehmer2.fachrichtung);
      System.out.println();

      System.out.println("Teilnehmer 3:");
      System.out.println();
      System.out.println("Name: " + teilnehmer3.name);
      System.out.println("Vorname: " + teilnehmer3.vorname);
      System.out.println("Alter: " + teilnehmer3.alter);
      System.out.println("Fachrichtung: " + teilnehmer3.fachrichtung);
      System.out.println();

      System.out.println("Teilnehmer 4:");
      System.out.println();
      System.out.println("Name: " + teilnehmer4.name);
      System.out.println("Vorname: " + teilnehmer4.vorname);
      System.out.println("Alter: " + teilnehmer4.alter);
      System.out.println("Fachrichtung: " + teilnehmer4.fachrichtung);
      System.out.println();

      System.out.println("Teilnehmer 5:");
      System.out.println();
      System.out.println("Name: " + teilnehmer5.name);
      System.out.println("Vorname: " + teilnehmer5.vorname);
      System.out.println("Alter: " + teilnehmer5.alter);
      System.out.println("Fachrichtung: " + teilnehmer5.fachrichtung);
      System.out.println();
   }
}
