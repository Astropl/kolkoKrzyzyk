import javafx.scene.control.Tab;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String tab[][] = new String[3][3];
        //String checkWin;
        CheckWin checkWin = new CheckWin();
        Boolean stanWygranej = false;
        //String checkWin;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        PlanszaPierwsza planszaPierwsza = new PlanszaPierwsza();
        RysujPlansze rysujPlansze = new RysujPlansze();
        planszaPierwsza.planszaPierwsza();
        System.out.println("Wybierz czy grasz z kolegą czy z komputerem.\n1. Z komputerem.\n2. Z kolegą");
        int wybor = 0;
        do {
            wybor = sc.nextInt();
            if (wybor == 1) {
                System.out.println(" Grasz z komputerem. Twój pierwszy ruch.\nGrasz znakami X");
            } else if (wybor == 2) {
                System.out.println(" Grasz z kolegą Twój pierwszy ruch.\nGrasz znakami X, a kolega O");
            } else {
                System.out.println(" Wybrany zły numer. Wybierz ponownie");
            }
        } while ((wybor != 1) && (wybor != 2));

        for (int i = 0; i < 100; i++) {// ZMIenic pozniej na petle while
            System.out.println("\nPodaj pole np a1,a2,a3  b1,b2,b3  c1,c2,c3  i po enterze nacisnij znak x lub o :");

// wybor gracza czy komputer zrobie za pomoca modulo.
            
            String podajPole = sc.nextLine();
            String znak = sc.nextLine();

            //rysujPlansze.podajPole(podajPole);
            rysujPlansze.podajPole(podajPole, znak);
            rysujPlansze.checkWin();
            if (rysujPlansze.stanWygranej == true) {
                System.out.println("Koniec.");
                i = 100;
            }
            //checkWin.checkWin();

        }
//rysujPlansze(podajPole,znak)

        // zrobic obsługę wygranych :>


    }
}
