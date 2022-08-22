package sk.lukas;

import java.util.Scanner;

public class Main extends ryba {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char volba;

    // vytvorenie objektu obj
    Main obj = new Main();

    // inicializacia metod
    obj.setOneHair(" vlasy,");
    obj.setFin(" plutvu,");
    obj.setTwoEyes(" dve oči,");
    obj.setTwoHands(" dve ruky,");
    obj.setFourFeet(" štyry nohy,");
    obj.setOneTail(" chvost,");
    obj.setTwoWings(" dve krídla,");
    obj.setTwoEars(" dve uši,");
    
    
    // uvod + vyber z menu
    System.out.println("           VITAJ V ATLASE ZVIERAT");
    System.out.println("Zadaj číslo,aby si sa dozvedel\nviac o určitom druhu.");

    System.out.println("1.človek\n2.plazy\n3.ryby\n4.vtáky");
    
    
    // volba uzivatela
    volba = sc.next().charAt(0);

    switch (volba) {
      case '1':
        obj.clo();
        break;

      case '2':
        obj.pla();
        break;

      case '3':
        obj.ryb();
        break;

      case '4':
        obj.vta();
        break;

      default:
        System.out.println("zadal si zlý vyber");
        break;
    }
    sc.close();
  }
}
