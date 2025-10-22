// u06_klasse
// auf6.1

public class Autoverleih
{
   public static void main(String[] args)
   {
      Auto auto1;
      Auto auto2;
      Auto auto3;

      auto1 = new Auto();
      auto2 = new Auto();
      auto3 = new Auto();

      auto1.autonummer = "HH-SY1235";
      auto2.autonummer = "HH-JO1453";
      auto3.autonummer = "HH-OJ2471";

      auto1.farbe      = Farbe.schwarz;
      auto2.farbe      = Farbe.blau;
      auto3.farbe      = Farbe.hellGrau;

      auto1.tagespreis = 50;
      auto2.tagespreis = 75;
      auto3.tagespreis = 115;

      Darsteller.zeige(auto1, auto2, auto3);
   }
}